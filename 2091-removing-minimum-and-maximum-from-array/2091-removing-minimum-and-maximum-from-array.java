class Solution { 
    public int minimumDeletions(int[] n) { 
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; 
        
        for(int i = 0; i < n.length; i++) 
        { 
            if(n[i] > max) 
                max = n[i]; 
            
            if(n[i] < min) 
                min = n[i]; 
        } 
        
        int j = 0, k = 0; 
        
        for(int i = 0; i < n.length; i++) 
        { 
            if(n[i] == max) 
                j = i; 
            
            if(n[i] == min) 
                k = i; 
        } 
        
        int a = Math.min(j, k);
        int b = Math.max(j, k);
        
        int l = b + 1;
        int r = n.length - a;
        int both = (a + 1) + (n.length - b);
        
        return Math.min(l, Math.min(r, both));
    } 
}