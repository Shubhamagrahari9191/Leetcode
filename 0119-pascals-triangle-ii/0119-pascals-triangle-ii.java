class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> list = new ArrayList<>();

        long ans = 1;
        list.add((int) ans);

        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1);
            ans = ans / i;

            list.add((int) ans);
        }

        return list;
    }
}
