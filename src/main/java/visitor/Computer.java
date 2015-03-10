package visitor;

import java.util.Arrays;
import java.util.List;

/**
 * Computer class representation
 *
 * @author Yashraj R. Sontakke
 */
public class Computer implements ComputerPart {

    List<ComputerPart> parts;

    public Computer() {
        parts = Arrays.asList(new Keyboard(), new Mouse(), new Monitor());
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
