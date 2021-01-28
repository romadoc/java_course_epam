package com.epam.modulefour.taskfifteen.vouchercontainer;

import com.epam.modulefour.taskfifteen.enumcontainer.*;

/**
 * Туристические путевки.
 * Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */

public class TravelVoucher {
    private Country country;
    private TypeOfTravel typeOfTravelVoyage;
    private TransportType transportType;
    private Feed feed;
    private DaysOfTravel daysOfTravel;


    public TravelVoucher(Country country, TypeOfTravel typeOfTravelVoyage, TransportType transportType, Feed feed, DaysOfTravel daysOfTravel) {
        this.country = country;
        this.typeOfTravelVoyage = typeOfTravelVoyage;
        this.transportType = transportType;
        this.feed = feed;
        this.daysOfTravel = daysOfTravel;
    }

    public Country getCountry() {
        return country;
    }

    public TypeOfTravel getTypeOfTravelVoyage() {
        return typeOfTravelVoyage;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public Feed getFeed() {
        return feed;
    }

    public DaysOfTravel getDaysOfTravel() {
        return daysOfTravel;
    }



    @Override
    public String toString() {
        return "страна: " + country + "; тип путевки: " + typeOfTravelVoyage +
                "; вид транспорта: " + transportType + "; питание: " + feed +
                "; количество дней: " + daysOfTravel;
    }
}
