package interface_studt;

public class Son implements Father,Mother
{

	public static void main(String[] args) {
		Son s=new Son();
		s.care();
		s.love();
		s.phone();
		s.laptop();
		s.money();
		Father.test();
		Mother.test();
		

	}

	@Override
	public void love() {
        System.out.println( "mother love is completed in son class" );		
		
	}

	@Override
	public void care() {
        System.out.println( "mother care is completed in son class" );		
		
	}

	@Override
	public void phone() {
        System.out.println( "father phone is completed in son class" );		
		
	}

	@Override
	public void laptop() {
        System.out.println( "father laptop is completed in son class" );		
		
	}

	@Override
	public void money() {
		Mother.super.money();
		Father.super.money();
	}

	

}
