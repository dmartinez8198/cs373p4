package src.Model;

public class Inspection {
    //instantiates variables
    private String inspectionType;
    private Interval interval;

    //method for setting variables
    public Inspection(String inspectionType, Interval interval)
    {
        this.inspectionType = inspectionType;
        this.interval = interval;
    }

    public Inspection() {
    }

    //getter for facility inspection type
    public String getInspectionType()
    {
        return inspectionType;
    }

    //setter for facility inspection type
    public void setInspectionType(String inspectionType)
    {
        this.inspectionType = inspectionType;
    }

    //getter for inspection interval
    public Interval getInterval()
    {
        return interval;
    }

    //setter for inspection interval
    public void setInterval(Interval interval)
    {
        this.interval = interval;
    }
}
