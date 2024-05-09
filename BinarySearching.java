public class BinarySearching {
    static int BinarySearch(int []arr,int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            else if ( arr[mid] > target) {
                 end = mid - 1;
            } else {
                 start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={5,10,15,19,23,29,43,67,97};
        int result=BinarySearch(arr,4);
        System.out.println(result);
    }
}
