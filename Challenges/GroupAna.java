package Medium;

import java.util.*;

public class GroupAna {
    public static void main(String[] args) {
        String[] a = {"dog","cat","god","tac","act"};
        isAna(a);
    }

    static void isAna(String[] a){
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(a));

        for(int i=0;i< a.length;i++){
            char[] store = a[i].toCharArray();
            Arrays.sort(store);
            a[i] = new String(store);
        }
        System.out.println("Sorted array is " + Arrays.toString(a));
        System.out.println("Original array is "+ temp);


        List<List<Integer>> group = new ArrayList<>();
        List<Integer> test = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            List<Integer> pair = new ArrayList<>();
            for (int j = i+1; j < a.length; j++) {
                if(a[i].equals(a[j])) {
                    if (!test.contains(i)) {
                        test.add(i);
                        pair.add(i);
                    }
                    if(!test.contains(j)){
                        test.add(j);
                        pair.add(j);
                    }
                }
                if(pair.size()!=0){
                    group.add(pair);
                }
            }
        }
        List<List<Integer>> abc = new ArrayList<>(new HashSet<>(group));
        System.out.println(abc);











//        Set<List<String>> printer = new HashSet();

//        for(int i=0;i<a.length;i++){
//            List<String> pair = new ArrayList<>();
//            for(int j=0;j< a.length;j++){
//
//                if(a[i] == a[j]){
//                    pair.add(temp.get(j));
//                }
//            }
//
//            printer.add(pair);
//            group.add(pair);
//        }
//        System.out.println("Using SET "+ printer);
//        System.out.println("Using List " + group);
//        return group;
    }

}
