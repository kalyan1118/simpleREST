package hello;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Json structue for the inocoming Json param for Paragraph of strings

public class WordRequest {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    private String text;
}

