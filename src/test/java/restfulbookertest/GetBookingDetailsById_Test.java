package restfulbookertest;

import org.testng.Assert;
import org.testng.annotations.Test;
import restful_booker_client.get_booking_details_by_id.BookingDetailsResponse;
import restful_booker_client.get_booking_details_by_id.GetBookingDetailsByIdClient;

public class GetBookingDetailsById_Test extends Base_test {
    @Test
    public void getbookingdetailsbyid() {
        BookingDetailsResponse bookingdetailsresponse = new GetBookingDetailsByIdClient().getdetailsbyId(122);
       /* Assert.assertEquals(bookingdetailsresponse.getFirstname(), "John");
        Assert.assertEquals(bookingdetailsresponse.getLastname(), "Smith");
        Assert.assertEquals(bookingdetailsresponse.getTotalprice(), 111);
        Assert.assertEquals(bookingdetailsresponse.getBookingdates().getCheckin(), "2018-01-01");
        Assert.assertEquals(bookingdetailsresponse.getBookingdates().getCheckout(), "2019-01-01");
        Assert.assertTrue(bookingdetailsresponse.isDepositpaid());
        Assert.assertEquals(bookingdetailsresponse.getAdditionalneeds(),"Breakfast");
    */}
}