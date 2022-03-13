package day05;

public class Encryption1 extends Encryption {

	public Encryption1(Strings str) {
		super(str);
	}
	public void display(){
		super.display();
		onceEncrypt();
	}
	public void onceEncrypt(){
		System.out.println("一次加密");
	}

}
