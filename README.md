# Vem Ser Cozinheiro

Quem nunca pensou em ser um jurado do MasterChef?! Ou até mesmo ser portador de uma estrela Michellin?! Neste jogo você será o dono de uma lanchonete fast-food e precisa atender os clientes o mais rapido possível, montando os lanches solicitados de forma correta, aumentando sua fama e suas chances em alcançar sucesso na cidade e no mundo. Então, dá play no jogo e **Vem Ser Cozinheiro** com a gente!


### Logo do Jogo
<img src="https://cdn.discordapp.com/attachments/1313508705593065548/1313564349327212655/file-P1M9SDqpyJQn8uXcLHmL3w.png?ex=675097a1&is=674f4621&hm=6cb41a8d31f2e562e1d54fa6d309ae410a9f96ba67dd61eff0d2099801203f1a&" width="370">

## 🎮 Sobre o Jogo

Você é o proprietário iniciante de uma lanchonete que pode ter o nome que você escolher. Seu objetivo é atender os pedidos dos clientes que chegam de forma aleatória. Para isso, será necessário:

- Escolher o **tipo de carne**.
- Selecionar o **pão correto**.
- Escolher o **ponto da carne**
- Adicionar a **bebida** correspondente.

O desafio está em montar os pedidos corretamente para que os clientes fiquem satisfeitos e seu sonho não acabe!

---

## 🛠️ Funcionalidades

- **Personalização do jogo:** Escolha o nome da sua lanchonete no início.
- **Pedidos aleatórios:** Cada cliente faz um pedido.
- **Montagem dos pedidos:** Combine ingredientes e bebidas para atender corretamente os clientes.
- **Sistema de pontuação:** Ganhe pontos por pedidos entregues corretamente.

---

## 📋 Regras do Jogo

1. Cada pedido deve ser montado conforme solicitado.
2. Pedidos errados resultam em clientes insatisfeitos e ganho de menos pontos.
3. jogo termina após um número específico de pedidos. 

---
## 📃 Descrição do projeto 
Criação de jogo utilizando a linguagem de programação Java, utilizando o modelo MVC para estruturação do código. 
Durante o código, conceitos como encapsulamento, herança, sobrecarga, Java Collections e entre outros conceitos.
---
## ⚡ Diagrama UML (Inicial)
<img src="https://media.discordapp.net/attachments/1313508705593065548/1314308520820084876/Classe_UML_1.png?ex=67534cb2&is=6751fb32&hm=c2710a1a3f08702a5e13f92a00bd9fefaec1299e1df875e5ce69b0227fe66415&=&format=webp&quality=lossless&width=972&height=663">

---
## 📦 Estrutura do Projeto

* **Modelo MVC (Model-View-Controller)**:
    Utilizamos o Modelo MVC, que é um padrão de arquitetura de software utilizado para separar a lógica de negócios, a interface de usuário e o controle de fluxos de dados dentro de um código. 
```
scr/
├── Controllers
├── Enums
├── Model
├── Views
├── Main.java
```
* **Controllers**:
O package Controllers irá possuir os arquivos que irão receber as entradas do usuário(da view), processar as entradas e chamar os métodos no Model. Além disso, também atualiza a View com os dados atualizados da ação do jogo. 
```
Controllers/
├── BebidasController
├── GeradorPedidos
├── HamburguerController
├── JogadorController
├── PedidoController
```
* **Enums**:
Eles vão conter as enumerações que definem conjuntos de valores fixos e predefinidos. No caso do jogo, ele representa os tipos fixos e constantes de dados no sistema, como tipos de carne, tipos de pão, tamanhos de bebida e o ponto da carne. 
```
Enums/
├── PontoCarne
├── TamanhoBebida
├── TipoCarne
├── TipoPao
```
* **Model**: Responsável por representar a lógica da lanchonete e a estrutura de dados. Cada classe dentro do package Model reflete um objeto ou entidade no domínio da aplicação, como um hambúrguer ou bebida.
```
Model/
├── Bebidas
├── Hamburguer
├── Item
├── Jogador
├── Pedido
├── Refrigerante
├── Suco
```
* **Views**: Ele é encarregado de exibir os dados e interagir com o usuário, recebendo entradas e exibindo informações. As classes dentro do package Views serão responsáveis por servir de "Menu" para as diversas ações do jogador. 
```
Views/
├── BebidaView
├── HamburguerView
├── JogadorView
├── MenuView
├── PedidoView
```
## Conceitos utilizados 
## 1. Herança

