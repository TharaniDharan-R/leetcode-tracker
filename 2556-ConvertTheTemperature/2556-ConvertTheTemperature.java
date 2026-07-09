// Last updated: 7/9/2026, 9:47:05 AM
class Solution {
    public double[] convertTemperature(double c) {
        double k=c+273.15;
        double f=c*1.80+32.00;
        double []sum= new double[2];
        sum[0]=k;
        sum[1]=f;
        return sum;
    }
}
