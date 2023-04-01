package Chapter11.caseProblems.ex2;

public abstract class Equipment {

    private final String[] equipments = {
            "jet ski", "pontoon boat", "rowboat",
            "canoe", "kayak", "beach chair", "umbrella", "other"};
    private final int[] feesForEquipment = {50, 40, 15, 12, 10, 2, 1, 0};
    private int equipmentType;
    private String equipmentName;
    private double equipmentFee;

    public Equipment(int equipmentType) {
        if (equipmentType >= 0 && equipmentType < this.equipments.length) {
            this.equipmentType = equipmentType;
            this.equipmentName = this.equipments[equipmentType];
            this.equipmentFee = this.feesForEquipment[equipmentType];
        } else {
            this.equipmentType = this.equipments.length - 1;
            this.equipmentName = this.equipments[this.equipmentType];
            this.equipmentFee = this.feesForEquipment[this.equipmentType];

        }
    }

    public int getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(int equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public double getEquipmentFee() {
        return equipmentFee;
    }

    public void setEquipmentFee(double equipmentFee) {
        this.equipmentFee = equipmentFee;
    }

    public abstract String policy();
}
