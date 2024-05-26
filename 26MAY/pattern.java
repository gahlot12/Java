class Patterns {
    int n;

    public void getN(int n) {
        this.n = n;
    }

    public void pattern1() {
        // Input: ‘N’ = 3

        // Output: 
        // * * *
        // * * *
        // * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern2() {
        // Input: ‘N’ = 3

        // Output: 
        // * 
        // * *
        // * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern3() {
        // Input: ‘N’ = 3

        // Output: 
        // 1
        // 1 2 
        // 1 2 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern4() {
        // Input: ‘N’ = 3

        // Output: 
        // 1
        // 2 2 
        // 3 3 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern5() {
        // Input: ‘N’ = 3

        // Output: 
        // * * *
        // * *
        // *
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern6() {
        // Input: ‘N’ = 3

        // Output: 
        // 1 2 3
        // 1 2
        // 1
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern7() {
        // Input: ‘N’ = 3

        // Output: 
        //   *
        //  ***
        // *****
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern8() {
        // Input: ‘N’ = 3

        // Output: 
        // *****
        //  ***
        //   *
        for (int i = n; i > 0; i--) {
            // print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void pattern9() {
        // Input: ‘N’ = 3

        // Output: 
        //   *
        //  ***
        // *****
        // *****
        //  ***
        //   *
        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i > 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    public void pattern10() {
        // Input: ‘N’ = 3

        // Output: 
        // *
        // **
        // ***
        // **
        // *
        // Print the upper part of the rotated triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the rotated triangle
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public class Main
{
	public static void main(String[] args) {
		 Patterns patterns = new Patterns();
        patterns.getN(3); // Set the value of 'N' as desired

        // Call the pattern methods
        patterns.pattern1();
        patterns.pattern2();
        patterns.pattern3();
        patterns.pattern4();
        patterns.pattern5();
        patterns.pattern6();
        patterns.pattern7();
        patterns.pattern8();
        patterns.pattern9();
        patterns.pattern10();
	}
}
