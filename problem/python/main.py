import sys

# number_letter_count(i)
# returns the number of letters in integer i, not including spaces, commas, or hyphens
def number_letter_count(i):
    pass

# number_letter_counts(min,max)
# returns the number of letters in all integers in the range min to max, inclusive
def number_letter_counts(min,max):
    pass

if __name__ == "__main__":
    try:
        min = int(sys.argv[1])
        max = int(sys.argv[2])
    except:
        print(f"usage: python3 main.py min max")
        exit()
    result = number_letter_counts(min,max)
    print(f"number_letter_counts({min},{max}) = {result}")
