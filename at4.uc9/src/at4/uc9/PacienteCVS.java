package at4.uc9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class PacienteCVS {
    
    //caminho do arquivo
    private static String nomeArquivo = "./dados/Paciente.csv";
    
    //METODO PARA ADCIONAR O PACIENTE
    public static boolean AdcionarPaciente(Paciente p) throws IOException{
        try{
            //verificar arquivo
            boolean arquivoExiste = new File(nomeArquivo).exists();
            
            //abrir o escritor para adcionar dados ao arquivo
            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, true);
            if(!arquivoExiste){
                escritor.write("data; hora; pressaoSistolica; pressaoDiastolica; checkbox; \n");
            }
            
            //escrever os dados do paciente no formato apropriado
            escritor.write(p.getData() + ";" + p.getHora() + ";" + p.getPressaoSistolica() + ";" +
                     p.getPressaoDiastolica() + ";" + p.getCheckbox() + "\n");
            
            //escrever todos os dados do write no arquivo
            escritor.flush();
            
            //fecha escrita
            escritor.close();
            return true;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static ArrayList<Paciente> ListarPacientes(){
        ArrayList<Paciente> lista = new ArrayList<>();
        
        try{
            //abrir o leitor para ler o arquivo
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            boolean primeiraLinha = true;
            
            while((linha = leitor.readLine()) != null){
                //ignora a primeira linha que são os titulos da tabela
                if(primeiraLinha){
                    primeiraLinha = false;
                    continue;
                }
                //Dividir a linha em partes usando o ponto e virgula
                String[] partes = linha.split(";");
                
                //criar o objeto
                Paciente p = new Paciente();
                
                p.setData(partes[0]);
                p.setHora(partes[1]);
                p.setPressaoSistolica(Integer.parseInt(partes[2]));
                p.setPressaoDiastolica(Integer.parseInt(partes[3]));
                p.setCheckbox(partes[4]);
                
                //add na lista
                lista.add(p);
            }
            leitor.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return lista;
    }
}
