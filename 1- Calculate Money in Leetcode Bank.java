class Solution {
        public static int totalMoney(int n) {
        int m = 1+2+3+4+5+6+7;

        int weeks = (n/7);
        int sum = (weeks-1)*weeks/2;

        int weeksSum = m*weeks+7*sum;
        int days = n%7;
        int daysSum = ((weeks+1)+(days+weeks))*days/2;
        // sum = (start + finish)*n /2
        return daysSum+weeksSum;
    }
}