//This answer seems wrong

import sys

roman = {
    "I" : 1,
    "V" : 5,
    "X" : 10,
    "L" : 50,
    "C" : 100,
    "D" : 50,
    "M" : 1000
}

val = input("roman number ")
pre = sys.maxsize
ans = 0

for i in range (len(val)):
    cur = roman.get(val[i])
    if(pre >= cur):
        ans = ans + cur
        pre = cur
    else:
        ans = ans - cur
        pre = cur

print(ans)