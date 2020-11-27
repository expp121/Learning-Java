public class LessonsWithRental extends Rental {
    private final static String[] instructors = {"Doshev", "Odew", "Marinov", "Noqe", "Ollq", "Ajk", "Uom", "Maop"};  
    private boolean isLessonRequired;
    private byte choosenInstructor;

    public LessonsWithRental(String contractNumber, short minutes, int equipmentType){
        super(contractNumber,minutes);

        if (equipmentType>=0 && equipmentType <= 7){
            if (equipmentType == 0 || equipmentType == 1)
                isLessonRequired = true;
            else isLessonRequired = false;
            choosenInstructor = (byte)equipmentType;
            super.setEquipmentType(equipmentType);
        }
        else
        {
            choosenInstructor = (byte)(instructors.length - 1);
            isLessonRequired = false;
            super.setEquipmentType(99);
        }
    }

    public String getInstructor(){
        return "\nEquipment type: " + super.getEquipmentType() +
                "\nIs lesson required: " + this.isLessonRequired +
                "\nInstructor name: " + this.instructors[choosenInstructor];
    }


}
