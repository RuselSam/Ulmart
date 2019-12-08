package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TV extends Product{
    private double displayDiagonal;
    private boolean smartTv;
    private String displayResolution;

    public TV(String name, int price, int rating, String manufacture, double displayDiagonal, boolean smartTv, String displayResolution) {
        super(0, name, price, rating, manufacture);
        this.displayDiagonal = displayDiagonal;
        this.smartTv = smartTv;
        this.displayResolution = displayResolution;
    }

    @Override
    public String toString(){
        String result;
        result ="Id: "+super.getId()+"\n"+"Наименование товара: "+super.getName()+"\n"+"Цена: "+super.getPrice()+"\n"+"Рейтинг: "+super.getRating()
                +"\n"+"Производитель: "+super.getManufacture()+"\n"+"Диагональ дисплея: "+displayDiagonal+"\n"
                +"Разрешение экрана: "+displayResolution+"\n";
        if(smartTv==true){
            result +="Смарт тв"+"\n";
        }else {
            return  result;
        }
        return result;
    }
}
