import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.persister.entity.EntityPersister;

/**
 * Created by nhs3108 on 14/09/2017.
 */
public class MyPostCreatedEventListener implements PostInsertEventListener {
    public void onPostInsert(PostInsertEvent event) {
        System.out.println("------------------------------------");
        System.out.println("----------------INSERTED---------------");
        System.out.println("------------------------------------");
    }

    public boolean requiresPostCommitHanding(EntityPersister persister) {
        return false;
    }
}
