package builders;

import restful_booker_client.Bookingdates;
import restful_booker_client.post_create_booking_details.CreateBookingRequest;

public class CreateUserDetailsBuilder
{
    CreateBookingRequest createbookingrequest ;
    Bookingdates bookingdates ;

    public CreateUserDetailsBuilder() {
        createbookingrequest = new CreateBookingRequest();
        bookingdates = new BookingDatesBuilder().build();

        createbookingrequest.setFirstname("kishor");
        createbookingrequest.setLastname("kulkarni");
        createbookingrequest.setDepositpaid(true);
        createbookingrequest.setAdditionalneeds("new");
        createbookingrequest.setTotalprice("3000");
        createbookingrequest.setBookingdates(bookingdates);
    }

    public CreateBookingRequest build()
    {
        return createbookingrequest;
    }
}
