class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Generate every subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            // Elements inside current window
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count this subarray once for each distinct element
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int ans = -1;

        // Find largest element appearing in exactly one window
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }

        return ans;
    }
}