package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	//Hooks
//	@Before
//	public void beforesnapping() {
//		System.out.println("Thanos collecting the infinity stones");
//	}
//    @After
//	public void aftersnapping() {
//		System.out.println("After killing everyone, taking rest on garden");
//	}
	
	//Hooks with order
//	@Before(order=1)
//	public void beforesnapping() {
//		System.out.println("Thanos collecting the infinity stones");
//	}
//    @After(order=1)
//	public void aftersnapping() {
//		System.out.println("After killing everyone, taking rest on garden");
//	}
//    @Before(order=0)
//    public void beforescenario() {
//    	System.out.println("Thanos has to be born");
//    }
//    @After(order=0)
//    public void afterscenario() {
//    	System.out.println("Finally Thanos is dying");
//    }
	
	//Tagged Hooks
//	@Before
//	public void beforescenario() {
//		System.out.println("This will run before every scenario");
//	}
//	@After
//	public void afterscenario() {
//		System.out.println("This will run after every scenario");
//	}
//	@Before("@First")
//	public void beforefirst() {
//		System.out.println("This will run only before first scenario");
//	}
//	@Before("@Second")
//	public void beforesecond() {
//		System.out.println("This will run only before second scenario");
//	}
//	@Before("@Third")
//	public void beforethird() {
//		System.out.println("This will run only before third scenario");
//	}
//	@After("@First")
//	public void afterfirst() {
//		System.out.println("This will run only after first scenario");
//	}
//	@After("@Second")
//	public void aftersecond() {
//		System.out.println("This will run only after second scenario");
//	}
//	@After("@Third")
//	public void afterthird() {
//		System.out.println("This will run only after third scenario");
//	}
	
	//Combined tagged hooks
//	@Before
//	public void beforescenario() {
//		System.out.println("This will run before every scenario");
//	}
//	@After
//	public void afterscenario() {
//		System.out.println("This will run after every scenario");
//	}
//	@Before("@First or @Second")
//	public void beforefirst() {
//		System.out.println("This will run only before first and second scenario");
//	}
//	@Before("@Third")
//	public void beforethird() {
//		System.out.println("This will run only before third scenario");
//	}
//	@After("@First or @Second")
//	public void afterfirst() {
//		System.out.println("This will run only after first and second scenario");
//	}
//	@After("@Third")
//	public void aftersecond() {
//		System.out.println("This will run only after third scenario");
//	}
	
	//Background with hooks
	@Before
	public void beforescenario() {
		System.out.println("This will run before every scenario");
	}
	@After
	public void afterscenario() {
		System.out.println("This will run after every scenario");
	}
}
