class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null) {
            
                Integer value = map.get(s.charAt(i));
                value = value + 1;
                map.put(s.charAt(i), value);
            } else {
                map.put(s.charAt(i), 1);
            }
            if(map.get(t.charAt(i)) != null) {
                Integer value = map.get(t.charAt(i));
                value = value - 1;
                map.put(t.charAt(i), value);
            } else {
                map.put(t.charAt(i), -1);
            }
        } 

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}