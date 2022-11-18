import java.io.IOException;

import requests.OAuth;

public class main {
    public static void main(String[] args) {
        try {
          System.out.println(OAuth.postTest("4dbe3aa7-8ce9-43a4-9298-73b700e712bb","1b364af124250aa09461f33161c3d96e551d822080fe1bd977aa66d7ec9378c8"));
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
}
