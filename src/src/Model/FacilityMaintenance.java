package src.Model;

import java.util.ArrayList;

public class FacilityMaintenance {
    //instantiates variables
    private MaintenanceSchedule maintenanceSchedule;
    private ArrayList<MaintenanceOrder> maintenanceOrders;
    private MaintenanceLog maintenanceLog;
    private ArrayList<MaintenanceRequest> maintenanceRequests;

    //method for setting variables
    public FacilityMaintenance(MaintenanceSchedule schedule, MaintenanceLog log)
    {
        this.maintenanceSchedule = schedule;
        this.maintenanceOrders = new ArrayList<MaintenanceOrder>();
        this.maintenanceLog = log;
        this.maintenanceRequests = new ArrayList<MaintenanceRequest>();
    }

    //getter for maintenance schedule
    public MaintenanceSchedule getMaintenanceSchedule()
    {
        return maintenanceSchedule;
    }

    //setter for maintenance schedule
    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule)
    {
        this.maintenanceSchedule = maintenanceSchedule;
    }

    //getter for maintenance orders
    public ArrayList<MaintenanceOrder> getMaintenanceOrders()
    {
        return maintenanceOrders;
    }

    //getter for maintenance log
    public MaintenanceLog getMaintenanceLog()
    {
        return maintenanceLog;
    }

    //getter for maintenance requests
    public ArrayList<MaintenanceRequest> getMaintenanceRequests()
    {
        return maintenanceRequests;
    }

    //adds maintenance requests 
    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest)
    {
        maintenanceRequests.add(maintenanceRequest);
    }

    //adds maintenance order to schedule
    public void addOrderToSchedule(MaintenanceOrder maintenanceOrder, Interval intervalSlot)
    {
        maintenanceSchedule.getSchedule().put(maintenanceOrder, intervalSlot);
        maintenanceOrders.remove(maintenanceOrder);
    }

    //adds maintenance order
    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder)
    {
        maintenanceOrders.add(maintenanceOrder);
    }

    //adds maintenance order to maintenance log
    public void addOrderToLog(MaintenanceOrder maintenanceOrder)
    {
        maintenanceLog.getLog().put(maintenanceOrder, (Interval) maintenanceSchedule.getSchedule().get(maintenanceOrder));
        maintenanceSchedule.getSchedule().remove(maintenanceOrder);
    }
}
