package restfulbookertest;

import builders.CreateUserDetailsBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;
import restful_booker_client.post_create_booking_details.CreateBookingRequest;
import restful_booker_client.post_create_booking_details.CreatebookingClient;
import restful_booker_client.post_create_booking_details.CreatebookingResponse;

public class PostCreateBookingDetailsTest extends Base_test
{
    @Test

    public void createbooingdetailstest()
    {
        CreateBookingRequest createBookingRequest = new CreateUserDetailsBuilder().build(); //request = builder  & response = client class method
        CreatebookingResponse createbookingResponse = new CreatebookingClient().createbookingdetais(createBookingRequest);
        Assert.assertEquals(createbookingResponse.getHttpstatuscode(),200);
        Assert.assertEquals(createbookingResponse.getBooking().getFirstname(),"kishor");
        Assert.assertEquals(createbookingResponse.getBooking().getLastname(),"kulkarni");
        Assert.assertEquals(createbookingResponse.getBooking().getTotalprice(),3000);
        Assert.assertTrue(createbookingResponse.getBooking().isDepositpaid());
        Assert.assertEquals(createbookingResponse.getBooking().getBookingdates().getCheckin(),"2022-06-01");
        Assert.assertEquals(createbookingResponse.getBooking().getBookingdates().getCheckout(),"2024-01-01");
        Assert.assertEquals(createbookingResponse.getBooking().getAdditionalneeds(),"new");

    }

}
