package restful_booker_client.get_booking_details_by_id;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingDetailsByIdClient
{
    public BookingDetailsResponse getdetailsbyId(int id)
    {
        String url = String.format("%s/booking/%d","https://restful-booker.herokuapp.com",id);
        System.out.println(url);
        Response response =  given()
                .contentType("applicaation/json")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();

        BookingDetailsResponse bookingdetailsresponse = response.as(BookingDetailsResponse.class);
        bookingdetailsresponse.setHttpstatuscode(response.getStatusCode());
        return bookingdetailsresponse;

    }
}
