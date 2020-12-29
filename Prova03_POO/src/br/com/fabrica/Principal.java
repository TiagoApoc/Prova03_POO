package br.com.fabrica;

public class Principal {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro ("Gol","Vermelho",38.500,true);
        c1.teste();
        c1.informacoes();
        c1.almentarPreco();

        CarroAzul ca1 = new CarroAzul("Golf", 48.909, false, 2.500);
        ca1.teste();
        ca1.informacoes();
        ca1.ligar();
        
        Filial f1 = new Filial ();
        f1.recebido();
        f1.pago();
        
    }
}
