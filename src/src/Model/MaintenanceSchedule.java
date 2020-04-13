package src.Model;

import java.util.HashMap;

public class MaintenanceSchedule {

    //instantiates schedule
    private HashMap<MaintenanceOrder, Interval> schedule;

    public MaintenanceSchedule()
    {
        schedule = new HashMap<MaintenanceOrder, Interval>();
    }

    //getter for maintenance schedule
    public HashMap<MaintenanceOrder, Interval> getMaintenanceSchedule()
    {
        return schedule;
    }

    //setter for maintenance schedule
    public void setMaintenanceSchedule(HashMap<MaintenanceOrder, Interval> schedule)
    {
        this.schedule = schedule;
    }

    public HashMap getSchedule(){
        return schedule;
    }
}

