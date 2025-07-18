package AdmissionPortal;

public class UGFormFactory extends AdmissionFormFactory {
    @Override
    public AdmissionForm createAdmissionForm() {
        return new UGAdmissionForm();
        
    }
}