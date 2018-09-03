import java.util.HashMap;

public class RomantoInteger {

    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < s.length(); ++i){
            if((i ==0) || (map.get(s.charAt(i)) <= (map.get(s.charAt(i - 1))))){
                res += map.get(s.charAt((i)));
            }

            else{
                res = res + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }
        }
        return res;
    }

    public static void main(String []args) {

        RomantoInteger result = new RomantoInteger();
        System.out.println(result.romanToInt("IX"));

    }

}
