# Projeto FiapRide - Gabriel Cerri Fidalgo

## Informações do Aluno

**Nome:** Gabriel Cerri Fidalgo

- **RM:** 563213
- **Turma:** 2CCPO
- **Curso:** Ciência da Computação
- **GitHub:** FidalgoGab

# Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**

A classe `Passageiro` é fundamental para organizar dados e comportamentos de forma escalável. Com variáveis soltas, teríamos milhões de variáveis espalhadas no código, tornando-o caótico e impossível de manter. A classe encapsula todos os dados (nome, saldo, etc.) e métodos (adicionar saldo, consultar saldo) em uma única entidade reutilizável. Assim, para 1 milhão de usuários, simplesmente criamos 1 milhão de objetos `Passageiro` - código limpo, organizado e sem duplicação de lógica.

---

### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Sua Resposta:**

Deixar o saldo ser alterado diretamente abre portas para fraudes e bugs críticos. Qualquer programador poderia fazer `passageiro.saldo = -999999` ou deixar o saldo negativo sem controle. Um método `adicionarSaldo(valor)` permite validar a operação: verificar se o valor é positivo, aplicar limites, registrar a transação em logs, etc. Para uma startup de mobilidade, isso significa segurança financeira, rastreabilidade e confiança dos usuários.

---

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

**Pense bem:** Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasuar?

**Sua Resposta:**

O método `get` retorna uma cópia dos dados, enquanto um atributo `public` expõe o dado real/original. Se alguém tiver acesso ao original, pode modificar livremente. O `get` é como fornecer uma fotocópia: a pessoa vê a informação mas não consegue alterar o documento original. Dessa forma, mantemos o controle total sobre os dados internos e podemos adicionar validações se precisarmos modificá-los.

---

### Aula 4 - Construtores

**Pergunta:** Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

**Sua Resposta:**

Gerar getters e setters automaticamente para tudo viola o princípio de que dados não devem mudar livremente. O modelo de um veículo não muda - é uma característica imutável definida na fabricação. Deixar `setModelo()` aberto permitiria alguém "transformar" um Carro em uma Moto, quebrando a lógica do sistema. Já a placa, que pode mudar no mundo real (quando há roubo ou transferência), é controlada através de `atualizarPlaca()`, que pode validar o processo e registrá-lo adequadamente, protegendo o sistema de fraudes.

---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

**Pense nas regras de negócio:** O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?

**Sua Resposta:**

Precisamos do objeto inteiro porque a Viagem precisa interagir com o Passageiro além de apenas exibir dados. Quando a viagem termina, o sistema deve descontar o saldo - com apenas a String "Ana Silva", não conseguimos fazer isso. O objeto completo mantém a associação com o Passageiro real, permitindo acessar seus métodos e atributos, como `descontarSaldo()`. Isso garante que apenas dados válidos sejam manipulados e que o sistema funcione de forma coesa e segura.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Sua Resposta:**

O Java restringe o acesso aos atributos `private` porque está protegendo o encapsulamento. Se a filha conseguisse alterar diretamente, ela poderia quebrar as validações da mãe. O `private` da mãe significa "ninguém, nem as filhas, alteram isso diretamente". As filhas devem usar os métodos da mãe (`setPlaca()`) que contêm a lógica de validação. Isso garante que todas as classes respeitem as regras de negócio definidas pela mãe, independentemente de quantas filhas existam.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Sua Resposta:**

Não, o compilador não deixaria chamar `veiculo.calcularAutonomia()` se o método não existir em `Veiculo`. Quando trabalhamos com tipos genéricos (`Veiculo`), o compilador só permite chamar métodos que existem nessa classe base. O contrato precisa existir na hierarquia porque é uma promessa: "todo Veiculo tem calcularAutonomia()". Sem isso, o compilador não pode garantir que todas as filhas têm o método, quebrando a segurança de tipo e tornando o polimorfismo impossível.

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Sua Resposta:**

No mundo real, ninguém compra "um veículo" genérico - sempre é um carro, moto ou caminhão específico. Se não colocarmos `abstract`, alguém poderia fazer `new Veiculo()` e quebrar toda a lógica do sistema - teríamos um veículo "fantasma" sem tipo específico, incapaz de implementar comportamentos concretos. O `abstract` força explicitamente que `Veiculo` é apenas um modelo, uma estrutura que DEVE ser especializada em subclasses.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

**Pense:** Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?

**Sua Resposta:**

Se o Java permitisse herança múltipla, teríamos ambiguidade: qual `ligar()` seria chamado - da `Veiculo` ou da `Bateria`? Interfaces resolvem isso porque são apenas contratos sem implementação. `CarroEletrico` pode implementar múltiplas interfaces (ex: `Veiculo`, `Recarregavel`) sem conflito - cada uma define métodos que `CarroEletrico` implementa uma única vez. Interfaces forçam `CarroEletrico` a ser explícito: "sim, eu sou um Veiculo e também sou Recarregavel", sem ambiguidade ou herança conflitante.

---

## Desafios Técnicos Implementados

### Projeto Animal (POO Avançada)

**Domínio do Projeto:** Sistema de gerenciamento de animais com hierarquia de classes e comportamentos específicos.

**Classes Criadas:**

- `Animal` (classe abstrata)
- `Formiga` (herda de Animal, implementa Locomocao)
- `Passaro` (herda de Animal, implementa Locomocao)
- `Alimentacao` (classe de suporte)
- `Locomocao` (interface para comportamento de deslocamento)

**Maior Desafio Técnico:**
Não tive um grande desafio técnico pois já dominava POO e seus conceitos. O mais trabalhoso de implementar e idealizar foi a classe Alimentacao que está como um atributo de Animal.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**

Revi contextos e abordagens que já conhecia, assim, podendo fixar e compreender conteúdos já vistos.

**Qual conceito foi mais difícil de entender?**

Quando aprendi pela primeira vez, o que me deixou com mais dúvida era do funcionamento e similaridade entre Abstração e Interfaces.

**O que você melhoraria no seu projeto se pudesse refazer?**

Exploraria melhor a classe Animal, realizando implementações e definições mais profundas.
