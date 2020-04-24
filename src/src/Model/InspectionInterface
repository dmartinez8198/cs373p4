package src.Model;

public class InspectionInterface extends Inspection
{
  ArrayList<Inspection> inspections = new ArrayList<>();
  
  public InspectionInterface(){
    super();
  }
  
  public InspectionInterface(String inspectionType, Interval interval)
  {
    super(inspectionType, interval);
  }
  
  public String getInspectionType()
  {
    return inspectionType;
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
  
  public void add(Inspection i)
  {
    inspections.add(i);
  }
  
  public void remove(Inspection i)
  {
    inspections.remove(i);
  }
}
