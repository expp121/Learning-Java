public class NonMetalElement extends Element {

    public NonMetalElement(String elementSymbol, int atomicNumber, float atomicWeight) {
        super(elementSymbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Element symbol: " + super.getElementSymbol() + "\nAtomic Number: " + super.getAtomicNumber()
                + "\nAtomic Weight: " + super.getAtomicWeight() + "\nElements from this kind are usually not conductant");

    }
}
