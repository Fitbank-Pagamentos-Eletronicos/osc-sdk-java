package br.com.fitbank.domains.response;

public class PubSubRequestReturn {

    private String topic_id;
    private String subscription_id;
    private String project_id;
    private String service_account;

    public PubSubRequestReturn(){

    }
    public PubSubRequestReturn(String topic_id, String subscription_id, String project_id, String service_account){
        setProject_id(project_id);
        setService_account(service_account);
        setSubscription_id(subscription_id);
        setTopic_id(topic_id);
    }


    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
    }

    public String getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(String subscription_id) {
        this.subscription_id = subscription_id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getService_account() {
        return service_account;
    }

    public void setService_account(String service_account) {
        this.service_account = service_account;
    }
}
