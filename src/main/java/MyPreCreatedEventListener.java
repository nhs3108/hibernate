import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreInsertEventListener;

/**
 * Created by nhs3108 on 14/09/2017.
 */
public class MyPreCreatedEventListener implements PreInsertEventListener {
    public boolean onPreInsert(PreInsertEvent event) {
//        NonIdentifierAttribute[] properties = event.getPersister().getEntityMetamodel().getProperties();
//        Object[] state = event.getState();
//        for (int i = 0; i < properties.length; i++) {
//            if (properties[i].getName().equals("name")) {
//                state[i] = "------------------";
//                break;
//            }
//        }
        return false;
    }
}
