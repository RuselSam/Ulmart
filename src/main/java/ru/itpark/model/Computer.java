package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer extends Product {
    private int coreCapacity;
    private int ramCapacity;
    private int ssdCapacity;


    public Computer(String name, int price, int rating, String manufacture, int coreCapacity, int ramCapacity, int ssdCapacity) {
        super(0, name, price, rating, manufacture);
        this.coreCapacity = coreCapacity;
        this.ramCapacity = ramCapacity;
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public String toString(){
        String result;
        result ="Наименование товара: "+super.getName()+"\n"+"Цена: "+super.getPrice()+"\n"+"Рейтинг: "+super.getRating()
                +"\n"+"Производитель: "+super.getManufacture()+"\n"+"Количестов ядер: "+coreCapacity+"\n"+"Объем оперативной памяти: "
                +ramCapacity+"\n"+"Объем жесткого диска: "+ssdCapacity+"\n";
        return result;
    }
}
