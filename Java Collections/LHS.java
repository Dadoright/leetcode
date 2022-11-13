import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHS {
    public static void main(String[] args){
        LinkedHashSet<String> set = new LinkedHashSet<String>();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        
        System.out.println(set);

        HashSet<String> set2 = new HashSet<String>();  
        set2.add("One");    
        set2.add("Two");    
        set2.add("Three");   
        set2.add("Four");  
        set2.add("Five");
        
        System.out.println(set2);
    }
    
    
}
