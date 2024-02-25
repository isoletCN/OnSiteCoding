package cn.isolet.contactus.service;

import cn.isolet.contactus.dto.ContactUsFormDTO;
import cn.isolet.contactus.exception.CustomException;

/**
 * ContactUS服务
 */
public interface ContactUsService {

    /**
     * 提交表单
     *
     * @param form 表单信息
     */
    void submit(ContactUsFormDTO form) throws CustomException;
}
