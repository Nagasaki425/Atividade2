public class Q1 {

    public static double media(int[] v) {
        //Lista vazia retorna 0.0 e interrompe o programa
        if (v.length == 0){
            return 0.0;
        }

        int soma = 0;

        for (int i = 0; i < v.length; i++){
            soma += v[i];
        }

        return (double) soma / v.length;


    }

    public static void main(String[] args) {
        int[] v = { 10, 20, 30, 40 };
        System.out.println(media(v)); // esperado: 20.0
    }

}
