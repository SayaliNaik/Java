package Arrays;

import java.util.*;

public class FindTriplets {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 2};
        triplets(a);
    }

    static void triplets(int[] a) {
        Arrays.sort(a);
        HashMap<List<Integer>, Integer> hmap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i + 1; j < a.length; j++) {
                sum = a[i] + a[j];
                List<Integer> pair = new ArrayList<>();
                pair.add(a[i]);
                pair.add(a[j]);
                if (!hmap.containsValue(sum)) {
                    hmap.put(pair, sum);
                } else {
                    System.out.println(hmap.get(pair));
                }
            }

        }
        System.out.println(hmap);
        for (int i = 0; i < a.length; i++) {
            for (Map.Entry mentry : hmap.entrySet()) {
                if (mentry.getValue().equals(a[i])) {
                    System.out.println(mentry);
                }

            }
        }



    }
}
