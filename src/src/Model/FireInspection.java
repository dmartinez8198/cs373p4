package src.Model;

public class FireInspection extends Inspection
{
  public FireInspection() {
    super();
    this.inspectionType = "Fire";
   }
   
  public FireInspection(String inspectionType, Interval interval)
  {
    super(inspectionType, interval);
  }
  
  public String getInspectionType()
  {
    return "Fire";
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
  public void acceptVisitor(Visitor visitor){
    visitor.visit(this);
  }
}
