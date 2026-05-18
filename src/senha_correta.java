import static java.lang.IO.*;

void main() {

 for(int tent = 1; tent <= 3; tent++) {
     int senha = Integer.parseInt(readln("Digite a senha: "));

     if (senha == 4321){
         IO.println("Senha correta! Acesso liberado.");
         break;
     }else if (tent <= 2) {
         IO.println("Senha incorreta. Tente novamente.");
     }else {
         IO.print("Sua conta foi bloqueada!");
         break;
     }

 }
}
