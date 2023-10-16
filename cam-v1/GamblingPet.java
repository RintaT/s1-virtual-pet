public class GamblingPet {
    
    private int luck; //how "lucky" pet is on 0-10 scale. If luck = 0 pet only rolls lowest roll, if luck = 10 pet only rolls highest roll, etc
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
            totalmoneywon += bet;
            face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + ". We tied zzz");
            face.setImage("asleep");
            return "Tie"+myroll+computerroll;
        }
        else{
            if(myroll>computerroll){
                totalmoneywon += 2*bet;
                face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + ". I win!");
                face.setImage("ecstatic");
                return "You Win"+myroll+computerroll;
                
            }
            face.setMessage("I rolled a " + myroll + ", you rolled a " + computerroll + "... You win");
            face.setImage("verysad");
            return "You Lose"+myroll+computerroll;

        }
    }

    public void EndGames(){
        if(totalmoneybet>totalmoneywon){
            face.setMessage("I am now $" + (totalmoneybet-totalmoneywon) + " in debt");
            face.setImage("sick");
        }
        else{
            if(totalmoneywon>totalmoneybet){
                face.setMessage("I am up $" + (totalmoneywon-totalmoneybet) + "!");
                face.setImage("joyful");
            }
            else{
                face.setMessage("I ended up with the same money I started with...");
                face.setImage("normal");
            }
        }
    }

    public void Waite(int s){
        face.WaitMsec(s);
    }








}
