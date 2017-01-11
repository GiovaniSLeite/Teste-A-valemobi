
import java.util.ArrayList;
import java.util.Collections;


public class Tb_customer_account {

    
    public static void main(String[] args) {
        ArrayList<Customer_account> tb = new ArrayList();
        
        fill(tb);
        ArrayList<Customer_account> selecionados = new ArrayList();
        System.out.println("Média: " + media(tb, selecionados));
        System.out.println("\n********** NAO ORDENADO ***********");
        System.out.println(selecionados);
        Collections.sort(selecionados);
        System.out.println("\n\n\n********** ORDENADO ***********");
        System.out.println(selecionados);
    }
    
    public static void fill(ArrayList<Customer_account> tb){
        tb.add(new Customer_account(1950, "47821485297", "Maria Alice Barros", true, 700));
        tb.add(new Customer_account(2007, "35621485268", "José Felipe Martins", true, 590.9));
        tb.add(new Customer_account(850, "25521485858", "Carlos Eduardo", true, 750));
        tb.add(new Customer_account(2150, "32412587548", "Gev Alison", true, 400));
    }
    
    public static double media(ArrayList<Customer_account> tabela_completa, ArrayList<Customer_account> objetos_selecionados)
    {
        
        double total_vltotal = 0;
        for(Customer_account customer : tabela_completa) {
            if(customer.getVl_total() > 560 && customer.getId() > 1500 && customer.getId() < 2700){
                objetos_selecionados.add(customer);
                total_vltotal += customer.getVl_total();
            }
        }
        
        if(objetos_selecionados.isEmpty()) return 0;
        
        return total_vltotal/objetos_selecionados.size();
     
    }
    
   
    
}
