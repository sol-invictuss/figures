package factory;

public class AbstractFactory {

    private BaseFactory factory;

    public AbstractFactory(BaseFactory factory) {
        this.factory = factory;
    }

    public void setFactory(BaseFactory factory) {
        this.factory = factory;
    }

    public BaseFactory getFactory() {
        return factory;
    }
}
