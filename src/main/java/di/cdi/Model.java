package di.cdi;

import java.io.IOException;
import java.util.ResourceBundle;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

// tag::main[]
public class Model {
    
    public @Produces @MyModel String getModelData(InjectionPoint ip)
		throws IOException {

        ResourceBundle props = ResourceBundle.getBundle("messages");
        return props.getString(
			ip.getMember().getDeclaringClass().getSimpleName() + "." +
			ip.getMember().getName());
    }
}
// end::main[]
