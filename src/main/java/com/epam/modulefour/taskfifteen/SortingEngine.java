package com.epam.modulefour.taskfifteen;

import com.epam.modulefour.taskfifteen.enumcontainer.DaysOfTravel;
import com.epam.modulefour.taskfifteen.enumcontainer.Feed;
import com.epam.modulefour.taskfifteen.enumcontainer.TransportType;
import com.epam.modulefour.taskfifteen.vouchercontainer.TravelVoucher;

import java.util.HashSet;

public class SortingEngine {

    public static HashSet<TravelVoucher> filterTransport(HashSet<TravelVoucher>travelVouchers,
                                                         TransportType transport) {
        travelVouchers.removeIf(nextVoucher -> !nextVoucher.getTransportType().equals(transport));
        return travelVouchers;
    }

    public static HashSet<TravelVoucher> filterFeed(HashSet<TravelVoucher>travelVouchers, Feed feed) {
        travelVouchers.removeIf(nextVoucher -> !nextVoucher.getFeed().equals(feed));
        return travelVouchers;
    }

    public static HashSet<TravelVoucher> filterDays(HashSet<TravelVoucher>travelVouchers, DaysOfTravel daysOfTravel) {
        travelVouchers.removeIf(nextVoucher -> !nextVoucher.getDaysOfTravel().equals(daysOfTravel));
        return travelVouchers;
    }

}
