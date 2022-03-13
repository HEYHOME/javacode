package day01;

/**
 * @description:
 * @create: 2020-11-08-16:50
 * @author: Hey
 */
public class OutcomeFactory implements Factory {
    @Override
    public Purchase createPurchase() {
        return new PurOut();
    }

    @Override
    public Sale createSale() {
        return new slReturnOut();
    }

    @Override
    public Stock createStock() {
        return new StOut();
    }
}
