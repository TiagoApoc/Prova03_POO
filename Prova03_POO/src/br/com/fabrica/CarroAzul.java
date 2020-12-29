package br.com.fabrica;

/*CONTEM
Classe Final,uso do método Super, sobrecarga de métodos e sobrescrita de métodos.
uso do método Super em outro método.*/

public final class CarroAzul extends Carro {
   
    private double preco, valor;
    private String nome, cor;

    public CarroAzul (String nome, double preco, boolean testado, double valor){
        super(nome, preco, testado);
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.valor = valor;
    } 
    
    
    //Sobrecarregando  método.
    public void Preco(double almentarPreco){
       valor = valor + getPreco();
       System.out.format("O valor atual do carro é: ",getPreco()); 
    }
    //Sobrescrevendo método.
    public void informacoes(){
        cor = "Azul";
        System.out.format("Nome: %s\t Preco: %.3f\t Cor: %s \n", nome, preco, cor);
    }

    public void ligar(){
        System.out.println("O carro está desligado");
        super.ligar();
    }

}
