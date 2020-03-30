package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.containsString;

public class BDDmethod {

    public static void PerformContainsCollection() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false")
                .then()
                .body("Name", containsString("Carbon credits"));
    }
}
