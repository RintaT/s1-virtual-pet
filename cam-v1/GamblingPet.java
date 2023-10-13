public class GamblingPet {
    
    private int luck; //how "lucky" pet is on 0-100 scale
    private int totalmoneybet;
    private int totalmoneywon;

    public GamblingPet(int LUCK){
        luck = LUCK;
    }

    public void DiceGame(int bet){ //pet gambles against computer, dice game 1-6
        totalmoneybet +=bet;
        int computerroll = (int)(Math.random()*7);
        int myroll = (int)(Math.random()*(7-(luck-5)));



    }






}
