public class chesspattern {
    public static void main(String[] args) {
        int size = 8; // Adjust the size as needed

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Use 'X' and ' ' to create the chess pattern
                if ((i + j) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("&");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
