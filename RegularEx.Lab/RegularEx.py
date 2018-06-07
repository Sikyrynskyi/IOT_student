import re

if __name__ == '__main__':

    pattern = '0[7-8]/Mar/2004:[0-2][0-9]:[0-5][0-9]:[0-5][0-9].*GET.*TWiki'

    with open("log.txt") as file:
        for line in file:
            match = re.search(pattern, line)
            if match:

                print(line)