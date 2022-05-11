class Solution {
    public int countCharacters(String[] words, String chars) {
        int l=0;
        int[] char_count=new int[26];
        for(char c:chars.toCharArray()){
            char_count[c-'a']++;
        }
        for(String word:words)
        {
            int[] temp=Arrays.copyOf(char_count,char_count.length);
            int valid_char_count=0;
            for(char c:word.toCharArray())
            {
                if(temp[c-'a']>0){
                    valid_char_count++;
                    temp[c-'a']--;
                }
            }
            if(valid_char_count==word.length()){
                l+=word.length();
            }
        }
        return l;
        
    }
}
