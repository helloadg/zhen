package sortUtil;


import java.util.Arrays;

public class Test1 {
    /**
     * 二分法查找非递归
     * @param arr
     * @param data
     * @return
     */
    public static int find(int[]arr,int data){
        int mid=0;
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            mid=(right+left)/2;
            if(arr[mid]>data){
                right=mid-1;
            }else if(arr[mid]<data) {
                left=mid+1;
            }else {
                return arr[mid];
            }
        }
     return -1;
    }

    /**
     * 二分法查找递归
     * @param arr
     * @param data
     * @param left
     * @param right
     * @return
     */
    public static  int find(int[]arr,int data,int left,int right){
        if(left==right)return -1;
        int mid=(left+right)/2;
        if(arr[mid]==data) return arr[mid];
        return arr[mid]>data?find(arr,data,left,mid-1):find(arr,data,mid+1,right);
    }

    /**
     * 单链表反转递归
     * @param head
     * @return
     */
    public static Node  reverse(Node head){
        if(null==head||null==head.getNext()) return head;
        Node reHead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reHead;
    }

    /**
     * 单链表反转非递归
     * @param head
     * @return
     */
    public static Node reverse1(Node head){
        if(null==head) return head;
        Node pre=head;
        Node cur=head.getNext();
        Node temp;
        while (null!=cur){
            temp=cur.getNext();
            cur.setNext(pre);
            pre=cur;
            cur=temp;
        }
        head.setNext(null);
        return pre;
    }

    /**
     * 打印链表到控制台
     * @param head
     */
    public static void printNode(Node head){
        while (null!=head.getNext()){
            System.out.print(head.getValue());
            System.out.print(",");
            head=head.getNext();
        }
        System.out.println(head.getValue());
    }

    public static void frontTravelsal(TreeNode treeNode){
        System.out.print(treeNode.getValue());
        System.out.print(",");
        if(null!=treeNode.getLeft()){
            frontTravelsal(treeNode.getLeft());
        }
        if(null!=treeNode.getRight()){
            frontTravelsal(treeNode.getRight());
        }
    }

    public static void midTravelsal(TreeNode treeNode){
        if(null!=treeNode.getLeft()){
            midTravelsal(treeNode.getLeft());
        }
        System.out.print(treeNode.getValue());
        System.out.print(",");
        if(null!=treeNode.getRight()){
            midTravelsal(treeNode.getRight());
        }
    }

    public static void afterTravelsal(TreeNode treeNode){

    }

    public static void main(String[] args) {
       /* int[] arr={3,5,8,4,2,1,9};
        QuickSortUtil.quickSort(arr,0,arr.length-1);
        System.out.println("排序结果："+Arrays.toString(arr));
        System.out.println(find(arr,0));
        System.out.println(find(arr,88,0,arr.length-1));*/
       /* Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Node h=node1;
        //printNode(h);
        Node newHead = reverse(node1);
        printNode(newHead);
        Node node = reverse1(newHead);
        printNode(node);*/

       /*TreeNode treeNode=new TreeNode(10);
       TreeNode treeNode1=new TreeNode(6);
       TreeNode treeNode2=new TreeNode(14);
       TreeNode treeNode3=new TreeNode(4);
       TreeNode treeNode4=new TreeNode(8);
       TreeNode treeNode5=new TreeNode(12);
       TreeNode treeNode6=new TreeNode(16);
       treeNode.setLeft(treeNode1);
       treeNode.setRight(treeNode2);
       treeNode1.setLeft(treeNode3);
       treeNode1.setRight(treeNode4);
       treeNode2.setLeft(treeNode5);
       treeNode2.setRight(treeNode6);*/
      //  frontTravelsal(treeNode);
      /*  midTravelsal(treeNode);*/
        int[]arr={1, 3, 4, 5, 2, 6, 9, 7, 8, 0 };
       QuickSortUtil.heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }


}

class Node{
  private   int value;
  private  Node next;
  public Node(int value){
      this.value=value;
  }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class TreeNode{
 private   int value;
 private   TreeNode left;
 private   TreeNode right;

 public TreeNode(int value){
     this.value=value;
 }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}