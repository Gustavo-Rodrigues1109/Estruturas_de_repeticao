import static java.lang.IO.*;

void main() {
    int valor = 0,soma = 0, pares = 0, impares = 0, maior = 0, menor = 0, quant = 0, soma_p = 0,soma_imp = 0;
    double media = 0;

    //continua pedindo numeros até o -1
    while (valor != -1) {
        valor = Integer.parseInt(readln("Digite um valor: "));
        if (valor == -1){
            break;
        }

        quant++;
        soma += valor;
        //if que verifica os impares e pares
        if (valor % 2 == 0) {
            pares++;
            soma_p += valor;
        } else {
            impares++;
            soma_imp += valor;
        }
        if (quant == 1) {
            maior=valor;
            menor=valor;
        }
        if (valor>maior){
            maior=valor;
        }
        if (valor<menor){
            menor=valor;

        }

    }

    if (quant > 0) {
        media = (double) soma / quant;

    }

    IO.println("Maior = " + maior);
    IO.println("Menor = " + menor);
    IO.println("Média = " + media);
    IO.println("Impares = " + impares);
    IO.println("Pares = " + pares);
    IO.println("Soma = " + soma);
    IO.println("Soma dos impares = " + soma_p);
    IO.println("Soma dos pares = " + soma_imp);
}
