/*Lógicos Os operadores lógicos, 
    representam o recurso que nos permite criar expressões lógicas maiores, 
    a partir da junção de duas ou mais expressões. Para isso, 
    aplicamos as operações lógicas E (representado por “&&”) e OU (representado por “||”).*/

    public class Logcos {
        public static void main(String[] args){
            boolean condicao1 = true;

            boolean condicao2 = false;

            if(condicao1 &&  (7 > 4) ){
                System.out.println("as duas condição são verdadeiras");
               ;
            }
            if(condicao1 ||condicao2 ){
                System.out.println("Uma das condição é verdadeira");
            }
            System.out.println("FIM!...");
        }

    }
