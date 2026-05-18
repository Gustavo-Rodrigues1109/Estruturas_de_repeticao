void main(){
    double saldo = 500.00;

    while (true) {

        IO.println("""
        \n======================
        \n===CAIXA ELETRÔNICO===
        \n=======================
        \n====SEJA BEM-VINDO!====
        1 - Saque
        2 - Depósito
        3 - Saldo
        0 - Sair""");
        IO.print("Escolha uma opção: ");

        String opcao = IO.readln();

        switch (opcao) {
            //saque
            case "1":

                IO.println("Valor do saque: R$ ");
                double valorSaque = Double.parseDouble(IO.readln());

                if (valorSaque <= 0) {
                    IO.println("Erro: O valor deve ser positivo.");
                } else if (valorSaque > saldo) {
                    IO.println("Erro: Saldo insuficiente.");
                } else {
                    saldo -= valorSaque;
                    IO.println("Saque realizado! Novo saldo: R$ "+ saldo);
                }
                break;

            //deposito
            case "2":

                IO.println("Valor do depósito: R$ ");
                double valorDeposito = Double.parseDouble(IO.readln());

                if (valorDeposito <= 0) {
                    IO.println("Erro: O valor deve ser positivo.");
                } else {
                    saldo += valorDeposito;
                    IO.println("Depósito realizado! Novo saldo: R$ "+ saldo);
                }
                break;

            //
            case "3":
                IO.println("Seu saldo atual é: R$ "+ saldo);
                break;

            case "0":
                IO.println("""
                        -------------------------------
                        Encerrando o sistema. Até mais!""");
                return;

            default:
                IO.println("Opção inválida! Tente novamente.");
        }

        //adiciona um delay entre o final de cada case para dar tempo pro usuario ler
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}