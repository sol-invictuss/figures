import factory.AbstractFactory;
import factory.BlackFactory;

public class Main {
    public static void main(String[] args) {

        final AbstractFactory abstractFactory = new AbstractFactory(new BlackFactory());
        abstractFactory
                .getFactory()
                .createCircle()
                .describe();

    }
}
