package com.estudos.flyway;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ManualFlywayMigrationTest {
    @Autowired(required = false)
    private Flyway flyway;

    @Test
    public void testFlywayManualMigration() {
        final String teste = "safa";
        flyway.clean();
        flyway.migrate();
    }
}
