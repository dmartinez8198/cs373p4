package src.DAL;

import src.Model.*;

import java.util.ArrayList;

public class UseDAO {
    public UseDAO(){}

    //checks to see if a specified facility is in use during a specific date and time
    public static boolean inUseDuringInterval(Facility f, Date d, Time start, Time end)
    {
        Interval comp = new Interval(d, start, end);
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.timeOverlaps(comp))
            {
                return true;
            }
        }
        return false;
    }
    
    //checks to see if a specified facility is in use during a specific week and time
    public static boolean inUseDuringInterval(Facility f, Week w, Time start, Time end)
    {
        Interval comp = new Interval(w, start, end);
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.timeOverlaps(comp))
            {
                return true;
            }
        }
        return false;
    }
    
    //assigns specified facility in use for a specified request
    public static void assignFacilityToUse(Facility f, UseRequest useRequest)
    {
        Database.db.get(f).getFacilityUse().getSchedule().getSchedule().put(useRequest, useRequest.getIntervalSlot());
    }

    //vacates specified facility
    public static void vacateFacility(Facility f)
    {
        Database.db.get(f).getFacilityUse().getSchedule().getSchedule().clear();
    }

    //lists inspections of specified facility
    public static ArrayList<Inspection> listInspections(Facility f)
    {
        return Database.db.get(f).getInspections();
    }

    //lists the schedule of specified facility
    public static UseSchedule listActualUsage(Facility f)
    {
        return Database.db.get(f).getFacilityUse().getSchedule();
    }

    //returns how long a specified facility is in use for
    public static double calcUsageRate(Facility f)
    {
        float totalMinutesInUse = 0;
        double usageRate;
        for(Interval i : Database.db.get(f).getFacilityUse().getSchedule().getSchedule().values())
        {
            if(i.getWeek() == null)
            {
               totalMinutesInUse += i.getTimeSpan().getTimeSpan()*i.getWeek().daysInUse();
            }
            else
            {
                totalMinutesInUse += i.getTimeSpan().getTimeSpan();
            }
        }
        usageRate = totalMinutesInUse/10000;

        return usageRate;
    }
}
