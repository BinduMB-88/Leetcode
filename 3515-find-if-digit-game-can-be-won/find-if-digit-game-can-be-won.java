class Solution {
    public boolean canAliceWin(int[] n) {
        int s=0;
        int s1=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<=9)
            {
                s+=n[i];
            }
            else
            {
                s1+=n[i];
            }
            
        }
        return (s==s1)?false:true;

        
    }
}