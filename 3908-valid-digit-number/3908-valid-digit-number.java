class Solution {
    public boolean validDigit(int n, int x) {
        String k = String.valueOf(n);
        char r = Character.forDigit(x, 10); 
        
        if (k.charAt(0) != r && k.contains(String.valueOf(r))) {
            return true;
        }
        return false;
    }
}
