class Solution {
    public int arraySign(int[] n) {
        int p=0,ne=0;
    for(int i=0;i<n.length;i++)
    {
        if(n[i]==0) return 0;
        else if(n[i]>0)
        {
            p++;
        }
        else ne++;
    }
    if(ne%2==0) return 1;
    else return -1;
        
    }
}