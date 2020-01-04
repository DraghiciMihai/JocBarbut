public class JucatorBarbut {
    private int dicesResult;
    private Zar dice1;
    private Zar dice2;

    public JucatorBarbut(){
         dice1 = new Zar();
         dice2 = new Zar();
    }

    public void rollDices(){
        int randomResult1 = (int)(Math.random() * 6);
        int dice1Result = dice1.getDiceValue(randomResult1);
        int randomResult2 = (int)(Math.random() * 6);
        int dice2Result = dice2.getDiceValue(randomResult2);
        System.out.println("First dice is " + dice1Result + " and second dice is " + dice2Result);
        dicesResult = dice1Result + dice2Result;
    }

    public int getDicesResult() {
        return dicesResult;
    }
}
