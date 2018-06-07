from Part import Part
from Enums import PartType
from Enums import Parts

class ComputerCompany:
    computerParts = []

    def __init__(self, computerParts):
        self.computerParts = computerParts

    def addPart(self, addPart):
        self.computerParts.append(addPart)

    def sortByPrice(self):
        self.computerParts.sort(key=lambda x: x.price, reverse=False)
        self.printList()

    def selectCheapestPart(self, maxPrice, category):
        min = Part(maxPrice)
        for part in self.computerParts:
            if part.category == category and part.price < min.price:
                min = part
        return min

    def createPCFromPartsCheaperThan(self, maxPrice):
        cheapestParts = []
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.CPU))
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.MOTHERBOARD))
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.VIDEOCARD))
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.SCREEN))
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.KEYBOARD))
        cheapestParts.append(self.selectCheapestPart(maxPrice, Parts.MOUSE))

        total = 0
        for part in cheapestParts:
            total += part.price

        if total <= maxPrice:
            for part in cheapestParts:
                print(part)
        else:
            return self.computerParts

    def printList(self):
        for i in self.computerParts:
            print(i)


