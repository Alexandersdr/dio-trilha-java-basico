public class ExeRel2 {
    public static void main(String[] args){
        String nomeUm = "ALEXANDER";
        String nomeDois = new String("ALEXANDER");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
// usar em objetos o equals e não em numeros!
}