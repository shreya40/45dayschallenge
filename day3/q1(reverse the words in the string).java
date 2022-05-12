link-https://leetcode.com/problems/reverse-words-in-a-string/

IMPROVE THE TIME AND SPACE COMPLEXITY



class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String word="";
       String fin="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
           word=s.charAt(i)+word; 
            else
            {
                if(s.charAt(i+1)!=' ')
                {
                   word=' '+word; 
                    fin=fin+word;
                    word="";
                }
                
            }
                
            }
        fin=fin+" "+word;
        fin=fin.trim();
        return fin;
        }
        
    }
