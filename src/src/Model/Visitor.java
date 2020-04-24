package src.Model;

public interface Visitor
{
   void visit(Inspection i);
   void visit(FireInspection f);
   void visit(TestInspection t);
}
 
