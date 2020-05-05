package payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Character {
    private @Id @GeneratedValue Long idChar;
    private String id;
    private String firstName;
    private String lastName;
    private String picture;
    private Integer age;
    private String idQuote;
    private String quote;

    public Character() {
    }

    public Character(String id, String firstName, String lastName, String picture, Integer age, String idQuote, String quote) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.age = age;
        this.idQuote = idQuote;
        this.quote = quote;
    }
}
