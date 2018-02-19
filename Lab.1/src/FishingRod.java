public class FishingRod {
    public static double TotalPrices;
    private String model;
    private String type;
    private double price;
    private double length;
    private double weight;


    public FishingRod(){}

    public FishingRod(String model, String type, double price, double length){
        this.model = model;
        this.type = type;
        this.price= price;
        this.length = length;
        TotalPrices += price;
    }

    public FishingRod(String model, String type, double price, double length, double weight){
        this.model = model;
        this.type = type;
        this.price= price;
        this.length = length;
        this.weight = weight;
        TotalPrices += price;
    }

    public String toString(){
        String Info = "model: " + model + " type: " + type + " price: " + price + " length: " + length + " weight: " + weight;
        return Info;
    }

    static void prinStaticPrice(){
        System.out.println("Fishing Rods total price is: " + TotalPrices + " USD");
    }

    public void printSum() {
        System.out.println("Fishing rod: " + model + " type: " + type + " price is: " + price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void resetValues(String model, String type, int price, double length, double weight) {
        TotalPrices -= this.price;
        setModel(model);
        setType(type);
        setPrice(price);
        setLength(length);
        setWeight(weight);
        TotalPrices += price;
    }
}
