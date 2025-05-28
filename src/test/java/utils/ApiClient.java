package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiClient {
    private static String token;

    public static void authenticate(String username, String password) {
        Response response = RestAssured.given()
                .baseUri("https://apiforshopsinventorymanagementsystem.onrender.com")
                .header("Content-Type", "application/json")
                .body("{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}")
                .post("/auth/login");

        response.then().statusCode(200);
        token = response.jsonPath().getString("token");
    }

    public static RequestSpecification getRequestWithAuth() {
        return RestAssured.given()
                .baseUri("https://apiforshopsinventorymanagementsystem.onrender.com")
                .header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json");
    }

    public static RequestSpecification getRequestWithoutAuth() {
        return RestAssured.given()
                .baseUri("https://apiforshopsinventorymanagementsystem.onrender.com")
                .header("Content-Type", "application/json");
    }
}
