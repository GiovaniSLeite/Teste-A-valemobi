
import java.util.ArrayList;
import java.util.Collections;


public class Tabela {

    private ArrayList<Customer_account> objetos_tabela;
    
    public Tabela(){
        objetos_tabela = new ArrayList();
    }
    
    
    /*Insercao dos dados do enunciado*/
    public void inserir()
    {
        objetos_tabela.add(new Customer_account(2007, "35621485268", "José Felipe Martins", true, 590.9));
        objetos_tabela.add(new Customer_account(1950, "47821485297", "Maria Alice Barros", true, 700));
        objetos_tabela.add(new Customer_account(850, "25521485858", "Carlos Eduardo", true, 750));
        objetos_tabela.add(new Customer_account(2150, "32412587548", "Gev Alison", true, 400));
    }
    
    /*Insercao de um objeto unico*/
    public void inserir(Customer_account novo_item){
        objetos_tabela.add(novo_item);
    }
    
    /*Insercao de uma lista de objetos*/
    public void inserir(ArrayList<Customer_account> novos_itens){
        objetos_tabela.addAll(novos_itens);
    }
    
    /*Retorna o vl_total medio entre os objetos elegiveis*/
    public double calcular_media(Tabela objetos_selecionados) {    
        
        double somatoria_vl_total = 0;
        
        //Para cada objeto dentro da tabela, verifica se e elegivel, caso seja adiciona a lista de selecionados e acrescenta seu vl_total a variavel total
        for(Customer_account objeto : objetos_tabela) {
            if(objeto.getVl_total() > 560 && objeto.getId() > 1500 && objeto.getId() < 2700){
                objetos_selecionados.inserir(objeto);
                somatoria_vl_total += objeto.getVl_total();
            }
        }
        
        //Evitar a divisao por 0
        if(objetos_selecionados.quantidade_itens() == 0) return 0;
        
        //retorna a somatoria dos campos vl_total selecionados divida pela quantidade de selecionados
        return somatoria_vl_total/objetos_selecionados.quantidade_itens();
    }
    
    /*Imprime a lista de objetos recebida como parametro em forma de tabela*/
    public void imprimir_tabela() {
        
        if(objetos_tabela.isEmpty()){
            System.out.println("Tabela vazia");
            return;
        }
                    
        /*Uso do formato para melhor exibição da tabela*/
        String formato = "%-15s%-20s%-25s%-15s%-15s\n";
        
        System.out.format(formato, new Object[]{"id_customer","cpf_cnpj","name", "is_active", "vl_total"});
        for(Customer_account ca : objetos_tabela)
            System.out.format(formato, (Object[])ca.toArrayString());   
    }
    
    public int quantidade_itens(){
        return objetos_tabela.size();
    }
    
    public void ordenar_tabela(){
        Collections.sort(objetos_tabela);
    }
}
