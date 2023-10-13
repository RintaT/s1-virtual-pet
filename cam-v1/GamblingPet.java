public class GamblingPet {
    
    private int luck; //how "lucky" pet is on 0-10 scale
    private int totalmoneybet;
    private int totalmoneywon;
    VirtualPetFace face;

    public GamblingPet(int LUCK){
        luck = LUCK;
        face = new VirtualPetFace();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String DiceGame(int bet){ //pet gambles against computer, dice game 1-6
        totalmoneybet +=bet;
        int computerroll = getRandomNumber(1, 6);
        int myroll = 0;

        if (luck>5){
            myroll = getRandomNumber((luck-5)+1, 6);
        }
        else{
            myroll = getRandomNumber(1, 6-(5-luck));
        }

        if(myroll == computerroll){
            face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + ". We tied zzz");
            face.setImage("asleep");
            return "Tie"+myroll+computerroll;
        }
        else{
            if(myroll>computerroll){
                totalmoneywon += bet;
                face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + ". I win!");
                face.setImage("ecstatic");
                return "You Win"+myroll+computerroll;
                
            }
            face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + "... You win");
            face.setImage("verysad");
            return "You Lose"+myroll+computerroll;

        }
    }








}
