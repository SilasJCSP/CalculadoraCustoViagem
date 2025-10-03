import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class CalculadoraCustoViagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("--- Calculadora de Custos de Viagem ---");

        // 1. Coleta de dados do usuário
        System.out.print("Digite a distância total da viagem em km: ");
        double distanciaTotalKm = scanner.nextDouble();

        System.out.print("Digite o consumo médio do seu carro (km/litro): ");
        double consumoMedioKmPorLitro = scanner.nextDouble();

        System.out.print("Digite o preço do litro da gasolina (R$): ");
        double precoLitroGasolina = scanner.nextDouble();

        System.out.print("Digite o número de pedágios: ");
        int numeroPedagios = scanner.nextInt();

        double soma = 0.0;

        for (int i = 0; i < numeroPedagios; i++) {
            System.out.print("Digite o custo do " + (i + 1) + "º pedágio (R$): ");
            double custoPedagio = scanner.nextDouble();
            soma += custoPedagio;
            // Adiciona o custo do pedão ao total
        }
        System.out.println("Custo total dos pedários: R$ " + soma);

        // 2. Cálculo dos custos
        // Cálculo do custo do combustível
        double litrosNecessarios = distanciaTotalKm / consumoMedioKmPorLitro;
        double custoCombustivel = litrosNecessarios * precoLitroGasolina;

        // Cálculo do custo dos pedágios
        double custoPedagios = soma;

        // Cálculo do custo total
        double custoTotalViagem = custoCombustivel + custoPedagios;

        // 3. Exibição dos resultados
        System.out.println("\n--- Resumo dos Custos ---");
        System.out.printf("Litros de gasolina necessários: %.2f litros%n", litrosNecessarios);
        System.out.printf("Custo total com combustível: R$ %.2f%n", custoCombustivel);
        System.out.printf("Custo total com pedágios: R$ %.2f%n", custoPedagios);
        System.out.printf("Custo TOTAL da viagem: R$ %.2f%n", custoTotalViagem);

        scanner.close();
    }
}