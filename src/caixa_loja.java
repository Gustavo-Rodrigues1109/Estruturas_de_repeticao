import static java.lang.IO.*;

void main() {
    double valor = 0, soma = 0;

    while (valor != -1) {
        valor = Integer.parseInt(readln("Digite o valor do produto(caso queira parar digite -1): "));
        if (valor == -1) {
            break;
        }
        soma += valor;
    }
    IO.println("O valor final foi de: "+ soma);
}