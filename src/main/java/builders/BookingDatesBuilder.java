package builders;

import restful_booker_client.Bookingdates;

public class BookingDatesBuilder
{
    public Bookingdates bookingdates;

    public BookingDatesBuilder()
    {
        bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-06-01");
        bookingdates.setCheckout("2024-01-01");

    }

    public Bookingdates build() //used to call checkin/out data to builder class
    {
        return bookingdates;
    }
}
