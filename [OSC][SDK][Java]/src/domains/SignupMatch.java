package domains;

import java.sql.Date;
import java.util.InputMismatchException;

public class SignupMatch{
    
    private String cpf;
    private String name;
    private String birthday;
    private String email;
    private String phone;
    private String zipCode;
    private String education;

    public SignupMatch(){

    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        if(isCPF(cpf)){
            this.cpf = cpf;
        }
        else{
            //erro 
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() <= 100){
            this.name = name;
        }
        else{
            //erro
        }
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
   //     Date verificardor = birthday.format("yyyy-MM-dd	", birthday);
        this.birthday = birthday;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(isValidEmailAddress(email)){
            this.email = email;
        }
        else{
            //erro
        }
    }

    public String getEducation() {
        return education;
    }
    public int getEducationNumber(String education){
        educationEnum
    }
    public void setEducation(String education) {
        educationEnum educationEnumValue = educationEnum(education); 
        this.education = education;
    }

    
    public enum educationEnum{
        NAO_ALFABETIZADO(1), ENSINO_FUNDAMENTAL_INCOMPLETO(2), ENSINO_FUNDAMENTAL_COMPLETO(3), ENSINO_MEDIO_INCOMPLETO(4), ENSINO_MEDIO_COMPLETO(5), ENSINO_SUPERIOR_INCOMPLETO(6), ENSINO_SUPERIOR_COMPLETO(7), POS_GRADUACAO(8);
        
        public int valor;
        educationEnum(int valorEducation){
            valor = valorEducation;
        }

        public int getValueEducation(){
            return valor;
        }
    }

    


    
    


    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        
        try {
       
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); 

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

}