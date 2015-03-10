package visitor;

/**
 * Example working of visitor design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        Monitor monitor = new Monitor();
        monitor.accept(new ComputerPartDisplayVisitor());
    }
}
