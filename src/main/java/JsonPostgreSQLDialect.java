import org.hibernate.dialect.PostgreSQL82Dialect;

import java.sql.Types;

/**
 * Created by FRAMGIA\le.ha.tu on 06/10/2016.
 */
public class JsonPostgreSQLDialect extends PostgreSQL82Dialect {
    public JsonPostgreSQLDialect() {

        super();

        this.registerHibernateType(Types.OTHER, "pg-uuid");
        this.registerColumnType(Types.JAVA_OBJECT, "json");
    }
}
