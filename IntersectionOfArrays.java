import java.util.*;
class IntersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toSet()));
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toSet()));

        set1.retainAll(set2);

        List<Integer> arr = new ArrayList<>();
        for (int num : set1) {
            arr.add(num);
        }

        int[] sol = new int[arr.size()];
        for (int i = 0; i < arr.size();i++) {
            sol[i] = arr.get(i);
        }

        return sol;
        
    }
}
