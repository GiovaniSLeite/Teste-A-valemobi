
import java.util.ArrayList;

public class Teste_execucao {

    final static ArrayList<Customer_account> PADRAO = null;

    public static void main(String[] args) {
        /*Teste padrao*/
        System.out.println("***\tTESTE ANEXADO AO ENUNCIADO\t***\n");
        testar(PADRAO);

        /*Inverte-se as tuplas para testar o funcionamento da ordenacao*/
        System.out.println("\n\n***\tTESTE ANEXADO AO ENUNCIADO INVERTENDO A ORDEM DA PRIMEIRA E SEGUNDA TUPLA\t***\n");
        ArrayList<Customer_account> dados = new ArrayList();
        dados.add(new Customer_account(1950, "47821485297", "Maria Alice Barros", true, 700));
        dados.add(new Customer_account(2007, "35621485268", "José Felipe Martins", true, 590.9));
        dados.add(new Customer_account(850, "25521485858", "Carlos Eduardo", true, 750));
        dados.add(new Customer_account(2150, "32412587548", "Gev Alison", true, 400));
        testar(dados);

        dados.clear();

        /*testar a verificacao do vl_total*/
        System.out.println("\n\n***\tTESTE SEM CLIENTES ELEGIVEIS PARA O CALCULO DA MEDIA POR CONTA DO VL_TOTAL\t***\n");
        dados.add(new Customer_account(1950, "47821485297", "Maria Alice Barros", true, 200));
        dados.add(new Customer_account(2007, "35621485268", "José Felipe Martins", true, 290.9));
        testar(dados);
        
        dados.clear();

        /*Testar a verificacao do id*/
        System.out.println("\n\n***\tTESTE SEM CLIENTES ELEGIVEIS PARA O CALCULO DA MEDIA POR CONTA DO ID\t***\n");
        dados.add(new Customer_account(1, "47821485297", "Maria Alice Barros", true, 1000));
        dados.add(new Customer_account(22, "35621485268", "José Felipe Martins", true, 5000.9));
        testar(dados);

    }

    public static void testar(ArrayList<Customer_account> itens_tabela) {
        /*Criacao da tabela e populacao da tabela*/
        Tabela tabela_completa = new Tabela();
        if (itens_tabela == null) {
            tabela_completa.inserir();
        } else {
            tabela_completa.inserir(itens_tabela);
        }

        /*Objetos selecionados para o calculo da media*/
        Tabela tabela_selecionados = new Tabela();

        /*Calcula e exibe a media, alem de guardar os selecionados na lista apropriada*/
        System.out.println("MÉDIA FINAL: " + tabela_completa.calcular_media(tabela_selecionados) + "\n");

        /*Imprime os objetos selecionados*/
        System.out.format("%50s\n\n", "OBJETOS SELECIONADOS");
        tabela_selecionados.imprimir_tabela();

        /*Ordena a partir do campo vl_total e imprime os objetos selecionados*/
        System.out.println("\n");
        System.out.format("%55s\n\n", "OBJETOS SELECIONADOS ORDENADOS");
        tabela_selecionados.ordenar_tabela();
        tabela_selecionados.imprimir_tabela();
        System.out.println("\n*********************************************************************************************\n");
    }
}
