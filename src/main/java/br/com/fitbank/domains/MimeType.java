package br.com.fitbank.domains;

public enum MimeType {
    CODE_01(1,"image/jpeg"), 
    CODE_02(2,"image/png"), 
    CODE_03(3,"application/pdf"); 
    
    private final int valor;
    private final String descricao;
 
    MimeType(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
 
    public int getValor() {
        return this.valor;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
}
