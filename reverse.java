public class reverse {

   public int reverse_num(int x) {
       long res = 0;
           while (x != 0) {
               res = 10 * res + x % 10;
               x /= 10;
           }

           if((res > Integer.MAX_VALUE)||res < Integer.MIN_VALUE){
               return 0;
           }else{
               int num = (int) res;
               return num;
           }
       }

    public static void main(String []args) {

       reverse result = new reverse();
       System.out.println(result.reverse_num(1534236469));

    }

}


