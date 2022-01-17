package ru.Bank.Services;

import ru.Bank.Services.Type.RetailService;

public class Service {

    private String serviceName;
    private String serviceType;
    private double servicePrice;
    private String dateOfService;
    private String offerName;
    private double offerNumber;
    private RetailService retailService;

    public Service(){
        serviceName="Выдача кредита";
        retailService =new RetailService();
    }
    public RetailService getRetailService() {
        return retailService;
    }

    public static void main(String[] args) {

        Service bankService = new Service();
        System.out.println("Розничная услуга "+ bankService.getRetailService().getTypeServiceRetail());
        System.out.println("Стоимость услуги "+bankService.getRetailService().getSumma());

    }

}






