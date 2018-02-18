public class Main {
    public static void main(String[] args){

        FishingRod Fish = new FishingRod();
        FishingRod Ribka = new FishingRod("The Amazing","Sporty",200,14);
        FishingRod Shark = new FishingRod("White Shark", "Amature",300,20,4);

        System.out.println(Fish.toString());
        System.out.println(Ribka.toString());
        System.out.println(Shark.toString());

        Ribka.resetValues("Blue Whale", "very Sporty", 2500,10.3,3.5);

        Shark.printSum();
        Ribka.printSum();
        Fish.printSum();

        Shark.setPrice(180);

        FishingRod.prinStaticPrice();



    }
}
