package top.gyj.computerstore.config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AlipayConfig {
    // 自己的appId
    public static String appId = "9021000134659061";
    // 应用私有秘钥
    public static String appPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDCWqR2ZfvIp79DDLXpw2elJNV7zIporfY1KMK+JRp6YC0rCJZTyb2NrUjQiBEby+Ozs/v9jjWrRPi+O8B174ZRkT2Hz9KunB0lcXcZ+9xS3wsAr7e26AD3MkikVqmRnWreTtQuonTaM67jQy4o90X7MsCJwx4ttaIBOCHcIPHaeZ7SMgEp1zyKSLcVP08z+LOSoa5Xr8Ad07zZ4PRKqIwqBkRDEzrgaBEFLSxKgh+T+VjkDH3MNhFdMGLiq9nwJ0MRfuwNztntsYkghNnjUSDV2K9/+sWB3Xs6cBen1efpj4Ho/tPxQRtSV7WKMLYYFa0xDxHSGQ6meDXKIUG9r42VAgMBAAECggEALAwo++BvKPHDqimGTP2JTudDLvSTZdgPVcrwH/H+xz9m3Trr/v9Y43QjbYd5ASi7aW3gLX3+cduG2G5oVxI7Cd9154LVR9d/z42gpZXsQCfmsXghleWM2nld90jg02yu3MVW117gRtexyjXej1BDXwQImPBMtaVVmxsiqWYaCh5iszmgLQf4mtGk2GHa2ewZgkpv6Di6BUPm7iH/srIpe6Fr+oljagtvy8nOzu3m3qZ757WnE5jZtz6nZzEa7eadJ0dp8AJP3/T87KSNyVrzWelpn8A0+G9OvheTAtubd15Eph5yziqosdmRJxJIcmcQGSmLq+sCyj5i1aj/FaXVYQKBgQD0qqYrmU59+RiqiPeZG7aFu2RQR07dVtMJLxs73QKsiUg4OzeGKWaeVa9eZz4soE/zX98RALichnB12KX7ZCgboBB5u8UGjcLUAr3bS3aPkWGyxYBJ1ySzyvpI93SXLsBt8FZAisRsrLbbA7V8XnNH8VBPkXmQSkDYt2OxFrpsKQKBgQDLW140avmtnGddH7N/olnNNh9bXSbrHphjhWO9NTQvQoRiLMDWJPigSXaxYngOPlHzbkLr4r37IwcqqLO9XkdRiMI1Lbf+QJDp3REVNTOuMOx5ECRlbAOUEQVgwMcaYul7jOrQOze+B5LXTvmsiWaCrvjy71h0Hi6xVk6OG4GDjQKBgBY8PAXSVPPV44v8DqR3hEr7EM7K7DvpXByFj3ANUeTkRQ/3McCbmpvhJaLqtxfPKfTwTZF6A00WWrobClqia5K3JUgq7GkAESi7Zw26+fdqOvrIQDR1vPwqAj0HYC0tLofPQ8dx1RAbUjLtT10SKF/tamMQ0X9vgB0x7Xl2m1KhAoGAUj5EjjyJd+5eW2o7xS3a1cTCz8ePut1n0jAbU2VWEpr7QV1KLBFNwD2V1E23skMAD8yTIiVUomHbPyR1dOvROiduK+WumRRxxzNR+lrG6Pb+XEPsBFy34cU0gJnWrFQ+i2pFeSvJ8n/LompdTatQGyA6rL2h72xZg/0czhpPue0CgYEA4OeOsKwbsuCoCCUAoajjXPDeOgHd1xMf0/qd/pgKEApS391J5njy1ycI6Mk67eF0eWJn/dQ40qJillpvtZfm4ULBI/OW7AeV5FfbvV+M70x0FSPjaFNI7UdI7VWVH0ZwnHOyglHaJhUzK7yUOKF/76QHaMWPjqyUfqe739/NZtY=";
    // 支付宝公钥
    public static String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkEOXIWqwLEdDCqfnRl+UjSDhQyfdaD6AhreeBEHhbbyXryva5QJfaJtH/cysYABtgswrqj9xrZz4kdoU5M2tnk5Awq7jZTcdVWJPdgYzUisJXec0cRR31kg0Xy3GpqN3UJPw9gdn/57UTysujWuD44vExF2XwksDwaMk2L7V89hGnwfnf7YnasB+V47nfdZxg4vIKoY7oyoTwNETzFfo7uHuCay9gpmaMF1T//jLv65xKUPbHjgRON79p4xf0DQ9XH68rsU7QhMW2gm2iMYsNCVL9AXMSL4b0MBmiYDL91gCxwaY9OYjVoBMUzbFSaepqixLf0BNkckeEowsu5/9pwIDAQAB";
    // 异步回调地址
    public static String notifyUrl = "http://127.0.0.1:8080/alipay/notifyNotice";
    // 同步回调地址
    public static String returnUrl = "http://127.0.0.1:8080/alipay/returnNotice";
    // 推荐使用这个秘钥
    public static String signType = "RSA2";
    // 使用的编码格式
    public static String charset = "utf-8";
    // 支付宝默认网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

}
