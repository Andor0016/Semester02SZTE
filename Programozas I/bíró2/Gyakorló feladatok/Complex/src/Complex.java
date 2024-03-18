public class Complex {
    //properties
    private double real;
    private double imag;

    //get
    public double getReal(){
        return this.real;
    }
    public double getImag(){
        return this.imag;
    }

    //constructors
    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public Complex(){
        this.real = 0;
        this.imag = 0;
    }
    public Complex add(Complex secondNumber){
        return new Complex(this.getReal()+secondNumber.getReal(),this.getImag()+ secondNumber.getImag());
    }

    public Complex mul(Complex sN){
        return new Complex((this.real*sN.getReal()-this.imag*sN.getImag()),(this.imag* sN.getReal()+this.real*sN.getImag()));
    }
    public Complex conjugate(){
        return new Complex(this.real, this.imag*-1);
    }

    //Override methods
    @Override
    public String toString(){
        if(this.imag < 0) {
            return Double.toString(this.real) + Double.toString(this.imag) + "i";
        } else if( this.imag > 0) {
            return Double.toString(this.real) + "+" + Double.toString(this.imag) + "i";
        } else {
            return Double.toString(this.real);
        }
    }

}
