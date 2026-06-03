class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        Map<Integer, Integer> myDict = new HashMap<>();

        for (int uniqueNum : numsSet) {
            int count1 = 0;
            for (int num : nums) {
                if (uniqueNum == num) {
                    count1++;
                }
            }
            myDict.put(uniqueNum, count1);
        }

        List<Integer> highestKeys = new ArrayList<>(myDict.keySet());
        highestKeys.sort((a, b) -> myDict.get(b) - myDict.get(a));

        List<Integer> topKList = highestKeys.subList(0, k);

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = topKList.get(i);
        }

        return answer;
    }
}
