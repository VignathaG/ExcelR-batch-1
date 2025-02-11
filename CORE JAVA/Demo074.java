import java.util.Arrays;
class Sort{
    int[] arr = {10,2,5,6};
    void input(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    void output(){
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

}

public class Demo074 {
    public static void main(String[] args) {
        Sort obj = new Sort();
        obj.input();
        obj.output();
       
        
    }
    
}