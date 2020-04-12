package src.View;

import src.Model.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FacilityClient {

    public static void main(String args[]) {

        //Office Example 2 with Spring

        FacilityInfo CorboyCenter = (Facility) context.getBean("facility");

        CorboyCenter.setPhoneNumber(777777);
        CorboyCenter.setFacilityID(111);
        CorboyCenter.setAddress("26 E Pearson St");
        CorboyCenter.setCity("Chicago");
        CorboyCenter.setState("Illinois");
        CorboyCenter.setZipCode(60611);

        //Office Example Sherry Hall
        FacilityInfo office1 = new FacilityInfo(100, 8135862, "6330 N Sheridan Rd", "Chicago", "Illinois", 60660);
        FacilityCapacity fc1 = new FacilityCapacity("Sherry Hall", 100, 1200);

        UseSchedule schedule1 = new UseSchedule();
        FacilityUse use1 = new FacilityUse(schedule1);

        MaintenanceSchedule maintSchedule1 = new MaintenanceSchedule();
        MaintenanceLog maintLog1 = new MaintenanceLog();
        FacilityMaintenance maintenance1 = new FacilityMaintenance(maintSchedule1, maintLog1);
        Facility f1 = new Building(office1, fc1, use1, maintenance1);

        Time start1 = new Time(1, 0);
        Time end1 = new Time(2, 30);
        Week w1 = new Week(true, true, true, false, false, false, true);
        Interval i1 = new Interval(w1, start1, end1);
        FacilityUser facilityUser1 = new FacilityUser("joshseitz", "Joshua Seitz", 8920185, "jseitz@luc.edu", "Admin");
        UseRequest useRequest1 = new UseRequest(facilityUser1, i1);

        Time start2 = new Time(15, 29);
        Time end2 = new Time(21, 30);
        Date d1 = new Date(2, 23, 2020);
        Interval i2 = new Interval(d1, start2, end2);
        Inspection inspection1 = new Inspection("Safety", i2);

        Date d2 = new Date(1, 1, 2020);
        MaintenanceRequest maintRequest1 = new MaintenanceRequest(1, "Broken Door Hinge", d2);

        Date d3 = new Date(2, 14, 2020);
        Time start3 = new Time(12, 45);
        TimeSpan timeSpan1 = new TimeSpan(300);
        Interval i3 = new Interval(d3, start3, timeSpan1);
        MaintenanceOrder maintOrder1 = new MaintenanceOrder(maintRequest1, d3, 25);


    }

}
