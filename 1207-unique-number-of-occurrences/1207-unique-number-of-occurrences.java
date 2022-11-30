class Solution {
    boolean isUniqueOccurrences = true;
    
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        map.forEach((key, value) -> {
            if (set.contains(value)) {
                isUniqueOccurrences = false;
            } else {
                set.add(value);
            }
        });

        return isUniqueOccurrences; 
    }
}