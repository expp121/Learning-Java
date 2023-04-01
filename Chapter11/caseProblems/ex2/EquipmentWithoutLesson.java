package Chapter11.caseProblems.ex2;

public class EquipmentWithoutLesson extends Equipment {
    public EquipmentWithoutLesson(int equipmentType) {
        super(equipmentType);

    }

    @Override
    public String policy() {
        return null;
    }
}
