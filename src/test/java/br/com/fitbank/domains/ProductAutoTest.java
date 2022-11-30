package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;



public class ProductAutoTest {
    public static void main(String[] args) {
        ProductType type = ProductType.CARD;
        float value = (float) 25.05;
        String vehicleBrand = "brand";
        String vehicleModel = "model";
        int installments = 15;
        String vehicleModelYear = "year";
        String codeFipe = "fipe";
        float vehicleFipeValue = (float) 444.3;

        ProductAuto productAuto = new ProductAuto(type, value, vehicleBrand, vehicleModel, installments, vehicleModelYear, codeFipe, vehicleFipeValue);
        System.out.println(productAuto);
        System.out.println("_______");

        String s = JSON.getGson().toJson(productAuto);
        System.out.println(s);
        System.out.println("_______");

        ProductAuto newProductAuto = JSON.getGson().fromJson(s, ProductAuto.class);
        System.out.println(newProductAuto);
        System.out.println(newProductAuto.getType());
        System.out.println(newProductAuto.getValue());
        System.out.println(newProductAuto.getVehicleBrand());
        System.out.println(newProductAuto.getVehicleModel());
        System.out.println(newProductAuto.getInstallments());
        System.out.println(newProductAuto.getVehicleModelYear());
        System.out.println(newProductAuto.getCodeFipe());
        System.out.println(newProductAuto.getVehicleFipeValue());
    }
}
