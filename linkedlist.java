import java.util.*;
public class Practice6 {
    public static void main(String[] args) {
        String[]things = {"car", "house", "mother", "sister", "brother", "zai"};
        List<String> list1 = new LinkedList<String>();
        for(String i: things)
            list1.add(i);
        
        String[]things2 ={"orange","apple","grapes","melon","watermelon"};
        List<String> list2 = new LinkedList<String>();
        for(String j: things2)
            list2.add(j);
        
        list1.addAll(list2);
        list2 =null;
        
        printMe(list1);
        removeStuff(list1, 2,5);
        printMe(list1);
        reverseMe(list1);
    }
    //printMe method
    private static void printMe(List<String> l){
        for(String b: l)
            System.out.printf("%s ", b);
        System.out.println();
    }
    //removeStuff method
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }
    //reverseMe method
    private static void reverseMe(List<String> l){
        ListIterator<String> reverse = l.listIterator(l.size());
        while(reverse.hasPrevious())
            System.out.printf("%s ",reverse.previous());
    }
}
