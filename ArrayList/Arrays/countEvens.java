package Arrays;

public class countEvens {
    public static void main(String[] args) {
        //int [] arr=new int[5];
        int arr[]={1,2,3,4,5};
        countEvenNumbers(arr);
    }

    public static void countEvenNumbers(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
