class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (hm.containsKey(groupSizes[i])) {
                hm.get(groupSizes[i]).add(i);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                hm.put(groupSizes[i], list);
            }
        }
        for (int size : hm.keySet()) {
            List<Integer> res = hm.get(size);
            for (int i = 0; i < res.size(); i += size) {
                result.add(res.subList(i,i+size));
            }
        }
        return result;
    }
}