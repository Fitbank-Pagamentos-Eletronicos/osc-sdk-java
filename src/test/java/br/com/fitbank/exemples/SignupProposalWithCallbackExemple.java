
package br.com.fitbank.exemples;


import br.com.fitbank.OSC;
import br.com.fitbank.domains.Pipeline;
import br.com.fitbank.domains.Proposal;
import br.com.fitbank.domains.SignupMatch;
import br.com.fitbank.utils.JSON;

import java.io.IOException;

public class SignupProposalWithCallbackExemple {
    public static void main(String[] args){
        String client_id = "";
        String client_secret = "";
        OSC osc = OSC.createIntance(client_id, client_secret);

        try {
            osc.setResponseListening(SignupProposalWithCallbackExemple::processPipelineResult);
            Pipeline pipeline = signup();
            processPipelineResult(pipeline);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void processPipelineResult(Pipeline pipeline) throws IOException {
        if(pipeline == null) {
            System.out.println("Pipeline: error");
            return;
        }

        switch (pipeline.getStatus()) {
            case SIGNUP_ANALISIS -> System.out.println("Pipeline: " + pipeline.getId() + " (cadastro em analise)");
            case SIGNUP_COMPLETED -> {
                System.out.println("Pipeline: " + pipeline.getId() + " (enviar solicitação de proposta)");
                proposal(pipeline.getId());
            }
            case SIGNUP_DENIED -> System.out.println("Pipeline: " + pipeline.getId() + " (cadastro reprovado)");
            case PROPOSAL_ANALISIS -> System.out.println("Pipeline: " + pipeline.getId() + " (proposta em analise)");
            case PROPOSAL_CREATED -> System.out.println("Pipeline: " + pipeline.getId() + " (proposta(s) criadas)");
            case PROPOSAL_DENIED -> System.out.println("Pipeline: " + pipeline.getId() + " (proposta reprovada)");
            default -> System.out.println("Pipeline: " + pipeline.getId());
        }
    }

    public static Pipeline signup() throws IOException {
        String data = "";
        SignupMatch signupMatch = JSON.getGson().fromJson(data, SignupMatch.class);
        return OSC.getIntance().signup(signupMatch);
    }

    public static Pipeline proposal(String id) throws IOException {
        String data = "";
        Proposal proposal = JSON.getGson().fromJson(data, Proposal.class);
        return OSC.getIntance().proposal(proposal, id);
    }
}