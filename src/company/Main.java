package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Customer:");
        for(int i = 0; i< StaticConstants.CUSTOMER_LIST.size(); i++){
            System.out.println("Type " + i + " for customer:" + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

        System.out.println(customer.getUserName());

    }



}
