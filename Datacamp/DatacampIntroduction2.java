public class DatacampIntroduction2{
    public static void main(String[] args) {
//Primitivos
        int age = 19;
        long cpf = 56789623412l; //9 QUINTILHOES PARA MAIS 
        short data = 2005; //para ecomonizar memoria com numeros menores, de -32 mil a 32 mil
        byte number = 9; //para economizar memoria, de -127 a 126
        double decimal = 18.900; //para numeros decimais, ate 15 digitos 
        float decimalmenospreciso = 99.9f; //vai ate a setima casa decimal, ate 7 digitos

        System.out.println(age+cpf+data);
        
        boolean isOnSale = false; //mostra que a variavel e um boll
        char firstLyricsOfMyName = 'F'; //para um unico caracterio. E sempre usa aspas simples

    	char tshirtSize = 'M'; 
        boolean isOnSale2 = true;
        String color = "green"; //String e sempre com letra maiuscula

//Manipulacao de strings
        int colorLength = color.length();
        System.out.println(colorLength);

        String yes = "Yes";
        System.out.println(yes.toLowerCase()); //tudo em minusculo
        System.out.println(yes.toUpperCase()); //tudo em maiusculo
//Concatenacao
        String mensagem1 = "Java is";
        String mensagem2 = "boring";
        System.out.println(mensagem1 + " " + mensagem2);

        int num = 21;
        System.out.println(mensagem1 + " " + num);

        String myName;
        myName = "Flavia Vitoria de Queiroz";
        System.out.println(myName);

//Como armazenar varios valores juntos = array (matriz)
        //declarando uma variavel de matriz
        int[] prices = {10, 20, 30, 40};
        System.out.println(prices[0]);
        int secondElement = prices [1]; 

        prices[3] = 60; //os valores podem ser alterados, mas n o comprimento 
        int pricesLength = prices.length;
        System.out.println(pricesLength);

        //matriz de strings
        String[] v = {"Vitoria", "Maria", "Paula"}; //todos os valores em um array precisam ser iguais



    }
}