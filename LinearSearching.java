public class LinearSearching{
    public static int search(int[] arr,int target){
        for(int i=0;i < arr.length-1;i++){
            if(arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int target=89;
        int[] arr={78,89,90,234,53};

        int result =System.out.println(search(arr,target));

if(result==-1){
    System.out.println(NOT SORTED.....)
}
    }
}