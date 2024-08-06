import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MathServiceTest {

    private MathService mathService;
    private Multiplier multiplierMock;

    @Before
    public void setUp() {
        mathService = new MathService();
        multiplierMock = Mockito.mock(Multiplier.class);
        mathService.setMultiplier(multiplierMock);
    }

    @Test
    public void testMultiply() {
      
        when(multiplierMock.multiply(10, 10)).thenReturn(100);

        int result = mathService.multiply(10, 10);

        assertEquals(100, result);

        // Verifica quantas vezes o método multiply foi chamado com os parâmetros especificados
        verify(multiplierMock, times(1)).multiply(10, 10);
    }
}
