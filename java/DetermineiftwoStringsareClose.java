public class DetermineiftwoStringsareClose {
  public static void main(String[] args) {
    String s1="cbbb";
    String s2="cbbc";
    boolean flag1 = true; // Initialize flag for s1
boolean flag2 = true; // Initialize flag for s2

// Check if the lengths are equal
if (s1.length() != s2.length()) {
    flag1 = false;
    flag2 = false;
} else {
    // Check if all unique letters in s1 are present in s2
    for (int i = 0; i < s1.length(); i++) {
        char currentChar = s1.charAt(i);
        if (s2.indexOf(currentChar) == -1 && s1.indexOf(currentChar) == i) {
            flag1 = false;
            break;
        }
    }

    // Check if all unique letters in s2 are present in s1
    for (int i = 0; i < s2.length(); i++) {
        char currentChar = s2.charAt(i);
        if (s1.indexOf(currentChar) == -1 && s2.indexOf(currentChar) == i) {
            flag2 = false;
            break;
        }
    }
}

boolean finalFlag = flag1 && flag2; // Set the final flag based on both conditions

System.out.println(finalFlag);

    
  }
}
