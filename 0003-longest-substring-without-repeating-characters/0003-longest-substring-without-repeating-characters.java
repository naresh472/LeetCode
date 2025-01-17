class Solution {
    public int lengthOfLongestSubstring(String s) {
       

       Set<Character> set = new HashSet<>();
        int max =0;
        int l =0;
        
        for(int i =0; i<s.length() ; i++ ){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));      
            }else{
                while(l<i){
                    if(s.charAt(l)!= s.charAt(i)){
                        set.remove(s.charAt(l));
                        l++;
                    }else{
                        break;
                    }
                    
                }
               l++;
            }
            max = Math.max(max, set.size());
        }
        return max;
      
    }
}