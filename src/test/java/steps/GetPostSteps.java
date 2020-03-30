package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetPostSteps {


    @Given("^I perform get operations for \"([^\"]*)\"$")
    public void i_perform_get_operations_for(String arg1) throws Throwable {

    }

    @Then("^I should see the name as \"([^\"]*)\"$")
    public void i_should_see_the_name_as(String arg1) throws Throwable {
        BDDmethod.PerformContainsCollection();
    }

    @Then("^I should see the CanRelist as \"([^\"]*)\"$")
    public void i_should_see_the_CanRelist_as(String arg1) throws Throwable {

    }

    @Then("^I should  see gallery description as \"([^\"]*)\"$")
    public void i_should_see_gallery_description_as(String arg1) throws Throwable {

    }



}
