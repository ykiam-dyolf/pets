/*
 * PetSOS
 * Aplicativo para localicação de animais domésticos perdidos
 * Projeto de Programação Orientada a Objetos I
 */

/**
 * @author Brunna Dalzini
 * @author Maikysuel Braga
 * @author Rafaela Pessin
*/ 

package pets.persistenciaArquivo;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import pets.modelo.Animal;
import pets.modelo.Clinica;
import pets.modelo.Dono;

public class PersistenciaArquivo {

    public void salvarDadosClinica(Clinica clinica) {

        File arq = new File("clinica.csv");       
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(clinica.getNome() + 
                ";Rua " + clinica.getEndereco().getRua() + 
                ", " + clinica.getEndereco().getNumero() +
                ", " + clinica.getEndereco().getBairro() +
                ", " + clinica.getEndereco().getMunicipio() +
                " - " + clinica.getEndereco().getEstado() +
                " - " + clinica.getEndereco().getCep() +
                " - " + clinica.getEndereco().getComplemento() +        
                ";" + clinica.getContato().getTelefone() + 
                ";" + clinica.getContato().getCelular() +
                ";" + clinica.getContato().getEmail()  +
                ";" + clinica.getRedeSocial().getFacebook() + 
                ";" + clinica.getRedeSocial().getTwitter() + 
                ";" + clinica.getRedeSocial().getInstagram() + 
                ";" + clinica.getRedeSocial().getWhatsapp());
                   
                escreveArq.flush();
                escreveArq.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            escreveArq.println("Clínica;Endereço;Telefone;Celular;Email;"
                    + "Facebook;Twitter;Instagram;Whatsapp");
            
            escreveArq.println(clinica.getNome() + 
                ";Rua " + clinica.getEndereco().getRua() + 
                ", " + clinica.getEndereco().getNumero() +
                ", " + clinica.getEndereco().getBairro() +
                ", " + clinica.getEndereco().getMunicipio() +
                " - " + clinica.getEndereco().getEstado() +
                " - " + clinica.getEndereco().getCep() +
                " - " + clinica.getEndereco().getComplemento() +        
                ";" + clinica.getContato().getTelefone() + 
                ";" + clinica.getContato().getCelular() +
                ";" + clinica.getContato().getEmail()  +
                ";" + clinica.getRedeSocial().getFacebook() + 
                ";" + clinica.getRedeSocial().getTwitter() + 
                ";" + clinica.getRedeSocial().getInstagram() + 
                ";" + clinica.getRedeSocial().getWhatsapp());
             
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        }        
    }    

    public void salvarDadosDono(Dono dono) {
        
        File arq = new File("dono.csv");
        
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(dono.getNome() + 
                ";Rua " + dono.getEndereco().getRua() + 
                ", " + dono.getEndereco().getNumero() +
                ", " + dono.getEndereco().getBairro() +
                ", " + dono.getEndereco().getMunicipio() +
                " - " + dono.getEndereco().getEstado() +
                " - " + dono.getEndereco().getCep() +
                " - " + dono.getEndereco().getComplemento() +        
                ";" + dono.getContato().getTelefone() + 
                ";" + dono.getContato().getCelular() +
                ";" + dono.getContato().getEmail()  +
                ";" + dono.getRedeSocial().getFacebook() + 
                ";" + dono.getRedeSocial().getTwitter() + 
                ";" + dono.getRedeSocial().getInstagram() + 
                ";" + dono.getRedeSocial().getWhatsapp());

                escreveArq.flush();
                escreveArq.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Dono do Animal;Endereço;Telefone;Celular;Email;"
                    + "Facebook;Twitter;Instagram;Whatsapp");
            
            escreveArq.println(dono.getNome() + 
                ";Rua " + dono.getEndereco().getRua() + 
                ", " + dono.getEndereco().getNumero() +
                ", " + dono.getEndereco().getBairro() +
                ", " + dono.getEndereco().getMunicipio() +
                " - " + dono.getEndereco().getEstado() +
                " - " + dono.getEndereco().getCep() +
                " - " + dono.getEndereco().getComplemento() +        
                ";" + dono.getContato().getTelefone() + 
                ";" + dono.getContato().getCelular() +
                ";" + dono.getContato().getEmail()  +
                ";" + dono.getRedeSocial().getFacebook() + 
                ";" + dono.getRedeSocial().getTwitter() + 
                ";" + dono.getRedeSocial().getInstagram() + 
                ";" + dono.getRedeSocial().getWhatsapp());
             
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
     
    public void salvarDadosAnimal(Animal animal){
        File arq = new File("animal.csv");
        
        if (arq.exists()){
            try {
                arq.createNewFile();
                FileWriter arqWriter;
                arqWriter = new FileWriter(arq, true);

                PrintWriter escreveArq = new PrintWriter(arqWriter);
                
                escreveArq.println(animal.getNome() + 
                    ";" + animal.getTipo() +
                    ";" + animal.getCor() + 
                    ";" + animal.getRaca() +
                    ";" + animal.getSexo()+
                    ";" + animal.getPorte() +
                    ";" + animal.getIdade() +
                    ";" + animal.getCastracao() +
                    ";" + animal.getVacinaV10() +
                    ";" + animal.getVacinaAntirrabica() + 
                    ";" + animal.getVermifugacao()+
                    ";" + animal.getUltimaLocalizacao()+  
                    ";" + animal.getObservacao());

                escreveArq.flush();
                escreveArq.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } 
        else{
            try {
            arq.createNewFile();
            FileWriter arqWriter;
            arqWriter = new FileWriter(arq, true);
            
            PrintWriter escreveArq = new PrintWriter(arqWriter);
            
            escreveArq.println("Nome;Tipo;Cor;Raça;Sexo;Porte;Idade;Castratado;VacinaV10"
                    +"Vacina Antirrábica;Vermifugado;Último local visto;Informações Adicionais");
            
            escreveArq.println(animal.getNome() + 
                    ";" + animal.getTipo() +
                    ";" + animal.getCor() + 
                    ";" + animal.getRaca() +
                    ";" + animal.getSexo()+
                    ";" + animal.getPorte() +
                    ";" + animal.getIdade() +
                    ";" + animal.getCastracao() +
                    ";" + animal.getVacinaV10() +
                    ";" + animal.getVacinaAntirrabica() + 
                    ";" + animal.getVermifugacao()+
                    ";" + animal.getUltimaLocalizacao()+  
                    ";" + animal.getObservacao());
                     
            escreveArq.flush();
            escreveArq.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
    
    public void deletarDados(String remover, String arquivo) {
        File arq = new File(arquivo);
        File newArq = new File("tempArquivo.csv");

    try {
        //Indicamos o arquivo que será lido
        FileReader fileReader = new FileReader(arq);
        //Criamos o objeto bufferReader que nos oferece o 
        FileWriter fileWriter = new FileWriter(newArq);
        //Criamos o objeto bufferReader que nos oferece o método de leitura readLine()
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //String que irá receber cada linha do arquivo
        String linha = "";

        //Fazemos um loop linha a linha no arquivo, enquanto ele seja diferente de null.
        //O método readLine() devolve a linha na posicao do loop para a variavel linha.
        while ( ( linha = bufferedReader.readLine() ) != null) {
            //Aqui imprimimos a linha
            //System.out.println(linha);
            int i=0;
            String nome="";
            //Concatena as strings do nome
            while (linha.charAt(i) != ';'){
                nome = nome + linha.charAt(i);
                i=i+1;
            }
            //System.out.println(nome);
            
            //escreve linhas em novo arquivo enquanto nome diferente de removeClinica
            if (!nome.equals(remover)){
                fileWriter.write(linha + "\r\n");
            }
        }
	//liberamos o fluxo dos objetos ou fechamos o arquivo
        
                
        fileWriter.close();
        fileReader.close();     
        bufferedReader.close();
        
        arq.delete();
        newArq.renameTo(new File(arquivo)); 
        
        
	} catch (IOException e) {
    	e.printStackTrace();
        }
    }
}