package ru.Bank.Services.Type;

public class RetailService {

    private double Summa;
    private String TypeServiceRetail;

    public void setSumma(double summa) {
        Summa = summa;
    }

    public RetailService() {
        TypeServiceRetail = "Прием депозитов";
        double rsPrice1 = 100.0;
        double rsPrice2 = 105.1;
        double rsComissionPercent = 1.5;

        Summa = rsPrice1 + rsPrice2 + (rsPrice1 + rsPrice2) * rsComissionPercent / 100;

        if (Summa > 400) {
            System.out.println("Скидка 5% на следующую услугу");
        }
        else {
            System.out.println("Скидка 7 % на следующую услугу");
        }

        do {
            System.out.println("Спасибо за выбор услуги!");}

        while (Summa > 290) ;

            System.out.println("Доступна услуга мобильного оповещения");

    }



    public  String getTypeServiceRetail() {
        return TypeServiceRetail;
    }

    public String setTypeServiceRetail(String typeService) {
        TypeServiceRetail = typeService;
        return typeService;
    }

    public double getSumma() {
        return Summa;
    }

    }