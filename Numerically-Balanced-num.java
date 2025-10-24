class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=1224444;i++){
            if(isbalance(i)){
                return i;
            }
        }
        return -1;
    }
    private boolean isbalance(int x){
        int[] c = new int[10];
        while(x > 0){
            c[x%10]++;
            x /= 10;
        }
        for(int j=0;j<10;j++){
            if(c[j] > 0 && c[j] != j){
                return false;
            }
        }
        return true;
    }
}