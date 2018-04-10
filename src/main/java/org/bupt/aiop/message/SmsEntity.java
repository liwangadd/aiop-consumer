package org.bupt.aiop.message;

import org.springframework.stereotype.Component;

@Component
public class SmsEntity {

    private String to;
    private String content;
    private String footer;

    public SmsEntity(String to, String content, String footer) {
        this.to = to;
        this.content = content;
        this.footer = footer;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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
        return "SmsConsumer{" +
                "to='" + to + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
