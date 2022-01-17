package ru.Bank.Services.Type;

import ru.Bank.Services.Service;

public class fiduciaryService { //Доверительные услуги

    public String consultingService;
    public String transferOfPropertyService;
    public String custodyOfAssetsService;

    Service serv;
    fiduciaryService doveritelnyeUslugi = new fiduciaryService();

    public fiduciaryService changeServiceType() {
        return new fiduciaryService();
    }

}
