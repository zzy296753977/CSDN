package design.factorymethod;

public class Factory1 extends  AbsractFactory{
    @Override
    public Product Manufacture() {
        return new Product1();
    }
}
