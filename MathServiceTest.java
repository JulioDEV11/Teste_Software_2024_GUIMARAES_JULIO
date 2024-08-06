import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
    public void testMultiplyCalledAtLeastTwice() {
        
        when(multiplierMock.multiply(10, 10)).thenReturn(100);

        
        mathService.multiply(10, 10);
        mathService.multiply(10, 10);

        // Verifica se o método multiply do mock foi chamado pelo menos duas vezes!
        verify(multiplierMock, atLeast(2)).multiply(10, 10);
        
        verify(multiplierMock, times(3)).multiply(10,10);
    }
}
