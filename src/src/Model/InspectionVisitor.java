package src.Model;

public class InspectionVisitor implements Visitor
{
  @Override
  public void visit(Inspection i){
    System.out.println("Visited inspection: " + i.getInspectionType());
  }
  
  @Override
  public void visit(FireInspection f){
    System.out.println("Visited inspection: " +i.getInspectionType());
  }
  
  @Override
  public void visit(TestInspection t){
    System.out.println("Visited inspection: " +i.getInspectionType());
  }
}
