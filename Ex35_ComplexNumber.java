public class Ex35_ComplexNumber {
    private double real;
    private double imaginary;

    public Ex35_ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(Ex35_ComplexNumber number) {
        add(number.real,number.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(Ex35_ComplexNumber number) {
        subtract(number.real, number.imaginary);
    }


    public static void main(String[] args) {

    }

}
