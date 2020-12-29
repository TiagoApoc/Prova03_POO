package br.com.fabrica;

//Contém método final.
public class Carro {
    private String  nome, cor;
    private double preco;
    private boolean testado,ligado; // se true então foi testado.

    public Carro(String nome, String cor, double preco, boolean testado){
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.testado = testado;
    }

    public Carro(String nome2, double preco2, boolean testado2) {
	}

	public final void teste (){
        if (testado == true){
            System.out.println("O Carro pode ser vendido");
            }else {
                System.out.println("O carro precisa ser testado antes");
            }
        }
    
    public void almentarPreco (){
        preco =  500;
        System.out.println("O valor aumentou em R$ "+preco);

    }

    public void informacoes(){
        System.out.format("Nome: %s\t Preco: %.3f\t Cor: %s \n", nome, preco, cor);
    }

    public void ligar(){
        System.out.println("O Carro está ligado");
    }

   
    //Métodos get***********************************
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
    public boolean getTestado() {
        return testado;
    }

    //Métodos set***********************************
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTestado(boolean testado) {
        this.testado = testado;
    }
}