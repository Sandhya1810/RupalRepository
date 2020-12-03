package javaPractice;

public class IndiaTrafficRules implements CentralTrafficRules{

	public static void main(String[] args) {
		CentralTrafficRules in = new IndiaTrafficRules ();
		 in.greenGo();
		 in.redStop();
		 in.yellowWait();
		
	}

	@Override
	public void greenGo() {
		System.out.println("Green is Implemented");
		
	}

	@Override
	public void yellowWait() {
		System.out.println("Yellow is Implemented");
		
	}

	@Override
	public void redStop() {
		System.out.println("Red  is Implemented"); 
		
	}

}
