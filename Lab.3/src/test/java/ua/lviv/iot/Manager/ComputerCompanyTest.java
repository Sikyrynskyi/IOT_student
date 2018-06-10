package ua.lviv.iot.Manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.Enums.PartType;
import ua.lviv.iot.Enums.Parts;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerCompanyTest {
    private Part amd = new Part(3400, "Ryzen 3", "Socket AM4", "AMD",PartType.OFFICE, Parts.CPU);
    private Part intel = new Part(3500, "Core i3", "some", "Intel", PartType.OFFICE, Parts.CPU);
    private Part motherboard = new Part(1025, "H81M", "PCIe ", "ASRock", PartType.OFFICE, Parts.MOTHERBOARD);
    private Part screen = new Part(3999, "22MP68VQ-P", "21.5\"", "LG", PartType.GAMING, Parts.SCREEN);
    private Part asus = new Part(8129, "MB169B", "15.6\"", "ASUS", PartType.PORTABLE, Parts.SCREEN);
    private Part videocard = new Part(2258, "GeForce GT 730", "GDR5", "Gigabyte", PartType.OFFICE, Parts.VIDEOCARD);
    private Part keyboard = new Part(699, "Be Fire", "USB", "Aula", PartType.GAMING, Parts.KEYBOARD);
    private Part mouse = new Part(599, "Interceptor DS B1", "USB", "MSI", PartType.GAMING, Parts.MOUSE);

    private List<Part> testParts = new LinkedList<>();                                                  

    private ComputerCompany testCompany = new ComputerCompany();

    @Test
    public void sortByPriceAndBrand() {
        testCompany.getComputerParts().add(amd);
        testCompany.getComputerParts().add(screen);
        testCompany.getComputerParts().add(mouse);
        testCompany.getComputerParts().add(motherboard);
        testCompany.getComputerParts().add(videocard);
        testCompany.getComputerParts().add(keyboard);


        testParts.add(amd);
        testParts.add(motherboard);
        testParts.add(keyboard);
        testParts.add(videocard);
        testParts.add(screen);
        testParts.add(mouse);

        List<Part> result = testCompany.sortByPriceAndBrand(testCompany.getComputerParts());
        assertEquals(result, testParts);
    }

    @Test
    public void selectCheapestPartTest() {
        testCompany.getComputerParts().add(amd);
        testCompany.getComputerParts().add(intel);

        Part result = testCompany.selectCheapestPart(4000, Parts.CPU);
        assertEquals(result, amd);
    }

    @Test
    public void createPCFromPartsCheaperThanTest() {
        testCompany.getComputerParts().add(amd);
        testCompany.getComputerParts().add(intel);
        testCompany.getComputerParts().add(motherboard);
        testCompany.getComputerParts().add(screen);
        testCompany.getComputerParts().add(asus);
        testCompany.getComputerParts().add(videocard);
        testCompany.getComputerParts().add(keyboard);
        testCompany.addPart(mouse);

        testParts.add(amd);
        testParts.add(motherboard);
        testParts.add(keyboard);
        testParts.add(videocard);
        testParts.add(screen);
        testParts.add(mouse);

        List<Part> result = testCompany.createPCFromPartsCheaperThan(13500);
        assertEquals(result, testParts);

        testParts.clear();
        List<Part> cheaperResult = testCompany.createPCFromPartsCheaperThan(1350);
        assertEquals(cheaperResult, testParts);
    }

    @Test
    public void writerTest(){
        testCompany.addPart(intel);
        testCompany.addPart(amd);
        testCompany.addPart(asus);
        testCompany.addPart(motherboard);
        testCompany.addPart(keyboard);
        WriteParts writer = new WriteParts();
        writer.writeToFile(List<Part>);
    }

}
