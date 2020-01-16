package com.example.flywaydemo.flyway;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class FlywayRunner {

    private final static String DDL_LOCATION = "com.example.flywaydemo.db.migration.ddl";

    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.name:demo}")
    private String schema;

    public void runFlyway() throws SQLException {
        Flyway flyway = new Flyway();

        flyway.setBaselineVersion(MigrationVersion.fromVersion("0"));
        flyway.setBaselineOnMigrate(true);

        flyway.setDataSource(url, username, password);
        flyway.setLocations(DDL_LOCATION);
        flyway.setValidateOnMigrate(true);

        createDatabase(flyway.getDataSource());
        flyway.setSchemas(schema);

        flyway.migrate();
    }

    private void createDatabase(DataSource dataSource) throws SQLException {
        try (Statement stmt = dataSource.getConnection().createStatement()) {
            stmt.executeQuery("drop database if exists " + schema);
            stmt.executeQuery("create database if not exists " + schema + " character set utf8 collate utf8_unicode_ci");
        }
    }
}
