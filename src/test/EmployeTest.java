package test;

import metier.Employe;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class EmployeTest {

    @Test
    public void testGetPrime() {
        Employe chefDepartementMock = mock(Employe.class);
        when(chefDepartementMock.getPrimeFixe()).thenReturn(1500.0);

        Employe employe = new Employe(1, "Nom", "Prenom", 5000.0, 0.1, 18, chefDepartementMock);

        System.out.println("Prime of the employee: " + employe.getPrime());
    }
}