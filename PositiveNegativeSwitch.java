public class PositiveNegativeSwitch {
    public static void main(String[] args) {
        int number = -5;

        switch (Integer.signum(number)) {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            default:
                System.out.println("Zero");
        }
    }
}
