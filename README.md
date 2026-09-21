# Java Fundamentals

A structured learning path through Java, progressing from arrays and basic object
orientation to collections, generics, algorithmic complexity and the Streams API.

The material is organised as a course in three levels, where each lesson is a
self-contained, runnable package that isolates one concept. Examples share a
consistent narrative theme so that classes, inheritance hierarchies and collections
are exercised against a coherent domain rather than abstract placeholders.

## Repository structure

```text
src/
├── BatismoDeJava/
│   ├── README.md             Detailed lesson notes, in Portuguese
│   ├── NivelBasico/          Arrays and basic data handling
│   ├── NivelIntermediario/   Fifteen lessons on object orientation and collections
│   └── NivelAvancado/        Complexity analysis and the Streams API
└── Exercicios/               Standalone algorithm exercises
```

Package declarations mirror the directory layout, so every example compiles and runs
independently of the others.

## Learning path

### Basic level

| Topic | Concepts |
| --- | --- |
| Arrays | declaration, initialisation, iteration, indexed access |

### Intermediate level

| Lesson | Topic | Concepts |
| --- | --- | --- |
| 1 | Banking system | classes and objects, abstract base class, account subtypes, business rules, enum for account type |
| 2 | Inheritance and interfaces | `extends` against `implements`, abstract methods, polymorphism through interfaces, resolving multiple inheritance |
| 3 | Method overloading | compile-time polymorphism, overloaded constructors, simulated optional parameters |
| 4 | Encapsulation | access modifiers, getters and setters, validation on write |
| 5 | Enumerations | constant value sets, methods inside enums, enums as class attributes |
| 6 | Refactoring | method extraction, reducing duplication, improving structure without changing behaviour |
| 7 | List | the `List` interface and its implementations, iteration and manipulation |
| 8 | Generics | generic classes and methods, type safety, avoiding casts, side-by-side comparison of the same solution with and without generics |
| 9 | Records | immutable data carriers, automatic constructor, accessors, `equals` and `hashCode` |
| 10 | Stack | LIFO semantics, push and pop |
| 11 | Data structures review | consolidation of lists, stacks, queues and maps |
| 12 | Queue | FIFO semantics, `offer`, `poll` and `peek` |
| 13 | Collections | distinguishing concrete classes from interfaces, declaring by interface, `PriorityQueue` with reversed ordering |
| 14 | Challenge: linked list of objects | `LinkedList` holding objects, `addFirst` and `removeFirst`, lookup by index, sorting by different criteria with lambdas |
| 15 | HashSet | uniqueness guarantees, silent rejection of duplicates, membership tests, absence of insertion order |

### Advanced level

| Lesson | Topic | Concepts |
| --- | --- | --- |
| 1 | Complexity analysis and Big O | O(1), O(n) and O(n squared) demonstrated in code, then measured empirically with `System.nanoTime` by populating an `ArrayList` and a `LinkedList` with more than ten million elements and timing indexed access, insertion and removal on each |
| 2 | Streams API | `filter`, `sorted`, `map` and `max`, method references, reduction to a single result, `Optional` handling for empty collections |

The complexity lesson is the one worth highlighting: rather than asserting that
indexed access on a linked list is expensive, it measures the difference on a
ten-million-element structure and prints both timings side by side.

## Running an example

Package names are rooted at `src`, so compile and run from there. Using the Streams
lesson as an example:

```bash
cd src
javac BatismoDeJava/NivelAvancado/Aula2/Streams/Main.java
java BatismoDeJava.NivelAvancado.Aula2.Streams.Main
```

The same pattern applies to every lesson: compile the `Main.java` of the package and
run it through its fully qualified name.

To keep compiled output separate from sources, direct it elsewhere:

```bash
cd src
javac -d ../out BatismoDeJava/NivelAvancado/Aula2/Streams/Main.java
java -cp ../out BatismoDeJava.NivelAvancado.Aula2.Streams.Main
```

Requires a JDK. Verified with OpenJDK 17.

## Additional exercises

`src/Exercicios` holds five short, self-contained programs written to practise loops
and number manipulation: primality testing, palindrome detection, summing even
digits, summing the first and last digit of a number, and printing a diagonal star
pattern. They are independent of the course material and each has its own `main`.

## Detailed notes

`src/BatismoDeJava/README.md` contains the full lesson-by-lesson notes, written in
Portuguese. It documents the objective of each lesson, the concepts it introduces,
the classes involved and the reasoning behind specific choices, along with a concept
index and interview preparation topics.

## A note on the theme

Examples are built around characters and concepts from the Naruto series. This is
deliberate: a familiar domain with natural hierarchies, clans and ranks makes
inheritance, interfaces, enums and comparators easier to reason about than generic
`Foo` and `Bar` placeholders, and makes the resulting code easier to remember.

Class names, output text and the detailed notes are in Portuguese.
