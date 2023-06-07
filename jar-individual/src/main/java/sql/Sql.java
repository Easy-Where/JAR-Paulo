package sql;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Sql {
    
    private JdbcTemplate connection;
    
    public Sql() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource​.setUrl("jdbc:sqlserver://svr-projeto-easy.database.windows.net:1433;database=bd-projeto-easy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        dataSource​.setUsername("admin-projeto-easy@svr-projeto-easy");
        dataSource​.setPassword("#Gfgrupo1");  
        this.connection = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connection;
    }

}
