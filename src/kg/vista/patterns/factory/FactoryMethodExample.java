package kg.vista.patterns.factory;

/**
 * Created by fukuro on 5/28/16.
 */
class Product {}

class ConcreteProductA extends Product {}
class ConcreteProductB extends  Product {}

abstract  class Creator {
    public abstract Product factoryMethod();
}

class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new  ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public  class FactoryMethodExample {

    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};

        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }

    }

}
