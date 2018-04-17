package ua.lviv.iot.Manager;

import ua.lviv.iot.Enums.Parts;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComputerCompany {
    private List<Part> computerParts = new LinkedList<>();

    public ComputerCompany() {
    }

    public ComputerCompany(final List<Part> parts) {
        this.computerParts = parts;
    }

    public final void addPart(Part addPart) {
        computerParts.add(addPart);
    }

    public final List<Part> getComputerParts() {
        return computerParts;
    }

    public final List<Part> sortByPriceAndBrand(final List<Part> compParts) {
        compParts.sort(Comparator.comparing(Part::getBrand).thenComparing(Part::getPrice));
        return compParts;
    }


    public final List<Part> createPCFromPartsCheaperThan(final int maxPrice) {
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
        if (total <= maxPrice) {
            return sortByPriceAndBrand(cheapestParts);
        } else {
            return new LinkedList<Part>();
        }
    }

    public final Part selectCheapestPart(final int maxPrice, final Parts category) {
        Part min = new Part();
        min.setPrice(maxPrice);
        for (Part part : computerParts) {
            if (part.getCategory() == category && part.getPrice() < min.getPrice()) {
                min = part;
            }
        }
        return min;
    }
}
