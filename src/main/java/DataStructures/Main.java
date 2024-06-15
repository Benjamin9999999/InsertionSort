package DataStructures;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums = {10,1,9,2,8,3,7,4,6,5,20,11,19,12,18,13,17,14,16,15};
        int size = nums.length;
        for(int i=0; i<size; i++){
            int key = nums[i];
            int j =i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]= nums[j];
                j--;

            }
            nums[j+1]= key;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}