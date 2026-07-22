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

## 🎯 Ordem Recomendada de Estudo

```
1. Nível Básico
   └── Arrays.java

2. Nível Intermediário
   ├── Aula 1: Desafio3 (Classes, Objetos, Métodos)
   ├── Aula 2: HerancaMultipla (Herança, Interfaces)
   ├── Aula 3: Overload (Sobrecarga de Métodos)
   ├── Aula 4: Encapsulamento (Proteção de Dados)
   └── Aula 5: Enum (Tipos Enumerados)
```

---

## 💡 Conceitos-Chave Aprendidos

| Conceito                  | Aula | Descrição                                 |
|---------------------------|------|-------------------------------------------|
| **Classes e Objetos**     | 1    | Criar e instanciar classes                |
| **Atributos e Métodos**   | 1    | Propriedades e comportamentos             |
| **Herança**               | 2    | Compartilhar código entre classes         |
| **Interfaces**            | 2    | Contrato de métodos                       |
| **Polimorfismo**          | 2, 3 | Mesma interface, múltiplas implementações |
| **Sobrecarga (Overload)** | 3    | Mesmo nome, assinaturas diferentes        |
| **Encapsulamento**        | 4    | Proteção e controle de acesso             |
| **Getters/Setters**       | 4    | Acesso controlado a atributos             |
| **Enumerações**           | 5    | Tipos com valores fixos                   |

---

## 🚀 Como Usar Este Material

1. **Siga a ordem proposta**: Comece pelo Nível Básico e suba gradualmente
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

**Bom aprendizado! 火の意志 (Will of Fire)** 🔥


