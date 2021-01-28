package com.epam.modulefour.taskfifteen.vouchercontainer;


import com.epam.modulefour.taskfifteen.enumcontainer.*;
import java.util.HashSet;

public class VoucherAgregator {
    TravelVoucher travelVoucher;
    HashSet<TravelVoucher> voucherSet = new HashSet<>();

    TravelVoucher voucher = new TravelVoucher(Country.CUBA, TypeOfTravel.CRUISE,
                                              TransportType.PLANE, Feed.FULLPANSION, DaysOfTravel.TWENTY);
    TravelVoucher voucher1 = new TravelVoucher(Country.ANTALIA, TypeOfTravel.REST,
                                              TransportType.PLANE, Feed.FULLPANSION, DaysOfTravel.TEN);
    TravelVoucher voucher2 = new TravelVoucher(Country.CHINA, TypeOfTravel.EXCURTIONS,
                                              TransportType.PLANE, Feed.FULLPANSION, DaysOfTravel.TWENTY);
    TravelVoucher voucher3 = new TravelVoucher(Country.GERMANY, TypeOfTravel.TREATMENT,
                                              TransportType.BUS, Feed.NONE, DaysOfTravel.FIFTEEN);
    TravelVoucher voucher4 = new TravelVoucher(Country.INDIA, TypeOfTravel.EXCURTIONS,
                                              TransportType.PLANE, Feed.BREAKFASTANDSUPPER, DaysOfTravel.FIFTEEN);
    TravelVoucher voucher5 = new TravelVoucher(Country.GREECE, TypeOfTravel.EXCURTIONS,
                                              TransportType.PLANE, Feed.BREAKFAST, DaysOfTravel.TEN);
    TravelVoucher voucher6 = new TravelVoucher(Country.SWEDEN, TypeOfTravel.SHOPPING,
                                              TransportType.PLANE, Feed.BREAKFASTANDSUPPER, DaysOfTravel.TEN);
    TravelVoucher voucher7 = new TravelVoucher(Country.ITALY, TypeOfTravel.SHOPPING,
                                              TransportType.REALWAY, Feed.SUPPER, DaysOfTravel.TEN);
    TravelVoucher voucher8 = new TravelVoucher(Country.INDIA, TypeOfTravel.EXCURTIONS,
                                              TransportType.PLANE, Feed.NONE, DaysOfTravel.FIFTEEN);

    public HashSet<TravelVoucher> getVoucherSet(){
        voucherSet.add(voucher);
        voucherSet.add(voucher1);
        voucherSet.add(voucher2);
        voucherSet.add(voucher3);
        voucherSet.add(voucher4);
        voucherSet.add(voucher5);
        voucherSet.add(voucher6);
        voucherSet.add(voucher7);
        voucherSet.add(voucher8);

        return voucherSet;
    }


}
