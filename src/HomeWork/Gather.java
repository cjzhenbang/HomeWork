package HomeWork;
import java.util.*;
public class Gather {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("g");
        list.add("ah");
        System.out.println("List集合迭代");
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(14);
        set.add(13);
        set.add(6);
        System.out.println("Set集合迭代");
        Iterator<Integer> ite=set.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        Map<String,Integer>map=new HashMap<>();
        map.put("cj",2019214010);
        map.put("ysy",2019214013);
        map.put("wxy",2019214008);
        map.put("fy",2019214018);
        map.put("jyn",2019214077);
        System.out.println("Map集合");
        for(String str:map.keySet()){
            Integer in=map.get(str);
            System.out.println("k"+str+"  "+"v"+in);
        }


    }
}
