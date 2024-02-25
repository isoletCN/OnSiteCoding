package cn.isolet.contactus.repo;

import cn.isolet.contactus.dbo.ContactUsForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsForm, Long> {
    boolean existsByEmail(String email);
}