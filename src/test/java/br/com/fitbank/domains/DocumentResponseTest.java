package br.com.fitbank.domains;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class DocumentResponseTest {
    public static void main(String[] args) throws JsonProcessingException {
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String url = "url";

        DocumentResponse documentResponse = new DocumentResponse(type, mimeType, name, url);

        System.out.println(documentResponse);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(documentResponse);
        System.out.println(s);
        System.out.println("_______");

        DocumentResponse newDocumentResponse = new ObjectMapper().readValue(s, DocumentResponse.class);
        System.out.println(newDocumentResponse);
    }
}
