public class LoadedDie extends Die2 {
    
    public final static byte LOWEST_DIE_VALUE = 2;

    public LoadedDie(){
        super.value = ((int)(Math.random() * 100) % Die2.HIGHEST_DIE_VALUE + LoadedDie.LOWEST_DIE_VALUE);
    }
}
