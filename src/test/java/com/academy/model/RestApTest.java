package com.academy.model;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RestApTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://localhost/rest/json";
        RestAssured.port = 8081;
    }


    @Test
    public void testGetSubscriber() {
        Response response = given()
                .get("/subscribers/1");

        assertThat(response.getStatusCode(), equalTo(200));

        response.getBody().print();
        JsonPath jsonPath = response.getBody().jsonPath();
        int id = jsonPath.getInt("id");
        String firstName = jsonPath.getString("firstName");

        assertThat(id, equalTo(1));
        assertThat(firstName, equalTo("Peter"));
    }

    @Test
    public void testElegantGetSubscriber1() {
        given()
                .when()
                .get("/subscribers/1")
                .then()
                .assertThat()
                .body("id", equalTo(1))
                .and()
                .body("firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }

    @Test
    public void testElegantGetSubscriber2 () {

        given()
                .when()
                .get("/subscribers/1")
                .then()
                .assertThat()
                .body("id", equalTo(1))
                .and()
                .body("firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }
    @Test
    public void testElegantGetSubscriber3 () {
        given()
                .when()
                .get("/subscribers/1")
                .then()
                .assertThat()
                .body("id", equalTo(1))
                .and()
                .body("firstName", equalTo("Peter"))
                .and()
                .statusCode(200);
    }

}