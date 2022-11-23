package requests;

import java.io.IOException;
import java.text.Normalizer;
import java.util.Arrays;

import domains.*;


public class OSC {
    private static OSC instances[];                     /* static private, armazena instancias da classe */
    private static String default_instance_name = "default";  /* static private, define nome padrão */
    private static String default_scopes[] = {"api-external"};  /* static private, define nome padrão */

    public String name;
    public String client_id;
    public String client_secret;
    public String scopes[];
   
    public OSC(String name, String client_id, String client_secret, String scopes[]){
        AuthSucess auth_response;
        /* storage */
    }
      
    public String normalize(String name){
        /* lowcase, trim, remover acentos, converter [^A-z0-9] para [-] */
        name = name.toLowerCase();
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^A-z0-9]", "-");
        return name;
    } 
    
    public static void createIntance(String name, String client_id, String client_secret, String scopes[]){
      if (OSC.getIntance(name).equals(null)){
        OSC osc = new OSC(name, client_id, client_secret, scopes);
        osc.name = name;
        osc.client_id = client_id;
        osc.client_secret = client_secret;
        osc.scopes = scopes;
         
        OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
        OSC.instances[OSC.instances.length - 1] = osc;
      }
        
      /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }
    
    public static void createIntance(String name, String client_id, String client_secret){
      if (OSC.getIntance(name).equals(null)){
        OSC osc = new OSC(name, client_id, client_secret, default_scopes);
        osc.name = name;
        osc.client_id = client_id;
        osc.client_secret = client_secret;
        osc.scopes = default_scopes;
         
        OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
        OSC.instances[OSC.instances.length - 1] = osc;
      }
      /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static void createIntance(String client_id, String client_secret, String scopes[]){
      if (OSC.getIntance().equals(null)){
        OSC osc = new OSC(default_instance_name, client_id, client_secret, scopes);
        osc.name = default_instance_name;
        osc.client_id = client_id;
        osc.client_secret = client_secret;
        osc.scopes = scopes;
         
        OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
        OSC.instances[OSC.instances.length - 1] = osc;
      }
      /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static void createIntance(String client_id, String client_secret){
      if (OSC.getIntance().equals(null)){
        OSC osc = new OSC(default_instance_name, client_id, client_secret, default_scopes);
        osc.name = default_instance_name;
        osc.client_id = client_id;
        osc.client_secret = client_secret;
        osc.scopes = default_scopes;
         
        OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
        OSC.instances[OSC.instances.length - 1] = osc;
      }
      /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static OSC getIntance(){
        for (int i = 0; i<instances.length;i++) {
            if (instances[i].name == default_instance_name) {
                return instances[i];
            }
        }
        return null;
      /* verificar se ja existe instancia com o nome default, se sim retorna a instancia */ 
    }

    public static OSC getIntance(String name){
        for (int i = 0; i<instances.length;i++) {
            if (instances[i].name == name) {
                return instances[i];
            }
        }
        return null;
        /* verificar se ja existe instancia com o mesmo nome, se sim retorna a instancia */ 
    }
      
  
    public String getToken(){

      return null;
    }
      /* verifica se há autenticação e se o token ainda não expirou, caso o token seja valido retorna o token, caso o contra faz requisição de autenticação e retorna o token */
  
    public AuthSucess auth(String clientId , String clientSecret) throws IOException {
        return OAuth.oAuth(clientId, clientSecret);
    }

    public AuthSucess auth(Auth auth) throws IOException {
      return OAuth.oAuth(auth);
    }
      /* requisição de autenticação */
}
  

