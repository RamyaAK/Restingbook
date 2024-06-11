package restful_booker_client.post_create_booking_details;

import restful_booker_client.BaseResponse;
import restful_booker_client.Booking;

public class CreatebookingResponse extends BaseResponse
{
    public int bookingid;
    public Booking booking;

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
