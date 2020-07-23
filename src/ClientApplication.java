import com.applications.world.hello.Adapter;
import com.applications.world.hello.ITarget;
import software.party.third.Adaptee;


public class ClientApplication {

    public static void main(String[] args) {
        ITarget target = new Adapter(new Adaptee());

        target.request();
    }
}
