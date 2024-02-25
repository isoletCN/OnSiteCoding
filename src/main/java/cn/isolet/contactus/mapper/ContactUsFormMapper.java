package cn.isolet.contactus.mapper;

import cn.isolet.contactus.dbo.ContactUsForm;
import cn.isolet.contactus.dto.ContactUsFormDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ContactUsFormMapper {
    ContactUsFormDTO mapToDTO(ContactUsForm record);

    ContactUsForm mapToEntity(ContactUsFormDTO record);
}
