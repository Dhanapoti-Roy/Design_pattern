package AdmissionPortal;

import java.util.Scanner;

public class AdmissionPortal {
    public static void main(String[] args) {
        AdmissionFormFactory factory =new UGFormFactory();
        AdmissionForm form=factory.createAdmissionForm();
    
    
        form.validateDocument();
        double fee=form.calculateFees();
        System.out.println("Fees: "+fee);
        form.submitApplication();

    }

}
