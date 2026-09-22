class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c= letters[0];;
        for(char ch:letters)
        {
            if(ch>target)
            {
                c=ch;
                break;
            }
        }
        return c;
    }
}