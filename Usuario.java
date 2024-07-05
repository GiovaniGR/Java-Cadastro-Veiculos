
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gigui
 */
import javax.swing.JOptionPane;

public class Usuario {
    private int id;
    private String name;
    private String cpf;
    private String tel;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public void cadastrarUsuario(){
     this.setName(JOptionPane.showInputDialog("Informe o nome do cliente"));
     this.setCpf(JOptionPane.showInputDialog("Informe a CPF do cliente" ));
     this.setTel(JOptionPane.showInputDialog("Informe o Telefone"));
    }   
    public String mostrarDadosUsuario(){
           return "Cliente\n" + "Nome:" + name + "\nCPF:" + cpf + "\nTelefone:" + tel;
    }
   

}
