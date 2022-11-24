import sys


n = int(input())
arr = map(int, input().split())

largest = -sys.maxsize-1
secondLargest = -sys.maxsize-1

for i in list(arr):
    if (i>largest):
        secondLargest = largest
        largest = i
        # print("sl",secondLargest)
        # print("l",largest)
    
    elif(i>secondLargest and i!=largest):
        secondLargest = i
        # print("sl",secondLargest)
        # print("l",largest)
        

print(secondLargest)