import java.util.*;
public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(5);
        al.set(3,36);
        System.out.println(al);
        al.remove(4);
        al.remove((Integer)(1));
        System.out.println(al.size());
        for(int i:al){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");

        }
    }
}
