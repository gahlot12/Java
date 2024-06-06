public class GCDof2NumbersQ7 {
    public static int GCD(int a,int b){
        if(a==0)return b;
        if(b==0)return a;
        return GCD(b%a,a);
    }

        public static int findGCD(int arr[], int n){ 
        int result = arr[0]; 
        for (int i = 1; i < n; i++) 
        { 
            result = GCD(arr[i], result); 
        
            if(result == 1) 
            { 
            return 1; 
            } 
        } 
        return result; 
    } 
    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // System.out.println(GCD(a,b));

        int a[] = {2,4,6,8,16};
        int n = a.length; 
        System.out.println(findGCD(a, n));
    }
}
