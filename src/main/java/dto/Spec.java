package dto;

public class Spec {
    private SignedCert signedCert;

    public Spec(){

    }

    public Spec(SignedCert signedCert) {
        super();
        this.signedCert = signedCert;
    }

    public SignedCert getSignedCert() {
        return signedCert;
    }

    public void setSignedCert(SignedCert signedCert) {
        this.signedCert = signedCert;
    }
}
