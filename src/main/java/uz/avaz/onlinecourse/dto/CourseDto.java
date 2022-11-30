package uz.avaz.onlinecourse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import uz.avaz.onlinecourse.entity.Attachment;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDto {
    private Long id;
    private Long[] authorsId;
    private MultipartFile img;
    private String name;
    private Double price;
    private String base64;

    public CourseDto(Long id, String name, Double price, String base64Encode) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.base64 = base64Encode;
    }
}
