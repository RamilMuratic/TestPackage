package ru.Bank.Services;

import ru.Bank.Services.Type.RetailService;

public class BankService {

    private String serviceName;

    private double servicePrice;
    private String dateOfService;
    private String offerName;
    private double offerNumber;
    private RetailService retailService;

    public BankService(){
        serviceName="Выдача кредита";
        retailService =new RetailService();

    }
    public RetailService getRetailService() {
        return retailService;
    }

    public static void main(String[] args) {

        BankService bankService = new BankService();
        System.out.println("Розничная услуга "+ bankService.getRetailService().getTypeServiceRetail());
        System.out.println("Стоимость услуги "+bankService.getRetailService().getSumma());

    }


}






