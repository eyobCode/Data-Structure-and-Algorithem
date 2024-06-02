public class LCG {
    //Linear congruential generator
    //Used by C and C++, Java, Ruby.
    private int modulus = (int) Math.pow(2,48);
    private int increment = 0;
    private int multiplier = 99;
    private int seed = (int) System.currentTimeMillis();
    private int current = 0;
    private int generate(int cur){
        return (int) (multiplier * cur + increment) % modulus;
    }
    public LCG(){
        current = generate(seed);
    }
    public void setSeed(int seed) throws IllegalStateException{
        if (seed > modulus || seed < 0) throw new IllegalStateException("seed must be in range");
        this.seed = seed;
    }
    public void setMultiplier(int m) throws IllegalStateException {
        if (2 > m || m > modulus) throw new IllegalStateException("Invalid multiplier");
        this.multiplier = m;
    }
    public void setIncrement(int i){
        this.increment = i;
    }
    //generation
    public double nextDouble(){
        //generate the next number and set it to current
        current = generate(current);
        //change to positive if negative
        if (current < 0) current *= (-1);
        //change to decimal
        return (double) current / modulus;
    }
    public int nextInt(){
        current = generate(current);
        return current;
    }
    public int nextInt(int range){
        current = generate(current);
        if (current < 0) current *= (-1);
        return (current % range);
    }
    public int[] nextSequence(int range, int n){
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++){
            sequence[i] = nextInt(range);
        }
        return sequence;
    }
}


