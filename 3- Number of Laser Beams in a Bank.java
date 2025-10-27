class Solution {
    public static  int numberOfBeams(String[] bank) {
        int result =0;
        int row1devices = 0;
        for (String bank1 : bank) {
            // get the number of Devices in the row
            // if no security devices in the row continue
            int numOfDevicesInRow = StringDegitsSum(bank1);
            if(numOfDevicesInRow == 0) continue;
            // laser beam between row1 and row2 = n of devices in row1 * n of devices in row2
            if(row1devices == 0) row1devices = numOfDevicesInRow;
            else {
                result += row1devices * numOfDevicesInRow;
                row1devices = numOfDevicesInRow;
            }
        }
        return result;
    }

    private static  int StringDegitsSum(String string) {
        int result=0;
        for(int i =0; i<string.length(); i++){
            if(string.charAt(i) >='0' && string.charAt(i) <='9'){
                result += (int)string.charAt(i)-48;
            }
            else{
                System.out.println("can't convert string "+string+" to integer because it has charecter "+string.charAt(i));
                return 0;
            }
        }

        return result;
    }
}
