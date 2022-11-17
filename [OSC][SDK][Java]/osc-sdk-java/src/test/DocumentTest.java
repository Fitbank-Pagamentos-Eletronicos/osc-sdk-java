package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import domains.Document;
import domains.DocumentType;
import domains.MimeType;

public class DocumentTest {
    public static void main(String[] args) throws JsonProcessingException {
        DocumentType type = DocumentType.ADDRESS_PROOF;
        MimeType mimeType = MimeType.CODE_01;
        String name = "name";
        String base64 = "base 64";

        Document document = new Document(type, mimeType, name, base64);

        System.out.println(document);
        System.out.println("_______");

        String s = new ObjectMapper().writeValueAsString(document);
        System.out.println(s);
        System.out.println("_______");
        
        Document newDocument = new ObjectMapper().readValue(s, Document.class);
        System.out.println(newDocument);
    }
}
