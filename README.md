Automação de Página de Login
O projeto consiste na automação de uma página de contas, utilizando os seguintes recursos:

IDE: IntelliJ;
Padrão PageObjects;
Java;
Maven;
JUnit;
Selenium;
Cucumber (BDD);
Pluguins p/ relatórios automatizados.
Configuração da IDE e Projeto de Automação
Criar projeto no IntelliJ

File > New > Maven Project
Instalação de plugin na IDE

File > Settings > Plugins > Cucumber Java
Instalar os pacotes na Aplicação através do Maven (pom.xml)

cucumber-java 7.2.3
cucumber-junit 7.2.3
selenium-java 3.141.59
webdrivermanager 5.0.3
Planejamento de Testes
Funcionalidade: Contas
   Eu como usuário do site "Sr. Barriga"
   Gostaria de realizar de criar uma conta
   Para acessar poder fazer movimentações
Recursos automatizados
Contas
Mapeando cenários
Cenário: TC001 - Criar conta com sucesso
Criação da Feature de Teste
Na feature, criei os cenários de fluxo base e exceção, utilizando a escrita da feature em gherkin tendo como base o BDD: /src/test/resources/features/Contas.feature

Apoie este projeto
Se você quer apoiar este projeto, deixe uma ⭐.
