package question6;

import java.util.List;

public class ShopTester {
    public static void main(String[] args) {
       Clothing jeans = new Clothing("Blue jeans",enumerationSize.M,20.00);
       Clothing tShirt = new Clothing("White T Shirt", enumerationSize.S, 5.00);
       Clothing buttonUp = new Clothing("Button up shirt", enumerationSize.L,30.00);

       //creating managers cart using an array
       String [] managercart = {jeans,tshirt, buttonUp};

       // create a manager object and give it a size small
        Manager manager = new Manager("manager Bob");
        enumerationSize managerSize = new enumerationSize("small");
        manager.se

    }
}
