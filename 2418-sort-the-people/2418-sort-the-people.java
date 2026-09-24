class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      
        
        for(int i=0;i<heights.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<heights.length;j++)
            {
                if(heights[min]<heights[j])
                {
                    min=j;
                }
            }
            String t=names[i];
            names[i]=names[min];
            names[min]=t;
            int tempHeight = heights[i];
            heights[i] = heights[min];
            heights[min] = tempHeight;
        }
        return names;
    }
}