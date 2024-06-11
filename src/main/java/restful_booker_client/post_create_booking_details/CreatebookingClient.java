package restful_booker_client.post_create_booking_details;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreatebookingClient
{
    public CreatebookingResponse createbookingdetais(CreateBookingRequest requestbody)
    {
        String url = String.format("%s/booking","https://restful-booker.herokuapp.com");
        System.out.println(url);
        Response response = given()
                .contentType("application/json")
                .when()
                .body(requestbody)
                .post(url)
                .then()
                .log().all()
                .extract().response();
        CreatebookingResponse createbookingresponse = response.as(CreatebookingResponse.class);//deserlization -response is in json formay converting it to java pojo response CreateBooingResponse
        createbookingresponse.setHttpstatuscode(response.getStatusCode());
        return createbookingresponse;

    }
}
