public class Die2 {

    public final static byte HIGHEST_DIE_VALUE = 6;
    public final static byte LOWEST_DIE_VALUE = 1;
    
    protected int value;

    public Die2() {
        this.value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }

	public int getValue() {
		return this.value;
	}
}