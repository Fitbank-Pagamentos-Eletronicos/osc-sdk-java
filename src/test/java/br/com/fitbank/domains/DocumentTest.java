package br.com.fitbank.domains;





import br.com.fitbank.utils.JSON;
public class DocumentTest {
    public static void main(String[] args) {
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String base64 = "base 64";

        Document document = new Document(type, mimeType, name, base64);

        System.out.println(document);
        System.out.println("_______");

        String s = JSON.getGson().toJson(document);
        System.out.println(s);
        System.out.println("_______");

        Document newDocument = JSON.getGson().fromJson(s, Document.class);
        System.out.println(newDocument);
    }
}
