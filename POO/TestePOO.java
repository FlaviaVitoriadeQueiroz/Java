// Classe abstrata que representa um equipamento eletrônico
abstract class Equipamento {
    protected String marca;
    protected String modelo;

    public Equipamento(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstrato que deve ser implementado nas subclasses
    public abstract void ligar();
}

// Herança: Smartphone herda Equipamento
class Smartphone extends Equipamento {
    private int bateria; // encapsulamento, atributo privado

    public Smartphone(String marca, String modelo, int bateria) {
        super(marca, modelo);
        this.bateria = bateria;
    }

    // Encapsulamento: getter e setter da bateria
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if(bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        }
    }

    // Implementação do método abstrato
    @Override
    public void ligar() {
        System.out.println("Smartphone " + marca + " " + modelo + " ligado.");
    }

    // Polimorfismo: mesmo método, comportamento diferente
    public void usarApp(String app) {
        System.out.println("Usando o app " + app + " no smartphone.");
    }
}

// Herança e polimorfismo: Notebook herda Equipamento
class Notebook extends Equipamento {
    private boolean ligado;

    public Notebook(String marca, String modelo) {
        super(marca, modelo);
        this.ligado = false;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Notebook " + marca + " " + modelo + " ligado.");
    }

    // Polimorfismo: mesmo método usarApp do smartphone, mas adaptado
    public void usarApp(String app) {
        if(ligado) {
            System.out.println("Executando o app " + app + " no notebook.");
        } else {
            System.out.println("Notebook desligado, não é possível executar apps.");
        }
    }
}

// Classe principal para testar os conceitos
public class TestePOO {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Samsung", "Galaxy", 85);
        Notebook n1 = new Notebook("Dell", "Inspiron");

        // Polimorfismo e abstração
        Equipamento[] equipamentos = {s1, n1};
        for(Equipamento e : equipamentos) {
            e.ligar(); // mesmo método, execução diferente para cada objeto
        }

        // Encapsulamento
        System.out.println("Bateria do smartphone antes: " + s1.getBateria());
        s1.setBateria(90);
        System.out.println("Bateria do smartphone depois: " + s1.getBateria());

        // Polimorfismo específico
        s1.usarApp("WhatsApp");
        n1.usarApp("Word");
    }
}
