public class ElementArray {

    public static void main(String args[]) {
        Element[] elements = new Element[5];
        for (int i = 0; i < elements.length - 1; i += 2) {
            elements[i] = new MetalElement("" + (char) (i + 60), i, i * 2.31f);
            elements[i + 1] = new NonMetalElement("" + (char) (i + 61), i + 1, (i + 1) * 2.31f);
        }
        for (int i = 0; i < elements.length - 1; i++)
            elements[i].describeElement();
    }
}