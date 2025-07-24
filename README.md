# Projeto Integrador

## Whitejack

### Blackjack do Walter White

Esse programa é um jogo Blackjack ou 21 de forma mais simplista, com a principal mecânica que é adicionar carta, que é um dado na tabela no banco de dados, soma das cartas, um limitador que é o 21 e um computador como adversário. (Walter White)

## Programas utilizados

IDE: Apache NetBeans 23

Linguagem de programação: Java 23

Banco de dados: MySQL WorkBench 8.0 CE

## Banco de dados

Criei um banco chamado baralho_BD, duas tabelas baralho_jogador e baralho_adversario. Ambas com os dados id, carta e naipe.

## Programação

O meu programa é dividido em 4 partes: Controller, DAO, Imagens, Model, View e Sons:
```
📦Whitejack
 ┣ 📂src
 ┃ ┣ 📂Controller
 ┃ ┣ 📂DAO
 ┃ ┣ 📂Imagens
 ┃ ┣ 📂Model
 ┃ ┣ 📂View
 ┃ ┣ 📂Sons
```
## Controler

Conexão do banco de dados

## Model

Nas classes ```Baralho_Jogador``` e ```Baralho_Adversario```, ambas tem o ```construtor``` com as variáveis ```id```, ```carta``` e ```valor```, vão ser os dados da ```Tabela_Jogador``` e ```Tabela_Adversario``` no ```View```

Na classe ```Embaralhamento``` tem 2 ```ArrayList```, um com os ```naipes``` e o outro com as ```cartas```. Fiz 2 variáveis, uma no tipo ```String``` carta e outra no tipo ```int``` valor.

No método ```embaralhar```, aleatoriza os itens dentro da ```ArrayList```, retorna a variável carta o primeiro item ```naipes``` e item ```cartas``` e retorna o ```setValor``` o primeiro item cartas.

No ```setValor``` verá no parâmetro do tipo String que é a carta. Dependendo da carta da ArrayList cartas será definido o valor do tipo int da carta.

Nas classes ```Modelo_Tabela_Jogador``` e ```Modelo_Tabela_Adversario``` vão interagir com as tabelas do ```View```, definindo as colunas e os dados, atualizando a tabela caso seja adicionado ou excluído os dados.

## DAO

Criei uma classe ```BD``` que entra a conexão do banco de dados.

Na classe ```DAO``` fiz as interações da tabela que é o ```adicionar carta```, ```listar carta```, ```excluir carta``` e ```somar cartas``` em ambas as tabelas do banco.

Nos métodos ```adicionar carta``` criei um objeto do tipo ```Embaralhamento``` para executar o método ```embaralhar``` e retornar os valores nas Classes ```Baralho_Jogador``` e ```Baralho_Adversario```.

Nos métodos ```listar cartas``` servem para listar os dados, interagindo com as Classes ```Baralho_Jogador``` e ```Baralho_Adversario``` para serem listados na ```Tabela_Jogador``` e ```Tabela_Adversario``` no ```View```.

Nos métodos ```excluir cartas``` servem para caso jogue de novo, não manterem os dados nas tabelas.

Nos métodos ```somar cartas``` somam as variáveis do tipo ```valor```.

## View

No frame ```Menu``` tem o botão ```jogar``` que entra no frame ```Jogo```.

No frame ```Jogo```, na sua interface tem 2 tabelas, a ```Tabela_Jogador``` e a ```Tabela_Adversario``` que recebem cartas que são dados do banco. 

Na classe ```Jogo```, foi criado ```objetos``` do tipo ```modelo tabela``` e ```baralho```, tanto do ```jogador``` quanto do ```adversário```. Sendo que, os ```objetos de modelo tabela``` receberem os ```objetos do baralho```. Quando inicializa o ```Jogo```, executa o método ```reiniciar_jogo``` para caso queira jogar de novo, exclui os dados da ```tabela jogador``` e da ```tabela adversário```.

No botão ```adicionar carta```, executa o objeto ```dao.adicionar_carta```, coloquei o ```swingworker``` para não dar erros ou travar na tabela quando atualiza. Com o ```doInBackground``` responsável na listagem da tabela e a soma do atributo ```valor``` cada vez que adiciona a carta. No ```done``` responsabiliza na atualização da tabela e da soma, com o ```if``` que, se a soma dos valores forem maior que ```21```, aparecer a mensagem que estourou e executar o frame ```Game_Over```.

No botão ```parar```, ira executar o método ```IA adversário```, que dentro no ```if```, adicionará carta até passar de ```17```, executa também um método privado atualizar ```tabela adversário```, responsável pela listagem e soma das cartas. Dentro no botão ```parar```, tem um ```if``` do adversário que, se passar da soma ```21```, mensagem de vitória e abre o frame ```Vitoria```. Se o adversário não passar de ```21```, entrará em 1 de 3 ```if```, que verificarão se a ```soma``` do ```adversário``` e maior do que o ```jogador```, ou se é menor, ou é igual, determinando se vai abrir o frame ```Game_Over```, ```Vitoria``` ou ```Empate```.

Nos frames ```Game_Over```, ```Vitoria``` e ```Empate```, tem apenas o botão ```jogar novamente```, que executa o frame ```Jogo```, e botão ```ir ao menu```, que abre o frame ```Menu```.

Fiz que pegasse nas pastas ```Imagens``` e ```Sons```, para ser colocados no projeto, com o caminho

## Imagens

### Menu
![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Walter_White_fofo.gif)

### Fundo do jogo

![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Mesa.jpg)

### Icone do adversário

![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Walter_White_Jogo.png)

### Vitória

![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Walter_White_Vitoria.gif)

### Game Over

![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Walter_White_Game_Over.gif)

### Empate

![](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Imagens/Walter_White_Empate.png)

## Sons


![Heisenberg](Senac/Projeto_Integrador/NetBeans/WhiteJack/src/Sons/heisenberg.wav)
