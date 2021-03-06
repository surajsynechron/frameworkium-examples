package restfulbooker.api.dto.booking.search;

import com.google.common.collect.ImmutableMap;
import restfulbooker.api.dto.booking.Booking;

import java.util.Map;

public class SearchParamsMapper {

    private SearchParamsMapper() {
        // hide constructor of mapper
    }

    public static Map<String, String> namesOfBooking(Booking booking) {
        return ImmutableMap.of(
                "firstname", booking.firstname,
                "lastname", booking.lastname);
    }

    public static Map<String, String> datesOfBooking(Booking booking) {
        return ImmutableMap.of(
                "checkin", booking.bookingdates.checkin,
                "checkout", booking.bookingdates.checkout);
    }
}
