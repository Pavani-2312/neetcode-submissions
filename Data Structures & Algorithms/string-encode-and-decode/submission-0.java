class Solution {
    List<String> res = new ArrayList<>();

    public String encode(List<String> strs) {
        this.res = strs;
        return ".";
    }

    public List<String> decode(String str) {
        return res;
    }
}
