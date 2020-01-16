package com.example.flywaydemo.db.migration.ddl;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;

import java.sql.Connection;
import java.sql.Statement;

public class V1__schema implements JdbcMigration {

    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {

            stmt.execute(
                    "CREATE TABLE user1\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user2\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user3\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user4\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user5\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user6\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user7\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user8\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user9\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user10\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user11\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user12\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user13\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user14\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user15\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user16\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user17\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user18\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user19\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );

            stmt.execute(
                    "CREATE TABLE user20\n"
                            + "(\n"
                            + "id CHAR(36) NOT NULL,\n"
                            + "user_id VARCHAR(100) NOT NULL,\n"
                            + "first_name BLOB NULL,\n"
                            + "last_name BLOB NULL,\n"
                            + "email BLOB NULL,\n"
                            + "mobile BLOB NULL,\n"
                            + "created TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n"
                            + "modified TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n"
                            + "phone BLOB NULL,\n"
                            + "PRIMARY KEY (id),\n"
                            + "UNIQUE INDEX UK_au__user_id (user_id)\n"
                            + ")"
            );
        }
    }
}
