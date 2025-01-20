public class Subsequences {
    public static void generate(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current); // Base case
            return;
        }
        // Include the current character
        generate(str, current + str.charAt(index), index + 1);
        // Exclude the current character
        generate(str, current, index + 1);
    }

    public static void main(String[] args) {
        generate("abc", "", 0);
        // Output: "", "c", "b", "bc", "a", "ac", "ab", "abc"
    }
}
