class Solution {
    public int minimumPushes(String w) {
        int l=w.length();
        if(l<=8)
        {
            return l;
        }
        else if(8<l && l<17)
        {
            return 8+(l-8)*2;
        }
        else if (16<l && l<24)
        {
            return 24+(l-16)*3;
        }
        else
        {
            return 48+(l-24)*4;
        }
        //return;
    }
}