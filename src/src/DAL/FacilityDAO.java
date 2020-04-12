package src.DAL;

import src.Model.Facility;
import src.Model.FacilityCapacity;
import src.Model.FacilityInfo;
import src.Model.Inspection;

import java.util.Collection;

public class FacilityDAO {
    public FacilityDAO(){}
    //creates list of facilities
    public static Collection<Facility> listFacilities()
    {
        return Database.db.values();
    }
    
    //getter for Facility information of a specific facility
    public static FacilityInfo getFacilityInfo(Facility f)
    {
        return Database.db.get(f).getFacilityInfo();
    }
    
    //getter for facility capacity of a specific facility
    public static FacilityCapacity getFacilityCapacity(Facility f)
    {
        return Database.db.get(f).getFacilityCapacity();
    }
    
    //adds a new facility to the database
    public static Facility addNewFacility(Facility f)
    {
        Database.db.put(f, f);
        return Database.db.get(f);
    }
    
    //adds a new facility detail to a specified facility
    public static void addFacilityDetail(Facility f, FacilityInfo fi)
    {
        Database.db.get(f).setFacilityInfo(fi);
    }

    //removes specified facility from database
    public static void removeFacility(Facility f)
    {
        Database.db.remove(f);
    }

    public static void addInspection(Facility f, Inspection ins)
    {
        Database.db.get(f).addInspection(ins);
    }
}
