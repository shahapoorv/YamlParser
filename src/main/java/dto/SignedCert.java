package dto;

public class SignedCert {
    private String cert;

    public SignedCert(){

    }

    public SignedCert(String cert) {
        super();
        this.cert = cert;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    @Override
    public String toString() {
        return "dto.SignedCert{" +
                "cert='" + cert + '\'' +
                '}';
    }
}
