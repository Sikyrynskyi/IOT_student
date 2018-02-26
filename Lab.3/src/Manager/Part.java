package Manager;

import Enums.PartType;
import Enums.Parts;

public class Part {
    private int price;
    private String model;
    private String characteristics;
    private String brand;
    private PartType partType;
    private Parts category;

    public Part() {}

    public Part(int price, String model, String characteristics, String brand , PartType partType, Parts category) {
        this.price = price;
        this.partType = partType;
        this.brand = brand;
        this.model = model;
        this.characteristics = characteristics;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Category:" + this.category + " |Price:" + price + " |Model:" + model + " |Characters:" + characteristics + " |Brand:" + brand + " |Enums.PartType:" + partType + "\n";

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Parts getCategory() {
        return category;
    }

    public void setCategory(Parts category) {
        this.category = category;
    }
}
