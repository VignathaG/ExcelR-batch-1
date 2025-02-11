public class Demo052 {
    public static void main(String[] args) {
        int num = 153, originalNum = num, result = 0, n = 0;
        
        while (originalNum != 0) {
            originalNum /= 10;
            n++;
        }
        
        originalNum = num;
        
        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, n);
            originalNum /= 10;
        }
        
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
