package org.bupt.aiop.message;

public class EmailToSingleEntity {

    private String to;
    private String subject;
    private String content;
    private String footer;

    public EmailToSingleEntity(String to, String subject, String content, String footer) {
        this.to = to;
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
        return "EmailToSingleEntity{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
