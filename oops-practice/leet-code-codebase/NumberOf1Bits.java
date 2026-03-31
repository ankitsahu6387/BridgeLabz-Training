public class NumberOf1Bits {
  public int hammingWeight(int n) {
    int ans = 0, count = 0;
    while(n>0){
        ans = ans*10 + n/2;
        if(n%2==1) count++;
        n/=2;
    }
    return count;
  }
}