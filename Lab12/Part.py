from Enums import PartType
from Enums import Parts


class Part:

    def __init__(self, price=0, model="unknown", characteristics="unknown", brand="unknown", partType=PartType.OTHER,
                 category=Parts.OTHER):
        self.price = price
        self.model = model
        self.characteristics = characteristics
        self.brand = brand
        self.partType = partType
        self.category = category


    def to_string(self):
        return "Category: " + self.category.name + "| Price: " + str(self.price) + "| Model: " + str(
            self.model) + "| Characteristics: " + str(self.characteristics) + "| Brand: " + str(
            self.brand) + "| Type : " + str(self.partType.name)

    def set_values(self, price, model, chars, brand, partType, parts):
        self.price = price
        self.model = model
        self.characteristics = chars
        self.brand = brand
        self.partType = partType
        self.parts = parts

    def __str__(self):
        return "Category: " + str(self.category) + " price: " + str(self.price) + " brand: " + str(self.brand)