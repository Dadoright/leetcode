class Solution:
    def RomanToInt(self,s):
        roman = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000
        }
        num = 0
        temp = 0
        sol = 0
        a = 0
        while(a != len(s)):    
            #print(s[num])
            # if(s[num] != s[-1] and s[num] == s[num+1] ):
            #     temp = temp + roman.get(s[num])
            #     print(temp)
            
            if(a!= (len(s)-1) and s[a] != s[a+1]):
                temp = temp + roman.get(s[a])
                # print("Temp in 1 ",temp)
                if(roman.get(s[a])>roman.get(s[a+1])):
                    sol = sol + temp
                    temp = 0
                
                    print(sol)
                if(roman.get(s[a])<roman.get(s[a+1])):
                    # temp = temp + roman.get(s[a])
                    sol = sol - temp
                    temp = 0

            if(a!=(len(s)-1) and s[a] == s[a+1]):
                temp = temp + roman.get(s[a])
                # print(temp)
            
            if(a==(len(s)-1)):
                # print("last character")
                temp = temp + roman.get(s[a])
                sol = sol+temp
                print(sol)

            a = a + 1
            return sol
            
val = input("Enter a roman number in Capital ")
R1 = Solution()
R1.RomanToInt(val)
        