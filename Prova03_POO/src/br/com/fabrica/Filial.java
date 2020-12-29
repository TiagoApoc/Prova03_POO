package br.com.fabrica;

public class Filial extends Caixa {
    private String nome;
    private int nFilial = 1812; //número filial
    
    
    
    @Override
    public void recebido() {
      System.out.format("A filial %d recebeu dinheiro \n", nFilial);

    }

    @Override
    public void pago() {
      System.out.format("A filial %d perdeu dinheiro \n", nFilial);

    }

    
}