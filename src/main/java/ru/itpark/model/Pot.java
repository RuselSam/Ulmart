package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pot extends Product{
    private double volumeCapacity;
    private String color;
    private String material;

    public Pot(String name, int price, int rating, String manufacture, double volumeCapacity, String color, String material) {
        super(0, name, price, rating, manufacture);
        this.volumeCapacity = volumeCapacity;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString(){
        String result;
        result ="Наименование товара: "+super.getName()+"\n"+"Цена: "+super.getPrice()+"\n"+"Рейтинг: "+super.getRating()
                +"\n"+"Производитель: "+super.getManufacture()+"\n"+"Объем горшка: "+volumeCapacity+"\n"+"Цвет: "+color
    +"\n"+"Материал: "+material+"\n";
        return result;
    }
}
