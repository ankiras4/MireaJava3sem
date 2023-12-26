package Tasks.Task24.punkt1;

public class ConcreteFactory implements ComplexAbstractFactory{
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int Real, int Img) {
        Complex a = new Complex();
        a.Real = Real;
        a.Img = Img;
        return a;
    }
}