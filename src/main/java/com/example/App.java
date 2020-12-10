package com.example;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;

import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        try (CqlSession session = CqlSession.builder()
                .withCloudSecureConnectBundle(Paths.get("secure-connect-trial.zip"))
                .withAuthCredentials(System.getenv("CASSANDRA_USER"), System.getenv("CASSANDRA_PASS"))
                .build()) {
            // Select the release_version from the system.local table:
            ResultSet rs = session.execute("select release_version from system.local");
            Row row = rs.one();
            //Print the results of the CQL query to the console:
            if (row != null) {
                System.out.println(row.getString("release_version"));
            } else {
                System.out.println("An error occurred.");
            }
        }
    }
}
