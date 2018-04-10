package org.bupt.aiop.message;

import java.util.List;

public class EmailToMultiEntity {

    private String to;
    private List<String> multiTo;
    private String subject;
    private String content;
    private String footer;

    public EmailToMultiEntity(String to, List<String> multiTo, String subject, String content, String footer) {
        this.to = to;
        this.multiTo = multiTo;
        this.subject = subject;
        this.content = content;
        this.footer = footer;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getMultiTo() {
        return multiTo;
    }

    public void setMultiTo(List<String> multiTo) {
        this.multiTo = multiTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "EmailToMultiEntity{" +
                "to='" + to + '\'' +
                ", multiTo=" + multiTo +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
