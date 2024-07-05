
import javax.swing.JOptionPane;


public class Carro {
    private int id;
    private String modelo, marca;
    public double valorPorKm;
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getValor(){
        return valorPorKm;
    }
    public void setValor(double valorPorKm){
        this.valorPorKm = valorPorKm;
    }
    
    public void cadastrarVeiculo(){
        this.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro:"));
        this.setMarca(JOptionPane.showInputDialog("Informe a marca do carro:"));
        this.setValor(Double.parseDouble((JOptionPane.showInputDialog("Informe o valor a ser cobrado por KM:"))));
    }   
    
    public String mostrarDadosVeiculo(){
        return "Carro\n" + "Modelo:" + modelo + "\nMarca:" + marca + "\nValor:" + valorPorKm;
    }
}

