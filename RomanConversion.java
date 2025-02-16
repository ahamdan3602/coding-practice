class RomanConversion {
    public String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String str = "";
        int j = 0;
        while (num != 0) {
            if (num >= nums[j]) {
                num -= nums[j];
                str+= roman[j];
            } else {
                j++;
            }
        }
        return str;
        
    }
}
