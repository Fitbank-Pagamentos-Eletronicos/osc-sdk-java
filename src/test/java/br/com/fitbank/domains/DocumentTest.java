package br.com.fitbank.domains;


import br.com.fitbank.domains.enumerator.DocumentType;
import br.com.fitbank.domains.enumerator.MimeType;
import br.com.fitbank.domains.requests.DocumentRequest;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DocumentTest {
    @Test
    public void documentTest(){
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String base64 = "base 64";

        DocumentRequest documentRequest = new DocumentRequest(type, mimeType, name, base64);
        String s = JSON.getGson().toJson(documentRequest);
        DocumentRequest newDocumentRequest = JSON.getGson().fromJson(s, DocumentRequest.class);
        assertNotNull(newDocumentRequest);

    }
}
