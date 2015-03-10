package visitor;

/**
 * Interface for computer part visitor
 *
 * @author Yashraj R. Sontakke
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
