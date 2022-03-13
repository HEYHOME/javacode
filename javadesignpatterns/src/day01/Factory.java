package day01;

/**
 * @description:
 * @create: 2020-11-08-15:39
 * @author: Hey
 */
public interface Factory {
    public Purchase createPurchase();
    public Sale createSale();
    public Stock createStock();

}
