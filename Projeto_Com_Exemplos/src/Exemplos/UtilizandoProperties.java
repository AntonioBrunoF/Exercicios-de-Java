package Exemplos;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;


public class UtilizandoProperties {
       public static void main(String[] args) {
		
    	Properties properties = new Properties();
		
		try{
			InputStream in = new FileInputStream("src//Utilitarios//ArquivoConfiguracao.txt");
			properties.load(in);   
			
			String nome =  properties.getProperty("nome");
			String idade = properties.getProperty("idade");
			String sexo = properties.getProperty("sexo");
			
			String mensagem = "Foram recebidos os Valores : "+nome+" / "+idade+" / "+sexo;
			
			JOptionPane.showMessageDialog(null, mensagem);
			
				
		} catch(Exception E){
			E.printStackTrace();
		}
    	
    	
    	   
	}
}