A **Herança** permite que uma classe herde atributos e métodos de outra. No código, a herança é utilizada para criar hierarquias entre as classes:

- **Classe `Bebidas` herda de `Item`**: A classe `Bebidas` herda os atributos e métodos da classe `Item`, como `nomeItem`, `preco` e `quantidade`, mas também adiciona atributos próprios, como `tamanhoBebida` e `gelada`.
- **Classes** `Refrigerante` e `Suco` herdam de `Bebidas`: Estas classes herdam os atributos de ` Bebidas` e adicionam características específicas, como `comLimao` em `Refrigerante` e `adocado` em `Suco`.

## 2. Polimorfismo
   O Polimorfismo permite que diferentes tipos de objetos respondam de maneira diferente a um mesmo método. No código, isso é exemplificado pela sobrecarga de métodos para tratar diferentes tipos de itens em um pedido:
Método `adicionarItem()` sobrecarregado: O método `adicionarItem()` é utilizado para adicionar diferentes tipos de itens ao pedido (como bebidas, hambúrgueres).

## 3. Abstração
   A Abstração é o processo de ocultar os detalhes de implementação e mostrar apenas as funcionalidades essenciais. A classe Item é um exemplo de abstração:

`Classe Item`: A classe Item é abstrata e define os atributos comuns a todos os itens. As classes filhas como `Bebidas` e `Hamburguer` implementam os detalhes específicos.

## 4. Encapsulamento
O Encapsulamento garante que os dados de uma classe sejam acessados de forma controlada, através de métodos get e set. Exemplo:
Métodos `get` e `set` para acesso aos atributos: Na classe `Item`, o acesso ao atributo `nomeItem` é feito por meio dos métodos `getNomeItem()` e `setNomeItem()`.

## 5. Instância
Instância refere-se à criação de objetos a partir de uma classe. No código, diversos objetos são instanciados para representar jogadores, pedidos, bebidas e hambúrgueres:

## 6. Relacionamentos
Relacionamentos entre classes são estabelecidos para que objetos de diferentes classes interajam entre si. No código, a classe `Pedido` mantém relacionamentos com as classes `Bebidas, Hamburguer e Jogador`.

## 6. Sobrecarga de construtores
A Sobrecarga de Construtores ocorre quando uma classe tem mais de um construtor, permitindo inicializar objetos de diferentes maneiras. No código, existem construtores sobrecarregados nas classes `Bebidas, Refrigerante, Suco e Hamburguer`.

## 7. Sobrecarga de Métodos
A Sobrecarga de Métodos permite definir vários métodos com o mesmo nome, mas com parâmetros diferentes. No código, métodos como `adicionarItem()` em `Pedido` são sobrecarregados para lidar com diferentes tipos de itens.
 

