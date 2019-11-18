package com.lt.recourse.service.impl;

import com.dt.common.dto.OssBeanDto;
import com.dt.common.utils.IdGenerator;
import com.dt.common.vo.Result;
import com.lt.recourse.dao.AliOssUtil;
import com.lt.recourse.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/17 0017
 * @since v1.0
 */
@Service
public class UpdateServiceImpl implements UpdateService {

    @Override
    public Result upload(MultipartFile file) {
        // 段空
        if (!file.isEmpty()) {
            // 不是空
            String originalFilename = file.getOriginalFilename();
            // 重新命名
            String newName = reName(originalFilename);
            // 上床到阿里云 OSS
            try {
                String downloadURL = AliOssUtil.upload(newName, file.getBytes(), 0);
                if (!downloadURL.isEmpty()) {
                    OssBeanDto ossBeanDto = new OssBeanDto();
                    ossBeanDto.setObjname(newName);
                    ossBeanDto.setUrl(downloadURL);
                    return Result.setOK(ossBeanDto);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return Result.setERROR("出错了");
    }

    private String reName(String fn){
        //1、原生文件名称超过20需要截取
        if(fn.length()>20){
            fn=fn.substring(fn.length()-20);
        }
        //2、重命名 微服务唯一 雪花算法
        IdGenerator idGenerator = new IdGenerator();
        return idGenerator.nextId()+"_"+fn;
    }
}
