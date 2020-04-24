package src.Model;

public abstract class Inspection {
    //instantiates variables
    protected InspectionType inspectionType;
    protected Interval interval;

    //method for setting variables
    public Inspection(String inspectionType, Interval interval)
    {
        this.inspectionType = inspectionType;
        this.interval = interval;
    }

    public Inspection() {
    }

    //getter for facility inspection type
    abstract public InspectionType getInspectionType();

    //setter for facility inspection type
    abstract public void setInspectionType(InspectionType inspectionType);

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
