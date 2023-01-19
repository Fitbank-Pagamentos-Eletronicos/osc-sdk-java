package br.com.fitbank.domains.requests;

import br.com.fitbank.domains.enumerator.DocumentType;
import br.com.fitbank.domains.enumerator.MimeType;

import java.io.Serializable;

public class DocumentRequest implements Serializable{
    private DocumentType type;
    private MimeType mimeType;
    private String name;
    private String base64;

    public DocumentRequest(){
        
    }
    public DocumentRequest(DocumentType type, MimeType mimeType, String name, String base64) {
        setType(type);
        setMimeType(mimeType);
        setName(name);
        setBase64(base64);
    }

    public DocumentType getType() {
        return type;
    }
    public void setType(DocumentType type) {
        this.type = type;
    }
    public MimeType getMimeType() {
        return mimeType;
    }
    public void setMimeType(MimeType mimeType) {
        this.mimeType = mimeType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBase64() {
        return base64;
    }
    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
