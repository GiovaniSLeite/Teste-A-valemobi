
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    
    public static void main(String[] args) {
        /*Criacao da tabela e populacao da tabela*/
        ArrayList<Customer_account> tb = new ArrayList();
        fill(tb);
        
        /*Lista dos objetos selecionados*/
        ArrayList<Customer_account> selecionados = new ArrayList();
        
        /*Calcula e exibe a media, alem de guardar os selecionados na lista apropriada*/
        System.out.println("Média final: " + media(tb, selecionados)+"\n");
        
        /*Imprime os objetos selecionados*/
        System.out.format("%50s\n\n","Objetos Selecionados");
        printTable(selecionados);
        
        /*Ordena a partir do campo vl_total e imprime os objetos selecionados*/
        System.out.println("\n");
        System.out.format("%55s\n\n", "Objetos Selecionados ordenados");
        Collections.sort(selecionados);
        printTable(selecionados);
    }
    
    /*Metodo responsavel por popular a tabela, aqui sao inseridas as tuplas
    Inicialmente contam com as tuplas dispostas pelo exemplo
    Os dois primeiros objetos tiveram sua ordem invertida tornando possivel observar o funcionamento da ordenacao dos selecionados*/
    public static void fill(ArrayList<Customer_account> tb){
        tb.add(new Customer_account(1950, "47821485297", "Maria Alice Barros", true, 700));
        tb.add(new Customer_account(2007, "35621485268", "José Felipe Martins", true, 590.9));
        tb.add(new Customer_account(850, "25521485858", "Carlos Eduardo", true, 750));
        tb.add(new Customer_account(2150, "32412587548", "Gev Alison", true, 400));
    }
    
    /*Essa funcao calcula a media e retorna seu valor a partir dos parametros: tabela completa, com todas as tuplas, e a tabela dos selecionados, que e populada neste metodo*/
    public static double media(ArrayList<Customer_account> tabela_completa, ArrayList<Customer_account> objetos_selecionados) {    
        
        double total_vltotal = 0;
        
        //Para cada Customer_account dentro da tabela, verifica se e elegivel, caso seja adiciona a lista de selecionados e acrescenta seu vl_total a variavel total
        for(Customer_account customer : tabela_completa) {
            if(customer.getVl_total() > 560 && customer.getId() > 1500 && customer.getId() < 2700){
                objetos_selecionados.add(customer);
                total_vltotal += customer.getVl_total();
            }
        }
        
        //Evitar a divisao por 0
        if(objetos_selecionados.isEmpty()) return 0;
        
        //retorna a somatoria dos campos vl_total selecionados divida pela quantidade de selecionados
        return total_vltotal/objetos_selecionados.size();
     
    }
    
    /*Imprime a lista de objetos recebida como parametro em forma de tabela*/
    public static void printTable(ArrayList<Customer_account> tabela) {
        /*Uso do formato para melhor exibição da tabela*/
        String formato = "%-15s%-20s%-25s%-15s%-15s\n";
        System.out.format(formato, new Object[]{"id_customer","cpf_cnpj","name", "is_active", "vl_total"});
        for(Customer_account ca : tabela)
            System.out.format(formato, (Object[])ca.toArrayString());   
    }
    
}
