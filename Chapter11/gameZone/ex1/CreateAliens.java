package ex1;
import aliens.Martian;
import aliens.Jupiterian;
public class CreateAliens {
    public static void main(String[] args) {
        
        Martian martian = new Martian();
        Jupiterian jupiterian = new Jupiterian();

        System.out.println(martian.toString());
        System.out.println(jupiterian.toString());
    }
}
