package uz.avaz.onlinecourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.avaz.onlinecourse.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Long> {

}
