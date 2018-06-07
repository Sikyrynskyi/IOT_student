from Part import Part
from ComputerCompany import *
from Enums import PartType
from Enums import Parts

if __name__ == "__main__":
    parts = []


    parts.append(Part(3400, "Ryzen 3", "Socket AM4", "AMD", PartType.OFFICE, Parts.CPU))
    parts.append(Part(3500, "Core i3", "some", "Intel", PartType.OFFICE, Parts.CPU))
    parts.append(Part(1025, "H81M", "PCIe ", "ASRock", PartType.OFFICE, Parts.MOTHERBOARD))
    parts.append(Part(1205, "Z370", "PCI-Ex16", "MSI", PartType.GAMING, Parts.MOTHERBOARD))
    parts.append(Part(2599, "GeForce GT 1030", "GDDR5", "Gigabyte", PartType.GAMING, Parts.VIDEOCARD))
    parts.append(Part(2258, "GeForce GT 730", "GDR5", "Gigabyte", PartType.OFFICE, Parts.VIDEOCARD))
    parts.append(Part(3999, "22MP68VQ-P", "21.5\"", "LG", PartType.GAMING, Parts.SCREEN))
    parts.append(Part(8129, "MB169B", "15.6\"", "ASUS", PartType.PORTABLE, Parts.SCREEN))
    parts.append(Part(3569, "223V7QHSB ", "21.5\"", "Philips", PartType.OFFICE, Parts.SCREEN))
    parts.append(Part(90, "Standard 502", "USB", "Real-El", PartType.OFFICE, Parts.KEYBOARD))
    parts.append(Part(699, "Be Fire", "USB", "Aula", PartType.GAMING, Parts.KEYBOARD))
    parts.append(Part(599, "Interceptor DS B1", "USB", "MSI", PartType.GAMING, Parts.MOUSE))
    parts.append(Part(174, "Mr-401-M", "Wireless", "Maxxter", PartType.OFFICE, Parts.MOUSE))
    itCenter = ComputerCompany(parts)

    itCenter.sortByPrice()
    print("\n")
    itCenter.createPCFromPartsCheaperThan(14000)
