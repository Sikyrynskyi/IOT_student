from enum import Enum


class PartType(Enum):
    GAMING = "gaming"
    OFFICE = "office"
    FORKIDS = "forKids"
    PORTABLE = "portable"
    OTHER = "other"

class Parts(Enum):
    CPU = "cpu"
    MOTHERBOARD = "motherboard"
    SCREEN = "screen"
    VIDEOCARD = "videocard"
    KEYBOARD = "keyboard"
    HEADPHONES = "headphones"
    MOUSE = "mouse"
    OTHER = "other"