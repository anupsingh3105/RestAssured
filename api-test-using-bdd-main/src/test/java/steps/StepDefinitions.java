package steps;

import com.example.auto.util.Constants;
import com.example.auto.util.JsonRequestReader;
import com.example.auto.util.JsonResponseReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class StepDefinitions {

    //ApiService api = new ApiService(Constants.BASE_URL);
    public static Response response;
    public String requestBody;

    @Then("status code should be {int}")
    public void status_code_should_be(int int1) {
        Assert.assertTrue("Response status code is not " + int1, response.getStatusCode() == int1);
    }

    @Given("check api using GET")
    public void checkApiUsingGET() {
        System.out.println(Constants.BASE_URL + Constants.GET_LIST_USERS);
        response = RestAssured
                .given()
                .header("x-api-key", "reqres-free-v1")
                .get(Constants.BASE_URL + Constants.GET_LIST_USERS);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asPrettyString());
    }

    @When("create user using POST")
    public void createUserUsingPOST() {
        response = RestAssured
                .given()
                .header("x-api-key", "reqres-free-v1")
                .body(requestBody)
                .post(Constants.BASE_URL + Constants.POST_LIST_USERS);
        System.out.println(Constants.BASE_URL + Constants.POST_LIST_USERS);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asPrettyString());
    }

    @And("user should be created")
    public void userShouldBeCreated() {

    }

    @Given("user reads {string} from file")
    public void userReadsFromFile(String arg0) throws Exception {
        requestBody = JsonRequestReader.getRequestBody(arg0);
    }

    @And("validate the response")
    public void validateTheResponse() {
        JsonResponseReader.getResponseUsingJSONPath(response);
       // JsonReader.getResponseJsonAndArrayBody(response);
    }
}
