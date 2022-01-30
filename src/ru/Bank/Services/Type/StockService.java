package ru.Bank.Services.Type;

import ru.Bank.Services.BankService;

public class StockService { //Фондовые услуги

    private String purchaseOfSecurities;
    private String saleOfSecurities;
    private String placementOfSecuritiesService;



    BankService serv = new BankService();

    public StockService(){
        purchaseOfSecurities = "Покупка ценных бумаг";

    }

    public StockService changeServiceType() {
        return new StockService();
    }




            public String[] serviceName = {"Stock Service", "Retail Service", "Trust Service", "Comissioning Service"};





}
