# 🥋 Batismo de Java

Bem-vindo ao módulo **Batismo de Java**! Este é um roteiro estruturado para aprender os fundamentos de **Programação Orientada a Objetos (POO)** em Java, utilizando o universo do anime Naruto como tema.

---

## 📚 Estrutura de Aprendizado

### **Nível Básico**

#### 1️⃣ **Arrays.java**
- **Objetivo**: Entender estruturas de dados básicas
- **Conceitos Explorados**:
  - Declaração e inicialização de arrays
  - Iteração sobre arrays
  - Manipulação de dados em coleções

---

### **Nível Intermediário**

#### 🔰 **Aula 1 - Sistema Bancário (Desafio3)**
- **Objetivo**: Criar sua primeira aplicação orientada a objetos
- **Arquivo Principal**: `Main.java`
- **Conceitos Explorados**:
  - ✅ Criação de classes e objetos
  - ✅ Atributos e métodos
  - ✅ Tipos de contas diferentes (Corrente, Poupança)
  - ✅ Encapsulamento básico
  - ✅ Implementação de regras de negócio
  - ✅ Enumerações para tipos de conta (`TipoConta`)
- **Classes Principais**:
  - `ContaBancaria`: Classe abstrata base
  - `ContaCorrente`: Conta corrente
  - `ContaPoupanca`: Conta poupança
  - `BancoKonoha`: Gerenciador do banco

---

#### 🔀 **Aula 2 - Herança Múltipla (HerancaMultipla)**
- **Objetivo**: Aprender herança e interfaces em Java
- **Conceitos Explorados**:
  - ✅ Herança de classes (extends)
  - ✅ Interfaces (implements)
  - ✅ Polimorfismo através de interfaces
  - ✅ Resolução de conflitos de herança múltipla
  - ✅ Métodos abstratos
- **Classes Principais**:
  - `Ninja`: Classe base
  - `Uchiha`: Classe que herda de Ninja
  - `Hatake`: Classe que herda de Ninja
  - `AnbuInterface`: Interface para membros ANBU
  - `Sharingan`: Interface especial

---

#### 🔄 **Aula 3 - Sobrecarga de Métodos (Overload)**
- **Objetivo**: Dominar o polimorfismo através de sobrecarga
- **Conceitos Explorados**:
  - ✅ Sobrecarga de métodos (mesmo nome, parâmetros diferentes)
  - ✅ Polimorfismo em tempo de compilação
  - ✅ Construtores sobrecarregados
  - ✅ Parâmetros opcionais simulados
- **Exemplo Prático**:
  - Método `inteligenciaDeCombate()` com diferentes assinaturas:
    - `inteligenciaDeCombate()` - sem parâmetros
    - `inteligenciaDeCombate(int poder)` - com poder específico
- **Classes Principais**:
  - `Ninja`: Classe base com métodos sobrecarregados
  - `Uchiha`: Implementação específica
  - `Uzumaki`: Outra implementação específica
  - `NivelNinja`: Enum com níveis

---

#### 🔐 **Aula 4 - Encapsulamento (Encapsulamento)**
- **Objetivo**: Proteger dados e controlar acesso aos atributos
- **Conceitos Explorados**:
  - ✅ Modificadores de acesso (public, private, protected)
  - ✅ Getters (métodos de leitura)
  - ✅ Setters (métodos de escrita)
  - ✅ Validação de dados
  - ✅ Princípio da encapsulação
- **Exemplo Prático**:
  - Atributos privados com acesso controlado
  - `getNome()`, `setNome()` para manipulação segura
  - Getters para dados de leitura: idade, aldeia, altura
- **Classes Principais**:
  - `Uzumaki`: Com encapsulamento completo
  - `Uchiha`: Com encapsulamento completo

---

#### 📋 **Aula 5 - Enumerações (Enum)**
- **Objetivo**: Criar tipos fixos de valores
- **Conceitos Explorados**:
  - ✅ Criação de enumerações (Enum)
  - ✅ Valores constantes pré-definidos
  - ✅ Métodos em enums
  - ✅ Uso de enums em classes
- **Enums Criados**:
  - `RankDeMissoes`: Classificação de missões (RANK_S, RANK_A, RANK_B, etc.)
  - `Missoes`: Diferentes tipos de missões disponíveis
  - `NivelNinja`: Níveis de ninjas (GENIN, CHUNIN, JONIN, KAGE)

---

### 🔧 **Aula 6 - Refatoração (Refatocao)**
- **Objetivo**: Melhorar a estrutura e legibilidade do código sem alterar comportamento
- **Conceitos Explorados**:
  - ✅ Extração de métodos
  - ✅ Simplificação de classes
  - ✅ Reuso e organização
