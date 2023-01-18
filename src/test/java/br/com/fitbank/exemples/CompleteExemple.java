
package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.enumerator.DocumentType;
import br.com.fitbank.domains.enumerator.MimeType;
import br.com.fitbank.domains.enumerator.PendentDocuments;
import br.com.fitbank.domains.domains.Proposals;
import br.com.fitbank.domains.requests.DocumentRequest;
import br.com.fitbank.domains.requests.ProposalRequest;
import br.com.fitbank.domains.requests.SignContractRequest;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.domains.response.SignContractResponse;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

import static br.com.fitbank.requests.PostContract.postContract;

public class CompleteExemple {
    static OSC osc;

    public static void main(String[] args) {
        String client_id = "";
        String client_secret = "";
        osc = OSC.createIntance(client_id, client_secret);

        try {
            osc.setResponseListening(CompleteExemple::processPipelineResult);
            PipelineResponse pipelineResponse = signup();
            processPipelineResult(pipelineResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void processPipelineResult(PipelineResponse pipelineResponse) throws IOException {
        if (pipelineResponse == null) {
            System.out.println("Pipeline: error");
            return;
        }

        switch (pipelineResponse.getStatus()) {
            case SIGNUP_ANALISIS -> System.out.println("Pipeline: " + pipelineResponse.getId() + " (cadastro em analise)");
            case SIGNUP_COMPLETED -> {
                System.out.println("Pipeline: " + pipelineResponse.getId() + " (enviar solicitação de proposta)");
                proposal(pipelineResponse.getId());
            }
            case SIGNUP_DENIED -> System.out.println("Pipeline: " + pipelineResponse.getId() + " (cadastro reprovado)");
            case PROPOSAL_ANALISIS -> System.out.println("Pipeline: " + pipelineResponse.getId() + " (proposta em analise)");
            case PROPOSAL_CREATED -> {
                System.out.println("Pipeline: " + pipelineResponse.getId() + " (proposta(s) criadas)");

                Proposals[] proposals = pipelineResponse.getProposals();
                boolean pendentDoc = true;

                for (Proposals p : proposals) {
                    if (p != null) {
                        if (p.getHasDocuments()) {
                            DocumentRequest documentRequest = null;
                            for (PendentDocuments pendentDocument : p.getPendentDocuments()) {
                                switch (pendentDocument) {

                                    case SELF:
                                        documentRequest = new DocumentRequest(DocumentType.SELF, MimeType.CODE_01, "name", "base 64");
                                        break;
                                    case ADDRESS_PROOF:
                                        documentRequest = new DocumentRequest(DocumentType.ADDRESS_PROOF, MimeType.CODE_01, "name", "base 64");
                                        break;
                                    case IDENTITY_BACK:
                                        documentRequest = new DocumentRequest(DocumentType.IDENTITY_BACK, MimeType.CODE_01, "name", "base 64");
                                        break;
                                    case IDENTITY_FRONT:
                                        documentRequest = new DocumentRequest(DocumentType.IDENTITY_FRONT, MimeType.CODE_01, "name", "base 64");
                                        break;
                                    case INCOME_PROOF:
                                        documentRequest = new DocumentRequest(DocumentType.INCOME_PROOF, MimeType.CODE_01, "name", "base 64");
                                        break;
                                }
                                br.com.fitbank.requests.Document.putDocument(osc, documentRequest, pipelineResponse.getId());
                            }
                        } else {
                            pendentDoc = false;
                        }
                    }

                    if (!pendentDoc) {
                        if (p != null) {
                            if (p.getHasContracts()) {
                                SignContractRequest signContractRequest = null;//contrato
                                String customServiceNumber = null;

                                SignContractResponse s = postContract(osc, customServiceNumber, signContractRequest);
                                String signContracts[] = new String[]{s.getAceptedCheckSum()};

                                SignContractRequest signedSignContractRequest = new SignContractRequest(signContracts, null);
                                postContract(osc, customServiceNumber, signedSignContractRequest);
                            }
                        }
                    }
                }
            }
            case PROPOSAL_DENIED -> System.out.println("Pipeline: " + pipelineResponse.getId() + " (proposta reprovada)");
            default -> System.out.println("Pipeline: " + pipelineResponse.getId());
        }
    }

    public static PipelineResponse signup() throws IOException {
        String data = "";
        SignupRequest signupRequest = JSON.getGson().fromJson(data, SignupRequest.class);
        return OSC.getIntance().signup(signupRequest);
    }

    public static PipelineResponse proposal(String id) throws IOException {
        String data = "";
        ProposalRequest proposalRequest = JSON.getGson().fromJson(data, ProposalRequest.class);
        return OSC.getIntance().proposal(proposalRequest, id);
    }
}