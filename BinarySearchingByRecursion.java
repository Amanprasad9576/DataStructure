public class BinarySearchingByRecursion {
        static int BinarySearch(int[] arr, int start, int end, int target) {
            int n = arr.length;
            int mid = (start + end) / 2;
            while (start <= end) {
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] > target) {
                    return BinarySearch(arr, start, mid - 1, target);
                }
                else {
                    return  BinarySearch(arr, mid + 1, end, target);
                }
            }
            return -1;
        }

        public static void main (String[]args){
            int[] arr = {5, 10, 15, 19, 23, 29, 43, 67, 97};
            int result = BinarySearch(arr, 0, arr.length - 1, 5);
            System.out.println(result);
        }
    }
