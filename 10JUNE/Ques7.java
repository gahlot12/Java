public class Ques7 {
    public static int mySqrt(int x) {
        long start = 0, end = x;
        long mid;
        long ans = -1;

        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid == x){
                ans = mid;
                break;
            }
            if(mid*mid < x){
                start = mid+1;
                ans = mid;
            }
            else end = mid-1;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int a = 986678;
        System.out.println(mySqrt(a));
    }
}
