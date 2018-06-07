public class Main {
    public static void main(String[] args){

        FishingRod fish = new FishingRod();
        FishingRod ribka = new FishingRod("The Amazing","Sporty",200,14);
        FishingRod shark = new FishingRod("White Shark", "Amature",300,20,4);

        System.out.println(fish.toString());
        System.out.println(ribka.toString());
        System.out.println(shark.toString());

        ribka.resetValues("Blue Whale", "very Sporty", 2500,10.3,3.5);

        shark.printSum();
        ribka.printSum();
        fish.printSum();

        shark.setPrice(180);

        FishingRod.prinStaticPrice();



    }
}
