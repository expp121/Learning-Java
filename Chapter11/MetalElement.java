public class MetalElement extends Element {

    public MetalElement(String elementSymbol, int atomicNumber, float atomicWeight) {
        super(elementSymbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Element symbol: " + super.getElementSymbol() + "\nAtomic Number: " + super.getAtomicNumber()
                + "\nAtomic Weight: " + super.getAtomicWeight()
                + "\nElements from this kind are usually conductant and stick to magnets");
    }

}
