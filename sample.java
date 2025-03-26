class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hs = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i=0;i<=s.length()-10;i++) {
            String substr = s.substring(i,i+10);
            if (hs.contains(substr)) {
                result.add(substr);
            }
            hs.add(substr);
        }
        return new ArrayList<String>(result);
    }
}
