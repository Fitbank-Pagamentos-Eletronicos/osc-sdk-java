package br.com.fitbank;

import java.io.IOException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

import br.com.fitbank.domains.*;
import br.com.fitbank.requests.OAuth;


public class OSC {
    private static OSC[] instances;                     /* static private, armazena instancias da classe */
    private static final String default_instance_name = "default";  /* static private, define nome padrão */
    private static final String[] default_scopes = {"api-external"};  /* static private, define nome padrão */

    public String name;
    public String client_id;
    public String client_secret;
    public String[] scopes;

    public AuthSucess token;

    public OSC(String name, String client_id, String client_secret, String[] scopes) {
        AuthSucess auth_response;
        /* storage */
    }

    public String normalize(String name) {
        name = name.toLowerCase();
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^A-z0-9]", "-");
        return name;
    }

    public static void createIntance(String name, String client_id, String client_secret, String[] scopes) {

        if (OSC.instances != null) {
            OSC osc = new OSC(name, client_id, client_secret, scopes);
            osc.name = osc.normalize(name);
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = scopes;


            OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
            OSC.instances[OSC.instances.length - 1] = osc;
        } else {
            OSC osc = new OSC(name, client_id, client_secret, scopes);
            osc.name = osc.normalize(name);
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = scopes;
            OSC.instances = new OSC[]{osc};
        }


        /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static void createIntance(String name, String client_id, String client_secret) {
        if (OSC.instances != null) {
            OSC osc = new OSC(name, client_id, client_secret, default_scopes);
            osc.name = osc.normalize(name);
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = default_scopes;


            OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
            OSC.instances[OSC.instances.length - 1] = osc;
        } else {
            OSC osc = new OSC(name, client_id, client_secret, default_scopes);
            osc.name = osc.normalize(name);
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = default_scopes;
            OSC.instances = new OSC[]{osc};
        }

        /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static void createIntance(String client_id, String client_secret, String[] scopes) {
        if (OSC.instances != null) {
            OSC osc = new OSC(default_instance_name, client_id, client_secret, scopes);
            osc.name = default_instance_name;
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = scopes;


            OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
            OSC.instances[OSC.instances.length - 1] = osc;
        } else {
            OSC osc = new OSC(default_instance_name, client_id, client_secret, scopes);
            osc.name = default_instance_name;
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = scopes;
            OSC.instances = new OSC[]{osc};
        }

        /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }

    public static void createIntance(String client_id, String client_secret) {
        if (OSC.instances != null) {
            OSC osc = new OSC(default_instance_name, client_id, client_secret, default_scopes);
            osc.name = default_instance_name;
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = default_scopes;


            OSC.instances = Arrays.copyOf(OSC.instances, OSC.instances.length + 1); //create new array from old array and allocate one more element
            OSC.instances[OSC.instances.length - 1] = osc;
        } else {
            OSC osc = new OSC(default_instance_name, client_id, client_secret, default_scopes);
            osc.name = default_instance_name;
            osc.client_id = client_id;
            osc.client_secret = client_secret;
            osc.scopes = default_scopes;
            OSC.instances = new OSC[]{osc};
        }

        /* validar atributos, verificar se ja existe instancia com o mesmo nome, chamar construtor e armazenar instancia na variavel estatica */
    }


    public static OSC getIntance() {
        for (int i =0;i< instances.length;i++) {
            if (instances[i].name ==default_instance_name) {
                return (instances[i]);
            }

        }
        return null;
        /* verificar se ja existe instancia com o nome default, se sim retorna a instancia */
    }

    public static OSC getIntance(String name) {
        String name2 = name;
        name2 = name.toLowerCase();
        name2 = Normalizer.normalize(name2, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        name2 = Normalizer.normalize(name2, Normalizer.Form.NFD).replaceAll("[^A-z0-9]", "-");
        for (int i =0;i< instances.length;i++) {
            String name3 = instances[i].name;
            if ( name3.equals(name2)) {
                return (instances[i]);
            }

        }

        return null;
        /* verificar se ja existe instancia com o mesmo nome, se sim retorna a instancia */
    }


    public AuthSucess getToken() throws IOException {
        if (token == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.ENGLISH);
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(Calendar.getInstance().getTime());
        LocalDate currentDate = LocalDate.parse(timeStamp, formatter);
        LocalDate date = LocalDate.parse(token.getExpire_at(), formatter);
        if (token.getAccess_token() == null || token.getExpire_at() == null || date.isAfter(currentDate)) {
            return auth(client_id, client_secret);
        } else {
            return token;
        }

    }
    /* verifica se há autenticação e se o token ainda não expirou, caso o token seja valido retorna o token, caso o contra faz requisição de autenticação e retorna o token */

    public AuthSucess auth(String clientId, String clientSecret) throws IOException {
        token = OAuth.request(clientId, clientSecret);
        return token;
    }
}
  

