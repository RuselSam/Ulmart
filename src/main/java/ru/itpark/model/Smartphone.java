package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Smartphone extends Product {
    private double displayDiagonal;
    private int batteryCapacity;
    private int coreCapacity;
    private int ramCapacity;
    private int ssdCapacity;

    public Smartphone(String name, int price, int rating, String manufacture, double displayDiagonal, int batteryCapacity, int coreCapacity, int ramCapacity, int ssdCapacity) {
        super(0, name, price, rating, manufacture);
        this.displayDiagonal = displayDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.coreCapacity = coreCapacity;
        this.ramCapacity = ramCapacity;
        this.ssdCapacity = ssdCapacity;
    }

    @Override
    public String toString(){
        String result;
        result ="Id: "+super.getId()+"\n"+"Наименование товара: "+super.getName()+"\n"+"Цена: "+super.getPrice()+"\n"+"Рейтинг: "+super.getRating()
                +"\n"+"Производитель: "+super.getManufacture()+"\n"+"Диагональ дисплея: "+displayDiagonal+"\n"
                +"Емкость аккумулятора: "+batteryCapacity+"\n"+"Количестов ядер: "+coreCapacity+"\n"+"Объем оперативной памяти: "
                +ramCapacity+"\n"+"Объем жесткого диска: "+ssdCapacity+"\n";
        return result;
    }
}
