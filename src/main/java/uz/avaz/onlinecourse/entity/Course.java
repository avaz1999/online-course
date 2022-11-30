package uz.avaz.onlinecourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    @OneToOne
    private Attachment attachment;

    public String getBase64Encode(){
        if (this.attachment != null){
            byte[] bytes = Base64.getEncoder().encode(this.attachment.getBytes());
            try {
                return new String(bytes,"UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}
