package day05;

public class Encryption3 extends Encryption {

	public Encryption3(Strings str) {
		super(str);
	}
	public void display(){
		super.display();
		thirdEncrypt();
	}
	public void thirdEncrypt(){
		System.out.println("三次加密");
	}

}
