package src.Model;
import src.DAL.FacilityDAO;

public class FacilityCapacity{
    //instantiates variables
    private String name;
    private int facilityCapacity;
    private int squareFeet;

    //method for setting variables
    public FacilityCapacity(String name, int facilityCapacity, int squareFeet)
    {
        this.name = name;
        this.facilityCapacity = facilityCapacity;
        this.squareFeet = squareFeet;
    }
    
    //getter for facility name
    public String getName()
    {
        return name;
    }

    //setter for facility name
    public void setName(String name)
    {
        this.name = name;
    }

    //getter for facility capacity
    public int getFacilityCapacity()
    {
        return facilityCapacity;
    }

    //setter for facility capacity
    public void setFacilityCapacity(int facilityCapacity)
    {
        this.facilityCapacity = facilityCapacity;
    }

    //getter for square feet of facility
    public int getSquareFeet()
    {
        return squareFeet;
    }

    //setter for square feet of facility
    public void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }
}
