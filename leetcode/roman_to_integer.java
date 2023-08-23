import java.util.HashMap;

public class roman_to_integer {

    public static int romanToInt(String s) {
        int res=0;
        char ar[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('L',50);
        map.put('X',10);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
         res=map.get(ar[ar.length-1]);
        for(int i=ar.length-2;i>=0;i--){
            
            if(map.get(ar[i])<map.get(ar[i+1]))
            res-=map.get(ar[i]);
            else
            res+=map.get(ar[i]);
            
        }
        return res;
        
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        
    }
    
}
