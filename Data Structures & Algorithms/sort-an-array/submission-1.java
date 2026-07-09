class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int[] mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        return merge(arr, left, mid, right);
    }

    public int[] merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int main = left;
        int l = 0, r = 0;

        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] <= rightArr[r]) {
                arr[main] = leftArr[l];
                l++;
            } else {
                arr[main] = rightArr[r];
                r++;
            }
            main++;
        }

        while (l < leftArr.length) {
            arr[main] = leftArr[l];
            l++;
            main++;
        }

        while (r < rightArr.length) {
            arr[main] = rightArr[r];
            r++;
            main++;
        }

        return arr;
    }
}