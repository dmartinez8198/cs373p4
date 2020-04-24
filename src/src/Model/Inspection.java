package src.Model;

public abstract class Inspection {
    //instantiates variables
    protected String inspectionType;
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
    abstract public String getInspectionType();

    //setter for facility inspection type
    abstract public void inspectionType(String inspectionType);

    //getter for inspection interval
    abstract public Interval getInterval();

    //setter for inspection interval
    abstract public void setInterval(Interval interval);
    
    abstract public void acceptVisitor(Visitor visitor);
}
