package ru.Bank.Services.Type;

import ru.Bank.Services.Service;

public class stockService { //Фондовые услуги

    private String loansSecuredBySecuritiesService;
    private String placementOfSecuritiesService;

    Service serv;
    stockService fondovyelnyeUslugi = new stockService();

    public stockService changeServiceType() {
        return new stockService();
    }
}
