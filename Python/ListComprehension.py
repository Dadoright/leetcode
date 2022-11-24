x = int(input("X "))
y = int(input("Y "))
z = int(input("Z "))
n = int(input("N "))

s = []


for j in range(x+1):
    for k in range(y+1):
        for l in range(z+1):
            if((j+k+l)!=n):
                s.append([j,k,l])

print(s)

