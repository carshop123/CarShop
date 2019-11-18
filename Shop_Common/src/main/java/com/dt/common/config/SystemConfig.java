package com.dt.common.config;

/**
 * @program: Utopia
 * @description:
 * @author: Feri
 * @create: 2019-11-12 14:52
 */
public class SystemConfig {

    //秘钥-私钥
    public static final String PASS_PRIKEY="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCPXQB926Hvoqmmy8e4TUV0RBlnilqyxuh92gTjmuwiR5TrwdpMB3SCiSNvrfV/9CTf7uUyKGsS661j5aHxwYqvhzQQa684jSpLPIqKSsiu7TDixwUqykzXU2xc6h70AIlY5oZnjaLLpcRZAhtKwWAdnCR4nC0heDBzpDiIngYEJVecHkK0IRTwtSCbiKml9YuZVxKJblIVP6QzMk8PADJXCpqwk5E0wQRteWgfw21/MbG1jQEXDysu1MfZe7hzJ3ZmaGYp4YQgmt/dX264BltASonk4kUbZYupFBF0p1n1rPXK1Whwxkrkc9ZqTsUDLVH7lxwK8hHmlug8bzc+TCsfAgMBAAECggEAXSl2lFMRnIP78yQhmSa9p5xJVfuWjO6tTntLCg02vd/+amYC0b1WfS1ZFc3Z51hkThEUZ8/UJOt6NZyX7F51HTOjJbiUmQ9DGLky3kNSvjnstrHWLcRgwty3YnnRu4ZNurOzS7/Ctsv2GFFCIwYey58YJDh5K3LLKZriEgV+q1oOBjQKDJFdJGFa76vArh8h3wZBJP66cS6fsvTu17V/HWWURGQUvuKtDKkDjQztAiq5iT6qaLqDTPzdXB4n5FmWnpznE1rgX0w2JDCmUfUjkhkC4//226ThkDZ4fV/lou4q5C5VzEfXs/Gk0hCAk4g6VwM2Qeo5BkCYus2pNKwCQQKBgQDYg1u9J5tvYZK2Lu4xwgVSsIX+txPWJaPEz6RSxv0kcOLsbHhTcn0I+gkHZUPbVUBIAwaQv+OokJ3vp+FNrtTvJBg1WpXP35e7wR3RGL3ehZNvk3CAU9k5fIEu7hsz/w8IHiowkt0ZcuX/Sxx171Gg0DVUnF21nU0NCeyOuWiRqQKBgQCpgmXzETPD9veGVWJrO1c0R6u8TgnLc3xSNxGeDDYt+xfr87M3+Gq30XbFufFDo/g4Hj4XbZ8v9OSfcXfE5N6XwJKpwE3q9z2h3B0BUYDEDKei6Gz3d6BXuMasEOuWEKh5EcSStvMA2ewjOVMjOHLlRzEhNOsYQxNIHyoUMxtjhwKBgQDVpvI9Oztf8toSm0cDpOEZ0wW277RMasIrsXcHFEOy1Q6onPUz61NFK28DdEM8yehv50RwTFr7+RFQ78odnTuUbHrTE3uoMI0LgqrIrnCWiBuQS98FUziVSK41wFLpwXR030dkvVgfB8m8XcNNAYb8eNlXkCHM2Ney2SstP/rXWQKBgFSvpwuG3pva+NMOOXtlTC38WJpdSptweP4CMTUK2M6kEdF6EWG3JGntpi8mtJichNhUk6TUyaEF8mqOH84ooeSi+yL/xm3LU+lXtM4B0BkiUWYcRMRl6Z+p2ugAFBMHA4RpEhJSgJk+RrFaZGTGQPC3Xp4+d+3JJQr1NuqcleRlAoGBAI/p/hFCyADeJ107jkOFBpWJpV5Kfj4lDMjOQ9/XhihKDn0vgDIfZxGNXcviRvh+TbDa7enYmhWtRCzF+a/l3HQ7zvfmpu+JFxzKJbA58c/Y55eNGKJouV8aTeuCkpkaIIm2SE//Ekd53z+AXw081HYwhce4CZtlGtPUwlu8HyGJ";
    //秘钥-公钥
    public static final String PASS_PUBKEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj10Afduh76KppsvHuE1FdEQZZ4passbofdoE45rsIkeU68HaTAd0gokjb631f/Qk3+7lMihrEuutY+Wh8cGKr4c0EGuvOI0qSzyKikrIru0w4scFKspM11NsXOoe9ACJWOaGZ42iy6XEWQIbSsFgHZwkeJwtIXgwc6Q4iJ4GBCVXnB5CtCEU8LUgm4ippfWLmVcSiW5SFT+kMzJPDwAyVwqasJORNMEEbXloH8NtfzGxtY0BFw8rLtTH2Xu4cyd2ZmhmKeGEIJrf3V9uuAZbQEqJ5OJFG2WLqRQRdKdZ9az1ytVocMZK5HPWak7FAy1R+5ccCvIR5pboPG83PkwrHwIDAQAB";

    //短信验证码的有效期10分钟
    public static final int SMSCODE_TIME=10;

    //Redis服务器的地址
    public static final String REDIS_HOST="redis://39.105.189.141:6380";
    //Redis服务器的密码
    public static final String REDIS_PASS="qfjava";

    //OSS访问链接的有效期 默认5年
    public static final int OSS_URLMONTHS=60;

    //Token的秘钥原始字符串
    public static final String TOKEN_KEY="utopia1906";

    //令牌的消息头名称
    public static final String TOKEN_HEADER="usertoken";

    //签到的基础奖励
    public static final int SIGN_SCORE=3;
    public static final int SIGN_MONEY=5;
    //签到额外奖励


}
