package day05;

public class Encryption2 extends Encryption {

	public Encryption2(Strings str) {
		super(str);
	}
	public void display(){
		super.display();
		twiceEncrypt();
	}
	public void twiceEncrypt(){
		System.out.println("二次加密");
	}

}
