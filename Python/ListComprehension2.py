x = int(input("X "))
y = int(input("Y "))
z = int(input("Z "))
n = int(input("N "))

s = []

s = [[i,j,k] for i in range(x+1) for j in range(y+1) for k in range(z+1) if(i+j+k)!=n]

print(s)