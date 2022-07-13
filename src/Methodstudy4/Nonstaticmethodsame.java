package Methodstudy4;

public class Nonstaticmethodsame {

	public static void main(String[] args) {
		Nonstaticmethodsame rule=new Nonstaticmethodsame();
		rule.info();
		
		Nonstaticmethodanother reguler= new Nonstaticmethodanother();
		reguler.unit();
	}
	public void info() {
		System.out.println("method run from info same class");
	}

}
