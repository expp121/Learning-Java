/**
 * Park
 */
public class Park {

    private String parkName;
    private int parkSize;
    private boolean hasPicnicFacility;
    private boolean hasTennisCourt;
    private boolean hasPlayground;
    private boolean hasSwimmingPool;

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public int getParkSize() {
        return parkSize;
    }

    public void setParkSize(int parkSize) {
        this.parkSize = (parkSize > 0 && parkSize < 400) ? parkSize : 0;
    }

    public boolean isHasPicnicFacility() {
        return hasPicnicFacility;
    }

    public void setHasPicnicFacility(boolean hasPicnicFacility) {
        this.hasPicnicFacility = hasPicnicFacility;
    }

    public boolean isHasTennisCourt() {
        return hasTennisCourt;
    }

    public void setHasTennisCourt(boolean hasTennisCourt) {
        this.hasTennisCourt = hasTennisCourt;
    }

    public boolean isHasPlayground() {
        return hasPlayground;
    }

    public void setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

}