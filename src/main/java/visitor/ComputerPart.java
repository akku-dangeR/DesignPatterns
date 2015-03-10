package visitor;

/**
 * Interface for computer part
 *
 * @author Yashraj R. Sontakke
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
