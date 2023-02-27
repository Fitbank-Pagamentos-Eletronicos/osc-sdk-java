
package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.requests.ProposalRequest;
import br.com.fitbank.domains.requests.SignupRequest;
import br.com.fitbank.domains.response.PipelineResponse;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupProposalWithCallbackExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        OSC osc = OSC.createIntance(client_id, client_secret);

        try {
            osc.setResponseListening(SignupProposalWithCallbackExemple::processPipelineResult);
            PipelineResponse pipelineResponse = signup();
            processPipelineResult(pipelineResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void processPipelineResult(PipelineResponse pipelineResponse) throws IOException {
        if(pipelineResponse == null) {
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
            case PROPOSAL_CREATED -> System.out.println("Pipeline: " + pipelineResponse.getId() + " (proposta(s) criadas)");
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