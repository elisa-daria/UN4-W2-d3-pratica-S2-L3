import entities.Customer;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Customer a=new Customer("Marcus");
//        System.out.println(a.toString());

        System.out.println("*ES-1");
        List<Product>Products=new ArrayList<>();
        Products.add(new Product("LOTR","books",12.99));
        Products.add(new Product("HP","books",15.99));
        Products.add(new Product("His Dark Materials","books",34.99));
        Products.add(new Product("Lucky Strike","cigarettes",5.99));
        System.out.println("*ES-1");
        List<Product>OnlyBooks=Products.stream().filter(product -> product.getCategory().equals("books")&& product.getPrice()<100).toList();
        OnlyBooks.forEach(product -> System.out.println(product.getName()+" "+product.getPrice()+"£"));;
    }
}