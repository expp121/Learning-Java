public abstract class Element {
    private String elementSymbol;
    private int atomicNumber;
    private float atomicWeight;

    public Element(String elementSymbol, int atomicNumber, float atomicWeight) {
        this.elementSymbol = elementSymbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getElementSymbol() {
        return elementSymbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public float getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void describeElement();
}
