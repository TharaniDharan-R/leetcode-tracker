// Last updated: 7/9/2026, 9:50:04 AM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
    while (true) {
        n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.contains(n))
            return false;
        st.add(n);
    }
    }
    static  int numSquareSum(int n)
     {
    int num = 0;
    while (n != 0) {
        int digit = n % 10;
        num += digit * digit;
        n /= 10;
    }
    return num;
}
}