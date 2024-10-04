public class TestBloodData {
    public static void main(String[] args) {
        BloodData patient1 = new BloodData();
        patient1.displayBloodInfo();  // should show default "O" and "+"
        
        patient1.setBloodType("B");
        patient1.setRhFactor("-");
        patient1.displayBloodInfo();  // should show updated "B" and "-"
        
        patient1.defaultPatient();
        patient1.displayBloodInfo();  // should show "A" and "-"
    }
}