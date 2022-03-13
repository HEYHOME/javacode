package day05;

public class Encryption implements Strings{
	private Strings str;
	public Encryption(Strings str){
		this.str = str;
	}
	@Override
	public void display() {
		str.display();
	}

}
