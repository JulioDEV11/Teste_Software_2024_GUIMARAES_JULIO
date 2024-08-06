ATIVIDADE 1 - JULIO GEOVANI OLIVEIRA GUIMARAES: How to verify a method is called two times with mockito verify()?

REPOSITÓRIO DO PROJETO: https://github.com/JulioDEV11/Teste_Software_2024_GUIMARAES_JULIO

Problema:

Verificação se um método foi chamado pelo menos duas vezes usando o Mockito. No problema em específico, o programador 
está recebendo uma exceção que indica que o método foi chamado mais vezes do que o esperado. 

A solução:

Para solucionar este problema, basta utilizar o VerificationMode de forma correta e apropriada para os testes em específicos:

1 - Importar os métodos necessários para o Mockito:

import static org.mockito.Mockito.atLeast; - Verifica se o método foi chamado pelo menos uma quantidade específica de vezes. 
import static org.mockito.Mockito.times; - Verifica se um método foi chamado exatamente um número específico de vezes.
import static org.mockito.Mockito.verify; - Verifica se um método foi chamado no mock. 

2 - Realizar testes utilizando os métodos importados:

Multiplier.java: Código em que o método de multiplicação para dois atributos é inicializado - https://github.com/JulioDEV11/Teste_Software_2024_GUIMARAES_JULIO/blob/main/Multiplier.java

MathService.java: 

MathServiceTest.java: Código em que os testes são realizados - https://github.com/JulioDEV11/Teste_Software_2024_GUIMARAES_JULIO/blob/main/MathServiceTest.java





