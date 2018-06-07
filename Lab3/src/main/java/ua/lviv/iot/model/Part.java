package ua.lviv.iot.model;

import ua.lviv.iot.Enums.PartType;
import ua.lviv.iot.Enums.Parts;

import javax.persistence.*;

@Entity

public class Part {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column (name= "part_id")
    private int id;
    @Column (name = "part_price")
    private int price;
    @Column (name = "model")
    private String model;
    @Column (name = "characteristics")
    private String characteristics;
    @Column (name = "brand")
    private String brand;
    @Column (name = "Type")
    private PartType partType;
    @Column (name = "category")
    private Parts category;


    public Part() {
    }

    public Part( final Integer id, final int newPrice, final String newModel, final String newCharacteristics, final String newBrand, final PartType newPartType, final Parts newCategory) {
        this.id = id;
        this.price = newPrice;
        this.partType = newPartType;
        this.brand = newBrand;
        this.model = newModel;
        this.characteristics = newCharacteristics;
        this.category = newCategory;
    }

    @Override
    public final String toString() {
        return "Category:" + this.category + " |Price:" + price + " |Model:" + model + " |Characters:" + characteristics + " |Brand:" + brand + " |Enums.PartType:" + partType + "\n";
    }

    public final int getPrice() {
        return price;
    }

    public final void setPrice(final int newPrice) {
        this.price = newPrice;
    }

    public final String getBrand() {
        return brand;
    }

    public final Parts getCategory() {
        return category;
    }

    public String getHeaders() {
        return "Price, Model, Characteristics, Brand, PartType, Category";
    }

    public String toCSV() {
        return this.brand + ", " + this.characteristics + ", " + this.model + ", " + this.category + ", " + this.partType + ", " + this.price + ", " + getBrand() + ", " + getHeaders() + ", " + getPrice() + ", " + getCategory() + ".";
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Part(int id){
        this.id = id;
    }
}
