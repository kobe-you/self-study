package cn.kobe.config;
import java.io.FileWriter;
import java.io.IOException;
public class AlipayConfig {


// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800617103";
// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC58CNVZiDA01j1M4zomXtD8RQ/J/Asm0k9Cwrm+jMHdwLGw9J9Js8Urc9RCL90EavRPcGDVhbLIWCH9vhMuhM0LfkF1iu//gPDoRgqUdRfzAiKCjgCFLvVPa12tH3X32OF/FI4n1n2tazZbDJ0srvXxDOTVeZ8/ikoqFV0c1LCY3NWMUvT29HqSbKNS79kXQe5RCGUo0oEiYMAheIGEpNuELaBLjlUoObdcsrpJ+IHgq86KUeThczChJLRJ03Gj29AM+ZNEnDbfwcaDron+dPv8+6r+bLVZZFm8Grd8CDuE06zlQPuz3W17RSO+QY7NpUTywkAzI/CyUwEC7z4MVOVAgMBAAECggEBAKjbB3t6b6wtQtAKrKBfIa4ltPlVz6ryqqQg7xmrhcP1tDPFidXV9KEW5vr0Msm5cotmxeH7wF9gREW1ZvBm2yG7zjYatUh56fkyxrtH7NHCfM6/UPWy1pFkna77Yn00hTEcX57EN/LwMbSRqZCI8EWWDDB1Bgfk2IPvuwsx36pfD8NwRZbwXbVtMgzfAw3DSgFuKSiobSs2SX0tTCrE54ek9DrmRvqp7giUuiZ+tP9N1clsbbF4QZ2mgHa8mXw/Nrrnsn+KuLzqiSsLgL24j0scOYhUmdjXm+ybvyQgpVzzAM8NabNN5aQitb2/Ji3iCUtl3f3KyMsJ9GzzoZymQYECgYEA8vHApVE8lfuDTmNltAwqU6uv9JPPy003TtGg5EcjvtAG+bElzDmRQSlAiVxq36jKzRa1z9C95maCusNU3/DbrsmpOo0xvIJwulMNzieUpDhgL9r6Qi80da/XKXKPSUJsvJ5AsM1/nEoDNoWv2Xx7PVP6qARdHD+n11c3rJqldh0CgYEAw+4imiAuYXehw1pCMnL+fFsbG2g5YLqBp0o9O3G+oM8xI3psy3TV1X1m+qHYgXmqxKJiJU3chBLZXh0UIr8bvvlpxJ1bvVA/8iZACEycHnqIw/nD/F5V6E3sUOM/56FcN+IrAt0TqRmRFD+rIDKk4EBO1T6sS7mxz9WWfeTm+dkCgYEAiLxUZzd/2BKFZts+5MVsFUeucwO2koBVPsFxwsnfbof7RRHVakqEXJ5xOl6PsG56JlA/6EVefIz5y1AhNyGDI69Q1imd8rGf7N7OCFfyqzMnwAeJjzKuXgaoHSXjS6JdPRP86QXgawClKky4GrqbSns3utUp6rpRJzxpk3Y+5mkCgYA7GslBaVfUezxHLCEwCtSOOwWQXP6CGYEnMBQMrKFu7VHLfBD5x0MCZhP8o3omhMdpDftBeZ1+EhmUdH0whioekCrB7x5Pm7fOmo9ScZne7+P2CpB+vw53R5p0RDlw7JJfIVEMShi2OEo1q4c57U0jgQLG/WMIbPog0jPVwomS8QKBgBOqK2bQ5cKhs1tdMjKO6mWzuXG+5p79o2gx6+TFiPxXJcTtaZOHbdbR4HO+ywSbffalyJiGgosiIEiay8DtzmtitGb1ECQiBoMnmKp0zAUx5xN7PCMcqbvCxLQZCFtrIF22ZcB7ST1r5SpS8r1wvLr2ho183w+yZwFtBI5Xm0kD";
// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArENbbtxohLNBJEAyB6jTd/3YmyRuDskK+P1Ig9Csxor3EPPhKUap8KQhtibmHpgCkYu1nNvvosFMpEPUih7t1awNTwU5C3aunsdZUpVRp7XlzFjiWEE7Qv5B+Xm7m5VLGON3/aucL1d4x3rIZvge9FCI+BZPbO2oYwEnb+VMXwOKadoE2ceETo8JCV8Zn/gTV2rTWxHbT/m0iDXluE86KAKVRr+LfmGkiTjK4SHgnFvqtw4iiAooVampDUsQpGmYkxreUsffHO35cOykUD18otEfQB3x0AKlrUcrD6fKxU2AQJAyW00MoAUZyRwsXESFuWw7fpVZcyvpzZv7ReIu5wIDAQAB";
// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:9090/pay/returnAlipay";

//	 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/personal";

// 签名方式
	public static String sign_type = "RSA2";
	
// 字符编码格式
	public static String charset = "utf-8";
	
// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
// 支付宝网关
	public static String log_path = "D:\\";



    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

