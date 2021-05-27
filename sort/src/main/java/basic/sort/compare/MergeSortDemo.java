package basic.sort.compare;

/**
 * @version V1.0
 * @Description:
 * @author: ying.ding
 * @date: 2021/5/27 5:42 下午
 */
public class MergeSortDemo {

    public int[] mergeSort(int[] input, int left, int right) {
        int mid = (left + right) / 2;
        if(left < right) {
            mergeSort(input, left, mid);
            mergeSort(input, mid, right);
        }
        return merge(input, left, mid, right);
    }

    private int[] merge(int[] input, int begin, int mid, int end) {

    }
}
