//Arithmetic Operators 
public class DatacampIntroduction3 {
    public static void main(String[] args){
        int a = 18 + 9;
        int b = 18 - 9;
        int c = a * b;
        System.out.println("Resultado da Soma: " + a + ", Resultado da Subtracao: " + b + ", Resultado da Multiplicacao de a e b " + c);
        System.out.println("18 mais 9 =" + a + ", 18 menos 9 =" + b + ", 27 vezes 9 =" + c);

        double f = 18.9;
        double v = 9;
        double q = f + v;
        System.out.println(q);

        int age = 19;
        System.out.println(age);

        age++; //incrementando idade apos um aniversario
        System.out.println(age);

        double product = 75.98;
        System.out.println(product);

        product --; //diminuindo 
        System.out.println(product);

        //problema: ha 3 grupos, cada grupo trabalha 5 dias. quantas vezes cada grupo trabalha?
        int day = 30;
        int gruop = 3;

        int vezes = 30 * 3;
        System.out.println(vezes);

        int divisao = vezes / 15;
        System.out.println(divisao);
        

    }
}
