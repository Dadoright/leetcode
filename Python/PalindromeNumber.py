class Solution:
    def isPalindrome(self,x):
        inverse = 0
        remove = int(x)
        if(x<0):
            return False
        while(remove != 0):
            inverse = inverse*10+remove%10
            # print(inverse)
            remove = remove//10
            # print(remove)
        if(inverse==x):
            return True
        return False

s1 = Solution
print(s1.isPalindrome(s1,323))    