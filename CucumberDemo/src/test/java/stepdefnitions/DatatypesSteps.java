package stepdefnitions;


import io.cucumber.java.en.Given;

public class DatatypesSteps {
	@Given("I have {int} laptop")
	public void i_have_laptop(int count) {
	    System.out.println("The number of laptop is "+count);
	}

	@Given("I have {float} CGPA")
	public void i_have_cgpa(float num) {
	    System.out.println("The CGPA is "+num);
	}

	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name1, String name2, String name3) {
	    System.out.println(name1+" is elder to"+name2+" and "+name3);
	}



}
