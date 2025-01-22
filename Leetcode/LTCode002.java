public class LTCode002 {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        int n = s.length();

        
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        
        while (index < n) {
            char currentChar = s.charAt(index);
            if (!Character.isDigit(currentChar)) {
                break;
            }

            int digit = currentChar - '0';

            
            if (total > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            total = total * 10 + digit;
            index++;
        }

        
        return total * sign;
    }

    public static void main(String[] args) {
        LTCode002 solution = new LTCode002();

        System.out.println(solution.myAtoi("42"));          
        System.out.println(solution.myAtoi("   -042"));     
        System.out.println(solution.myAtoi("1337c0d3"));    
        System.out.println(solution.myAtoi("0-1"));         
        System.out.println(solution.myAtoi("words and 987"));
    }
}
