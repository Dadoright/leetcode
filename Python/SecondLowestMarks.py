lowest = 100.0
s=[]
for _ in range(int(input())):
        name = input()
        score = float(input())
        s.append([name,score])
        if(score<lowest):
            secondLowest = lowest
            lowest = score
        elif(score<secondLowest and score != lowest):
            secondLowest = score

print(s)
s.sort(key=lambda s:s[0])
print(s)

for i in range(len(s)):
    if(s[i][1] == secondLowest):
        print(s[i][0])


# lowest = 100.0
# s=[[]]
# for i in range(int(input())):
#     name = input()
#     score = float(input())
#     s[i][0] = name
#     s[i][1] = score
#     if(score<lowest):
#         lowest = score
#         secondLowest = lowest
    
# # s.sort(key=lambda s:s[0])
            
# for i in range(len(s)):
#     if(s[i][1] == secondLowest):
#         print(s[i][0])