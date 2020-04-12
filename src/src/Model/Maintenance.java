package src.Model;

import java.util.ArrayList;

public class Maintenance implements interface_Maintenance{
    //instantiates variables
    private int maintenanceID;
    private int maintenanceRequestID;
    private int facilityID;
    private String maintenanceDetails;
    private int cost;
    private Facility facility;
    private MaintenanceSchedule maintenanceSchedule;
    private ArrayList<MaintenanceOrder> maintenanceOrders;
    private MaintenanceLog maintenanceLog;
    private ArrayList<MaintenanceRequest> maintenanceRequests;


    public Maintenance(MaintenanceSchedule maintenanceSchedule, MaintenanceLog maintenanceLog)
    {
        this.maintenanceSchedule = maintenanceSchedule;
        this.maintenanceOrders = new ArrayList<MaintenanceOrder>();
        this.maintenanceLog = maintenanceLog;
        this.maintenanceRequests = new ArrayList<MaintenanceRequest>();
    }
    //getter for maintenance id
    public int getMaintenanceID() {
        return maintenanceID;
    }

    //setter for maintenance id
    public void setMaintenanceID(int maintenanceID) {
        this.maintenanceID = maintenanceID;
    }

    //getter for maintenancerequestid
    public int getMaintenanceRequestID() {
        return maintenanceRequestID;
    }

    //setter for maintenancerequestid
    public void setMaintenanceRequestID(int maintenanceRequestID) {
        this.maintenanceRequestID = maintenanceRequestID;
    }

    //getter for facilityid
    public int getFacilityID() {
        return facilityID;
    }

    //setter for facilityid
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    //getter for maintenance details
    public String getMaintenanceDetails() {
        return maintenanceDetails;
    }

    //setter for maintenance details
    public void setMaintenanceDetails(String maintenanceDetails) {
        this.maintenanceDetails = maintenanceDetails;
    }

    //getter for maintenance cost
    public int getCost() {
        return cost;
    }

    //setter for maintenance cost
    public void setCost(int cost) {
        this.cost = cost;
    }

    //getter for facility
    public Facility getFacility() {
        return facility;
    }
    //setter for facility
    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public MaintenanceSchedule getMaintenanceSchedule()
    {
        return maintenanceSchedule;
    }

    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule)
    {
        this.maintenanceSchedule = maintenanceSchedule;
    }

    public MaintenanceLog getMaintenanceLog()
    {
        return maintenanceLog;
    }

    public void setMaintenanceLog(MaintenanceLog maintenanceLog)
    {
        this.maintenanceLog = maintenanceLog;
    }

    public ArrayList<MaintenanceOrder> getMaintenanceOrders()
    {
        return maintenanceOrders;
    }

    public void setMaintenanceOrders(ArrayList<MaintenanceOrder> maintenanceOrders)
    {
        this.maintenanceOrders = maintenanceOrders;
    }

    public ArrayList<MaintenanceRequest> getMaintenanceRequests()
    {
        return maintenanceRequests;
    }

    public void setMaintenanceRequests(ArrayList<MaintenanceRequest> maintenanceRequest)
    {
        this.maintenanceRequests = maintenanceRequest;
    }

    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest)
    {
        maintenanceRequests.add(maintenanceRequest);
    }

    public void addOrderToSchedule(MaintenanceOrder maintenanceOrder, Interval interval)
    {
        maintenanceSchedule.getMaintenanceSchedule().put(maintenanceOrder, interval);
        maintenanceOrders.remove(maintenanceOrder);
    }

    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder)
    {
        maintenanceOrders.add(maintenanceOrder);
    }

    public void addOrderToLog(MaintenanceOrder maintenanceOrder)
    {
        maintenanceLog.getMaintenanceLog().put(maintenanceOrder, maintenanceSchedule.getMaintenanceSchedule().get(maintenanceOrder));
        maintenanceSchedule.getMaintenanceSchedule().remove(maintenanceOrder);
    }
}
