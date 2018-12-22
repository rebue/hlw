package rebue.hlw.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rebue.hlw.jo.HlwStudentJo;

public interface HlwStudentDao extends JpaRepository<HlwStudentJo, java.lang.Long> {
}
