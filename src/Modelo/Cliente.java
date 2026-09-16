package Modelo;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] computadores;

    public Cliente(String nome, String cpf, Computador[] computadores)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = computadores;
    }

    public float calculaTotalCompra()
    {
        float total = 0;

        for (int i = 0; i < computadores.length; i++){
            if (computadores[i] != null){
                total = total + computadores[i].getPreco();
            }
        }
        return total;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }
}
