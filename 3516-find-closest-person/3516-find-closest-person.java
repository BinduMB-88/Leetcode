class Solution {
    public int findClosest(int x, int y, int z) {
        int s1=0,s2=0;
        s1= Math.abs(x-z);
        s2= Math.abs(y-z);
        if(s1>s2)
        {
            return 2;
        }
        else if(s1<s2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}