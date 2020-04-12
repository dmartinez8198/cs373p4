package src.Model;

import java.util.ArrayList;
import java.util.Collection;

//interface for facility 
public interface Facility {
    FacilityInfo getFacilityInfo();
    void setFacilityInfo(FacilityInfo Info);
    FacilityCapacity getFacilityCapacity();
    void setFacilityCapacity(FacilityCapacity facilityCapacity);
    FacilityUse getFacilityUse();
    void setFacilityUse(FacilityUse use);
    FacilityMaintenance getFacilityMaintenance();
    void setFacilityMaintenance(FacilityMaintenance Maintenance);
    ArrayList<Inspection> getInspections();
    void setInspections(ArrayList<Inspection> inspections);
    public void scheduleInspection(Inspection ins);

    //FacilityDAO interactions
    Collection<Facility> listFacilities();
    FacilityCapacity getFacilityID();
    int requestFacilityCapacity();
    Building addNewFacility();
    void addFacilityDetail(FacilityInfo fi);
    void removeFacility();
    void addInspection(Inspection ins);

    //UseDAO interactions
    public boolean inUseDuringInterval(Date d, Time start, Time end);
    public boolean inUseDuringInterval(Week w, Time start, Time end);
    public void assignFacilityToUse(UseRequest ur);
    public void vacateFacility();
    public ArrayList<Inspection> listInspections();
    public double calcUsageRate();

    //MaintenanceDAO interactions
    public void makeFacilityMaintenanceRequest(MaintenanceRequest mr);
    public void scheduleMaintenance(MaintenanceOrder mo, Interval i);
    public int calcMaintenanceCostForFacility();
    public String calcProblemRateForFacility();
    public int calcDownTimeForFacility();
    public ArrayList<MaintenanceRequest> listMaintRequests();
    public ArrayList<MaintenanceOrder> listMaintenance();
    public MaintenanceSchedule listFacilityProblems();

}
