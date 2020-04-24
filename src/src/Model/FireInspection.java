package src.Model;

public class FireInspection extends Inspection
{
  public FireInspection() {
    super();
   }
   
  public FireInspection(InspectionType inspectionType, Interval interval)
  {
    super(inspectionType, interval);
  }
  
  public InspectionType getInspectionType()
  {
    return new Fire();
  }
  @Override
  public void setInspectionType(InspectionType inspectionType)
  {
    this.inspectionType = inspectionType;
  }
  
  public Interval getInterval()
  {
    return interval;
  }
  
  public void setInterval(Interval interval)
  {
    this.interval = interval;
  }
}
