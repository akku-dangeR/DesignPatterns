package command;

/**
 * Object storing stock operations
 *
 * @author Yashraj R. Sontakke
 */
public class Stock {
    private final String name = "ABC";
    private final int quantity = 10;

    public void buy() {
        System.out.println(String.format("Stock %s of quantity %d bought", name, quantity));
    }

    public void sell() {
        System.out.println(String.format("Stock %s of quantity %d sold", name, quantity));
    }
}
