package first;

public class Override1 extends Override2 {
	
	@Override
	public void petrolprice() {
		// TODO Auto-generated method stub
		System.out.println("petrolprice is 108 on aug 29");
		
	}
	@Override
	public void dieselprice() {
		// TODO Auto-generated method stub
		System.out.println("dieselprice is 98 on aug 27");
		
		}
	public static void main(String[] args) {
		Override1 o = new Override1();
		o.petrolprice();
		o.dieselprice();
		
	}
	

}



