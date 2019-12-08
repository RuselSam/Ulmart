package ru.itpark;

import ru.itpark.model.Smartphone;
import ru.itpark.model.TShort;
import ru.itpark.model.TV;
import ru.itpark.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {
        ProductRepository Repository = new ProductRepository();
        Repository.addProducts(new Smartphone("Iphone 11", 10000, 1, "Apple", 6.5, 30000, 5, 500, 300));
        Repository.addProducts(new TV("Телевизор Xiaomi", 100_000, 5, "Xiaomi", 45, true, "Ful HD" ));
        Repository.addProducts(new TShort("Футболка", 1_000, 2, "Nike", 43, "женская", "черная"));
        Repository.addProducts(new Smartphone("Iphone 6S", 50_000, 3, "Apple", 5.5, 3_000, 2, 250, 100));
        Repository.deleteProducts(3);
        System.out.println(Repository.getProduct());
    }

}
