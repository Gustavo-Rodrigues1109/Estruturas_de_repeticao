import static java.lang.IO.*;



void main(){
    int joao = 1;
    int maria = 2;
    int votoj = 0, votom = 0, totalj = 0, totalm = 0, nulo = 0;



    for(int numv = 0; numv<=9 ;numv++) {
        int voto = Integer.parseInt(readln("Digite o seu voto:"));
        if(voto == 1) {
            totalj++;
        } else if (voto == 2) {
            totalm++;
        }
        else{
            nulo++;

        }

    }
    println("João = " + totalj + "\nMaria = " + totalm + "\nNulo = " + nulo);
    if (totalm > totalj){
        println("Maria foi eleita.");
    }
    else if (totalj > totalm){
        println("João foi eleito.");
    } else if (totalm == totalj) {
        println("Impate");
    } else{
        println("A eleição foi nula");


    }

}