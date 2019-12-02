package HomeWork;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String str1=sc.nextLine();
        System.out.println("请输入第二个字符串");
        String str2=sc.nextLine();
        Same same=new Same();
        same.Strsame(str1,str2);

    }
    public void Strsame(String str1,String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
        ArrayList list= new ArrayList();
        for(int i =0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    list.add(ch1[i]);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(list.get(i));
                }
            }
        }
        for (int i= 0;i<list.size();i++){
            System.out.println(list.get(i)+"   ");
        }
    }
}