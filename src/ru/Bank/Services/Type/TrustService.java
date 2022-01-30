package ru.Bank.Services.Type;

import ru.Bank.Services.BankService;

public class TrustService { //Доверительные услуги

    public String consultingService;
    public String transferOfPropertyService;
    public String custodyOfAssetsService;

    BankService serv;
    TrustService doveritelnyeUslugi = new TrustService();

    public TrustService changeServiceType() {
        return new TrustService();
    }

    public static void main(String[] args) {


        int z = 100;
            for (int a = 100; a <= 26 ; a= (z+100));
            int a = z + 100;
            System.out.println(a);}



}
