package uz.avaz.onlinecourse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import uz.avaz.onlinecourse.entity.Attachment;
import uz.avaz.onlinecourse.paylod.ApiResponse;
import uz.avaz.onlinecourse.service.AttachmentService;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {
    private final AttachmentService attachmentService;

    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }

    @PostMapping
    public ResponseEntity<?> addAttachment(@ModelAttribute MultipartFile file){
//        Attachment attachment = attachmentService.saveAttachment(file);
//        if(attachment != null){
//            return ResponseEntity.ok(new ApiResponse("Successfully added",true,attachment));
//        }else {
            return ResponseEntity.ok(new ApiResponse("Unsuccessfully added",false,null));
//        }
    }
}
