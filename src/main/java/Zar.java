public class Zar {
    int value;

    public int getDiceValue(int imput) {
        switch (imput) {
            case 0:
                value = 1;
                break;
            case 1:
                value = 2;
                break;
            case 2:
                value = 3;
                break;
            case 3:
                value = 4;
                break;
            case 4:
                value = 5;
                break;
            case 5:
                value = 6;
                break;
            default:
                System.out.println("Not a valid input");
        }
        return value;
    }
}
