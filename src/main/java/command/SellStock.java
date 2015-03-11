package command;

/**
 * Class used to sell stock.
 *
 * @author Yashraj R. Sontakke
 */
public class SellStock implements Order {

    private final Stock stock;

    public SellStock(final Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
