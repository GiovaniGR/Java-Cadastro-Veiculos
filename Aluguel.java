/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gigui
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aluguel {     
    private int qtdDias;
    private int kmInicio;
    private int kmFinal;
    private double valorTotal;
    
    Carro c = new Carro();
    Usuario u = new Usuario();    
   
   public int getDias(){
       return qtdDias;
   }
   public void setDias(int qtdDias){
       this.qtdDias = qtdDias;
   }   
    
   public int getKmInicio(){
       return kmInicio;
   }
   public void setKmInicio(int kmInicio){
       this.kmInicio = kmInicio;
   }   
   
   public double getKmFinal(){
       return kmFinal;
   }
       
   public void setKmFinal(int kmFinal){
       this.kmFinal = kmFinal;
   }
   
   public void iniciarLocacao(){
        u.cadastrarUsuario();
        c.cadastrarVeiculo();
        this.setKmInicio(Integer.parseInt(JOptionPane.showInputDialog("Digite o KM Inicial:")));
   }
   
   public void fecharLocacao(){
       this.setKmFinal(Integer.parseInt(JOptionPane.showInputDialog("Digite o KM final:")));
       this.setDias(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias:")));
    
    double valorBase = c.getValor() * (kmFinal - kmInicio); //Fórmula faculdade: valorBase = qtdDias * c.getValor(); 
    //(Essa formula não corresponde ao valor final da locação mostrado pelo professor nas instruções da atividade MAPA)
       
    if(qtdDias > 10){
        valorTotal = valorBase * 0.9;
    }else if(qtdDias > 20){
        valorTotal = valorBase * 0.8;
    }else{
        valorTotal = valorBase;
    }
   }
   
   public void mostrarResumoLocacao(){
       String resumo = "\nResumo Aluguel\n" + u.mostrarDadosUsuario() + "\n" + c.mostrarDadosVeiculo() + "\n" +
               "Quantidade de dias:" + qtdDias + "\nKM Inicial:" + kmInicio  
               + "\nKM Final:" + kmFinal + "\nValor total:" + "R$" + valorTotal;
       JOptionPane.showMessageDialog(null,resumo, "Resumo Aluguel", JOptionPane.INFORMATION_MESSAGE);
   }
}
