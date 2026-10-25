public class Main {
    public static void main(String[] args) {
        String s = "J@va the be$t!123";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            if (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }

        System.out.println("Input: " + s);
        System.out.println("Output: " + new String(chars));
    }
}