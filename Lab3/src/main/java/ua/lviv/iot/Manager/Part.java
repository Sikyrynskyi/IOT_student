package ua.lviv.iot.Manager;

import ua.lviv.iot.Enums.PartType;
import ua.lviv.iot.Enums.Parts;

public class Part {
    private int price;
    private String model;
    private String characteristics;
    private String brand;
    private PartType partType;
    private Parts category;

    public Part() {
    }

    public Part(final int newPrice, final String newModel, final String newCharacteristics, final String newBrand, final PartType newPartType, final Parts newCategory) {
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

    public String getHeaders(){
        return "Price, Model, Characteristics, Brand, PartType, Category";
    }

    public String toCSV() {
        return this.brand + ", " + this.characteristics  + ", " + this.model  + ", " + this.category + ", " + this.partType + ", " + this.price + ", " + getBrand() + ", " + getHeaders() + ", " + getPrice() + ", " + getCategory() + ".";
    }
}
