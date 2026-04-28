public class BinarySearch{
    public static int search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<high){

            int mid =low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }


    public static void main (String[] args){
        int target=454;
        int[] arr= {784,2,56,12,67,232,543,1,454,90};
		
		System.out.println(search(arr,target));
    }
}