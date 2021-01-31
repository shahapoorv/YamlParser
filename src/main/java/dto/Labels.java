package dto;

public class Labels {
    private String partOf;

    public Labels(){

    }

    public Labels(String partOf) {
        super();
        this.partOf = partOf;
    }

    public String getPartOf() {
        return partOf;
    }

    public void setPartOf(String partOf) {
        this.partOf = partOf;
    }

    @Override
    public String toString() {
        return "dto.Labels{" +
                "partOf='" + partOf + '\'' +
                '}';
    }
}
