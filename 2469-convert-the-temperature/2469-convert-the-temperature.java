class Solution {
    public double[] convertTemperature(double c) {
        double [] m=new double[2];
        m[0]=c+273.15;
        m[1]=c*1.80+32.00;
        return m;
    }
}