import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer a=new Customer("Marcus");
       System.out.println(a.toString());

        System.out.println("*ES-1");
        List<Product>Products=new ArrayList<>();
        Products.add(new Product("LOTR","books",12.99));
        Products.add(new Product("HP","books",15.99));
        Products.add(new Product("His Dark Materials","books",34.99));
        Products.add(new Product("Lucky Strike","cigarettes",5.99));
        Products.add(new Product("Biberon","baby",7.99));
        Products.add(new Product("body","baby",4.99));
        Products.add(new Product("jeans","boys",19.99));
        Products.add(new Product("glasses","boys",24.99));
        System.out.println("*ES-1");
        List<Product>OnlyBooks=Products.stream().filter(product -> product.getCategory().equals("books")&& product.getPrice()<100).toList();
        OnlyBooks.forEach(product -> System.out.println(product.getName()+" "+product.getPrice()+"£"));


        System.out.println("*ES-2");
        List<Order>OrderList=new ArrayList<>();
        Order firstOrder=new Order("pending", LocalDate.now(),LocalDate.now().plusDays(3),a,Products);
        OrderList.add(firstOrder);
       List<Order>OnlyBabyOrders= OrderList.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("baby"))).toList();
        OnlyBabyOrders.forEach(System.out::println);
    }

    }
