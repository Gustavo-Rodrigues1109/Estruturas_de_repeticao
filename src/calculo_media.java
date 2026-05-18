import static java.lang.IO.*;

float[] numeros = new float[16];
String[] alunos = new String[4];
float[] media = new float[4];
int fst = 0;
int snd = 1;
int trd = 2;
int qrt = 3;
int y = 0;
void main() {

      for(int i = 0; i < alunos.length; i++){
          alunos[i] = readln("Digite o " + (i+1) +  "° aluno:" );
           for(int x = 0; x < 4; x++) {
              numeros[y] = Float.parseFloat(readln("Digite a " + (x + 1) + "° nota do aluno:"));
              y++;
           }


      }
    media[0] = (numeros[0] + numeros[1] + numeros[2] + numeros[3])/ media.length;
    media[1] = (numeros[4] + numeros[5] + numeros[6] + numeros[7])/ media.length;
    media[2] = (numeros[8] + numeros[9] + numeros[10] + numeros[11])/ media.length;
    media[3] = (numeros[12] + numeros[13] + numeros[14] + numeros[15])/ media.length;

    for ( int i = 0; i < alunos.length; i++) {

        println(alunos[i] + " recebeu as seguintes notas: " + numeros[fst]  + " " + numeros[snd] + " "+ numeros[trd] + " " + numeros[qrt]);
        println("A media do " + alunos[i] + " é: " + media[i]);
        fst += 4;
        snd += 4;
        trd += 4;
        qrt += 4;
    }

}