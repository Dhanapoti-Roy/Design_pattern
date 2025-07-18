package AdmissionPortal;

public class UGAdmissionForm implements AdmissionForm {

    public void validateDocument(){
        System.out.println("Validating all documents");
    }
    public double calculateFees(){

        return 5000;
    }
    public void submitApplication(){
        System.out.println("UG Admission Form submitted");
    }
}