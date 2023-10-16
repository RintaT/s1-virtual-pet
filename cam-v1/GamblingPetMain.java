public class GamblingPetMain {
    public static void main(String[] args) {
        GamblingPet g1 = new GamblingPet(5);

        int count = 0;
        while(count<6){
            g1.DiceGame(100);
            g1.Waite(5000);
            count += 1;

        }
        
        
        g1.EndGames();





    }
}
