package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TShort extends Product {
    private int size;
    private String sex;
    private String colors;

    public TShort(String name, int price, int rating, String manufacture, int size, String sex, String colors) {
        super(0, name, price, rating, manufacture);
        this.size = size;
        this.sex = sex;
        this.colors = colors;
    }

    @Override
    public String toString(){
        String result;
        result ="Id: "+super.getId()+"\n"+"Наименование товара: "+super.getName()+"\n"+"Цена: "+super.getPrice()+"\n"+"Рейтинг: "+super.getRating()
                +"\n"+"Производитель: "+super.getManufacture()+"\n"+"Размер: "+size+"\n"+"Пол: "+sex+"\n"+"Цвет: "+colors+"\n";
        return result;
    }
}
