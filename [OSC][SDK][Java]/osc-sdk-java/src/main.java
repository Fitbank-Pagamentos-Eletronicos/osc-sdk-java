import java.io.IOException;

import domains.AuthSucess;
import requests.OAuth;

public class main {
    public static void main(String[] args) {
      AuthSucess authSucess = null;
        try {
          System.out.println("\nlogin e senha corretos:");
          authSucess = OAuth.oAuth("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8"));
          }
          
          System.out.println("\nlogin ausente:");
          authSucess = OAuth.oAuth("","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8"));
          }
          System.out.println("\nsenha ausente:");
          authSucess = OAuth.oAuth("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("4dbe3aa7-8ce9-43a4-9298-73b700e712bb",""));
          }
          System.out.println("\nlogin e senha Ausentes:");
          authSucess = OAuth.oAuth("","");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("",""));
          }
          System.out.println("\nlogin errado:");
          authSucess = OAuth.oAuth("4dbe3aa7-8ce9-43a4-9298-73b700e712ba","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("4dbe3aa7-8ce9-43a4-9298-73b700e712ba","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8"));
          }
          System.out.println("\nsenha errada:");
          authSucess = OAuth.oAuth("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c9");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c9"));
          }
          System.out.println("\nlogin e senha errados:");
          authSucess = OAuth.oAuth("4dbe3aa7-8ce9-43a4-9298-73b700e712ba","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c9");
          if (authSucess != null){
            System.out.println("access_token: "+ authSucess.getAccess_token() +" | expire_at: " + authSucess.getExpire_at());
          }else{
            System.out.println(OAuth.oAuthError("4dbe3aa7-8ce9-43a4-9298-73b700e712ba","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c9"));
          }
        


        

        } catch (IOException e) {
          e.printStackTrace();
        }
      }
}
