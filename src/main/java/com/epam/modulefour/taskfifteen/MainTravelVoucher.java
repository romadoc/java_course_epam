package com.epam.modulefour.taskfifteen;

import com.epam.modulefour.taskfifteen.enumcontainer.DaysOfTravel;
import com.epam.modulefour.taskfifteen.enumcontainer.Feed;
import com.epam.modulefour.taskfifteen.enumcontainer.TransportType;
import com.epam.modulefour.taskfifteen.vouchercontainer.TravelVoucher;
import com.epam.modulefour.taskfifteen.vouchercontainer.VoucherAgregator;

import java.util.HashSet;

public class MainTravelVoucher {
    public static void main(String[] args) {
        VoucherAgregator voucherAgregator = new VoucherAgregator();
        HashSet<TravelVoucher> travelVouchers =  voucherAgregator.getVoucherSet();
        HashSet<TravelVoucher> copyOfVouchers = new HashSet<>(travelVouchers);
        HashSet<TravelVoucher> filteredVouchersByDays = new HashSet<>();       /* новые хэш сеты, что бы сохранить изначальный хэш сет */
        HashSet<TravelVoucher> filteredVouchersByTransport = new HashSet<>();
        HashSet<TravelVoucher> filteredVouchersByFeed = new HashSet<>();

        /*
         * ниже тест работы отбора по необходимым параметрам
         */

        printHashSet(travelVouchers, "all offers");

        filteredVouchersByDays = SortingEngine.filterDays(copyOfVouchers, DaysOfTravel.FIFTEEN);
        printHashSet(filteredVouchersByDays, "result of selection by days of travel");

        filteredVouchersByTransport = SortingEngine.filterTransport(copyOfVouchers, TransportType.PLANE);
        printHashSet(filteredVouchersByTransport, "result of selection by transport");

        filteredVouchersByFeed = SortingEngine.filterFeed(copyOfVouchers, Feed.BREAKFASTANDSUPPER);
        printHashSet(filteredVouchersByFeed, "result of selection by type of feed");

    }

    private static void printHashSet(HashSet<TravelVoucher> travelVouchers, String header) {
        System.out.println(header + ": ");
        for (TravelVoucher s: travelVouchers ) {
            System.out.println(s);
        }
        System.out.println("********************************");
    }

}
