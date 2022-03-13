
package day05;

public class Client {
	public static void main(String[] args) {
		Strings s = new ConString();
		s.display();
		Strings s1 = new Encryption1(s);
		s1.display();
	}

}