## Ferramentas e Frameworks
* O diagrama de classes UML foi criado utilizando a plataforma Lucid Charts - [Confira aqui](https://lucid.app/lucidchart/d592c6c6-451d-4312-aba5-2a4cae62050e/edit?viewport_loc=2841%2C-492%2C277%2C113%2CHWEp-vi-RSFO&invitationId=inv_25de385d-8e1b-4917-bc14-9fc2d855cc57)
* A organização e definição de tasks foi realizada pelo quadra Kanban do próprio Github
<img src='https://media.discordapp.net/attachments/1313508705593065548/1314301512289222818/Captura_de_tela_2024-12-05_095351.png?ex=6753462b&is=6751f4ab&hm=7def207296d46a402e53f5b9f104d8b73c4a5444aa95fc1572cda8826a9a2439&=&format=webp&quality=lossless&width=1440&height=637'>
* Todos os integrantes utilizaram a IDE IntelliJ para a programação do código 
* Utilizamos inteligência artificial para gerar a logo do jogo com prompt especificando as características do jogo
* A comunicação do grupo foi realizada inteiramente via discord 

<img src ='https://media.discordapp.net/attachments/1314386764764282931/1314389404302970880/image.png?ex=67539806&is=67524686&hm=0cefb1b8a4acc1c5dfdcaba12fbfd7bfab89f2f277659f4fa91987da59e1a240&=&format=webp&quality=lossless' width="200">
<img src="https://media.discordapp.net/attachments/1314386764764282931/1314389458602299442/image.png?ex=67539813&is=67524693&hm=a230c018b77796687c55c3d555a703ac30c7a202d2e16d1e3ff76824c5bb21ee&=&format=webp&quality=lossless" width="500">
<img src="https://media.discordapp.net/attachments/1314386764764282931/1314389524645810336/image.png?ex=67539822&is=675246a2&hm=8a6b05c83adb4ced33e12caa1a35946490b5ca0e0c913a99b2a8ff98598ae0a8&=&format=webp&quality=lossless&width=1009&height=663" width="500">
<img src="https://media.discordapp.net/attachments/1314386764764282931/1314389598406705272/image.png?ex=67539834&is=675246b4&hm=740464bb567405fb7c368f441b2f1fdf4233eb06915fa7a02283142057702643&=&format=webp&quality=lossless&width=993&height=663" width="500">



---
## Galeria do jogo
* *Menu inicial*

<img src="https://media.discordapp.net/attachments/1314386764764282931/1314388582298816563/Captura_de_tela_2024-12-05_212646.png?ex=67539742&is=675245c2&hm=57dd8db91974698dd006dd4dfcd038d0d027b44ce7e411f9cb268fcdd1e18cca&=&format=webp&quality=lossless">

* 1 - *Iniciar jogo*

<img src="https://media.discordapp.net/attachments/1314386764764282931/1314388632714608721/Captura_de_tela_2024-12-05_212828.png?ex=6753974e&is=675245ce&hm=4f9f496983fbcd116b760fe6c151905b314137574621de300e057a0b97083fda&=&format=webp&quality=lossless">

* 2 - *Ver história*

<img src="https://media.discordapp.net/attachments/1314386764764282931/1314389004749373472/Captura_de_tela_2024-12-05_213205.png?ex=675397a6&is=67524626&hm=8310970b680a9868d317fdb1cad4d953c7ed60310255f74ff2cf665a62a2350f&=&format=webp&quality=lossless">

* 3 - *Sair*

<img src="https://media.discordapp.net/attachments/1314386764764282931/1314389005109821482/Captura_de_tela_2024-12-05_213214.png?ex=675397a6&is=67524626&hm=d65ffe5c1789429ea9087a1d59d2d210b8f508632ae3b50f142b7c3276350795&=&format=webp&quality=lossless">



--- 
[Vem ver nossa apresentação!](https://www.canva.com/design/DAGYdCSqqCg/XFeNJaUQHPOgW2qsXrH_2g/edit?utm_content=DAGYdCSqqCg&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)
---

## Integrantes 
Nomes   | Github
--------- | ------
Antonio Carolino | [AntonioCar0lin0](https://github.com/AntonioCar0lin0)
Cainan Machado | [cainantm](https://github.com/cainantm)
Luiz Henrique | [luizhcastro](https://github.com/luizhcastro)
Rafael Leonardo | [Rafaells-dv](https://github.com/Rafaells-dv)
---


Divirta-se e mostre suas habilidades como dono da melhor lanchonete da cidade! 😄🍔🥤
