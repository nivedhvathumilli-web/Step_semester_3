public class AtmPinRetry {
    static void atmPinRetry(String correctPin, String[] attempts) {
        int tries = 0;
        boolean success = false;
        while (tries < attempts.length && !success) {
            if (attempts[tries].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }
            tries++;
        }
        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        atmPinRetry("4821", new String[]{"1111", "4821"});
        atmPinRetry("4821", new String[]{"1111", "2222", "3333"});
    }
}