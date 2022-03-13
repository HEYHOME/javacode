package day01;

/**
 * @description:
 * @create: 2020-11-08-16:49
 * @author: Hey
 */
public class IncomeFactory implements Factory {
    @Override
    public Purchase createPurchase() {
        return new PurReturnIn();
    }

    @Override
    public Sale createSale() {
        return new slIn();
    }

    @Override
    public Stock createStock() {
        return new StReturnIn();
    }
}
