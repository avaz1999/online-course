package uz.avaz.onlinecourse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "attachment_id",referencedColumnName = "id")
    private Attachment attachment;

    public String getBase64(){
        if (attachment != null){
            byte[] bytes = Base64.getEncoder().encode(attachment.getBytes());
            return new String(bytes, StandardCharsets.UTF_8);
        }
        return null;
    }

}
