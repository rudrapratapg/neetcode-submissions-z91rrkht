class Solution {
    public boolean isAnagram(String s, String t) {
		if(s==null || t==null){
			return false;
		}
        if(s.length()!=t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		int n = sChars.length;
		int[] freq = new int[26];
		for(int i=0;i<n; i++){
			char sChar = sChars[i];
			char tChar = tChars[i];
			freq[sChar-97]++;
			freq[tChar-97]--;
		}
		for(int i=0;i<26;i++){
			if(freq[i]!=0){
				return false;
			}
		}
		return true;
    }
}
