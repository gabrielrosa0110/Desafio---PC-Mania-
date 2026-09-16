package Principal;

import Modelo.*;
import Util.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int matricula = 9745;

        // ============================
        // Promoção 1
        // ============================

        HardwareBasico[] hard1 = new HardwareBasico[3];

        hard1[0] = new HardwareBasico("Pentium Core i5",2200);
        hard1[1] = new HardwareBasico("Memória RAM", 8);
        hard1[2] = new HardwareBasico("HD", 500);

        SistemaOperacional iso1 = new SistemaOperacional("macOS Sequoia",64);

        Computador pc1 = new Computador("Apple",matricula,hard1,iso1);

        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive",16);

        pc1.addMemoriaUSB(memoria1);

        // ============================
        // Promoção 2
        // ============================

        HardwareBasico[] hard2 = new HardwareBasico[3];

        hard2[0] = new HardwareBasico("Pentium Core i7",3370);
        hard2[1] = new HardwareBasico("Memória RAM",16);
        hard2[2] = new HardwareBasico("HD",1000);

        SistemaOperacional iso2 = new SistemaOperacional("Windows 8",64 );

        Computador pc2 = new Computador("Samsung",matricula,hard2,iso2);

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive",32);

        pc2.addMemoriaUSB(memoria2);

        // ===========================
        // Promoção 3
        // ===========================

        HardwareBasico[] hard3 = new HardwareBasico[3];

        hard3[0] = new HardwareBasico("Pentium Core i7",4500);
        hard3[1] = new HardwareBasico("Memória RAM",32);
        hard3[2] = new HardwareBasico("HD",2000);

        SistemaOperacional iso3 = new SistemaOperacional("Windows 10", 64);

        Computador pc3 = new Computador("Dell",matricula,hard3,iso3);

        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo",1000);

        pc3.addMemoriaUSB(memoria3);

        //_____________________________
        //Cliente
        //_____________________________

        Computador[] computadoresComprados = new Computador[10];

        Cliente cliente = new Cliente("Gabriel","141.950.876-86",computadoresComprados);

        //*****************************
        //Compra
        //*****************************

        int opcao = -1;
        int posicao = 0;

        while(opcao != 0)
        {
            System.out.println();
            System.out.println(">>>>>> PC Mania <<<<<<");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar compra");

            System.out.println("Digite sua opção: ");
            opcao = teclado.nextInt();

            if(opcao == 1)
            {
                computadoresComprados[posicao] = pc1;
                posicao++;

                System.out.println("Promoção 1 adicionada!");
            }
            else if(opcao == 2)
            {
                computadoresComprados[posicao] = pc2;
                posicao++;

                System.out.println("Promoção 2 adicinada!");
            }
            else if(opcao == 3)
            {
                computadoresComprados[posicao] = pc3;
                posicao++;

                System.out.println("Promoção 3 adicinada!");
            }
            else if(opcao == 0)
            {
                System.out.println("Compra finalizada!");
            }else{
                System.out.println("Opção inválida!");
            }
        }

        //*************************
        //Mostrar cliente
        //*************************

        System.out.println();
        System.out.println("<<<<<<<<<< Cliente >>>>>>>>>>");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());


        //Mostrar PCs comprados

        System.out.println();
        System.out.println("****** Computadores comprados ******");

        for (int i = 0; i < computadoresComprados.length; i++)
        {
            if(computadoresComprados[i] != null)
            {
                System.out.println();
                System.out.println("Computador "+ (i + 1));

                computadoresComprados[i].mostraPCConfigs();
            }
        }

        //Total

        System.out.println();
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

        //Processar Pedido

        ProcessarPedido.processar(computadoresComprados);

        teclado.close();

    }
}
