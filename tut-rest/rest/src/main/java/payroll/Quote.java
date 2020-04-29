package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Quote {

    private @Id @GeneratedValue Long idQuote;
    private String id;
    private String character;
    private String firstName;
    private String lastName;
    private String picture;
    private Integer age;
    private String phrase;

    public Quote() {
    }

    public Quote(String id, String character, String firstName, String lastName, String picture, Integer age, String phrase) {
        this.id = id;
        this.character = character;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.age = age;
        this.phrase = phrase;
    }
}
