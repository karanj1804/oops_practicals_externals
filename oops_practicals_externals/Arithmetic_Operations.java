class Complex {
    int real, imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    void add(Complex c) {
        System.out.println("Addition = " + (real + c.real) + " + " + (imaginary + c.imaginary) + "i");
    }

    void subtract(Complex c) {
        System.out.println("Subtraction = " + (real - c.real) + " + " + (imaginary - c.imaginary) + "i");
    }

    void multiply(Complex c) {
        int realPart = real * c.real - imaginary * c.imaginary;
        int imaginaryPart = real * c.imaginary + imaginary * c.real;

        System.out.println("Multiplication = " + realPart + " + " + imaginaryPart + "i");
    }
}

class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
    }
}