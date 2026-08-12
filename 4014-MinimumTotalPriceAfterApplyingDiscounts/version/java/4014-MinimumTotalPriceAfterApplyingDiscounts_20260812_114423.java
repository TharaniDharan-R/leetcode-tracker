// Last updated: 8/12/2026, 11:44:23 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        double d=0;
6        int k=1;
7        int c=0;
8       // if(discounts.length<prices.length){
9        for(int i=discounts.length-1;i>=0;i--){
10            for(int j=prices.length-k;j>=0;j--){
11                System.out.println(prices[j]+" "+discounts[i]);
12                d+=(double)prices[j]*(100-discounts[i])/100;
13                k++;
14                c++;
15                break;
16            }
17        }
18        for(int i=prices.length-c-1;i>=0;i--){
19            System.out.print(prices[i]);
20            d+=prices[i];
21            
22        }
23        //}
24        // else{
25        // for(int i=discounts.length-1;i>=0;i--){
26        //     for(int j=prices.length-k;j>=0;j--){
27        //        // System.out.println(prices[i]+" "+discounts[j]);
28        //         d+=(double)discounts[i]*(100-prices[j])/100;
29        //         k++;
30        //         break;
31        //     }
32        // }
33        // }
34        return d;
35
36    }
37}