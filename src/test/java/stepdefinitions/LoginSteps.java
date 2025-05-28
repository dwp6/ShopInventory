package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private Response response;

    @When("I try to login with username {string} and password {string}")
    public void i_try_to_login_with_username_and_password(String username, String password) {
        response = RestAssured.given()
                .baseUri("https://apiforshopsinventorymanagementsystem.onrender.com")
                .header("Content-Type", "application/json")
                .body("{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}")
                .post("/auth/login");
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        assertEquals(200, response.getStatusCode());
    }

    @Then("login should fail with status code {int}")
    public void login_should_fail_with_status_code(Integer expectedStatusCode) {
        assertEquals(expectedStatusCode.intValue(), response.getStatusCode());
    }
}
