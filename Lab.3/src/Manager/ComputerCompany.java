package Manager;
import Enums.Parts;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComputerCompany {
    private List<Part> computerParts = new LinkedList<>();

    public ComputerCompany() {
    }

    public ComputerCompany(List<Part> parts) {
        this.computerParts = parts;
    }

    public void addPart(Part addPart) {
        computerParts.add(addPart);
    }

    public List<Part> getComputerParts() {
        return computerParts;
    }

    public void setComputerParts(List<Part> computerParts) {
        this.computerParts = computerParts;
    }

    public List<Part> sortByPriceAndBrand(List<Part> compParts) {
        compParts.sort(Comparator.comparing(Part::getBrand).thenComparing(Part::getPrice));
        return compParts;
    }


        public List<Part> createPCFromPartsCheaperThan(int maxPrice) {
            List<Part> cheapestParts = new LinkedList();
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.CPU));
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.MOTHERBOARD));
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.VIDEOCARD));
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.SCREEN));
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.KEYBOARD));
        cheapestParts.add(selectCheapestPart(maxPrice, Parts.MOUSE));

        int total = 0;
        for (Part part : cheapestParts) {
            total += part.getPrice();
        }
        if(total <= maxPrice) {
            return sortByPriceAndBrand(cheapestParts);
        } else {
            return new LinkedList<Part>();
        }
    }

    private Part selectCheapestPart(int maxPrice, Parts category) {
        Part min = new Part();
        min.setPrice(maxPrice);
        for(Part part : computerParts) {
            if(part.getCategory() == category && part.getPrice() < min.getPrice()) {
                min = part;
            }
        }
        return min;
    }
}








