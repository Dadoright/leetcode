public class IsPalindrome {
    public static boolean palindrome(int a){
        int reversing = a;
        int inverse = 0;
        boolean value;
        while(reversing>0){
            inverse = (inverse*10)+(reversing%10);
            reversing = reversing/10;
        } 

        value = (inverse == a) ? true:false;
        return value;
        
    }

    public static void main(String []args){
        System.out.println(palindrome(545));
        System.out.println(palindrome(42));
    }
}
