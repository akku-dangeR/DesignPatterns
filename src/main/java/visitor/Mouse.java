package visitor;

/**
 * Mouse class representation
 *
 * @author Yashraj R. Sontakke
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
