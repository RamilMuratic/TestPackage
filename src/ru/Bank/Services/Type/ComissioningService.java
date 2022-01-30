package ru.Bank.Services.Type;

import ru.Bank.Services.BankService;

public class ComissioningService { //Комиссионные услуги

    private String saleService;
    private String comissioningServiceType;
    private String securitiesPurchaseService;

    BankService serv;
    ComissioningService komissia = new ComissioningService();

    public ComissioningService() {
    }


    public ComissioningService changeServiceType() {
        return new ComissioningService();
    }


}
