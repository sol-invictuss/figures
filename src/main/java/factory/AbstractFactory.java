package factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AbstractFactory {

    // Variables

    private BaseFactory factory;

}
