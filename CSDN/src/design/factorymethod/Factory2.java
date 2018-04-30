package design.factorymethod;

public class Factory2 extends  AbsractFactory{
    @Override
    public Product Manufacture() {
        return new Product2();
    }
}
