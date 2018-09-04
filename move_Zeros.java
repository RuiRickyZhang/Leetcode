public class move_Zeros {

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int count = 0;
        int i = 0;
        for (i = 0; i < length; i++) {
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }

        for (int j = count; j < length; j++) {
            nums[j] = 0;
        }

        for(int k = 0; k < length; k++){
            System.out.println(nums[k]);
        }

    }

    public static void main(String []args){

        move_Zeros test = new move_Zeros();
        int[] cal = {-1,0,1,0,0,2,-1,4,0,0,0};
        test.moveZeroes(cal);
    }

}


