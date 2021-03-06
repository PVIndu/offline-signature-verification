package sfllhkhan95.versign.model.entity;


/**
 * VerificationRequest is sent to the server with a customer's identifier and a questioned
 * signature for verification.
 *
 * @author saifkhichi96
 * @version 1.0
 */
public class VerificationRequest {

    private final String customerID;
    private final SignatureImage questionedSignature;

    public VerificationRequest(String customerID, SignatureImage questionedSignature) {
        this.customerID = customerID;
        this.questionedSignature = questionedSignature;
    }

    public String getCustomerID() {
        return customerID;
    }

    public SignatureImage getQuestionedSignature() {
        return questionedSignature;
    }
}
