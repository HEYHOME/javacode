package day01;

/**
 * @description:
 * @create: 2020-11-08-17:01
 * @author: Hey
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Factory f;
        Purchase pur;
        Sale sl;
        Stock st;
        f = (Factory) Init.getInstance();
        pur = f.createPurchase();
        sl = f.createSale();
        st = f.createStock();
        pur.show();
        sl.show();
        st.show();
    }
}

