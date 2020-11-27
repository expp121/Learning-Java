
public class UsePackage {
    public static void main(String[] args) {
        String methods = "atm";
        Package[] packages = new Package[3];
        InsuredPackage[] insuredPackages = new InsuredPackage[3];
        for (int i = 0; i < packages.length; i++) {
            packages[i] = new Package(1.0f + i, methods.charAt(i));
            insuredPackages[i] = new InsuredPackage(1.0f +i, methods.charAt(i));
        }

        for (int i = 0; i < insuredPackages.length; i++) {
            packages[i].display();
        }
        
        for (int i = 0; i < insuredPackages.length; i++) {
            insuredPackages[i].display();
        }
    }   
}