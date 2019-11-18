package com.lt.recourse.service;

import com.dt.common.vo.Result;
import org.springframework.web.multipart.MultipartFile;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/17 0017
 * @since v1.0
 */
public interface UpdateService {

    Result upload(MultipartFile file);
}
