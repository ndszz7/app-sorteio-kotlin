# 🎲 App de Sorteio - Kotlin

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

## Objetivo

Simular um aplicativo de sorteio de participantes utilizando Kotlin e os principais conteúdos estudados durante a disciplina.

## Funcionalidades

- Cadastro de participantes;
- Validação de nome;
- Validação de número;
- Impedimento de números duplicados;
- Listagem dos participantes;
- Contagem de participantes;
- Sorteio aleatório;
- Tratamento de lista vazia;
- Menu interativo.

## Conteúdos utilizados

- Programação Orientada a Objetos (POO);
- Classes e objetos;
- Variáveis;
- Operadores;
- `if / else`;
- `when`;
- Laços de repetição com `do while` e `for`;
- Null Safety;
- `data class`;
- Listas mutáveis;
- Sorteio aleatório com `random()`.

## Estrutura

```text
app-sorteio-kotlin/
├── src/
│   ├── Main.kt
│   ├── Participante.kt
│   └── Sorteio.kt
└── README.md
```

## Como executar

Abra os arquivos em uma IDE com suporte a Kotlin, como IntelliJ IDEA ou Android Studio, e execute `Main.kt`.

## Exemplo

```text
===== APP DE SORTEIO =====

1 - Cadastrar participante
2 - Listar participantes
3 - Realizar sorteio
4 - Ver quantidade de participantes
0 - Sair
```

## Regras de negócio

1. Um participante precisa possuir nome e número.
2. O nome não pode estar vazio.
3. O número deve ser maior que zero.
4. Dois participantes não podem utilizar o mesmo número.
5. O sorteio somente pode ocorrer quando houver participantes cadastrados.
6. O vencedor é escolhido aleatoriamente entre os participantes cadastrados.
