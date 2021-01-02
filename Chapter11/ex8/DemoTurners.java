package ex8;

public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        leaf.turn();
        page.turn();
        pancake.turn();
        Turner[] turners = new Turner[5];
        turners[0] = new Leaf();
        turners[1] = new Page();
        turners[2] = new Pancake();
        turners[3] = new Computer();
        turners[4] = new Lamp();
        for (int i = 0; i < turners.length; i++)
            turners[i].turn();
    }
}
