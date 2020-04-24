package src.Model;

public class TestInspection extends Inspection
{
  public TestInspection(){
    super();
   }
   
  public TestInspection(InspectionType inspectionType, Interval interval)
  {
    super(inspectionType, Interval)
  }
  
  public InspectionType getInspectionType()
  {
    return new Test();
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
  
  @Override
  public void setInterval(Interval interval)
  {
    this.interval = interval;
  }
}
