package subsistema1.crm;

public class CRMService {

    private CRMService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
        System.out.println(nome + " - " + cep + ": " + cidade + "," + estado);
    }

}
