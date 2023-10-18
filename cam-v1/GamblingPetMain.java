public class GamblingPetMain {
    public static void main(String[] args) {
        GamblingPet g1 = new GamblingPet(0);

        int count = 0;
        while(count<4){
            g1.DiceGame(100);
            g1.Waite(2500);
            count += 1;

        }
        
        
        g1.EndGames();





    }
}
