package visitor;

/**
 * Monitor class representation
 *
 * @author Yashraj R. Sontakke
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
