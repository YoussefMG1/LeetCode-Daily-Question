class Solution {
    public static  int numberOfBeams(String[] bank) {
        int result =0;
        int row1devices = 0;
        for (String bank1 : bank) {
            // get the number of Devices in the row
            int numOfDevicesInRow = 0;
            for(int j =0; j<bank1.length(); j++){
                if(bank1.charAt(j)=='1') numOfDevicesInRow++;
            }
            
            // if no security devices in the row continue
            if(numOfDevicesInRow == 0) continue;

            // laser beam between row1 and row2 = n of devices in last row * n of devices in current row
            result += row1devices * (row1devices = numOfDevicesInRow);
            // result += row1devices * numOfDevicesInRow;
            // row1devices = numOfDevicesInRow;
        }
        return result;
    }
}
