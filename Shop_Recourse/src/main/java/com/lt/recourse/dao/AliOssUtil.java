package com.lt.recourse.dao;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.dt.common.config.SystemConfig;
import com.dt.common.utils.DateUtil;

import java.io.ByteArrayInputStream;

/**
 * @author Administrator luotuan
 */
public class AliOssUtil {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    private static final String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    private static final String accessKeyId = "LTAI4FfqDbGD2j4JVoxMrGwK";
    private static final String accessKeySecret = "g5kMqAwZoIrEJ1cGtPRraKthwSDL3I";
    private static final String bucketName = "updatatosomethings";

    //上传-字符串 JSON
    public static String upload(String objname,String json,int months){
       return upload(objname, json.getBytes(), months);
    }
    //上传-资源 字节数组
    public static String upload(String objname,byte[] data,int months){
        //1、创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //2、上传内容
        ossClient.putObject(bucketName, objname, new ByteArrayInputStream(data));
        //3、获取访问路径
        String u;
        if(months>0) {
            //设置资源的有效期
           u= ossClient.generatePresignedUrl(bucketName, objname, DateUtil.getDateByMonths(months)).toString();
        }else {
            //不设置资源有效期
            u=ossClient.generatePresignedUrl(bucketName,objname, DateUtil.getDateByMonths(SystemConfig.OSS_URLMONTHS)).toString();
        }
        //4、关闭 销毁
        ossClient.shutdown();
        return u;
    }

//    public static void main(String[] args) {
//        System.out.println(upload("test123","I Love Java",2));
//    }

}
