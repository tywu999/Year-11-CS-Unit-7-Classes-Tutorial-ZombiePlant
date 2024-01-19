public class ZombiePlant {
    private int maxPotency;
    private  int treatmentsNeeded;
    public ZombiePlant(int maxPotency, int treatmentsNeeded){
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }
    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }
    public boolean isDangerous(){
        return treatmentsNeeded > 0;
    }
    public void treat(int Potency){
        if(Potency <= maxPotency && treatmentsNeeded > 0 && Potency > 1){
            treatmentsNeeded--;
        }
        if(Potency > maxPotency){
            treatmentsNeeded++;
        }

    }
    public int getPotencyRequired(int Potency){
        return Potency;
    }
}
