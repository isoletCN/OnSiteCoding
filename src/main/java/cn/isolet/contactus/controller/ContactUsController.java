package cn.isolet.contactus.controller;

import cn.isolet.contactus.dto.ContactUsFormDTO;
import cn.isolet.contactus.service.ContactUsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ContactUsController {
    private final ContactUsService contactUsService;

    @PostMapping("/submit")
    public void submit(@RequestBody @Valid ContactUsFormDTO form) {
        contactUsService.submit(form);
    }
}
