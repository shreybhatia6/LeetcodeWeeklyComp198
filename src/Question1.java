public class Question1 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while (numBottles >= numExchange){
            int mod = numBottles % numExchange;
            numBottles/=numExchange;
            sum+=numBottles;
            numBottles+=mod;

        }
        return sum;
    }

}

