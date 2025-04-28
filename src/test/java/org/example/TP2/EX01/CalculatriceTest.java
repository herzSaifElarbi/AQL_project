package org.example.TP2.EX01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();

        // Act
        int result = calculatrice.additionner(2, 3);

        // Assert
        assertEquals(5, result, "Le résultat doit être 5");
    }
}
