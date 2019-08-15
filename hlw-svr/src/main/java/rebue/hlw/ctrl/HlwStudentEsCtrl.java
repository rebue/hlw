package rebue.hlw.ctrl;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import rebue.hlw.so.HlwStudentSo;
import rebue.hlw.svc.HlwStudentEsSvc;

/**
 * 学生信息
 */
@RestController
@Slf4j
public class HlwStudentEsCtrl {

    @Resource
    private HlwStudentEsSvc svc;

    /**
     * 获取单个学生信息
     *
     * @mbg.generated 自动生成，如需修改，请删除本行
     */
    @GetMapping("/hlw/studentso/get-by-id")
    HlwStudentSo getById(@RequestParam("id") final String id) {
        log.info("received get:/hlw/studentso/get-by-id");
        log.info("hlwStudentEsCtrl.getById: {}", id);
        return svc.getById(id);
    }

}
