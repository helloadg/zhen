package sortUtil;

import java.util.Arrays;

public class QuickSortUtil {
    /**
     * 快速排序 递归
     * @param arr 数组
     * @param left 左坐标 0
     * @param right 右坐标 length-1
     */
    public static void quickSort(int[]arr,int left,int right){
        if(arr.length==0) return;
        if(left>right) return;
        System.out.println("arr="+Arrays.toString(arr)+" ,left="+left+",right="+right);
        int index = midIndex(arr, left, right);
        quickSort(arr,left,index-1);
        quickSort(arr,index+1,right);
    }


    public static void heapSort(int[] arr){
       for (int i=arr.length/2;i>=0;i--){
           adjustHeap(arr,i,arr.length);
       }
       for(int i=arr.length-1;i>=0;i--){
           int temp=arr[i];
           arr[i]=arr[0];
           arr[0]=temp;
           adjustHeap(arr,0,i);
       }
    }


    /**
     * 左右指针移动交换，返回下次递归分割点
     * @param arr 数组
     * @param left 左坐标
     * @param right 右坐标
     * @return 分割点
     */
    private static int midIndex(int[]arr,int left,int right){
    int mid=arr[left];
    System.out.println("mid="+mid);
    while (left<right){

        while (left<right&&arr[right]>=mid){
            right--;
        }
        arr[left]=arr[right];
        System.out.println("right move:"+Arrays.toString(arr));
        while (left<right&&arr[left]<mid){
            left++;
        }
        arr[right]=arr[left];
        System.out.println("left move:"+Arrays.toString(arr));
    }
    arr[left]=mid;
    return left;
}

    /**
     * 调整生成堆
     * @param arr 数组
     * @param parent 父节点坐标
     * @param length 调整堆数组长度
     */
    private static void adjustHeap(int[]arr ,int parent, int length){
      int child=2*parent+1;
      int temp=arr[parent];
      while (child<length){

          if(child+1<length&&arr[child]<arr[child+1]){
              child++;
          }
          if(temp>arr[child]){
              break;
          }
          arr[parent]=arr[child];
          parent=child;
          child=2*parent+1;
      }

      arr[parent]=temp;
    }




}
