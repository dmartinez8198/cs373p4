package src.Model;
import src.Model.Interval;
import java.util.ArrayList;

public interface interface_Maintenance {

    //declaring getters and setters for maintenance

    public Facility getFacility();
    public void setFacility(Facility facility);
    public int getFacilityID();
    public void setFacilityID(int facilityID);
    public int getCost();
    public void setCost(int cost);
    public MaintenanceSchedule getMaintenanceSchedule();
    public void setMaitenanceSchedule(MaintenanceSchedule maintenanceSchedule);
    public MaintenanceLog getMaitenanceLog();
    public void setMaintenanceLog(MaintenanceLog maintenanceLog);
    public ArrayList<MaintenanceOrder> getMaintenanceOrders();
    public ArrayList<MaintenanceRequest> getMaintenanceRequests();
    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest);
    public void addOrderToSchedule(MaintenanceOrder maintenanceOrder, Interval, Interval intervalSlot);
    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder);
    public void addOrderToLog(MaintenanceOrder maintenanceOrder);
    public String getMaintenanceDetails();
    public void setMaintenanceDetails(String maintenanceDetails);
    public int getMaintenanceID();
    public void setMaintenanceID(int maintenanceID);
    public int getMaintenanceRequestID();
    public void setMaintenanceRequestID(int maintenanceRequestID);

}