- **Arquivos Principais**: `Anbu.java`, `Biju.java`, `EstrategiaDeBatalha.java`, `Kunai.java`, `Main.java`, `Ninja.java`, `NivelNinja.java`, `Pergaminho.java`, `SharinganInterface.java`, `Shuriken.java`, `Uchiha.java`, `Uzumaki.java`

---

### 📄 **Aula 7 - List (List)**
- **Objetivo**: Aprender a usar listas (collections) em Java
- **Conceitos Explorados**:
  - ✅ Uso de `List` e implementações básicas
  - ✅ Iteração e manipulação de coleções
- **Arquivo Principal**: `Main.java` (em `Aula7/List`)

---

### 🧩 **Aula 8 - Generics (Generics)**
- **Objetivo**: Entender tipos genéricos e reuso seguro de código
- **Conceitos Explorados**:
  - ✅ Classes e métodos genéricos
  - ✅ Vantagens de evitar casts e melhorar segurança de tipos
  - ✅ Comparação entre código com e sem generics
- **Exemplos/Arquivos**:
  - `CodeComGeneric`: `BolsaGenerica.java`, `EquipamentosNinja.java`, `Main.java`
  - `CodeSemgeneric`: `BolsaKunai.java`, `BolsaPergaminho.java`, `Kunai.java`, `Main.java`, `Pergaminho.java`

---

### 🧾 **Aula 9 - Records (Records)**
- **Objetivo**: Aprender a usar `record` em Java para tipos de dados imutáveis e concisos
- **Conceitos Explorados**:
  - ✅ Sintaxe de `record`
  - ✅ Redução de boilerplate (construtor, getters, equals/hashCode)
- **Arquivos**: `Main.java`, `Ninja.java`, `NinjaRecord.java`

---

### 📚 **Aula 10 - Stack (Stack)**
- **Objetivo**: Entender a estrutura LIFO (pilha)
- **Conceitos Explorados**:
  - ✅ Uso de `Stack`/`Deque` e operações push/pop
  - ✅ Aplicações práticas (algoritmos simples)
- **Arquivo Principal**: `Main.java` (em `Aula10/Stack`)

---

### 🔁 **Aula 11 - Recapitulação Estrutura de Dados**
- **Objetivo**: Revisar estruturas de dados estudadas
- **Conceitos Explorados**:
  - ✅ Recapitulação de listas, pilhas, filas e mapas
  - ✅ Exercícios de fixação
- **Arquivo Principal**: `Main.java` (em `Aula11/RecapitulacaoEstruraDeDados`)

---

### ➿ **Aula 12 - Queue (Queue)**
- **Objetivo**: Estudar filas (FIFO) e usos práticos
- **Conceitos Explorados**:
  - ✅ `Queue` e implementações (LinkedList, ArrayDeque)
  - ✅ Operações offer, poll, peek
- **Arquivo Principal**: `Main.java` (em `Aula12/Queue`)

---

### 🗂️ **Aula 13 - Collections (Collections)**
- **Objetivo**: Enxergar o framework de coleções como um conjunto coeso, não como classes isoladas
- **Conceitos Explorados**:
  - ✅ Diferença entre **classe** (`ArrayList`, `Stack`, `LinkedList`, `PriorityQueue`) e **interface** (`Queue`)
  - ✅ Declarar pela interface e instanciar pela implementação: `Queue<String> fila = new LinkedList<>()`
  - ✅ `PriorityQueue` com ordenação invertida via `Collections.reverseOrder()`
  - ✅ Operações `offer` (inserir) e `poll` (remover respeitando a prioridade)
- **Detalhe importante**: ao usar `reverseOrder()`, o `poll()` remove o **maior** elemento, não o primeiro inserido
- **Arquivo Principal**: `Main.java` (em `Aula13/Collections`)

---

### 🧭 **Aula 14 - Desafio 6 (Desafio6)**
- **Objetivo**: Aplicar `LinkedList` com objetos reais e ordenar por diferentes critérios
- **Conceitos Explorados**:
  - ✅ `LinkedList<Ninja>` armazenando objetos em vez de tipos primitivos
  - ✅ Operações de extremidade: `addFirst()` e `removeFirst()`
  - ✅ Busca por posição com `get(indice)` e `indexOf(objeto)`
  - ✅ Ordenação com `sort()` recebendo **lambda** (Comparator)
  - ✅ `compareTo()` para ordenar texto e `Integer.compare()` para ordenar números
  - ✅ `toString()` sobrescrito para exibição legível
- **Exemplo Prático**: a mesma lista de ninjas é ordenada duas vezes, primeiro por nome e depois por idade, apenas trocando a lambda
- **Classes Principais**:
  - `Ninja`: nome, idade e vila, com getters/setters e `toString()`
  - `Main`: monta a lista e demonstra cada operação

---

