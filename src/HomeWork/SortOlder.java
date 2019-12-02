package HomeWork;
import java.util.*;

    public class SortOlder {
        public static void main(String[] args) {
            Scanner sort =new Scanner(System.in);
            int arr[]=new int[10];
            for(int i=0;i<arr.length;i++){
                arr[i]=sort.nextInt();
            }
            System.out.println("选择排序");
            SortOlder order=new SortOlder();
            order.selsetSort(arr);
            System.out.println("冒泡排序");
            order.MaoPao(arr);
            System.out.println("插入排序");
            order.Charu(arr);

        }
        //选择排序
        public  void selsetSort(int[] arr){
            int index;
            for(int i= 0;i<arr.length-1;i++) {
                index = i;
                for (int j = i + 1; j <= arr.length - 1; j++) {
                    if (arr[j] < arr[index]) {
                        index = j;
                    }
                }
                if (i != index) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
            for(int i:arr){
                System.out.println(i);
            }
        }
        //冒泡排序
        public void MaoPao(int[]arr){
            int temp;
            for(int i=0;i<arr.length;i++){
         for(int j=1;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
    }
}
            }
          for(int c: arr){
              System.out.println(c);
          }
        }
        public void Charu(int[]arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j = i+1;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                    }
                }
            }
            for(int c:arr){
                System.out.println(c);
            }
        }
    }



