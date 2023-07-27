#language: pt
@recuperacao
@area_logada
Funcionalidade: Contas Seu Barriga

  Cenario: 01 - Adicionar Conta
    Dado que o usuario esta na pagina inicial do Seu Barriga
    Quando o usuario clicar em "Contas"
    E o usuario clicar em "Adicionar"
    E o usuario inserir o nome da conta
    E o usuario clicar em "Salvar"
    Entao o sistema deve exibir a mensagem "Conta adicionada com sucesso!"

  Cenario: 02 - Listar Conta
    Dado que o usuario esta na pagina inicial do Seu Barriga
    Quando o usuario clicar no botao contas
    E o usuario clicar no botao listar
    Entao o sistema deve exibir a conta "Nubank"

  Cenario: 03 - Editar Conta - Primeira da Lista
    Dado que o usuario esta na pagina inicial do Seu Barriga
    Quando o usuario clicar no botao contas
    E o usuario clicar no botao listar
    E o usuario clicar em editar
    E o usuario alterar o nome da conta
    E o usuario clicar em "Salvar"
    Entao o sistema deve exibir a mensagem "Conta alterada com sucesso!"
    E o sistema deve exibir a conta "C6 Bank"

  Cenario: 04 - Remover Conta - Primeira da Lista
    Dado que o usuario esta na pagina inicial do Seu Barriga
    Quando o usuario clicar no botao contas
    E o usuario clicar no botao listar
    E o usuario clicar em remover conta
    Entao o sistema deve exibir a mensagem "Conta removida com sucesso!"

