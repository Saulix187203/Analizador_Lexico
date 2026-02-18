package Tokens;

public class IntPose {
    private String value;

    public IntPose(String value) {
        this.value = value;
    }

    public Integer getValue() {
        int numero = Integer.parseInt(value);
        return numero;
    }
    
}
