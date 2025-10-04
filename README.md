# CalculadoraCustoViagem
Calculo dos custos com viagem de automóvel

O **CalculadoraCustoViagem** é um projeto desenvolvido em Java que tem como objetivo calcular os custos totais de uma viagem de automóvel, considerando tanto o consumo de combustível quanto o valor gasto com pedágios.

## Funcionalidades

- Solicita ao usuário as principais informações sobre a viagem:
  - Distância total a ser percorrida (em quilômetros)
  - Consumo médio do veículo (km/litro)
  - Preço do litro da gasolina
  - Quantidade de pedágios no percurso
  - Valor individual de cada pedágio

- Calcula automaticamente:
  - Litros de gasolina necessários para a viagem
  - Custo total com combustível
  - Custo total com pedágios
  - Custo total estimado da viagem

- Exibe um resumo detalhado dos custos, facilitando o planejamento financeiro da viagem.

## Como usar

1. Clone ou baixe o repositório:  
   `git clone https://github.com/SilasJCSP/CalculadoraCustoViagem.git`

2. Compile o arquivo principal:
   ```
   javac src/CalculadoraCustoViagem.java
   ```

3. Execute o programa:
   ```
   java -cp src CalculadoraCustoViagem
   ```

4. Siga as instruções no terminal, informando os dados solicitados.

## Exemplo de uso

```
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

## Sobre

- Autor: [SilasJCSP](https://github.com/SilasJCSP)
- Projeto público, disponível em: https://github.com/SilasJCSP/CalculadoraCustoViagem

---
