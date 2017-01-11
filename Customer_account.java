
public class Customer_account implements Comparable<Customer_account>{
    /*Atributos estipulados pela tabela*/
    private int id;
    private String cpf_cnpj;
    private String name;
    private boolean is_active;
    private double vl_total;

    /*Metodo construtor do objeto Customer_account*/
    public Customer_account(int id, String cpf_cnpj, String name, boolean is_active, double vl_total) {
        this.id = id;
        this.cpf_cnpj = cpf_cnpj;
        this.name = name;
        this.is_active = is_active;
        this.vl_total = vl_total;
    }

    /*Metodos de consulta aos atributos dessa classe*/
    public int getId() {
        return id;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getName() {
        return name;
    }

    public boolean is_active() {
        return is_active;
    }

    public double getVl_total() {
        return vl_total;
    }

    
    /*Metodo que compara dois objetos Customer_account baseado no atributo vl_total*/
    @Override
    public int compareTo(Customer_account o) {
        return Double.compare(this.vl_total, o.vl_total);
    }
    
    /*Define como deve ser impresso o objeto*/
    @Override
    public String toString(){
        return id + "\t" + cpf_cnpj + "\t" + name + "\t" + (is_active+"").toUpperCase() + "\t" + vl_total;
    }
    
    /*Retorna um array de Strings com cada um dos atributos do objeto para a impressao do mesmo em uma tabela*/
    public String[] toArrayString(){
        return new String[]{Integer.toString(id), cpf_cnpj, name, Boolean.toString(is_active).toUpperCase(), String.format("%.2f", vl_total)};
    }
            
    
}
