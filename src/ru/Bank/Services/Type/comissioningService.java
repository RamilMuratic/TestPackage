package ru.Bank.Services.Type;

import ru.Bank.Services.Service;

public class comissioningService { //Комиссионные услуги

    private String saleService;
    private String comissioningServiceType;
    private String securitiesPurchaseService;

    Service serv;
    comissioningService komissia = new comissioningService();


    public comissioningService changeServiceType() {
        return new comissioningService();
    }


}
