public class TwoPointerReverse{

    public static int reverse(int[] arr){
        if(arr.length==0) return 0;

        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]<arr[right]){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
        }
    }

    pubic static void main(String args[]){
        int[] arr={10,20,30,40};
        reverse(arr);
        for(int a:arr){
        System.out.println(a)


        }
    }
}