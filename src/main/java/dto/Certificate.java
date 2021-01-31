package dto;

public class Certificate {
    private String kind;
    private Labels labels;
    private Spec spec;

    public Certificate(){

    }

    public Certificate(String kind, Labels labels, Spec spec) {
        super();
        this.kind = kind;
        this.labels = labels;
        this.spec = spec;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }
}
