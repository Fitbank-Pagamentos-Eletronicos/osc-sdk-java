package br.com.fitbank.domains;


import br.com.fitbank.domains.enumerator.DocumentType;
import br.com.fitbank.domains.enumerator.MimeType;
import br.com.fitbank.domains.response.DocumentResponse;
import br.com.fitbank.utils.JSON;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DocumentResponseTest {
    @Test
    public void documentResponseTest(){
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String url = "url";

        DocumentResponse documentResponse = new DocumentResponse(type, mimeType, name, url);
        String s = JSON.getGson().toJson(documentResponse);
        DocumentResponse newDocumentResponse = JSON.getGson().fromJson(s, DocumentResponse.class);
        assertNotNull(newDocumentResponse);

    }
}
