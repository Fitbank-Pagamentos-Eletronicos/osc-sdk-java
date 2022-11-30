package br.com.fitbank.domains;


import br.com.fitbank.utils.JSON;

public class DocumentResponseTest {
    public static void main(String[] args) {
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String url = "url";

        DocumentResponse documentResponse = new DocumentResponse(type, mimeType, name, url);

        System.out.println(documentResponse);
        System.out.println("_______");

        String s = JSON.getGson().toJson(documentResponse);
        System.out.println(s);
        System.out.println("_______");

        DocumentResponse newDocumentResponse = JSON.getGson().fromJson(s, DocumentResponse.class);
        System.out.println(newDocumentResponse);
    }
}
