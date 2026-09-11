class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>s = new HashSet<>();

        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i != j && j != k && i !=k && digits[i] != 0 && digits[k]%2==0){
                        s.add(digits[i]*100+digits[j]*10+ digits[k]);
                    }
                }
            }
        }
        return s.size();
    }
}