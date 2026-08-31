// Last updated: 8/31/2026, 4:12:45 PM
1class Solution {
2    public String complexNumberMultiply(String num1, String num2) {
3        int[] a = parse(num1);
4        int[] b = parse(num2);
5
6        int real = a[0] * b[0] - a[1] * b[1];
7        int imaginary = a[0] * b[1] + a[1] * b[0];
8
9        return real + "+" + imaginary + "i";
10    }
11
12    private int[] parse(String s) {
13        int plus = s.indexOf('+');
14
15        int real = Integer.parseInt(s.substring(0, plus));
16        int imaginary = Integer.parseInt(
17            s.substring(plus + 1, s.length() - 1)
18        );
19
20        return new int[]{real, imaginary};
21    }
22}