https://leetcode.com/problems/ugly-number

class Solution {
    public boolean isUgly(int n) {
        while(n>1){
	if(n%2==0){
		n=n/2;
	}
	if(n%3==0){
		n=n/3;
	}
	if(n%5==0){
		n=n/5;
	}
	if(n%2 !=0 && n%3!=0 && n%5!=0){
		break;
	}
}

if(n==1)
	return true;

return false;
        
        
        
    }
}