### 🎴 **Aula 15 - HashSet (HashSet)**
- **Objetivo**: Trabalhar com conjuntos, onde cada elemento é único
- **Conceitos Explorados**:
  - ✅ `HashSet` e a garantia de elementos únicos
  - ✅ Tentativa de inserir duplicata é simplesmente ignorada, sem erro
  - ✅ Verificação de pertencimento com `contains()`
  - ✅ Remoção com `remove()`
  - ✅ Conjunto **não** mantém ordem de inserção
- **Exemplo Prático**: as aldeias participantes de um torneio, onde "Konoha" é adicionada duas vezes mas aparece uma só
- **Arquivo Principal**: `Main.java` (em `Aula15/HashSet`)

---

### **Nível Avançado**

#### ⏱️ **Aula 1 - Análise de Complexidade e Big O**
- **Objetivo**: Entender o custo dos algoritmos e comprovar esse custo na prática
- **Conceitos Explorados**:
  - ✅ Notação Big O como forma de descrever crescimento, não tempo absoluto
  - ✅ **O(1)** constante: acesso direto por índice
  - ✅ **O(n)** linear: uma passagem por todos os elementos
  - ✅ **O(n²)** quadrática: laço aninhado, cada elemento contra todos os outros
  - ✅ Medição real de tempo com `System.nanoTime()`
  - ✅ Comparação prática entre `ArrayList` e `LinkedList`
- **Divisão da aula**:
  - `IntroducaoBigO`: demonstra as três complexidades, primeiro com uma lista de ninjas e depois com array e tabuada de multiplicação
  - `AnaliseComplexidadeAlgoritmo`: popula as duas estruturas com mais de **10 milhões** de elementos e cronometra `get`, `add` e `remove` em cada uma
- **O que observar**: no `get(50)` o `ArrayList` vence com folga, porque acessa por índice em O(1), enquanto o `LinkedList` precisa percorrer os nós
- **Classes Principais**:
  - `Ninjas`: classe simples usada nos exemplos de complexidade

---

#### 🌊 **Aula 2 - Streams (Streams)**
- **Objetivo**: Processar coleções de forma declarativa, descrevendo **o que** fazer em vez de **como** iterar
- **Conceitos Explorados**:
  - ✅ `stream()` para abrir o fluxo a partir de uma coleção
  - ✅ `filter()` para selecionar elementos por condição
  - ✅ `sorted()` para ordenar com Comparator
  - ✅ `map()` para transformar cada elemento em outro valor
  - ✅ `max()` para reduzir a coleção a um único resultado
  - ✅ `forEach()` com **method reference** (`System.out::println`)
  - ✅ `Optional` e o uso de `orElse(null)` para o caso de coleção vazia
  - ✅ `String.CASE_INSENSITIVE_ORDER` como alternativa a comparar em maiúsculas
- **Exemplo Prático**: encontrar o ninja mais velho da lista em uma única expressão, sem laço nem variável auxiliar
- **Observação**: no arquivo, os exemplos de `filter`, `sorted` e `map` estão comentados para permitir executar um de cada vez; apenas o `max()` está ativo
- **Classes Principais**:
  - `Ninja`: nome, vila e idade, com getters e `toString()`

---

## 💡 Conceitos-Chave Aprendidos

| Conceito                      | Aula    | Descrição                                 |
|-------------------------------|---------|-------------------------------------------|
| **Classes e Objetos**         | 1       | Criar e instanciar classes                |
| **Atributos e Métodos**       | 1       | Propriedades e comportamentos             |
| **Herança**                   | 2       | Compartilhar código entre classes         |
| **Interfaces**                | 2       | Contrato de métodos                       |
| **Polimorfismo**              | 2, 3    | Mesma interface, múltiplas implementações |
| **Sobrecarga (Overload)**     | 3       | Mesmo nome, assinaturas diferentes        |
| **Encapsulamento**            | 4       | Proteção e controle de acesso             |
| **Getters/Setters**           | 4       | Acesso controlado a atributos             |
| **Enumerações**               | 5       | Tipos com valores fixos                   |
| **Refatoração**               | 6       | Melhorar estrutura e reduzir duplicação   |
| **List / Collections**        | 7       | Uso de List, iteração e manipulação       |
| **Generics**                  | 8       | Reuso seguro de tipos, evitar casts       |
| **Records**                   | 9       | Tipos imutáveis e menos boilerplate      |
| **Stack (Pilha)**             | 10      | Estrutura LIFO, push/pop                  |
| **Recapitulação (Estruturas)**| 11      | Revisão: listas, pilhas, filas e mapas    |
| **Queue (Fila)**              | 12      | Estrutura FIFO, offer/poll/peek           |
| **Collections**               | 13      | Classes e interfaces do framework         |
| **PriorityQueue**             | 13      | Fila por prioridade, ordem reversa        |
| **LinkedList com objetos**    | 14      | addFirst/removeFirst, busca por índice    |
| **Comparator com lambda**     | 14      | Ordenar por critérios diferentes          |
| **HashSet (Conjunto)**        | 15      | Elementos únicos, duplicata ignorada      |
| **Notação Big O**             | Av. 1   | O(1), O(n) e O(n²)                        |
| **Medição com nanoTime**      | Av. 1   | Comprovar custo real das operações        |
| **Streams**                   | Av. 2   | filter, sorted, map, max e forEach        |
| **Optional**                  | Av. 2   | Resultado ausente sem retornar null cru   |

