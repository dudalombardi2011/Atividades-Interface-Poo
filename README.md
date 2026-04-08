# 🚀 Exercícios de Orientação a Objetos: Interfaces

Este repositório contém a resolução de uma série de desafios práticos focados no conceito de **Interfaces** dentro da Programação Orientada a Objetos (POO). Os exercícios foram propostos pela plataforma **Alura** para consolidar o conhecimento sobre abstração e polimorfismo.

## 📌 Objetivo
O objetivo deste projeto é demonstrar como as interfaces permitem definir contratos que diferentes classes devem seguir, garantindo que objetos de tipos distintos possam ser tratados de forma padronizada.

---

## 💻 Exercícios Implementados

Abaixo estão detalhados os desafios resolvidos neste repositório:

### 1. Conversor de Moedas
* **Interface:** `ConversaoFinanceira`
* **Classe:** `ConversorMoeda`
* **Lógica:** Implementa o método `converterDolarParaReal()`. A classe recebe um valor em dólar como parâmetro e realiza o cálculo da conversão para reais.

### 2. Cálculo Geométrico
* **Interface:** `CalculoGeometrico`
* **Classe:** `CalculadoraSalaRetangular`
* **Lógica:** Implementa os métodos `calcularArea()` e `calcularPerimetro()`. A classe utiliza a altura e a largura recebidas para realizar os cálculos matemáticos de uma sala retangular.

### 3. Tabuada de Multiplicação
* **Interface:** `Tabuada`
* **Classe:** `TabuadaMultiplicacao`
* **Lógica:** Implementa o método `mostrarTabuada()`. A classe recebe um número e exibe no console a sua tabuada completa (de 1 a 10).

### 4. Cálculo de Itens (Calculável)
* **Interface:** `Calculavel`
* **Classes:** `Livro` e `ProdutoFisico`
* **Lógica:** Ambas as classes implementam o método `calcularPrecoFinal()`, mas cada uma aplica sua própria regra de negócio (como descontos específicos para livros ou taxas adicionais para produtos físicos).

### 5. Sistema de Vendas
* **Interface:** `Vendavel`
* **Classes:** `Produto` e `Servico`
* **Lógica:** Define métodos para calcular o preço total com base na quantidade e aplicar descontos. A classe `Produto` foca na venda de bens, enquanto a classe `Servico` foca na prestação de horas ou contratos.

---

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Paradigma:** Orientação a Objetos
