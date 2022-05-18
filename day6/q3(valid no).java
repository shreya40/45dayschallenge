https://leetcode.com/problems/valid-number/


class Solution {
    public boolean isNumber(String s) {
      
            
            
           if(s == null || s.length() ==0 || (s.length() == 1 && (s.charAt(0) <'0' || s.charAt(0) >'9'))) return false;
int dotIndex = -1;
int eIndex = -1;
int plusMinusIndex = -1;
boolean e = false;

    int i =0;
    while(i<s.length()){
        char c = s.charAt(i);
        if( (c <'0' || c>'9') && c != '-' && c !='+' && c !='e' && c !='E' && c!='.'){
            return false;
        } else if(c == '-' || c=='+'){
            if(i == s.length() -1 || plusMinusIndex>-1 && i-plusMinusIndex ==1 || (i !=0 && s.charAt(i-1) !='e')){
                return false;
            } else {
                plusMinusIndex = i;
            }
        } else if(c =='e' || c =='E'){
            if(e || i ==0 || i ==s.length()-1 || (plusMinusIndex>-1 && i-plusMinusIndex == 1)){
                return false;
            } else {
                e = true;
                eIndex = i;
            }
        } else if(c =='.') {
            if(dotIndex >-1 || (plusMinusIndex >-1 && i-plusMinusIndex==1 && i == s.length()-1)|| (eIndex > -1 && eIndex <i) ||(i==0 && s.charAt(i+1) == 'e') ){
                return false;
            }
            else{
                dotIndex = i;
            }
