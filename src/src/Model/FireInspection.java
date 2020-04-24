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
  @Override
  public void setInspectionType(String inspectionType)
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
  
  @Override
  public void acceptVisitor(Visitor v){
    visitor.visit(this);
  }
}
