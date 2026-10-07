class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> self= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean valid=true;
            while(n>0){
                int digit=n%10;
                if(digit==0||i%digit!=0){
                    valid=false;
                    break;
                } 
                n/=10;
            }
            if(valid)
                self.add(i);
        }
    return self;
    }
}