package visitor;

/**
 * Keyboard class representation
 *
 * @author Yashraj R. Sontakke
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