---

## 🚀 Como Usar Este Material

1. **Comece pelo Nível Básico**: suba gradualmente pelas aulas na ordem de complexidade
2. **Execute os exemplos**: Rode o `Main.java` de cada aula
3. **Modifique o código**: Tente alterar valores e ver os resultados
4. **Crie seus próprios exemplos**: Pratique os conceitos aprendidos
5. **Revisite quando necessário**: Retorne para revisar conceitos mais complexos

---

## 📖 Temas Utilizados

Todos os exemplos usam personagens e conceitos do anime **Naruto** para tornar o aprendizado mais engajante e memorável. As famílias Uzumaki e Uchiha são os pilares dos exemplos.

---

## ✨ Dicas de Aprendizado

- 📌 Compreenda o **porquê** de cada conceito, não apenas o **como**
- 🔄 Revise regularmente conceitos anteriores
- 💻 Sempre execute o código enquanto aprende
- ❓ Faça perguntas e experimente variações
- 📚 Use comentários no código para anotar suas dúvidas

---

## ❓ Perguntas de Entrevista (Tópicos)

- **Pergunta:** Qual a diferença entre um LinkedList e um ArrayList?

  **Resposta resumida:**

  - `ArrayList` é baseado em um array dinâmico; `LinkedList` é uma lista duplamente ligada (nós com referências para anterior/próximo).
  - Acesso aleatório: `ArrayList` tem acesso por índice em O(1); `LinkedList` exige travessia O(n).
  - Inserção/remoção:
    - `ArrayList`: adicionações no final são amortizadas O(1), inserir/remover no meio exige deslocamento O(n).
    - `LinkedList`: inserir/remover em posições conhecidas (ou nas extremidades) é O(1) — porém localizar a posição ainda pode ser O(n).
  - Memória: `LinkedList` consome mais memória por nó (referências prev/next + objeto de nó); `ArrayList` usa um array contínuo com overhead menor por elemento, mas pode alocar mais capacidade interna.
  - Iteradores: ambos suportam iteradores; `LinkedList` oferece operações eficientes de inserção/remoção via iterator.
  - Interfaces/uso em Java: `ArrayList` implementa `RandomAccess` (sinalizando bom desempenho em get por índice); `LinkedList` também implementa `Deque`/`Queue`, sendo útil quando precisa-se de operações de fila/pilha duplamente terminadas.
  - Quando usar:
    - Prefira `ArrayList` quando houver muitas leituras/acessos por índice e poucas inserções/remoções no meio.
    - Prefira `LinkedList` quando a aplicação fizer muitas inserções/remoções frequentes nas extremidades ou quando trabalhar com grandes listas onde evitar deslocamentos de array é crítico.

  **Observação:** Nenhuma das duas é sincronizada; para acesso concorrente use coleções sincronizadas ou as implementações concorrentes adequadas.

---

- **Pergunta:** Por que LinkedList tem esse nome?

  **Resposta resumida:**

  - O nome "**LinkedList**" vem do termo "lista ligada" (ou "lista encadeada"), um padrão de estrutura de dados clássica em ciência da computação.
  - Cada elemento da estrutura é chamado de "**nó**" (node), e contém:
    - Um valor (dados)
    - Uma ou mais **referências** (links) para outros nós (anterior e/ou próximo)
  - A palavra "**Linked**" em inglês significa "ligado" ou "vinculado", referindo-se justamente às referências que **ligam/conectam** um nó ao outro.
  - "**List**" indica que é uma coleção (lista) de elementos.
  - Logo, "LinkedList" = "Lista Ligada" = lista cujos elementos estão conectados/vinculados uns aos outros por referências.
  - Em Java, `LinkedList` implementa essa estrutura clássica usando nós duplamente ligados (cada nó aponta para o anterior **e** o próximo).
  - Comparação com `ArrayList`:
    - `ArrayList` = "lista de array" (usa array interno contínuo, sem links entre elementos).
    - `LinkedList` = "lista ligada" (usa nós conectados por referências).
  - O nome deixa claro o tipo de estrutura interna usada pela classe.

---

**Bom aprendizado! 火の意志 (Will of Fire)** 🔥


