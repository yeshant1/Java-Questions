//leetcode 242
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        //make an array of 26 size and initialize with zero 
        int freq[] = new int[26];

        for(int i = 0;i<s.length();i++){
…            }
        }

        return true;


    }
}

or
  class Solution {
    public boolean isAnagram(String s, String t) {
        //check both the strings have equal length
        if(s.length() != t.length()){
            return false;
        }

        //convert strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);


        //now checking every character of both strings are same or not
        for(int i = 0;i<sArray.length;i++){
            if(sArray[i] != tArray[i]){
                return false;
            }
        }
        return true;
        
    }
}
