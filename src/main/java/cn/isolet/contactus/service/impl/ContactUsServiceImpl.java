package cn.isolet.contactus.service.impl;

import cn.isolet.contactus.dbo.ContactUsForm;
import cn.isolet.contactus.dto.ContactUsFormDTO;
import cn.isolet.contactus.exception.CustomException;
import cn.isolet.contactus.mapper.ContactUsFormMapper;
import cn.isolet.contactus.repo.ContactUsRepo;
import cn.isolet.contactus.service.ContactUsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactUsServiceImpl implements ContactUsService {

    private final ContactUsRepo repo;

    private final ContactUsFormMapper mapper;

    @Override
    public void submit(ContactUsFormDTO form) {
        if(repo.existsByEmail(form.getEmail())){
            throw new CustomException("邮箱信息已经存在，请勿重复提交");
        }
        ContactUsForm entity = mapper.mapToEntity(form);
        repo.save(entity);
    }
}
