package br.com.fitbank.domains;





import br.com.fitbank.domains.enumerator.DocumentType;
import br.com.fitbank.domains.enumerator.MimeType;
import br.com.fitbank.domains.requests.DocumentRequest;
import br.com.fitbank.utils.JSON;
public class DocumentTest {
    public static void main(String[] args) {
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String base64 = "base 64";

        DocumentRequest documentRequest = new DocumentRequest(type, mimeType, name, base64);

        System.out.println(documentRequest);
        System.out.println("_______");

        String s = JSON.getGson().toJson(documentRequest);
        System.out.println(s);
        System.out.println("_______");

        DocumentRequest newDocumentRequest = JSON.getGson().fromJson(s, DocumentRequest.class);
        System.out.println(newDocumentRequest);
    }
}
