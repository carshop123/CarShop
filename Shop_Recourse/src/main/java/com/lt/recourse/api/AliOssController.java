package com.lt.recourse.api;


import com.dt.common.vo.Result;
import com.lt.recourse.service.UpdateService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @program: Utopia
 * @description:
 * @author: Feri
 * @create: 2019-11-13 15:48
 */
@Api(value = "实现资源的上传处理",tags = "实现资源的上传处理")
@RestController
public class AliOssController {
    @Autowired
    private UpdateService ossService;

    @PostMapping("api/resource/upload.do")
    public Result upload(@RequestParam MultipartFile file) throws IOException {
        return ossService.upload(file);
    }
}
