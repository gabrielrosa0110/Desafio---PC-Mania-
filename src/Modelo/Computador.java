package Modelo;

public class Computador {

    private String marca;
    private float preco;

    private MemoriaUSB memoriaUSB;
    private SistemaOperacional iso;
    private HardwareBasico[] hard;



    public Computador(String marca, float preco, HardwareBasico[] hard, SistemaOperacional iso) {

        this.marca = marca;
        this.preco = preco;
        this.hard = hard;
        this.iso = iso;

    }

    public void mostraPCConfigs()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$  " + preco);
        System.out.println("Sistema Operacional: " + iso.getNome());
        System.out.println("Tipo: " + iso.getTipo() + " bits");
        System.out.println("Hardware Básico: ");

        for (int i = 0; i < hard.length; i++){

            System.out.println(hard[i].getNome() + " - " + hard[i].getCapacidade());
        }
        if (memoriaUSB != null){

            System.out.println("Memória USB: " + memoriaUSB.getNome());
            System.out.println("Capacidade: " + memoriaUSB.getCapacidade() + " GB");
        }

    }
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        this.memoriaUSB = musb;
    }
    public float getPreco(){
        return preco;
    }

}
