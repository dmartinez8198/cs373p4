package src.Model;

public class TestInspection extends Inspection
{
  public TestInspection(){
    super();
    this.inspectionType = "Test";
   }
   
  public TestInspection(String inspectionType, Interval interval)
  {
    super(inspectionType, Interval)
  }
  
  public String getInspectionType()
  {
    return "Test";
  }
  
  public void inspectionType(String inspectionType)
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
  
  @Override
  public void acceptVisitor(Visitor visitor)
  {
    visitor.visit(this);
  }
}
