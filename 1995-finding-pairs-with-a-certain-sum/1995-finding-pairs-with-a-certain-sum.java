class FindSumPairs {
    int[] nums2;
    Map<Integer, Integer> map1;
    Map<Integer, Integer> map2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums2 = nums2;
        map1 = new HashMap<>();
        map2 = new HashMap<>();

        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        // Update nums2 array
        nums2[index] = newVal;

        // Update frequency map: remove oldVal
        map2.put(oldVal, map2.get(oldVal) - 1);
        if (map2.get(oldVal) == 0) {
            map2.remove(oldVal);
        }

        // Update frequency map: add newVal
        map2.put(newVal, map2.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;
        for (Map.Entry<Integer, Integer> e : map1.entrySet()) {
            int a = e.getKey();
            int b = tot - a;
            if (map2.containsKey(b)) {
                count += e.getValue() * map2.get(b);
            }
        }
        return count;
    }
}
