package ru.itpark.repository;

import ru.itpark.model.*;
import java.util.ArrayList;


public class ProductRepository {
    private ArrayList<Product> Products = new ArrayList<>();

        private long nextId=1;
        public void addProducts(Product item){
            item.setId(nextId++);
            Products.add(item);
        }

        public boolean deleteProducts(long id){
            return Products.removeIf(o->o.getId()==id);
        }
        public String getProduct(){
            return Products.toString();
        }

}
