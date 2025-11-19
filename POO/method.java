
class method {
    public static void main (String [] args) {
        //manipulacao de string
        System.out.println("Flavia".contains("ia")); //.contains ve se a ia em flavia

        System.out.println("Java".charAt(3)); //.charAt nos permite ver oq esta no index selecionado

        System.out.println("JavaandJava".substring(3, 6)); //nao inclui o ultimo index

        String java = "python";
        System.out.println(java.equals("java"));
        System.out.println(java.equals("python"));

        boolean output = "Java" == "word";
        System.out.println(output);




    }
}