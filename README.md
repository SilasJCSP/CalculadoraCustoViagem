<div align="center">

# 🚗 Calculadora de Custo de Viagem

### Planeje sua viagem com precisão e economia!

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Ativo-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

[Sobre](#-sobre) • [Funcionalidades](#-funcionalidades) • [Como Usar](#-como-usar) • [Exemplo](#-exemplo-de-uso) • [Tecnologias](#-tecnologias) • [Autor](#-autor)

</div>

---

## 📋 Sobre

O **CalculadoraCustoViagem** é uma aplicação de linha de comando desenvolvida em Java que ajuda você a **estimar os custos totais de uma viagem de automóvel**. O programa calcula de forma precisa tanto os gastos com combustível quanto com pedágios, permitindo um planejamento financeiro mais eficiente.

> 💡 **Ideal para**: Viajantes, motoristas de aplicativo, planejadores de road trips e qualquer pessoa que queira ter controle sobre os custos de deslocamento!

---

## ✨ Funcionalidades

<table>
<tr>
<td width="50%">

### 📊 Entrada de Dados
- ✅ Distância total (km)
- ✅ Consumo médio do veículo (km/l)
- ✅ Preço do combustível (R$)
- ✅ Quantidade de pedágios
- ✅ Valor individual de cada pedágio

</td>
<td width="50%">

### 🧮 Cálculos Automáticos
- 📍 Litros de combustível necessários
- 💰 Custo total com gasolina
- 🛣️ Custo total com pedágios
- 💵 **Custo total estimado da viagem**

</td>
</tr>
</table>

---

## 🚀 Como Usar

### Pré-requisitos

- **Java JDK 8** ou superior instalado
- Terminal/Prompt de comando

### Instalação e Execução

1️⃣ **Clone o repositório:**
```bash
git clone https://github.com/SilasJCSP/CalculadoraCustoViagem.git
cd CalculadoraCustoViagem
```

2️⃣ **Compile o programa:**
```bash
javac src/CalculadoraCustoViagem.java
```

3️⃣ **Execute a aplicação:**
```bash
java -cp src CalculadoraCustoViagem
```

4️⃣ **Siga as instruções** no terminal e informe os dados solicitados! 🎯

---

## 💻 Exemplo de Uso

```console
--- Calculadora de Custos de Viagem ---
Digite a distância total da viagem em km: 300
Digite o consumo médio do seu carro (km/litro): 12
Digite o preço do litro da gasolina (R$): 5.50
Digite o número de pedágios: 2
Digite o custo do 1º pedágio (R$): 9.90
Digite o custo do 2º pedágio (R$): 7.50

--- Resumo dos Custos ---
Litros de gasolina necessários: 25.00 litros
Custo total com combustível: R$ 137.50
Custo total com pedágios: R$ 17.40
Custo TOTAL da viagem: R$ 154.90
```

---

## 🛠️ Tecnologias

Este projeto foi desenvolvido com as seguintes tecnologias:

- **[Java](https://www.oracle.com/java/)** - Linguagem de programação principal
- **Scanner** - Para entrada de dados do usuário
- **System.out** - Para saída formatada no console

---

## 📂 Estrutura do Projeto

```
CalculadoraCustoViagem/
│
├── src/
│   └── CalculadoraCustoViagem.java   # Código-fonte principal
│
└── README.md                          # Documentação do projeto
```

---

## 🎯 Possíveis Melhorias Futuras

- [ ] Interface gráfica (GUI) com JavaFX ou Swing
- [ ] Suporte para múltiplos tipos de combustível (etanol, diesel, GNV)
- [ ] Cálculo de emissão de CO₂
- [ ] Histórico de viagens
- [ ] Exportação de relatórios em PDF
- [ ] Integração com APIs de preços de combustível em tempo real

---

## 👨‍💻 Autor

<div align="center">

**Desenvolvido com ☕ e 💙 por**

### [Silas JCSP](https://github.com/SilasJCSP)

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/SilasJCSP)

</div>

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir!

---

<div align="center">

### ⭐ Se este projeto foi útil para você, considere dar uma estrela!

**[⬆ Voltar ao topo](#-calculadora-de-custo-de-viagem)**

</div>