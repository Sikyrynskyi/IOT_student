package Main;

import Enums.PartType;
import Enums.Parts;
import Manager.ComputerCompany;
import Manager.Part;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        List<Part> parts = new LinkedList<Part>();
        ComputerCompany ItCenter = new ComputerCompany(parts);

        parts.add(new Part(3400, "Ryzen 3", "Socket AM4", "AMD", PartType.OFFICE, Parts.CPU));
        parts.add(new Part(3500, "Core i3", "some", "Intel", PartType.OFFICE, Parts.CPU));
        parts.add(new Part(1025, "H81M", "PCIe ", "ASRock", PartType.OFFICE, Parts.MOTHERBOARD));
        parts.add(new Part(1205, "Z370", "PCI-Ex16", "MSI", PartType.GAMING, Parts.MOTHERBOARD));
        parts.add(new Part(2599, "GeForce GT 1030", "GDDR5", "Gigabyte", PartType.GAMING, Parts.VIDEOCARD));
        parts.add(new Part(2258, "GeForce GT 730", "GDR5", "Gigabyte", PartType.OFFICE, Parts.VIDEOCARD));
        parts.add(new Part(3999, "22MP68VQ-P", "21.5\"", "LG", PartType.GAMING, Parts.SCREEN));
        parts.add(new Part(8129, "MB169B", "15.6\"", "ASUS", PartType.PORTABLE, Parts.SCREEN));
        parts.add(new Part(3569, "223V7QHSB ", "21.5\"", "Philips", PartType.OFFICE, Parts.SCREEN));
        parts.add(new Part(90, "Standard 502", "USB", "Real-El", PartType.OFFICE, Parts.KEYBOARD));
        parts.add(new Part(699, "Be Fire", "USB", "Aula", PartType.GAMING, Parts.KEYBOARD));
        parts.add(new Part(599, "Interceptor DS B1", "USB", "MSI", PartType.GAMING, Parts.MOUSE));
        parts.add(new Part(174, "Mr-401-M", "Wireless", "Maxxter", PartType.OFFICE, Parts.MOUSE));

        boolean menu = true;
        while (menu) {

            System.out.println("Menu:");
            System.out.println("1: Create the Computer from cheapest parts");
            System.out.println("2: Print parts");
            System.out.println("3: Print sorted parts");
            System.out.println("4: Exit");

            Scanner scan = new Scanner (System.in);
            int num = scan.nextInt();

            switch (num){
                case 1: {
                    System.out.println(ItCenter.createPCFromPartsCheaperThan(13500));

                    break;
                }
                case 2: {
                    System.out.print(ItCenter.sortByPriceAndBrand(parts));
                    break;
                }
                case 3: {
                    System.out.println(ItCenter.sortByPriceAndBrand(parts));
                }
                case 6: default: {
                    menu = false;
                    System.out.println("Exit program...");
                    break;
                }
            }


        }
    }
}