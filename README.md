ATIVIDADE 1 - ARIEL LIMA ABADE BANDEIRA: How do I print to console in pytest?
REPOSITÓRIO DO PROJETO: https://github.com/arielzz66/Teste_Software_2024_BANDEIRA_ARIEL

Problema

Este projeto aborda a dificuldade de imprimir logs do sistema (saídas da função print()) durante a execução de testes com o Pytest em Python. A visualização desses logs é crucial para entender o fluxo de execução dos testes e identificar possíveis falhas.

O problema original, publicado no Stack Overflow, envolvia um cenário de testes em uma classe Blogger que herda de Site, buscando verificar a correta recuperação de posts e links associados a um usuário específico. No entanto, a execução padrão do Pytest não exibia as mensagens de log desejadas.

Objetivos dos Testes

Confirmar se a classe Blogger é uma subclasse de Site.
Verificar se a chamada ao dono do blog retorna corretamente os posts associados ao usuário "alice".
Imprimir o nome do usuário e seus links associados para validação visual.
Solução

A solução encontrada foi executar o Pytest com a opção -s (shortcut para --capture=no):
