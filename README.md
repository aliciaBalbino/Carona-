🚗**Sistema de Caronas com 🍃Spring Boot**

🦾**Tecnologias usadas até 04/05/26:**
> Dependências: Dev Tools, Spring Web + Thymeleaf

> 

🏗️**Arquitetura MVC:**
> Criei 2 pacotes:

> 📊📂**1. Pacote Model:** Para modelar os dados da aplicação, criei 2 variáveis (motorista e destino) com getters and setters para encapsulamento dos dados.
> Aqui coloquei @Entity para mapear a classe como uma tabela no banco de dados através do JPA. Também adicionei um atributo
>chamado ID para um nº identificador que será gerado através da minha anotação @GeneratedValue.
>
> 🏹 **Como é na prática?** Dessa forma, o backend armazenar e organizar as ofertas de carona.
> Além disso, cada oferecimento será único através da chave primária gerada.


> 📂🎮**2. Pacote Controller:**
> Criei a classe CaronaController utilizando @RestController para controlar as requisições HTTP da aplicação. Também desenvolvi
> uma lista com ArrayList para armazenar temporariamente as caronas cadastradas. Utilizei @PostMapping("/oferecer") para receber os dados enviados pelo formulário HTML
> através de @RequestParam. Após isso, criei objetos da classe Carona e os adicionei ao mural de caronas disponíveis.
> Também implementei @GetMapping("/mural") utilizando ModelAndView para enviar os dados do backend para a página mural.html, permitindo a renderização dinâmica das informações.
> 
> 🏹 **Como é na prática?**
> O controller atua como intermediador entre frontend e backend, recebendo requisições do usuário, processando os dados e retornando respostas
> ou páginas dinâmicas com as informações cadastradas.


**Estrutura:**
projeto-carona/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/exercicio10sd/
│   │   │       │
│   │   │       ├── Exercicio10sdApplication.java
│   │   │       │
│   │   │       ├── controller/
│   │   │       │   └── CaronaController.java
│   │   │       │
│   │   │       └── model/
│   │   │           └── Carona.java
│   │   │
│   │   ├── resources/
│   │   │   │
│   │   │   ├── static/
│   │   │   │   └── index.html
│   │   │   │
│   │   │   ├── templates/
│   │   │   │   └── mural.html
│   │   │   │
│   │   │   └── application.properties
│   │
│   └── test/
│
├── pom.xml
│
└── README.md



**English:**
🚗**Ride-sharing System with 🍃Spring Boot**

🦾**Technologies used until 04/05/26:**
> Dependencies: Dev Tools, Spring Web + Thymeleaf

>

🏗️**MVC Architecture:**
> I created 2 packages:

> 📊📂**1. Model Package:** To model the application data, I created 2 variables (driver and destination) with getters and setters for data encapsulation.

> Here I used @Entity to map the class as a table in the database using JPA. I also added an attribute
> called ID for an identifier number that will be generated through my @GeneratedValue annotation.

>
> 🏹 **How ​​does it work in practice?** In this way, the backend stores and organizes ride-sharing offers.

> In addition, each offer will be unique through the generated primary key.

> 📂🎮**2. Controller Package:**
> I created the CaronaController class using @RestController to control the application's HTTP requests. I also developed
> a list with ArrayList to temporarily store the registered rides. I used @PostMapping("/offer") to receive the data sent by the HTML form
> through @RequestParam. After that, I created objects of the Carona class and added them to the available rides board.

> I also implemented @GetMapping("/board") using ModelAndView to send the data from the backend to the mural.html page, allowing dynamic rendering of the information.

>
> 🏹 **How ​​is it in practice?**
> The controller acts as an intermediary between the frontend and backend, receiving user requests, processing the data, and returning responses
> or dynamic pages with the registered information.

**Structure:**
project-piggyback/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/exercicio10sd/
│ │ │ │
│ │ │ ├── Exercicio10sdApplication.java
│ │ │ │
│ │ │ ├── controller/
│ │ │ │ └── CaronaController.java
│ │ │ │
│ │ │ └── model/
│ │ │ └── Carona.java
│ │ │
│ │ ├── resources/
│ │ │ │
│ │ │ ├── static/
│ │ │ │ └── index.html
│ │ │ │
│ │ │ ├── templates/
│ │ │ │ └── mural.html
│ │ │ │
│ │ │ └── application.properties
│ │
│ └── test/
│
├── pom.xml
│
└── README.md
