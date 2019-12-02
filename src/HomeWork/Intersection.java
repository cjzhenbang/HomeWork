package HomeWork;
import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]b=new int[5];
        int[]c=new int[5];
        System.out.println("输入第一个数组");
        for(int i= 0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("输入第二个数组");
        for(int i= 0;i<c.length;i++){
            c[i]=sc.nextInt();
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i :b){
            list1.add(i);
        }
        for(int j:c){
            list2.add(j);
        }
        list1.retainAll(list2);
        for(int i =0;i<list1.size();i++){
        System.out.println(list1.get(i));
        }
    }


}
