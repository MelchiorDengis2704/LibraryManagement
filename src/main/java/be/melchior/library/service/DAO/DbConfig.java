package be.melchior.library.service.DAO;

public class DbConfig {
    private String module;      // "mysql", "postgresql", etc.
    private String host;        // "localhost"
    private int port;           // 3306
    private String database;
    private String user;
    private String password;

    public DbConfig(String module, String host, int port, String database, String user, String password) {
        this.module = module;
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;
    }

    public String getUrl() {
        return switch (module.toLowerCase()) {
            case "mysql" -> "jdbc:mysql://" + host + ":" + port + "/" + database;
            case "postgresql" -> "jdbc:postgresql://" + host + ":" + port + "/" + database;
            default -> throw new IllegalArgumentException("Module DB inconnu : " + module);
        };
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}