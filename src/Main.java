import Entities.Costumer;
import Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Costumer cliente1 = new Costumer("Gianni", 2);
        Costumer cliente2 = new Costumer("Claudia", 2);
        Costumer cliente3 = new Costumer("Chris", 1);

        Product articolo1 = new Product("Xbox series x", "Electronics", 185.99);
        Product articolo2 = new Product("Lenovo legion laptop", "Electronics", 995.99);
        Product articolo3 = new Product("Gameboy color", "Electronics", 75.99);
        Product articolo4 = new Product("Iphone 250", "Electronics", 105.99);
        Product articolo5 = new Product("iliade", "Book", 25.99);
        Product articolo6 = new Product("Pandistelle", "Food", 5.99);
        Product articolo7 = new Product("Pizza", "Food", 5.99);
        Product articolo8 = new Product("Salmone", "Food", 5.99);
        Product articolo9 = new Product("Odissea", "Book", 15.99);
        Product articolo10 = new Product("The witcher", "Book", 205.99);
        Product articolo11 = new Product("Narnia ", "Book", 75.99);
        Product articolo12 = new Product("Harry potter", "Book", 199.99);


        List<Product> Listaprodotti = new ArrayList<>();

        Listaprodotti.add(articolo1);
        Listaprodotti.add(articolo2);
        Listaprodotti.add(articolo3);
        Listaprodotti.add(articolo4);
        Listaprodotti.add(articolo5);
        Listaprodotti.add(articolo6);
        Listaprodotti.add(articolo7);
        Listaprodotti.add(articolo8);
        Listaprodotti.add(articolo9);
        Listaprodotti.add(articolo10);
        Listaprodotti.add(articolo11);
        Listaprodotti.add(articolo12);


        Listaprodotti.stream().filter(product -> product.getCategory().equals("Book") && product.getPrice() > 100);
        Listaprodotti.stream().toList();

        List<Product> libriCostosi = Listaprodotti.stream()
                .filter(product -> product.getCategory().equals("Book") && product.getPrice() > 100)
                .toList();

        libriCostosi.forEach(System.out::println);


    }


}
