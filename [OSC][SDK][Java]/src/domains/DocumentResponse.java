package domains;

public class DocumentResponse {
    private DocumentType type;
    private MimeType mimeType;
    private String name;
    private String url;
    
    public DocumentResponse(DocumentType type, MimeType mimeType, String name, String url) {
        setType(type);
        setMimeType(mimeType);
        setName(name);
        setUrl(url);
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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
