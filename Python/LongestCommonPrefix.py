class Solution:
    def LongestCommonPrefix(self,s):
        prefix = s[0]
        for i in range (len(s)):
            for j in range(len(prefix)):
                if(j<len(s[i]) and prefix[j]==s[i][j]):
                    # print(prefix,i,j)
                    continue
                else:
                    prefix = prefix[:j]
                    # print(prefix)
                    break
        return (prefix)

s1 = Solution()
s2 = s1.LongestCommonPrefix(["flower","flow","flight"])
print(s2)