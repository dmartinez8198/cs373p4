package src.Model;

import src.DAL.*;
import java.util.ArrayList;
import java.util.Collection;


public class Building implements Facility {

        //instantiate variables
        private FacilityInfo facilityInfo;
        private FacilityCapacity facilityCapacity;
        private FacilityUse use;
        private FacilityMaintenance maintenance;
        private Inspection inspections;

        //creates setters for the instantiated variables
    public Building(FacilityInfo facilityInfo, FacilityCapacity facilityCapacity, FacilityUse use, FacilityMaintenance maintenance)
        {
            this.facilityInfo = facilityInfo;
            this.facilityCapacity = facilityCapacity;
            this.use = use;
            this.maintenance = maintenance;
            this.inspections = new Inspection();
        }

        //setter for facilityinfo
        public void setFacilityInfo(FacilityInfo facilityInfo)
        {
            this.facilityInfo = facilityInfo;
        }

    //getter for facilitycapacity
    public FacilityCapacity getFacilityCapacity()
    {
        return facilityCapacity;
    }

    //setter for facilitycapacity
    public void setFacilityCapacity(FacilityCapacity facilityCapacity)
    {
        this.facilityCapacity = facilityCapacity;
    }

    //getter for facilityuse
    public FacilityUse getFacilityUse()
    {
        return use;
    }

    //setter for facilityuse
    public void setFacilityUse(FacilityUse use)
    {
        this.use = use;
    }

    //getter for facilitymaintenance
    public FacilityMaintenance getFacilityMaintenance()
    {
        return maintenance;
    }

    //setter for facilitymaintenance
    public void setFacilityMaintenance(FacilityMaintenance maintenance)
    {
        this.maintenance = maintenance;
    }

    //setter for Inspections
    public void setInspections(Inspection inspections)
    {
        this.inspections = inspections;
    }

    //getter for facility inspections
    public Inspection getInspections()
    {
        return inspections;
    }


    public Collection<Facility> listFacilities()
    {
        return FacilityDAO.listFacilities();
    }

    public FacilityInfo getFacilityInfo()
    {
        return FacilityDAO.getFacilityInfo(this);
    }

    public int requestFacilityCapacity()
    {
        return facilityCapacity.getFacilityCapacity();
    }

    public Facility addNewFacility()
    {
        return FacilityDAO.addNewFacility(this);
    }

    public void addFacilityDetail(FacilityInfo fi)
    {
        FacilityDAO.addFacilityDetail(this, fi);
    }

    public void removeFacility()
    {
        FacilityDAO.removeFacility(this);
    }

    public void addInspection(Inspection ins)
    {
        FacilityDAO.addInspection(this, ins);
    }

    public boolean InUseDuringInterval(Date d, Time start, Time end)
    {
        return UseDAO.inUseDuringInterval(this, d, start, end);
    }

    public boolean isInUseDuringInterval(Week w, Time start, Time end)
    {
        return UseDAO.inUseDuringInterval(this, w, start, end);
    }

    public void assignFacilityToUse(UseRequest ur)
    {
        UseDAO.assignFacilityToUse(this, ur);1
    }

    public void vacateFacility()
    {
        UseDAO.vacateFacility(this);
    }

    public ArrayList<Inspection> listInspections()
    {
        return UseDAO.listInspections(this);
    }

    public UseSchedule listActualUsage()
    {
        return UseDAO.listActualUsage(this);
    }

    public double calcUsageRate()
    {
        return UseDAO.calcUsageRate(this);
    }

    public void makeFacilityMaintenanceRequest(MaintenanceRequest mr)
    {
        MaintenanceDAO.makeFacilityMaintenanceRequest(this, mr);
    }

    public void scheduleMaintenance(MaintenanceOrder mo, Interval i)
    {
        MaintenanceDAO.scheduleMaintenance(this, mo, i);
    }

    public int calcMaintenanceCostForFacility()
    {
        return MaintenanceDAO.calcMaintenanceCostForFacility(this);
    }

    public String calcProblemRateForFacility()
    {
        return MaintenanceDAO.calcProblemRateForFacility(this);
    }

    public int calcDownTimeForFacility()
    {
        return MaintenanceDAO.calcDownTimeForFacility(this);
    }

    public ArrayList<MaintenanceRequest> listMaintRequests()
    {
        return MaintenanceDAO.listMaintRequests(this);
    }

    public ArrayList<MaintenanceOrder> listMaintenance()
    {
        return MaintenanceDAO.listMaintenance(this);
    }

    public MaintenanceSchedule listFacilityProblems()
    {
        return MaintenanceDAO.listFacilityProblems(this);
    }
}
