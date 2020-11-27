/**
 * TestPark
 */
public class TestPark {

    public static void main(String[] args) {
        Park park1 = new Park(), 
             park2 = new Park(), 
             park3 = new Park();
        
        park1.setParkName("naruto");
        park2.setParkName("gfsd");
        park3.setParkName("gosho");

        park1.setParkSize(32);
        park1.setParkSize(12);
        park1.setParkSize(352);

        park1.setHasPicnicFacility(true);
        park2.setHasPicnicFacility(false);
        park3.setHasPicnicFacility(true);

        park1.setHasPlayground(false);
        park2.setHasPlayground(false);
        park3.setHasPlayground(true);

        park1.setHasSwimmingPool(true);
        park2.setHasSwimmingPool(true);
        park3.setHasSwimmingPool(false);

        park1.setHasTennisCourt(false);
        park2.setHasTennisCourt(true);
        park3.setHasTennisCourt(false);



        System.out.println("Park 1 has: " + numberOfFacilities(park1) + " facilities");
        
        System.out.println("Park 2 has: " + numberOfFacilities(park2) + " facilities");
        
        System.out.println("Park 3 has: " + numberOfFacilities(park3) + " facilities");

        
        System.out.println("Does Park 1 have picnic facility: " + (hasPicnic(park1) == true ? "yes" : "no"));
        
        System.out.println("Does Park 2 have picnic facility: " + (hasPicnic(park2) == true ? "yes" : "no"));

        System.out.println("Does Park 3 have picnic facility: " + (hasPicnic(park3) == true ? "yes" : "no"));
        
        System.out.println("The largest park of " + park1.getParkName() + " and " + park2.getParkName() + " is " + largestPark(park1, park2).getParkName());
        System.out.println("The largest park of " + park1.getParkName() + " and " + park3.getParkName() + " is " + largestPark(park1, park3).getParkName());
        System.out.println("The largest park of " + park2.getParkName() + " and " + park3.getParkName() + " is " + largestPark(park2, park3).getParkName());

        
    }

    public static boolean hasPicnic(Park park) {
        return park.isHasPicnicFacility();
    }

    public static boolean hasExactlyTheseFeature(Park park, boolean picnic, boolean tennisCourt, boolean playground, boolean pool) {
        return (park.isHasPicnicFacility() == picnic && park.isHasTennisCourt() == tennisCourt && park.isHasPlayground() == playground && park.isHasSwimmingPool() == pool ? true : false);
    }


    public static byte numberOfFacilities(Park park) {
        byte numFacilities = 0;

        if (park.isHasPicnicFacility())
            numFacilities++;
            
        if (park.isHasPlayground())
            numFacilities++;
        
        if (park.isHasSwimmingPool())
            numFacilities++;
            
        if (park.isHasTennisCourt())
            numFacilities++;
        
        return numFacilities;
    }

    public static Park largestPark(Park park1, Park park2) {
        if (park1.getParkSize() > park2.getParkSize())
            return park1;
        else 
            return park2;
    }
}