# 🧪 Java Playground Lab

[![Java Version](https://img.shields.io/badge/Java-21%2B-orange?style=for-the-badge&logo=openjdk)](https://openjdk.org/projects/jdk/21/)
[![Build](https://img.shields.io/badge/Build-Maven-blue?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

> A technical laboratory for experimenting with advanced concepts, performance benchmarks, and deep-diving into the Java ecosystem.

---

## 🎯 Purpose
This repository serves as a centralized sandbox for practical studies on the JVM, modern frameworks, and design patterns. The goal is not to build a final product, but to isolate scenarios to understand the "how" and "why" behind Java's internal mechanics and external libraries.

---

## 🏗️ Laboratory Structure

The project is organized into independent Maven modules to prevent dependency conflicts and allow isolated execution:

### 🧵 [Concurrency Benchmarks](./concurrency-benchmarks)
In-depth studies on parallelism and asynchrony.
- **Key Areas:** Virtual Threads (Project Loom) vs Platform Threads, `Structured Concurrency`, and `ReentrantLock` vs. `synchronized` performance.
- **Tools:** JMH (Java Microbenchmark Harness).

### 🍃 [Spring & Framework Comparisons](./spring-comparisons)
Side-by-side comparison of modern JVM frameworks.
- **Key Areas:** Startup time (AOT/Native Image), memory footprint, and developer experience (DX).
- **Tools:** Spring Boot 3+, Quarkus e Micronaut.

### 🧪 [Testing Strategies](./testing-strategies)
Exploring advanced QA and validation techniques.
- **Key Areas:** Integration testing with `Testcontainers`, Architecture-as-Code with `ArchUnit` and complex mocking scenarios with `Mockito`.

### 🧠 [Memory Management](./memory-management)
Low-level testing of JVM behavior.
- **Key Areas:** Heap analysis, Garbage Collection tuning (G1, ZGC, Shenandoah), and intentional Memory Leak simulations for profiling.

---

## 🚀 Getting Started

Since this is a multi-module project, you can build the entire lab from the root directory:

```bash
# Clone the repository
git clone [https://github.com/leo-nardow/java-playground-lab.git](https://github.com/leo-nardow/java-playground-lab.git)

# Build all modules
mvn clean install
```

## 🛠️ Tech Stack
- **Language:** Java 21+ (LTS)
- **Build Tool:** Maven 3.9+
- **Observability:** JConsole, VisualVM, and JFR (Java Flight Recorder).
- **Benchmark Engine:** JMH.

## 📝 Study Journal
Each module contains its own `README.md` documenting specific findings, benchmark results, and technical takeaways from each experiment.

---
_Developed for continuous learning and technical excellence._
---
