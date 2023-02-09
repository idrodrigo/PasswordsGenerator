import java.util.Scanner;

public class GeneradorPasswords01 {

    private static final String CONSONANTES = "qazwsxedcrfvtgbyhnujmikolpñ";
    private static final String VOCALES = "aeiou";
    private static final String NUMEROS ="0123456789";
    private static final String SIMBOLOS = "!@#$%&/\\=?*+-<>\"";

    private static final int NUM_PARES =3;
    private static final int NUM_NUMS=2;
    private static final int NUM_SIMB=1;

    private static final String OTRA="N";
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res;

        do {
            String password = "";
            for (int i = 0; i < NUM_PARES; i++) {
                password += getPar();
            }
            for (int i = 0; i < NUM_NUMS; i++) {
                password += getRandom(NUMEROS);
            }
            for (int i = 0; i < NUM_SIMB; i++) {
                password += getRandom(SIMBOLOS);
            }
            System.out.println("\t" + password + "\n para nueva pulse "+ OTRA);
            res = scanner.next();
        } while (res.equalsIgnoreCase(OTRA));
        System.out.println("FIN ;)");
        scanner.close();
   
    }
    
    private static char getRandom(String opciones){
        int pos = (int)(Math.random()* opciones.length());
        return opciones.charAt(pos);
    }

    private static String getPar(){
        String par="";
        par += getRandom(CONSONANTES);
        par += getRandom(VOCALES);
        return par;
    }


}
