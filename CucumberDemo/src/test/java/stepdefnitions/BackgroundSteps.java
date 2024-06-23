package stepdefnitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
	@Given("The student finished high school")
	public void the_student_finished_high_school() {
	    System.out.println("The student finished High School");
	}

	@Given("The student finished higher secondary")
	public void the_student_finished_higher_secondary() {
	    System.out.println("The student finished higher secondary");
	}

	@Given("the student applied for medical course")
	public void the_student_applied_for_medical_course() {
	    System.out.println("The student applied for medical course");
	}

	@When("the student cleared the entrance exam")
	public void the_student_cleared_the_entrance_exam() {
	    System.out.println("The student cleared the entrance exam");
	}

	@Then("the student is eligible for joining any Medical Institute")
	public void the_student_is_eligible_for_joining_any_medical_institute() {
	    System.out.println("The student is eligible for joing medical institute");
	}

	@Given("the student applied for Engineering course")
	public void the_student_applied_for_engineering_course() {
	    System.out.println("The student applied for engineering course");
	}

	@When("the student has a sayable cutoff")
	public void the_student_has_a_sayable_cutoff() {
	    System.out.println("The student has sayable cutoff");
	}

	@Then("the student is eligible for joining any Engneering Institute")
	public void the_student_is_eligible_for_joining_any_engneering_institute() {
	    System.out.println("The student is eligible for any engineering institute");
	}

}
