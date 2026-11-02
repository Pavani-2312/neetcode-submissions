class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            int m = strs[i].length();
            for(int j = 0; j < m; j++){
                freq[strs[i].charAt(j) - 'a']++;
            }
            map.putIfAbsent(Arrays.toString(freq), new ArrayList<>());
            map.get(Arrays.toString(freq)).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> temp: map.values()){
            res.add(temp);
        }
        return res;
    }
}
