package cn.lys.kmp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/ssr")
    public String ssr() {
        return "dHJvamFuOi8vMTcyNzJFRDQtNkY0OS0wM0M1LUMxNDctMTU4Q0ZFQjE1MTZFQDExNi42My45NC4xNTU6NjEwMT9hbGxvd0luc2VjdXJlPTEmdWRwPTEmcGVlcj1pcWl5aS5jb20mc25pPWlxaXlpLmNvbSNUcmFmZmljJTNBJTIwMTQuOTIlMjBHQiUyMCU3QyUyMDEwMCUyMEdCCnRyb2phbjovLzE3MjcyRUQ0LTZGNDktMDNDNS1DMTQ3LTE1OENGRUIxNTE2RUAxMTYuNjMuOTQuMTU1OjYxMDE/YWxsb3dJbnNlY3VyZT0xJnVkcD0xJnBlZXI9aXFpeWkuY29tJnNuaT1pcWl5aS5jb20jRXhwaXJlJTNBJTIwMjAyMi0wOS0xMwp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTAxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOSVBNiU5OSVFNiVCOCVBRi0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTAyP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOSVBNiU5OSVFNiVCOCVBRi0wMgp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTAzP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOSVBNiU5OSVFNiVCOCVBRi0wMwp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTMxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiU5NyVBNSVFNiU5QyVBQy0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTMyP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiU5NyVBNSVFNiU5QyVBQy0wMgp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTMzP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiU5NyVBNSVFNiU5QyVBQy0wMwp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTM0P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiU5NyVBNSVFNiU5QyVBQy0wNAp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTQxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyU4QiVBRSVFNSU5RiU4RS0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTQyP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyU4QiVBRSVFNSU5RiU4RS0wMgp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTQzP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyU4QiVBRSVFNSU5RiU4RS0wMwp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTExP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyVCRSU4RSVFNSU5QiVCRC0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTEyP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyVCRSU4RSVFNSU5QiVCRC0wMgp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTEzP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyVCRSU4RSVFNSU5QiVCRC0wMwp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTE0P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNyVCRSU4RSVFNSU5QiVCRC0wNAp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTUxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNSU4RiVCMCVFNiVCOSVCRS0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY1P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOSU5RiVBOSVFNSU5QiVCRC0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTIxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNSU4RCVCMCVFNSVCQSVBNi0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTYxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiVCMyVCMCVFNSU5QiVCRC0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTYyP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOCVCNiU4QSVFNSU4RCU5Ny0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY2P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFOCVCRiVBQSVFNiU4QiU5Qy0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY3P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiVCMyU5NSVFNSU5QiVCRC0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTcwP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNiU4MiU4OSVFNSVCMCVCQy0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY4P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNSVCNyVCNCVFOCVBNSVCRi0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY5P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNSU4QSVBMCVFNiU4QiVCRiVFNSVBNCVBNy0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTcxP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNSU4QSVBMCVFNiU4QiVCRiVFNSVBNCVBNy0wMgp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTYzP2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNCVCQyVBNiVFNiU5NSVBNi0wMQp0cm9qYW46Ly8xNzI3MkVENC02RjQ5LTAzQzUtQzE0Ny0xNThDRkVCMTUxNkVAMTE2LjYzLjk0LjE1NTo2MTY0P2FsbG93SW5zZWN1cmU9MSZ1ZHA9MSZwZWVyPWlxaXlpLmNvbSZzbmk9aXFpeWkuY29tIyVFNCVCQyVBNiVFNiU5NSVBNi0wMgo";
    }

    @RequestMapping("/subscribe")
    public String subscribe() {
    String v2tun = "port: 7890\n" +
            "socks-port: 7891\n" +
            "allow-lan: true\n" +
            "mode: Rule\n" +
            "log-level: info\n" +
            "external-controller: :9090\n" +
            "dns:\n" +
            "  enable: true\n" +
            "  ipv6: false\n" +
            "  listen: 127.0.0.1:8853\n" +
            "  enhanced-mode: fake-ip\n" +
            "  nameserver:\n" +
            "    - https://223.5.5.5/dns-query\n" +
            "    - https://223.6.6.6/dns-query\n" +
            "    - https://doh.pub/dns-query\n" +
            "  fake-ip-filter:\n" +
            "    - \"*.lan\"\n" +
            "    - stun.*.*.*\n" +
            "    - stun.*.*\n" +
            "    - time.windows.com\n" +
            "    - time.nist.gov\n" +
            "    - time.apple.com\n" +
            "    - time.asia.apple.com\n" +
            "    - \"*.ntp.org.cn\"\n" +
            "    - \"*.openwrt.pool.ntp.org\"\n" +
            "    - time1.cloud.tencent.com\n" +
            "    - time.ustc.edu.cn\n" +
            "    - pool.ntp.org\n" +
            "    - ntp.ubuntu.com\n" +
            "    - ntp.aliyun.com\n" +
            "    - ntp1.aliyun.com\n" +
            "    - ntp2.aliyun.com\n" +
            "    - ntp3.aliyun.com\n" +
            "    - ntp4.aliyun.com\n" +
            "    - ntp5.aliyun.com\n" +
            "    - ntp6.aliyun.com\n" +
            "    - ntp7.aliyun.com\n" +
            "    - time1.aliyun.com\n" +
            "    - time2.aliyun.com\n" +
            "    - time3.aliyun.com\n" +
            "    - time4.aliyun.com\n" +
            "    - time5.aliyun.com\n" +
            "    - time6.aliyun.com\n" +
            "    - time7.aliyun.com\n" +
            "    - \"*.time.edu.cn\"\n" +
            "    - time1.apple.com\n" +
            "    - time2.apple.com\n" +
            "    - time3.apple.com\n" +
            "    - time4.apple.com\n" +
            "    - time5.apple.com\n" +
            "    - time6.apple.com\n" +
            "    - time7.apple.com\n" +
            "    - time1.google.com\n" +
            "    - time2.google.com\n" +
            "    - time3.google.com\n" +
            "    - time4.google.com\n" +
            "    - music.163.com\n" +
            "    - \"*.music.163.com\"\n" +
            "    - \"*.126.net\"\n" +
            "    - musicapi.taihe.com\n" +
            "    - music.taihe.com\n" +
            "    - songsearch.kugou.com\n" +
            "    - trackercdn.kugou.com\n" +
            "    - \"*.kuwo.cn\"\n" +
            "    - api-jooxtt.sanook.com\n" +
            "    - api.joox.com\n" +
            "    - joox.com\n" +
            "    - y.qq.com\n" +
            "    - \"*.y.qq.com\"\n" +
            "    - streamoc.music.tc.qq.com\n" +
            "    - mobileoc.music.tc.qq.com\n" +
            "    - isure.stream.qqmusic.qq.com\n" +
            "    - dl.stream.qqmusic.qq.com\n" +
            "    - aqqmusic.tc.qq.com\n" +
            "    - amobile.music.tc.qq.com\n" +
            "    - \"*.xiami.com\"\n" +
            "    - \"*.music.migu.cn\"\n" +
            "    - music.migu.cn\n" +
            "    - \"*.msftconnecttest.com\"\n" +
            "    - \"*.msftncsi.com\"\n" +
            "    - localhost.ptlogin2.qq.com\n" +
            "    - \"*.*.*.srv.nintendo.net\"\n" +
            "    - \"*.*.stun.playstation.net\"\n" +
            "    - xbox.*.*.microsoft.com\n" +
            "    - \"*.ipv6.microsoft.com\"\n" +
            "    - \"*.*.xboxlive.com\"\n" +
            "    - speedtest.cros.wr.pvp.net\n" +
            "proxies:\n" +
            "  - {name: \"Traffic: 14.9 GB | 100 GB\", server: 116.63.94.155, port: 6101, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \"Expire: 2022-09-13\", server: 116.63.94.155, port: 6101, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDED\uD83C\uDDF0 香港-01, server: 116.63.94.155, port: 6101, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDED\uD83C\uDDF0 香港-02, server: 116.63.94.155, port: 6102, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDED\uD83C\uDDF0 香港-03, server: 116.63.94.155, port: 6103, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEF\uD83C\uDDF5 日本-01, server: 116.63.94.155, port: 6131, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEF\uD83C\uDDF5 日本-02, server: 116.63.94.155, port: 6132, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEF\uD83C\uDDF5 日本-03, server: 116.63.94.155, port: 6133, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEF\uD83C\uDDF5 日本-04, server: 116.63.94.155, port: 6134, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDF8\uD83C\uDDEC 狮城-01, server: 116.63.94.155, port: 6141, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDF8\uD83C\uDDEC 狮城-02, server: 116.63.94.155, port: 6142, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDF8\uD83C\uDDEC 狮城-03, server: 116.63.94.155, port: 6143, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDFA\uD83C\uDDF8 美国-01, server: 116.63.94.155, port: 6111, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDFA\uD83C\uDDF8 美国-02, server: 116.63.94.155, port: 6112, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDFA\uD83C\uDDF8 美国-03, server: 116.63.94.155, port: 6113, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDFA\uD83C\uDDF8 美国-04, server: 116.63.94.155, port: 6114, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE8\uD83C\uDDF3 台湾-01, server: 116.63.94.155, port: 6151, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDF0\uD83C\uDDF7 韩国-01, server: 116.63.94.155, port: 6165, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEE\uD83C\uDDF3 印度-01, server: 116.63.94.155, port: 6121, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDF9\uD83C\uDDED 泰国-01, server: 116.63.94.155, port: 6161, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDFB\uD83C\uDDF3 越南-01, server: 116.63.94.155, port: 6162, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE6\uD83C\uDDEA 迪拜-01, server: 116.63.94.155, port: 6166, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEB\uD83C\uDDF7 法国-01, server: 116.63.94.155, port: 6167, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE6\uD83C\uDDFA 悉尼-01, server: 116.63.94.155, port: 6170, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE7\uD83C\uDDF7 巴西-01, server: 116.63.94.155, port: 6168, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE8\uD83C\uDDE6 加拿大-01, server: 116.63.94.155, port: 6169, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDE8\uD83C\uDDE6 加拿大-02, server: 116.63.94.155, port: 6171, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEC\uD83C\uDDE7 伦敦-01, server: 116.63.94.155, port: 6163, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "  - {name: \uD83C\uDDEC\uD83C\uDDE7 伦敦-02, server: 116.63.94.155, port: 6164, type: trojan, password: 17272ED4-6F49-03C5-C147-158CFEB1516E, sni: iqiyi.com, skip-cert-verify: true, udp: true}\n" +
            "proxy-groups:\n" +
            "  - name: Proxies\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - HK\n" +
            "      - JP\n" +
            "      - SG\n" +
            "      - TW\n" +
            "      - US\n" +
            "      - \"Traffic: 14.9 GB | 100 GB\"\n" +
            "      - \"Expire: 2022-09-13\"\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-01\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-02\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-03\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-01\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-02\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-03\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-04\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-01\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-02\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-03\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-01\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-02\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-03\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-04\n" +
            "      - \uD83C\uDDE8\uD83C\uDDF3 台湾-01\n" +
            "      - \uD83C\uDDF0\uD83C\uDDF7 韩国-01\n" +
            "      - \uD83C\uDDEE\uD83C\uDDF3 印度-01\n" +
            "      - \uD83C\uDDF9\uD83C\uDDED 泰国-01\n" +
            "      - \uD83C\uDDFB\uD83C\uDDF3 越南-01\n" +
            "      - \uD83C\uDDE6\uD83C\uDDEA 迪拜-01\n" +
            "      - \uD83C\uDDEB\uD83C\uDDF7 法国-01\n" +
            "      - \uD83C\uDDE6\uD83C\uDDFA 悉尼-01\n" +
            "      - \uD83C\uDDE7\uD83C\uDDF7 巴西-01\n" +
            "      - \uD83C\uDDE8\uD83C\uDDE6 加拿大-01\n" +
            "      - \uD83C\uDDE8\uD83C\uDDE6 加拿大-02\n" +
            "      - \uD83C\uDDEC\uD83C\uDDE7 伦敦-01\n" +
            "      - \uD83C\uDDEC\uD83C\uDDE7 伦敦-02\n" +
            "  - name: Netflix\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - Proxies\n" +
            "      - HK\n" +
            "      - JP\n" +
            "      - SG\n" +
            "      - TW\n" +
            "      - US\n" +
            "  - name: Streaming\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - Proxies\n" +
            "      - HK\n" +
            "      - JP\n" +
            "      - SG\n" +
            "      - TW\n" +
            "      - US\n" +
            "  - name: StreamingSE\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - DIRECT\n" +
            "      - HK\n" +
            "      - TW\n" +
            "  - name: HK\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-01\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-02\n" +
            "      - \uD83C\uDDED\uD83C\uDDF0 香港-03\n" +
            "  - name: JP\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-01\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-02\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-03\n" +
            "      - \uD83C\uDDEF\uD83C\uDDF5 日本-04\n" +
            "  - name: SG\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-01\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-02\n" +
            "      - \uD83C\uDDF8\uD83C\uDDEC 狮城-03\n" +
            "  - name: TW\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - \uD83C\uDDE8\uD83C\uDDF3 台湾-01\n" +
            "  - name: US\n" +
            "    type: select\n" +
            "    proxies:\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-01\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-02\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-03\n" +
            "      - \uD83C\uDDFA\uD83C\uDDF8 美国-04\n" +
            "rules:\n" +
            " - DOMAIN,app.adjust.com,DIRECT\n" +
            " - DOMAIN,app.appsflyer.com,DIRECT\n" +
            " - DOMAIN,bdtj.tagtic.cn,DIRECT\n" +
            " - DOMAIN,log.mmstat.com,DIRECT\n" +
            " - DOMAIN,sycm.mmstat.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,blog.google // Google Blog,DIRECT\n" +
            " - DOMAIN-SUFFIX,googletraveladservices.com // Google Flights,DIRECT\n" +
            " - DOMAIN,clientservices.googleapis.com,DIRECT\n" +
            " - DOMAIN,dl.google.com,DIRECT\n" +
            " - DOMAIN,dl.l.google.com,DIRECT\n" +
            " - DOMAIN,update.googleapis.com,DIRECT\n" +
            " - DOMAIN,translate.googleapis.com,DIRECT\n" +
            " - DOMAIN,mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt1-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt2-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt3-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt4-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt5-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt6-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt7-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,alt8-mtalk.google.com,DIRECT\n" +
            " - DOMAIN,fairplay.l.qq.com,DIRECT\n" +
            " - DOMAIN,livew.l.qq.com,DIRECT\n" +
            " - DOMAIN,vd.l.qq.com,DIRECT\n" +
            " - DOMAIN,vi.l.qq.com,DIRECT\n" +
            " - DOMAIN,analytics.strava.com,DIRECT\n" +
            " - DOMAIN,msg.umeng.com,DIRECT\n" +
            " - DOMAIN,msg.umengcloud.com,DIRECT\n" +
            " - DOMAIN-KEYWORD,adservice,REJECT\n" +
            " - DOMAIN,ad.51wnl-cq.com,REJECT\n" +
            " - DOMAIN,adextra.51wnl-cq.com,REJECT\n" +
            " - DOMAIN,log.51wnl-cq.com,REJECT\n" +
            " - DOMAIN,r.51wnl-cq.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iadsdk.apple.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads.internal.unity3d.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads.prd.ie.internal.unity3d.com,REJECT\n" +
            " - DOMAIN-SUFFIX,unityads.unity3d.com,REJECT\n" +
            " - DOMAIN,tunion-api.m.taobao.com,REJECT\n" +
            " - DOMAIN-SUFFIX,atm.youku.com,REJECT\n" +
            " - DOMAIN,ad.mobile.youku.com,REJECT\n" +
            " - DOMAIN,iyes.youku.com,REJECT\n" +
            " - DOMAIN,pl.cp31.ott.cibntv.net,REJECT\n" +
            " - DOMAIN,optimus-ads.amap.com,REJECT\n" +
            " - DOMAIN,optimus-ads.amap.com.w.alikunlun.com,REJECT\n" +
            " - DOMAIN,adproxy.autohome.com.cn,REJECT\n" +
            " - DOMAIN,rd.autohome.com.cn,REJECT\n" +
            " - DOMAIN,al.autohome.com.cn,REJECT\n" +
            " - DOMAIN,applogapi.autohome.com.cn,REJECT\n" +
            " - DOMAIN,adm0.autoimg.cn,REJECT\n" +
            " - DOMAIN,adm1.autoimg.cn,REJECT\n" +
            " - DOMAIN,adm2.autoimg.cn,REJECT\n" +
            " - DOMAIN,adm3.autoimg.cn,REJECT\n" +
            " - DOMAIN-SUFFIX,duapps.com,REJECT\n" +
            " - DOMAIN-SUFFIX,cpro.baidu.com,REJECT\n" +
            " - DOMAIN-SUFFIX,pos.baidu.com,REJECT\n" +
            " - DOMAIN,afd.baidu.com,REJECT\n" +
            " - DOMAIN,als.baidu.com,REJECT\n" +
            " - DOMAIN,duclick.baidu.com,REJECT\n" +
            " - DOMAIN,mobads.baidu.com,REJECT\n" +
            " - DOMAIN,mobads-logs.baidu.com,REJECT\n" +
            " - DOMAIN,nadvideo2.baidu.com,REJECT\n" +
            " - DOMAIN,nsclick.baidu.com,REJECT\n" +
            " - DOMAIN,t7z.cupid.iqiyi.com,REJECT\n" +
            " - DOMAIN,t7z.cupid.ptqy.gitv.tv,REJECT\n" +
            " - IP-CIDR,101.227.97.240/32,REJECT,no-resolve\n" +
            " - IP-CIDR,101.227.200.11/32,REJECT,no-resolve\n" +
            " - IP-CIDR,101.227.200.28/32,REJECT,no-resolve\n" +
            " - IP-CIDR,124.192.153.42/32,REJECT,no-resolve\n" +
            " - DOMAIN-SUFFIX,pangolin-sdk-toutiao.com,REJECT\n" +
            " - DOMAIN-SUFFIX,pangolin-sdk-toutiao-b.com,REJECT\n" +
            " - DOMAIN,ad.toutiao.com,REJECT\n" +
            " - DOMAIN,dsp.toutiao.com,REJECT\n" +
            " - DOMAIN,pangolin.snssdk.com,REJECT\n" +
            " - DOMAIN,advertise.baicizhan.com,REJECT\n" +
            " - DOMAIN,advertise.baicizhan.org,REJECT\n" +
            " - DOMAIN,adx.yiche.com,REJECT\n" +
            " - DOMAIN,log.ycapp.yiche.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad.appboy.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-03.appboy.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-01.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-02.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-03.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-04.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-05.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-06.braze.com,REJECT\n" +
            " - DOMAIN-SUFFIX,iad-08.braze.com,REJECT\n" +
            " - DOMAIN,adstore-index-1252524079.file.myqcloud.com,REJECT\n" +
            " - DOMAIN,galaxy.bjcathay.com,REJECT\n" +
            " - DOMAIN,mdrecv.app.cntvwb.cn,REJECT\n" +
            " - DOMAIN,sdapprecv.app.cntvwb.cn,REJECT\n" +
            " - DOMAIN,vdapprecv.app.cntvwb.cn,REJECT\n" +
            " - DOMAIN,ad.21cn.com,REJECT\n" +
            " - DOMAIN,ad.k.21cn.com,REJECT\n" +
            " - DOMAIN,admarket.21cn.com,REJECT\n" +
            " - DOMAIN,adshows.21cn.com,REJECT\n" +
            " - DOMAIN,atrace.chelaile.net.cn,REJECT\n" +
            " - DOMAIN,logs.chelaile.net.cn,REJECT\n" +
            " - DOMAIN,dispatcher.360in.com,REJECT\n" +
            " - DOMAIN,ad.360in.com,REJECT\n" +
            " - DOMAIN,exp.360in.com,REJECT\n" +
            " - DOMAIN-SUFFIX,doubleclick.net,REJECT\n" +
            " - DOMAIN-SUFFIX,googleadservices.com,REJECT\n" +
            " - DOMAIN-SUFFIX,googleadsserving.cn,REJECT\n" +
            " - DOMAIN-SUFFIX,googlesyndication.com,REJECT\n" +
            " - DOMAIN-SUFFIX,googletagservices.com,REJECT\n" +
            " - DOMAIN,ads.youtube.com,REJECT\n" +
            " - DOMAIN-SUFFIX,da.mgtv.com,REJECT\n" +
            " - DOMAIN-SUFFIX,da.hunantv.com,REJECT\n" +
            " - DOMAIN-SUFFIX,log.hunantv.com,REJECT\n" +
            " - DOMAIN-SUFFIX,v2.hunantv.com,REJECT\n" +
            " - DOMAIN,adx.hupu.com,REJECT\n" +
            " - DOMAIN,adx-api.hupu.com,REJECT\n" +
            " - DOMAIN,goblin.hupu.com,REJECT\n" +
            " - DOMAIN,ad.hpplay.cn,REJECT\n" +
            " - DOMAIN,adc.hpplay.cn,REJECT\n" +
            " - DOMAIN,adcdn.hpplay.cn,REJECT\n" +
            " - DOMAIN,adeng.hpplay.cn,REJECT\n" +
            " - DOMAIN,pin.hpplay.cn,REJECT\n" +
            " - DOMAIN,rp.hpplay.cn,REJECT\n" +
            " - DOMAIN,rpt.hpplay.cn,REJECT\n" +
            " - DOMAIN,richmanapi.jxedt.com,REJECT\n" +
            " - DOMAIN,richmanmain.jxedt.com,REJECT\n" +
            " - DOMAIN,richmanrules.jxedt.com,REJECT\n" +
            " - DOMAIN,ad-stat.ksosoft.com,REJECT\n" +
            " - DOMAIN,img.auction-ads.wpscdn.cn,REJECT\n" +
            " - DOMAIN,counter.kingsoft.com,REJECT\n" +
            " - DOMAIN,counter.ksosoft.com,REJECT\n" +
            " - DOMAIN,minfo.wps.cn,REJECT\n" +
            " - DOMAIN,mobad.ijinshan.com,REJECT\n" +
            " - DOMAIN,ups.ksmobile.net,REJECT\n" +
            " - DOMAIN,ws.ksmobile.net,REJECT\n" +
            " - DOMAIN-SUFFIX,e.kuaishou.com,REJECT\n" +
            " - DOMAIN,js-ad.a.yximgs.com,REJECT\n" +
            " - DOMAIN-SUFFIX,webp2p.letv.com,REJECT\n" +
            " - DOMAIN,ark.letv.com,REJECT\n" +
            " - DOMAIN,emma-414870e223.huodonghezi.com,REJECT\n" +
            " - DOMAIN,g3.letv.com,REJECT\n" +
            " - DOMAIN,n.mark.letv.com,REJECT\n" +
            " - DOMAIN,a.wkanx.com,REJECT\n" +
            " - DOMAIN,cwx.lianwangtech.com,REJECT\n" +
            " - DOMAIN,c1wx.lianwangtech.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads.msn.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads1.msn.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads2.msn.com,REJECT\n" +
            " - DOMAIN-SUFFIX,bingads.microsoft.com,REJECT\n" +
            " - DOMAIN-SUFFIX,rads.msn.com,REJECT\n" +
            " - DOMAIN,mobileads.msn.com,REJECT\n" +
            " - DOMAIN,ad.api.moji.com,REJECT\n" +
            " - DOMAIN,adlaunch.moji.com,REJECT\n" +
            " - DOMAIN,ads.mojicdn.com,REJECT\n" +
            " - DOMAIN,v1.log.moji.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ad.cmvideo.cn,REJECT\n" +
            " - DOMAIN,ggc.cmvideo.cn,REJECT\n" +
            " - DOMAIN,ggic03.miguvideo.com,REJECT\n" +
            " - DOMAIN,ggmk.miguvideo.com,REJECT\n" +
            " - DOMAIN,ggv.cmvideo.cn,REJECT\n" +
            " - DOMAIN,ggx.cmvideo.cn,REJECT\n" +
            " - DOMAIN,ggx03.miguvideo.com,REJECT\n" +
            " - DOMAIN-SUFFIX,dsp.youdao.com,REJECT\n" +
            " - DOMAIN-SUFFIX,union.youdao.com,REJECT\n" +
            " - DOMAIN,ad.bn.netease.com,REJECT\n" +
            " - DOMAIN,ad.yixin.im,REJECT\n" +
            " - DOMAIN,admusicpic.music.126.net,REJECT\n" +
            " - DOMAIN,g1.163.com,REJECT\n" +
            " - DOMAIN,gorgon.youdao.com,REJECT\n" +
            " - DOMAIN,iad.g.163.com,REJECT\n" +
            " - DOMAIN,iadmat.nosdn.127.net,REJECT\n" +
            " - DOMAIN,iadmusicmat.music.126.net,REJECT\n" +
            " - DOMAIN,iadmusicmatvideo.music.126.net,REJECT\n" +
            " - DOMAIN,impservice.dictapp.youdao.com,REJECT\n" +
            " - DOMAIN,impservice.youdao.com,REJECT\n" +
            " - DOMAIN,n.3g.163.com,REJECT\n" +
            " - DOMAIN,nex.163.com,REJECT\n" +
            " - DOMAIN,yt-adp.nosdn.127.net,REJECT\n" +
            " - DOMAIN,yt-adp.ws.126.net,REJECT\n" +
            " - DOMAIN,ads.aplus.pptv.com,REJECT\n" +
            " - DOMAIN,ads.aplusapi.pptv.com,REJECT\n" +
            " - DOMAIN,asimgs.pplive.cn,REJECT\n" +
            " - DOMAIN,de.as.pptv.com,REJECT\n" +
            " - DOMAIN,regist.fotoable.com,REJECT\n" +
            " - DOMAIN,cdn.adapi.fotoable.com,REJECT\n" +
            " - DOMAIN,adnew.wifi8.com,REJECT\n" +
            " - DOMAIN,adfile.wifi8.com,REJECT\n" +
            " - DOMAIN,ad-analysis.pconline.com.cn,REJECT\n" +
            " - DOMAIN,iad0ssl.pcauto.com.cn,REJECT\n" +
            " - DOMAIN,iad0ssl.pconline.com.cn,REJECT\n" +
            " - DOMAIN,imgad0.pcauto.com.cn,REJECT\n" +
            " - DOMAIN,imgad0.pconline.com.cn,REJECT\n" +
            " - DOMAIN,ivy.pchouse.com.cn,REJECT\n" +
            " - DOMAIN-SUFFIX,deliver.ifeng.com,REJECT\n" +
            " - DOMAIN,api.newad.ifeng.com,REJECT\n" +
            " - DOMAIN,ifengad.3g.ifeng.com,REJECT\n" +
            " - DOMAIN,ad.qingting.fm,REJECT\n" +
            " - DOMAIN,adlaunch.qingting.fm,REJECT\n" +
            " - DOMAIN,ad-cdn.qingting.fm,REJECT\n" +
            " - DOMAIN-SUFFIX,ads.oppomobile.com,REJECT\n" +
            " - DOMAIN,adsfs.oppomobile.com,REJECT\n" +
            " - DOMAIN-SUFFIX,alitui.weibo.com,REJECT\n" +
            " - DOMAIN-SUFFIX,beacon.sina.com.cn,REJECT\n" +
            " - DOMAIN,adimg.uve.weibo.com,REJECT\n" +
            " - DOMAIN,adimg.vue.weibo.com,REJECT\n" +
            " - DOMAIN,u1.img.mobile.sina.cn,REJECT\n" +
            " - DOMAIN,sax.sina.com.cn,REJECT\n" +
            " - DOMAIN,saxs.sina.com.cn,REJECT\n" +
            " - DOMAIN,saxn.sina.com.cn,REJECT\n" +
            " - DOMAIN-SUFFIX,ad.sohu.com,REJECT\n" +
            " - DOMAIN-SUFFIX,ads.sohu.com,REJECT\n" +
            " - DOMAIN-SUFFIX,aty.sohu.com,REJECT\n" +
            " - DOMAIN,hui.sohu.com,REJECT\n" +
            " - DOMAIN,ads.snapchat.com,REJECT\n" +
            " - DOMAIN,adsapi.snapchat.com,REJECT\n" +
            " - DOMAIN-SUFFIX,hoisin.coocaa.com,REJECT\n" +
            " - DOMAIN-SUFFIX,hoisin.coocaatv.com,REJECT\n" +
            " - DOMAIN,data-hoisin.coocaa.com,REJECT\n" +
            " - DOMAIN-SUFFIX,e.qq.com,REJECT\n" +
            " - DOMAIN-SUFFIX,gdt.qq.com,REJECT\n" +
            " - DOMAIN-SUFFIX,l.qq.com,REJECT\n" +
            " - DOMAIN,adsmind.apdcdn.tc.qq.com,REJECT\n" +
            " - DOMAIN,adsmind.gdtimg.com,REJECT\n" +
            " - DOMAIN,adsmind.tc.qq.com,REJECT\n" +
            " - DOMAIN,adsmind.ugdtimg.com,REJECT\n" +
            " - DOMAIN,livep.l.t002.ottcn.com,REJECT\n" +
            " - DOMAIN,pgdt.gtimg.cn,REJECT\n" +
            " - DOMAIN,pgdt.gtimg.com,REJECT\n" +
            " - DOMAIN,pgdt.ugdtimg.com,REJECT\n" +
            " - DOMAIN,splashqqlive.gtimg.com,REJECT\n" +
            " - DOMAIN,vv.video.qq.com,REJECT\n" +
            " - DOMAIN,wa.gtimg.com,REJECT\n" +
            " - DOMAIN,ad.tencentmusic.com,REJECT\n" +
            " - DOMAIN,adstats.tencentmusic.com,REJECT\n" +
            " - DOMAIN,adserviceretry.kugou.com,REJECT\n" +
            " - DOMAIN,ads.service.kugou.com,REJECT\n" +
            " - DOMAIN,adsfile.bssdlbig.kugou.com,REJECT\n" +
            " - DOMAIN,g.koowo.com,REJECT\n" +
            " - DOMAIN,kgmobilestat.kugou.com,REJECT\n" +
            " - DOMAIN,kgmobilestatbak.kugou.com,REJECT\n" +
            " - DOMAIN,mobilelog.kugou.com,REJECT\n" +
            " - DOMAIN,mobilead.kuwo.cn,REJECT\n" +
            " - DOMAIN,rich.kuwo.cn,REJECT\n" +
            " - DOMAIN,tmead.y.qq.com,REJECT\n" +
            " - DOMAIN,adm.10jqka.com.cn,REJECT\n" +
            " - DOMAIN,stat.10jqka.com.cn,REJECT\n" +
            " - DOMAIN,admonitor.thepaper.cn,REJECT\n" +
            " - DOMAIN,adpai.thepaper.cn,REJECT\n" +
            " - DOMAIN,imgadpai.thepaper.cn,REJECT\n" +
            " - DOMAIN,adsp.xunlei.com,REJECT\n" +
            " - DOMAIN,etl.xlmc.sandai.net,REJECT\n" +
            " - DOMAIN,adv-adlog.variflight.com,REJECT\n" +
            " - DOMAIN,adv-ads.variflight.com,REJECT\n" +
            " - DOMAIN,app-ad.variflight.com,REJECT\n" +
            " - DOMAIN,adlog.vivo.com.cn,REJECT\n" +
            " - DOMAIN,adreq.vivo.com.cn,REJECT\n" +
            " - DOMAIN,ads-marketing-vivofs.vivo.com.cn,REJECT\n" +
            " - DOMAIN,adsdk.vivo.com.cn,REJECT\n" +
            " - DOMAIN,adsstatic.vivo.com.cn,REJECT\n" +
            " - DOMAIN,adxlog.vivo.com.cn,REJECT\n" +
            " - DOMAIN,vcardsdkservice.vivo.com.cn,REJECT\n" +
            " - DOMAIN-KEYWORD,stsdk.vivo.com.cn,REJECT\n" +
            " - DOMAIN-KEYWORD,stsdk.vivoglobal.com,REJECT\n" +
            " - DOMAIN,ads.viber.com,REJECT\n" +
            " - DOMAIN,ads-d.viber.com,REJECT\n" +
            " - DOMAIN,ads.aws.viber.com,REJECT\n" +
            " - DOMAIN,ad.ximalaya.com,REJECT\n" +
            " - DOMAIN,adbs.ximalaya.com,REJECT\n" +
            " - DOMAIN,adse.ximalaya.com,REJECT\n" +
            " - DOMAIN,adse.wsa.ximalaya.com,REJECT\n" +
            " - DOMAIN,adbehavior.wsa.ximalaya.com,REJECT\n" +
            " - DOMAIN,adbehavior.ximalaya.com,REJECT\n" +
            " - DOMAIN,adsebs.ximalaya.com,REJECT\n" +
            " - DOMAIN,adwbs.ximalaya.com,REJECT\n" +
            " - DOMAIN,ads-img-qc.xhscdn.com,REJECT\n" +
            " - DOMAIN,ads-video-al.xhscdn.com,REJECT\n" +
            " - DOMAIN,ads-video-qc.xhscdn.com,REJECT\n" +
            " - DOMAIN,t-ads.xiaohongshu.com,REJECT\n" +
            " - DOMAIN-SUFFIX,adserver.yahoo.com,REJECT\n" +
            " - DOMAIN-SUFFIX,adspecs.yahoo.com,REJECT\n" +
            " - DOMAIN-SUFFIX,advertising.yahoo.com,REJECT\n" +
            " - DOMAIN-SUFFIX,gemini.yahoo.com,REJECT\n" +
            " - DOMAIN,admarketing.yahoo.net,REJECT\n" +
            " - DOMAIN,ads.auctions.yahoo.com,REJECT\n" +
            " - DOMAIN,ads.finance.yahoo.com,REJECT\n" +
            " - DOMAIN,ads.yahoo.com,REJECT\n" +
            " - DOMAIN,ads.yahoo.de,REJECT\n" +
            " - DOMAIN,appcloud2.in.zhihu.com,REJECT\n" +
            " - DOMAIN,mqtt.zhihu.com,REJECT\n" +
            " - DOMAIN,sugar.zhihu.com,REJECT\n" +
            " - DOMAIN,118.89.204.198,REJECT\n" +
            " - IP-CIDR,118.89.204.198/32,REJECT,no-resolve\n" +
            " - IP-CIDR6,2402:4e00:1200:ed00:0:9089:6dac:96b6/128,REJECT,no-resolve\n" +
            " - DOMAIN,apppv.zol.com.cn,REJECT\n" +
            " - DOMAIN,pvnapp.zol.com.cn,REJECT\n" +
            " - DOMAIN-SUFFIX,netflix.com,Netflix\n" +
            " - DOMAIN-SUFFIX,netflix.net,Netflix\n" +
            " - DOMAIN-SUFFIX,nflxext.com,Netflix\n" +
            " - DOMAIN-SUFFIX,nflximg.com,Netflix\n" +
            " - DOMAIN-SUFFIX,nflximg.net,Netflix\n" +
            " - DOMAIN-SUFFIX,nflxso.net,Netflix\n" +
            " - DOMAIN-SUFFIX,nflxvideo.net,Netflix\n" +
            " - DOMAIN-KEYWORD,netflixdnstest,Netflix\n" +
            " - DOMAIN-KEYWORD,apiproxy-device-prod-nlb-,Netflix\n" +
            " - DOMAIN-KEYWORD,dualstack.apiproxy-,Netflix\n" +
            " - DOMAIN-SUFFIX,ext-twitch.tv,Streaming\n" +
            " - DOMAIN-SUFFIX,jtvnw.net,Streaming\n" +
            " - DOMAIN-SUFFIX,ttvnw.net,Streaming\n" +
            " - DOMAIN-SUFFIX,twitch.tv,Streaming\n" +
            " - DOMAIN-SUFFIX,twitchcdn.net,Streaming\n" +
            " - DOMAIN-SUFFIX,twitch-ext.rootonline.de,Streaming\n" +
            " - DOMAIN-SUFFIX,deezer.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dzcdn.net,Streaming\n" +
            " - DOMAIN-SUFFIX,joox.com,Streaming\n" +
            " - DOMAIN-KEYWORD,jooxweb-api,Streaming\n" +
            " - DOMAIN-SUFFIX,kkbox.com,Streaming\n" +
            " - DOMAIN-SUFFIX,kkbox.com.tw,Streaming\n" +
            " - DOMAIN-SUFFIX,kfs.io,Streaming\n" +
            " - DOMAIN-SUFFIX,pandora.com,Streaming\n" +
            " - DOMAIN-SUFFIX,p-cdn.us,Streaming\n" +
            " - DOMAIN-SUFFIX,sndcdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,soundcloud.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pscdn.co,Streaming\n" +
            " - DOMAIN-SUFFIX,scdn.co,Streaming\n" +
            " - DOMAIN-SUFFIX,spotify.com,Streaming\n" +
            " - DOMAIN-SUFFIX,spoti.fi,Streaming\n" +
            " - DOMAIN-KEYWORD,spotify.com,Streaming\n" +
            " - DOMAIN-KEYWORD,-spotify-com,Streaming\n" +
            " - DOMAIN-SUFFIX,tidal.com,Streaming\n" +
            " - DOMAIN-SUFFIX,himalaya.com,Streaming\n" +
            " - DOMAIN-SUFFIX,overcast.fm,Streaming\n" +
            " - DOMAIN-SUFFIX,abema.io,Streaming\n" +
            " - DOMAIN-SUFFIX,abema.tv,Streaming\n" +
            " - DOMAIN-SUFFIX,ameba.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,hayabusa.io,Streaming\n" +
            " - DOMAIN-KEYWORD,abematv.akamaized.net,Streaming\n" +
            " - DOMAIN-SUFFIX,c4assets.com,Streaming\n" +
            " - DOMAIN-SUFFIX,channel4.com,Streaming\n" +
            " - DOMAIN-SUFFIX,aiv-cdn.net,Streaming\n" +
            " - DOMAIN-SUFFIX,aiv-delivery.net,Streaming\n" +
            " - DOMAIN-SUFFIX,amazonvideo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,media-amazon.com,Streaming\n" +
            " - DOMAIN-SUFFIX,primevideo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pv-cdn.net,Streaming\n" +
            " - DOMAIN,atv-ps.amazon.com,Streaming\n" +
            " - DOMAIN,fls-na.amazon.com,Streaming\n" +
            " - DOMAIN,avodmp4s3ww-a.akamaihd.net,Streaming\n" +
            " - DOMAIN,d25xi40x97liuc.cloudfront.net,Streaming\n" +
            " - DOMAIN,dmqdd6hw24ucf.cloudfront.net,Streaming\n" +
            " - DOMAIN,dmqdd6hw24ucf.cloudfront.net,Streaming\n" +
            " - DOMAIN,d22qjgkvxw22r6.cloudfront.net,Streaming\n" +
            " - DOMAIN,d1v5ir2lpwr8os.cloudfront.net,Streaming\n" +
            " - DOMAIN,d27xxe7juh1us6.cloudfront.net,Streaming\n" +
            " - DOMAIN-KEYWORD,avoddashs,Streaming\n" +
            " - DOMAIN,tv.applemusic.com,Streaming\n" +
            " - DOMAIN,linear.tv.apple.com,Streaming\n" +
            " - DOMAIN,play-edge.itunes.apple.com,Streaming\n" +
            " - DOMAIN,uts-api.itunes.apple.com,Streaming\n" +
            " - DOMAIN-SUFFIX,bahamut.com.tw,Streaming\n" +
            " - DOMAIN-SUFFIX,gamer.com.tw,Streaming\n" +
            " - DOMAIN,bahamut.akamaized.net,Streaming\n" +
            " - DOMAIN,gamer-cds.cdn.hinet.net,Streaming\n" +
            " - DOMAIN,gamer2-cds.cdn.hinet.net,Streaming\n" +
            " - DOMAIN-SUFFIX,bbc.co.uk,Streaming\n" +
            " - DOMAIN-SUFFIX,bbci.co.uk,Streaming\n" +
            " - DOMAIN-KEYWORD,bbcfmt,Streaming\n" +
            " - DOMAIN-KEYWORD,uk-live,Streaming\n" +
            " - DOMAIN-SUFFIX,biliintl.com,Streaming\n" +
            " - DOMAIN,apm-misaka.biliapi.net,Streaming\n" +
            " - DOMAIN,p.bstarstatic.com,Streaming\n" +
            " - DOMAIN,p-bstarstatic.akamaized.net,Streaming\n" +
            " - DOMAIN,upos-bstar-mirrorakam.akamaized.net,Streaming\n" +
            " - DOMAIN,upos-bstar1-mirrorakam.akamaized.net,Streaming\n" +
            " - DOMAIN-SUFFIX,dazn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dazn-api.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dazndn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,indazn.com,Streaming\n" +
            " - DOMAIN,d151l6v8er5bdm.cloudfront.net,Streaming\n" +
            " - DOMAIN-KEYWORD,voddazn,Streaming\n" +
            " - DOMAIN-SUFFIX,disco-api.com,Streaming\n" +
            " - DOMAIN-SUFFIX,discoveryplus.co.uk,Streaming\n" +
            " - DOMAIN-SUFFIX,discoveryplus.com,Streaming\n" +
            " - DOMAIN-SUFFIX,discoveryplus.in,Streaming\n" +
            " - DOMAIN-SUFFIX,dnitv.com,Streaming\n" +
            " - DOMAIN,x-default-stgec.uplynk.com,Streaming\n" +
            " - DOMAIN-KEYWORD,discovery.uplynk.com,Streaming\n" +
            " - DOMAIN-SUFFIX,bamgrid.com,Streaming\n" +
            " - DOMAIN-SUFFIX,disneyplus.com,Streaming\n" +
            " - DOMAIN-SUFFIX,disney-plus.net,Streaming\n" +
            " - DOMAIN-SUFFIX,disneystreaming.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dssott.com,Streaming\n" +
            " - DOMAIN,cdn.registerdisney.go.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dmm.co.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,dmm.com,Streaming\n" +
            " - DOMAIN-SUFFIX,dmm-extension.com,Streaming\n" +
            " - DOMAIN-SUFFIX,encoretvb.com,Streaming\n" +
            " - DOMAIN,edge.api.brightcove.com,Streaming\n" +
            " - DOMAIN,bcbolt446c5271-a.akamaihd.net,Streaming\n" +
            " - DOMAIN-SUFFIX,hbo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbogo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbonow.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbomax.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbomaxcdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbogoasia.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hbogoasia.hk,Streaming\n" +
            " - DOMAIN-KEYWORD,.hbogoasia.,Streaming\n" +
            " - DOMAIN,44wilhpljf.execute-api.ap-southeast-1.amazonaws.com,Streaming\n" +
            " - DOMAIN,bcbolthboa-a.akamaihd.net,Streaming\n" +
            " - DOMAIN,cf-images.ap-southeast-1.prod.boltdns.net,Streaming\n" +
            " - DOMAIN,dai3fd1oh325y.cloudfront.net,Streaming\n" +
            " - DOMAIN,hboasia1-i.akamaihd.net,Streaming\n" +
            " - DOMAIN,hboasia2-i.akamaihd.net,Streaming\n" +
            " - DOMAIN,hboasia3-i.akamaihd.net,Streaming\n" +
            " - DOMAIN,hboasia4-i.akamaihd.net,Streaming\n" +
            " - DOMAIN,hboasia5-i.akamaihd.net,Streaming\n" +
            " - DOMAIN,hboasialive.akamaized.net,Streaming\n" +
            " - DOMAIN,hbogoprod-vod.akamaized.net,Streaming\n" +
            " - DOMAIN,hbolb.onwardsmg.com,Streaming\n" +
            " - DOMAIN,hbounify-prod.evergent.com,Streaming\n" +
            " - DOMAIN,players.brightcove.net,Streaming\n" +
            " - DOMAIN,s3-ap-southeast-1.amazonaws.com,Streaming\n" +
            " - DOMAIN-SUFFIX,5itv.tv,Streaming\n" +
            " - DOMAIN-SUFFIX,ocnttv.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hulu.com,Streaming\n" +
            " - DOMAIN-SUFFIX,huluim.com,Streaming\n" +
            " - DOMAIN-SUFFIX,hulustream.com,Streaming\n" +
            " - DOMAIN-SUFFIX,happyon.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,hjholdings.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,hulu.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,itv.com,Streaming\n" +
            " - DOMAIN-SUFFIX,itvstatic.com,Streaming\n" +
            " - DOMAIN,itvpnpmobile-a.akamaihd.net,Streaming\n" +
            " - DOMAIN-SUFFIX,iq.com,Streaming\n" +
            " - DOMAIN,intl.iqiyi.com,Streaming\n" +
            " - DOMAIN,intl-rcd.iqiyi.com,Streaming\n" +
            " - DOMAIN,intl-subscription.iqiyi.com,Streaming\n" +
            " - IP-CIDR,23.53.32.88/32,Streaming,no-resolve\n" +
            " - IP-CIDR,23.211.15.99/32,Streaming,no-resolve\n" +
            " - IP-CIDR,103.5.34.153/32,Streaming,no-resolve\n" +
            " - IP-CIDR,104.109.129.153/32,Streaming,no-resolve\n" +
            " - IP-CIDR,110.238.107.47/32,Streaming,no-resolve\n" +
            " - IP-CIDR,118.26.32.178/32,Streaming,no-resolve\n" +
            " - IP-CIDR,203.74.95.131/32,Streaming,no-resolve\n" +
            " - IP-CIDR,203.74.95.139/32,Streaming,no-resolve\n" +
            " - IP-CIDR,203.74.95.153/32,Streaming,no-resolve\n" +
            " - IP-CIDR,203.211.4.169/32,Streaming,no-resolve\n" +
            " - IP-CIDR,203.211.4.193/32,Streaming,no-resolve\n" +
            " - IP-CIDR,210.71.227.200/32,Streaming,no-resolve\n" +
            " - IP-CIDR,210.71.227.202/32,Streaming,no-resolve\n" +
            " - IP-CIDR,210.201.32.8/32,Streaming,no-resolve\n" +
            " - IP-CIDR,210.201.32.11/32,Streaming,no-resolve\n" +
            " - DOMAIN-SUFFIX,kktv.com.tw,Streaming\n" +
            " - DOMAIN-SUFFIX,kktv.me,Streaming\n" +
            " - DOMAIN,kktv-theater.kk.stream,Streaming\n" +
            " - DOMAIN-SUFFIX,linetv.tw,Streaming\n" +
            " - DOMAIN,d3c7rimkq79yfu.cloudfront.net,Streaming\n" +
            " - DOMAIN-SUFFIX,litv.tv,Streaming\n" +
            " - DOMAIN,litvfreemobile-hichannel.cdn.hinet.net,Streaming\n" +
            " - DOMAIN-SUFFIX,channel5.com,Streaming\n" +
            " - DOMAIN-SUFFIX,my5.tv,Streaming\n" +
            " - DOMAIN,d349g9zuie06uo.cloudfront.net,Streaming\n" +
            " - DOMAIN-SUFFIX,mytvsuper.com,Streaming\n" +
            " - DOMAIN-SUFFIX,tvb.com,Streaming\n" +
            " - DOMAIN-SUFFIX,naver.com,Streaming\n" +
            " - DOMAIN-SUFFIX,smartmediarep.com,Streaming\n" +
            " - DOMAIN-SUFFIX,netflix.com,Streaming\n" +
            " - DOMAIN-SUFFIX,netflix.net,Streaming\n" +
            " - DOMAIN-SUFFIX,nflxext.com,Streaming\n" +
            " - DOMAIN-SUFFIX,nflximg.com,Streaming\n" +
            " - DOMAIN-SUFFIX,nflximg.net,Streaming\n" +
            " - DOMAIN-SUFFIX,nflxso.net,Streaming\n" +
            " - DOMAIN-SUFFIX,nflxvideo.net,Streaming\n" +
            " - DOMAIN-KEYWORD,netflixdnstest,Streaming\n" +
            " - DOMAIN-KEYWORD,apiproxy-device-prod-nlb-,Streaming\n" +
            " - DOMAIN-KEYWORD,dualstack.apiproxy-,Streaming\n" +
            " - DOMAIN-SUFFIX,dmc.nico,Streaming\n" +
            " - DOMAIN-SUFFIX,nicovideo.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,nimg.jp,Streaming\n" +
            " - DOMAIN-SUFFIX,nowe.com,Streaming\n" +
            " - DOMAIN-SUFFIX,nowestatic.com,Streaming\n" +
            " - DOMAIN-SUFFIX,cbsi.com,Streaming\n" +
            " - DOMAIN-SUFFIX,cbsaavideo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,cbsivideo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,paramountplus.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pplusstatic.com,Streaming\n" +
            " - DOMAIN,cbsi.live.ott.irdeto.com,Streaming\n" +
            " - DOMAIN,cbsplaylistserver.aws.syncbak.com,Streaming\n" +
            " - DOMAIN,cbsservice.aws.syncbak.com,Streaming\n" +
            " - DOMAIN,link.theplatform.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pbs.org,Streaming\n" +
            " - DOMAIN-SUFFIX,peacocktv.com,Streaming\n" +
            " - DOMAIN-SUFFIX,phncdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,phprcdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pornhub.com,Streaming\n" +
            " - DOMAIN-SUFFIX,pornhubpremium.com,Streaming\n" +
            " - DOMAIN-SUFFIX,skyking.com.tw,Streaming\n" +
            " - DOMAIN,hamifans.emome.net,Streaming\n" +
            " - DOMAIN-SUFFIX,byteoversea.com,Streaming\n" +
            " - DOMAIN-SUFFIX,ibytedtos.com,Streaming\n" +
            " - DOMAIN-SUFFIX,muscdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,musical.ly,Streaming\n" +
            " - DOMAIN-SUFFIX,tiktok.com,Streaming\n" +
            " - DOMAIN-SUFFIX,tik-tokapi.com,Streaming\n" +
            " - DOMAIN-SUFFIX,tiktokcdn.com,Streaming\n" +
            " - DOMAIN-SUFFIX,tiktokv.com,Streaming\n" +
            " - DOMAIN-KEYWORD,tiktokcdn-,Streaming\n" +
            " - DOMAIN-SUFFIX,tver.jp,Streaming\n" +
            " - DOMAIN,edge.api.brightcove.com,Streaming\n" +
            " - DOMAIN-SUFFIX,viu.com,Streaming\n" +
            " - DOMAIN-SUFFIX,viu.tv,Streaming\n" +
            " - DOMAIN,api.viu.now.com,Streaming\n" +
            " - DOMAIN,d1k2us671qcoau.cloudfront.net,Streaming\n" +
            " - DOMAIN,d2anahhhmp1ffz.cloudfront.net,Streaming\n" +
            " - DOMAIN,dfp6rglgjqszk.cloudfront.net,Streaming\n" +
            " - DOMAIN-SUFFIX,wetv.vip,Streaming\n" +
            " - DOMAIN-SUFFIX,wetvinfo.com,Streaming\n" +
            " - IP-CIDR,150.109.28.51/32,Streaming,no-resolve\n" +
            " - DOMAIN-SUFFIX,googlevideo.com,Streaming\n" +
            " - DOMAIN-SUFFIX,withyoutube.com,Streaming\n" +
            " - DOMAIN-SUFFIX,youtu.be,Streaming\n" +
            " - DOMAIN-SUFFIX,youtube.com,Streaming\n" +
            " - DOMAIN-SUFFIX,youtubeeducation.com,Streaming\n" +
            " - DOMAIN-SUFFIX,youtubegaming.com,Streaming\n" +
            " - DOMAIN-SUFFIX,youtubekids.com,Streaming\n" +
            " - DOMAIN-SUFFIX,youtube-nocookie.com,Streaming\n" +
            " - DOMAIN-SUFFIX,yt.be,Streaming\n" +
            " - DOMAIN-SUFFIX,ytimg.com,Streaming\n" +
            " - DOMAIN,youtubei.googleapis.com,Streaming\n" +
            " - DOMAIN,yt3.ggpht.com,Streaming\n" +
            " - DOMAIN,api.biliapi.com,StreamingSE\n" +
            " - DOMAIN,api.biliapi.net,StreamingSE\n" +
            " - DOMAIN,api.bilibili.com,StreamingSE\n" +
            " - DOMAIN,app.biliapi.com,StreamingSE\n" +
            " - DOMAIN,app.biliapi.net,StreamingSE\n" +
            " - DOMAIN,app.bilibili.com,StreamingSE\n" +
            " - DOMAIN,grpc.biliapi.net,StreamingSE\n" +
            " - DOMAIN,m.bilibili.com,StreamingSE\n" +
            " - DOMAIN,upos-hz-mirrorakam.akamaized.net,StreamingSE\n" +
            " - DOMAIN,www.bilibili.com,StreamingSE\n" +
            " - DOMAIN-KEYWORD,cn-hk-eq-bcache-,StreamingSE\n" +
            " - DOMAIN,cache.video.iqiyi.com,StreamingSE\n" +
            " - IP-CIDR,116.211.202.206/32,StreamingSE,no-resolve\n" +
            " - IP-CIDR,116.211.202.216/32,StreamingSE,no-resolve\n" +
            " - DOMAIN-SUFFIX,api.mgtv.com,StreamingSE\n" +
            " - DOMAIN,mobileso.bz.mgtv.com,StreamingSE\n" +
            " - DOMAIN-SUFFIX,9cache.com,Proxies\n" +
            " - DOMAIN-SUFFIX,9gag.com,Proxies\n" +
            " - DOMAIN-SUFFIX,abc.com,Proxies\n" +
            " - DOMAIN-SUFFIX,anchor.fm,Proxies\n" +
            " - DOMAIN-SUFFIX,archive.fo,Proxies\n" +
            " - DOMAIN-SUFFIX,archive.org,Proxies\n" +
            " - DOMAIN-SUFFIX,archive.ph,Proxies\n" +
            " - DOMAIN-SUFFIX,archiveofourown.org,Proxies\n" +
            " - DOMAIN-SUFFIX,artstation.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ask.com,Proxies\n" +
            " - DOMAIN-SUFFIX,avg.com,Proxies\n" +
            " - DOMAIN-SUFFIX,axios.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bandcamp.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bandwagonhost.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bbc.com,Proxies\n" +
            " - DOMAIN-SUFFIX,behance.net,Proxies\n" +
            " - DOMAIN-SUFFIX,bit.ly,Proxies\n" +
            " - DOMAIN-SUFFIX,bloglovin.com,Proxies\n" +
            " - DOMAIN-SUFFIX,blubrry.com,Proxies\n" +
            " - DOMAIN-SUFFIX,box.com,Proxies\n" +
            " - DOMAIN-SUFFIX,brave.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bullguard.com,Proxies\n" +
            " - DOMAIN-SUFFIX,castbox.fm,Proxies\n" +
            " - DOMAIN-SUFFIX,change.org,Proxies\n" +
            " - DOMAIN-SUFFIX,cloudcone.com,Proxies\n" +
            " - DOMAIN-SUFFIX,clyp.it,Proxies\n" +
            " - DOMAIN-SUFFIX,cna.com.tw,Proxies\n" +
            " - DOMAIN-SUFFIX,conoha.jp,Proxies\n" +
            " - DOMAIN-SUFFIX,coursehero.com,Proxies\n" +
            " - DOMAIN-SUFFIX,c-span.org,Proxies\n" +
            " - DOMAIN-SUFFIX,dailymotion.com,Proxies\n" +
            " - DOMAIN-SUFFIX,daum.net,Proxies\n" +
            " - DOMAIN-SUFFIX,deadline.com,Proxies\n" +
            " - DOMAIN-SUFFIX,depositphotos.com,Proxies\n" +
            " - DOMAIN-SUFFIX,deviantart.com,Proxies\n" +
            " - DOMAIN-SUFFIX,deviantart.net,Proxies\n" +
            " - DOMAIN-SUFFIX,disconnect.me,Proxies\n" +
            " - DOMAIN-SUFFIX,disqus.com,Proxies\n" +
            " - DOMAIN-SUFFIX,dlive.tv,Proxies\n" +
            " - DOMAIN-SUFFIX,dowjones.com,Proxies\n" +
            " - DOMAIN-SUFFIX,duckduckgo.com,Proxies\n" +
            " - DOMAIN-SUFFIX,earthcam.com,Proxies\n" +
            " - DOMAIN-SUFFIX,edx-cdn.org,Proxies\n" +
            " - DOMAIN-SUFFIX,encyclopedia.com,Proxies\n" +
            " - DOMAIN-SUFFIX,feeder.co,Proxies\n" +
            " - DOMAIN-SUFFIX,feedly.com,Proxies\n" +
            " - DOMAIN-SUFFIX,flickr.com,Proxies\n" +
            " - DOMAIN-SUFFIX,flipboard.com,Proxies\n" +
            " - DOMAIN-SUFFIX,flitto.com,Proxies\n" +
            " - DOMAIN-SUFFIX,foreignaffairs.com,Proxies\n" +
            " - DOMAIN-SUFFIX,foreignpolicy.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ft.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ftchinese.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ftimg.net,Proxies\n" +
            " - DOMAIN-SUFFIX,genius.com,Proxies\n" +
            " - DOMAIN-SUFFIX,getsync.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gfw.report,Proxies\n" +
            " - DOMAIN-SUFFIX,git.io,Proxies\n" +
            " - DOMAIN-SUFFIX,githack.com,Proxies\n" +
            " - DOMAIN-SUFFIX,graphql.org,Proxies\n" +
            " - DOMAIN-SUFFIX,hackmd.io,Proxies\n" +
            " - DOMAIN-SUFFIX,heroku.com,Proxies\n" +
            " - DOMAIN-SUFFIX,hket.com,Proxies\n" +
            " - DOMAIN-SUFFIX,huffpost.com,Proxies\n" +
            " - DOMAIN-SUFFIX,i-cable.com,Proxies\n" +
            " - DOMAIN-SUFFIX,imgur.com,Proxies\n" +
            " - DOMAIN-SUFFIX,independent.co.uk,Proxies\n" +
            " - DOMAIN-SUFFIX,inoreader.com,Proxies\n" +
            " - DOMAIN-SUFFIX,is.gd,Proxies\n" +
            " - DOMAIN-SUFFIX,issuu.com,Proxies\n" +
            " - DOMAIN-SUFFIX,istockphoto.com,Proxies\n" +
            " - DOMAIN-SUFFIX,justpaste.it,Proxies\n" +
            " - DOMAIN-SUFFIX,kakao.com,Proxies\n" +
            " - DOMAIN-SUFFIX,kobo.com,Proxies\n" +
            " - DOMAIN-SUFFIX,listennotes.com,Proxies\n" +
            " - DOMAIN-SUFFIX,livestream.com,Proxies\n" +
            " - DOMAIN-SUFFIX,mailchimp.com,Proxies\n" +
            " - DOMAIN-SUFFIX,matrix.org,Proxies\n" +
            " - DOMAIN-SUFFIX,medibang.com,Proxies\n" +
            " - DOMAIN-SUFFIX,medium.com,Proxies\n" +
            " - DOMAIN-SUFFIX,mega.co.nz,Proxies\n" +
            " - DOMAIN-SUFFIX,mega.io,Proxies\n" +
            " - DOMAIN-SUFFIX,mega.nz,Proxies\n" +
            " - DOMAIN-SUFFIX,mixlr.com,Proxies\n" +
            " - DOMAIN-SUFFIX,moon.fm,Proxies\n" +
            " - DOMAIN-SUFFIX,mubi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,myspace.com,Proxies\n" +
            " - DOMAIN-SUFFIX,myspacecdn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nbcnews.com,Proxies\n" +
            " - DOMAIN-SUFFIX,neowin.net,Proxies\n" +
            " - DOMAIN-SUFFIX,newstatesman.com,Proxies\n" +
            " - DOMAIN-SUFFIX,newsweek.com,Proxies\n" +
            " - DOMAIN-SUFFIX,newyorker.com,Proxies\n" +
            " - DOMAIN-SUFFIX,now.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ok.ru,Proxies\n" +
            " - DOMAIN-SUFFIX,omny.fm,Proxies\n" +
            " - DOMAIN-SUFFIX,openvpn.net,Proxies\n" +
            " - DOMAIN-SUFFIX,owltail.com,Proxies\n" +
            " - DOMAIN-SUFFIX,oxfordscholarship.com,Proxies\n" +
            " - DOMAIN-SUFFIX,parsevideo.com,Proxies\n" +
            " - DOMAIN-SUFFIX,paste.ee,Proxies\n" +
            " - DOMAIN-SUFFIX,pastie.org,Proxies\n" +
            " - DOMAIN-SUFFIX,pcloud.com,Proxies\n" +
            " - DOMAIN-SUFFIX,peing.net,Proxies\n" +
            " - DOMAIN-SUFFIX,player.fm,Proxies\n" +
            " - DOMAIN-SUFFIX,podbean.com,Proxies\n" +
            " - DOMAIN-SUFFIX,prism-break.org,Proxies\n" +
            " - DOMAIN-SUFFIX,privoxy.org,Proxies\n" +
            " - DOMAIN-SUFFIX,proxifier.com,Proxies\n" +
            " - DOMAIN-SUFFIX,quora.com,Proxies\n" +
            " - DOMAIN-SUFFIX,quoracdn.net,Proxies\n" +
            " - DOMAIN-SUFFIX,qz.com,Proxies\n" +
            " - DOMAIN-SUFFIX,radioline.co,Proxies\n" +
            " - DOMAIN-SUFFIX,reabble.com,Proxies\n" +
            " - DOMAIN-SUFFIX,redditlist.com,Proxies\n" +
            " - DOMAIN-SUFFIX,resilio.com,Proxies\n" +
            " - DOMAIN-SUFFIX,rsshub.app,Proxies\n" +
            " - DOMAIN-SUFFIX,rthk.hk,Proxies\n" +
            " - DOMAIN-SUFFIX,scmp.com,Proxies\n" +
            " - DOMAIN-SUFFIX,scribd.com,Proxies\n" +
            " - DOMAIN-SUFFIX,search.com,Proxies\n" +
            " - DOMAIN-SUFFIX,shutterstock.com,Proxies\n" +
            " - DOMAIN-SUFFIX,signal.org,Proxies\n" +
            " - DOMAIN-SUFFIX,sketchappsources.com,Proxies\n" +
            " - DOMAIN-SUFFIX,slideshare.net,Proxies\n" +
            " - DOMAIN-SUFFIX,smartmailcloud.com,Proxies\n" +
            " - DOMAIN-SUFFIX,smh.com.au,Proxies\n" +
            " - DOMAIN-SUFFIX,speakerdeck.com,Proxies\n" +
            " - DOMAIN-SUFFIX,spideroak.com,Proxies\n" +
            " - DOMAIN-SUFFIX,spiegel.de,Proxies\n" +
            " - DOMAIN-SUFFIX,startpage.com,Proxies\n" +
            " - DOMAIN-SUFFIX,steemit.com,Proxies\n" +
            " - DOMAIN-SUFFIX,straitstimes.com,Proxies\n" +
            " - DOMAIN-SUFFIX,streamable.com,Proxies\n" +
            " - DOMAIN-SUFFIX,substack.com,Proxies\n" +
            " - DOMAIN-SUFFIX,swissinfo.ch,Proxies\n" +
            " - DOMAIN-SUFFIX,tapatalk.com,Proxies\n" +
            " - DOMAIN-SUFFIX,techspot.com,Proxies\n" +
            " - DOMAIN-SUFFIX,textnow.me,Proxies\n" +
            " - DOMAIN-SUFFIX,theage.com.au,Proxies\n" +
            " - DOMAIN-SUFFIX,theatlantic.com,Proxies\n" +
            " - DOMAIN-SUFFIX,theaustralian.com.au,Proxies\n" +
            " - DOMAIN-SUFFIX,theconversation.com,Proxies\n" +
            " - DOMAIN-SUFFIX,thediplomat.com,Proxies\n" +
            " - DOMAIN-SUFFIX,theguardian.com,Proxies\n" +
            " - DOMAIN-SUFFIX,theinitium.com,Proxies\n" +
            " - DOMAIN-SUFFIX,themoviedb.org,Proxies\n" +
            " - DOMAIN-SUFFIX,thetvdb.com,Proxies\n" +
            " - DOMAIN-SUFFIX,time.com,Proxies\n" +
            " - DOMAIN-SUFFIX,tineye.com,Proxies\n" +
            " - DOMAIN-SUFFIX,tiny.cc,Proxies\n" +
            " - DOMAIN-SUFFIX,torproject.org,Proxies\n" +
            " - DOMAIN-SUFFIX,tradingview.com,Proxies\n" +
            " - DOMAIN-SUFFIX,turbobit.net,Proxies\n" +
            " - DOMAIN-SUFFIX,tutanota.com,Proxies\n" +
            " - DOMAIN-SUFFIX,urbandictionary.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ustream.tv,Proxies\n" +
            " - DOMAIN-SUFFIX,v2ex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,venturebeat.com,Proxies\n" +
            " - DOMAIN-SUFFIX,viber.com,Proxies\n" +
            " - DOMAIN-SUFFIX,vimeo.com,Proxies\n" +
            " - DOMAIN-SUFFIX,voxer.com,Proxies\n" +
            " - DOMAIN-SUFFIX,vzw.com,Proxies\n" +
            " - DOMAIN-SUFFIX,washingtonpost.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wattpad.com,Proxies\n" +
            " - DOMAIN-SUFFIX,welt.de,Proxies\n" +
            " - DOMAIN-SUFFIX,whoer.net,Proxies\n" +
            " - DOMAIN-SUFFIX,wikimapia.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikiwand.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wire.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wireguard.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,worldcat.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wsj.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wsj.net,Proxies\n" +
            " - DOMAIN-SUFFIX,x.co,Proxies\n" +
            " - DOMAIN-SUFFIX,yandex.ru,Proxies\n" +
            " - DOMAIN-SUFFIX,you-get.org,Proxies\n" +
            " - DOMAIN-SUFFIX,zaobao.com,Proxies\n" +
            " - DOMAIN-SUFFIX,zello.com,Proxies\n" +
            " - DOMAIN-SUFFIX,zeronet.io,Proxies\n" +
            " - DOMAIN-SUFFIX,z-lib.org,Proxies\n" +
            " - DOMAIN-SUFFIX,zophar.net,Proxies\n" +
            " - DOMAIN-SUFFIX,zyxel.com,Proxies\n" +
            " - DOMAIN,lab.skk.moe,Proxies\n" +
            " - DOMAIN,ocsp.int-x3.letsencrypt.org,Proxies\n" +
            " - DOMAIN,a248.e.akamai.net,Proxies\n" +
            " - DOMAIN,a771.dscq.akamai.net,Proxies\n" +
            " - DOMAIN-SUFFIX,amazon.co.jp,Proxies\n" +
            " - DOMAIN,d3c33hcgiwev3.cloudfront.net,Proxies\n" +
            " - DOMAIN,payments-jp.amazon.com,Proxies\n" +
            " - DOMAIN,s3-ap-northeast-1.amazonaws.com,Proxies\n" +
            " - DOMAIN,s3-ap-southeast-2.amazonaws.com,Proxies\n" +
            " - DOMAIN-SUFFIX,abc.xyz,Proxies\n" +
            " - DOMAIN-SUFFIX,admob.com,Proxies\n" +
            " - DOMAIN-SUFFIX,adsense.com,Proxies\n" +
            " - DOMAIN-SUFFIX,advertisercommunity.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ampproject.org,Proxies\n" +
            " - DOMAIN-SUFFIX,android.com,Proxies\n" +
            " - DOMAIN-SUFFIX,androidify.com,Proxies\n" +
            " - DOMAIN-SUFFIX,androidtv.com,Proxies\n" +
            " - DOMAIN-SUFFIX,api.ai,Proxies\n" +
            " - DOMAIN-SUFFIX,apigee.com,Proxies\n" +
            " - DOMAIN-SUFFIX,appspot.com,Proxies\n" +
            " - DOMAIN-SUFFIX,blogblog.com,Proxies\n" +
            " - DOMAIN-SUFFIX,blogger.com,Proxies\n" +
            " - DOMAIN-SUFFIX,chrome.com,Proxies\n" +
            " - DOMAIN-SUFFIX,chromium.org,Proxies\n" +
            " - DOMAIN-SUFFIX,debug.com,Proxies\n" +
            " - DOMAIN-SUFFIX,dialogflow.com,Proxies\n" +
            " - DOMAIN-SUFFIX,feedburner.com,Proxies\n" +
            " - DOMAIN-SUFFIX,firebaseio.com,Proxies\n" +
            " - DOMAIN-SUFFIX,g.co,Proxies\n" +
            " - DOMAIN-SUFFIX,getoutline.org,Proxies\n" +
            " - DOMAIN-SUFFIX,ggpht.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gmail.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gmodules.com,Proxies\n" +
            " - DOMAIN-SUFFIX,googleapis.cn,Proxies\n" +
            " - DOMAIN-SUFFIX,gvt0.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gvt1.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gvt3.com,Proxies\n" +
            " - DOMAIN-SUFFIX,itasoftware.com,Proxies\n" +
            " - DOMAIN-SUFFIX,on2.com,Proxies\n" +
            " - DOMAIN-SUFFIX,recaptcha.net,Proxies\n" +
            " - DOMAIN-SUFFIX,schema.org,Proxies\n" +
            " - DOMAIN-SUFFIX,tensorflow.org,Proxies\n" +
            " - DOMAIN-SUFFIX,tenor.com,Proxies\n" +
            " - DOMAIN-SUFFIX,tfhub.dev,Proxies\n" +
            " - DOMAIN-SUFFIX,tiltbrush.com,Proxies\n" +
            " - DOMAIN-SUFFIX,waymo.com,Proxies\n" +
            " - DOMAIN-SUFFIX,web.dev,Proxies\n" +
            " - DOMAIN-SUFFIX,webmproject.org,Proxies\n" +
            " - DOMAIN-SUFFIX,webrtc.org,Proxies\n" +
            " - DOMAIN-SUFFIX,widevine.com,Proxies\n" +
            " - DOMAIN-SUFFIX,xn--ngstr-lra8j.com,Proxies\n" +
            " - DOMAIN-SUFFIX,zynamics.com,Proxies\n" +
            " - DOMAIN-KEYWORD,google,Proxies\n" +
            " - DOMAIN-KEYWORD,.blogspot.,Proxies\n" +
            " - DOMAIN-SUFFIX,goog,Proxies\n" +
            " - DOMAIN,testflight.apple.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gravatar.com,Proxies\n" +
            " - DOMAIN-SUFFIX,tumblr.com,Proxies\n" +
            " - DOMAIN-SUFFIX,videopress.com,Proxies\n" +
            " - DOMAIN-SUFFIX,wordpress.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bloomberg.cn,Proxies\n" +
            " - DOMAIN-SUFFIX,bloomberg.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bloomberg.de,Proxies\n" +
            " - DOMAIN-SUFFIX,bloombergview.com,Proxies\n" +
            " - DOMAIN-SUFFIX,clubhouseapi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,joinclubhouse.com,Proxies\n" +
            " - DOMAIN,clubhouse.pubnubapi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,aex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bibox.com,Proxies\n" +
            " - DOMAIN-SUFFIX,binance.cc,Proxies\n" +
            " - DOMAIN-SUFFIX,binance.com,Proxies\n" +
            " - DOMAIN-SUFFIX,binance.me,Proxies\n" +
            " - DOMAIN-SUFFIX,binance.us,Proxies\n" +
            " - DOMAIN-SUFFIX,bitcointalk.org,Proxies\n" +
            " - DOMAIN-SUFFIX,bitfinex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bithumb.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bitmex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bitstamp.net,Proxies\n" +
            " - DOMAIN-SUFFIX,bittrex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bybit.com,Proxies\n" +
            " - DOMAIN-SUFFIX,coinbase.com,Proxies\n" +
            " - DOMAIN-SUFFIX,coincheck.com,Proxies\n" +
            " - DOMAIN-SUFFIX,coingecko.com,Proxies\n" +
            " - DOMAIN-SUFFIX,coinmarketcap.com,Proxies\n" +
            " - DOMAIN-SUFFIX,coinone.co.kr,Proxies\n" +
            " - DOMAIN-SUFFIX,etherscan.io,Proxies\n" +
            " - DOMAIN-SUFFIX,ftx.com,Proxies\n" +
            " - DOMAIN-SUFFIX,gate.io,Proxies\n" +
            " - DOMAIN-SUFFIX,gemini.com,Proxies\n" +
            " - DOMAIN-SUFFIX,huobi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,korbit.co.kr,Proxies\n" +
            " - DOMAIN-SUFFIX,kraken.com,Proxies\n" +
            " - DOMAIN-SUFFIX,kucoin.com,Proxies\n" +
            " - DOMAIN-SUFFIX,liquid.com,Proxies\n" +
            " - DOMAIN-SUFFIX,okex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,okx.com,Proxies\n" +
            " - DOMAIN-SUFFIX,poloniex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,sushi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,uniswap.org,Proxies\n" +
            " - DOMAIN-SUFFIX,zb.com,Proxies\n" +
            " - DOMAIN-SUFFIX,discord.com,Proxies\n" +
            " - DOMAIN-SUFFIX,discordapp.com,Proxies\n" +
            " - DOMAIN-SUFFIX,discordapp.net,Proxies\n" +
            " - DOMAIN-SUFFIX,dropbox.com,Proxies\n" +
            " - DOMAIN-SUFFIX,dropboxapi.com,Proxies\n" +
            " - DOMAIN-SUFFIX,dropboxusercontent.com,Proxies\n" +
            " - DOMAIN-SUFFIX,freetls.fastly.net,Proxies\n" +
            " - DOMAIN,cloud-cdn-digitalocean-com.global.ssl.fastly.net,Proxies\n" +
            " - DOMAIN,github.global.ssl.fastly.net,Proxies\n" +
            " - DOMAIN,nytimes.map.fastly.net,Proxies\n" +
            " - DOMAIN-SUFFIX,line.me,Proxies\n" +
            " - DOMAIN-SUFFIX,line-apps.com,Proxies\n" +
            " - DOMAIN-SUFFIX,line-scdn.net,Proxies\n" +
            " - DOMAIN-SUFFIX,naver.jp,Proxies\n" +
            " - IP-CIDR,103.2.30.0/23,Proxies,no-resolve\n" +
            " - IP-CIDR,125.209.208.0/20,Proxies,no-resolve\n" +
            " - IP-CIDR,147.92.128.0/17,Proxies,no-resolve\n" +
            " - IP-CIDR,203.104.144.0/21,Proxies,no-resolve\n" +
            " - DOMAIN-SUFFIX,accountkit.com,Proxies\n" +
            " - DOMAIN-SUFFIX,cdninstagram.com,Proxies\n" +
            " - DOMAIN-SUFFIX,f8.com,Proxies\n" +
            " - DOMAIN-SUFFIX,facebookmail.com,Proxies\n" +
            " - DOMAIN-SUFFIX,fb.com,Proxies\n" +
            " - DOMAIN-SUFFIX,fb.me,Proxies\n" +
            " - DOMAIN-SUFFIX,fb.watch,Proxies\n" +
            " - DOMAIN-SUFFIX,fbaddins.com,Proxies\n" +
            " - DOMAIN-SUFFIX,fbcdn.net,Proxies\n" +
            " - DOMAIN-SUFFIX,fbsbx.com,Proxies\n" +
            " - DOMAIN-SUFFIX,fbworkmail.com,Proxies\n" +
            " - DOMAIN-SUFFIX,instagram.com,Proxies\n" +
            " - DOMAIN-SUFFIX,m.me,Proxies\n" +
            " - DOMAIN-SUFFIX,messenger.com,Proxies\n" +
            " - DOMAIN-SUFFIX,oculus.com,Proxies\n" +
            " - DOMAIN-SUFFIX,oculuscdn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,readyatdawn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,rocksdb.org,Proxies\n" +
            " - DOMAIN-SUFFIX,whatsapp.com,Proxies\n" +
            " - DOMAIN-SUFFIX,whatsapp.net,Proxies\n" +
            " - DOMAIN-KEYWORD,.facebook.,Proxies\n" +
            " - DOMAIN-SUFFIX,aka.ms,Proxies\n" +
            " - DOMAIN-SUFFIX,github.blog,Proxies\n" +
            " - DOMAIN-SUFFIX,github.com,Proxies\n" +
            " - DOMAIN-SUFFIX,github.io,Proxies\n" +
            " - DOMAIN-SUFFIX,githubassets.com,Proxies\n" +
            " - DOMAIN-SUFFIX,githubusercontent.com,Proxies\n" +
            " - DOMAIN-SUFFIX,onedrive.live.com,Proxies\n" +
            " - DOMAIN-SUFFIX,streaming.mediaservices.windows.net,Proxies\n" +
            " - DOMAIN,assets1.xboxlive.com,Proxies\n" +
            " - DOMAIN,assets2.xboxlive.com,Proxies\n" +
            " - DOMAIN,az416426.vo.msecnd.net,Proxies\n" +
            " - DOMAIN,az668014.vo.msecnd.net,Proxies\n" +
            " - DOMAIN-SUFFIX,pinimg.com,Proxies\n" +
            " - DOMAIN-KEYWORD,.pinterest.,Proxies\n" +
            " - DOMAIN-SUFFIX,pixiv.net,Proxies\n" +
            " - DOMAIN-SUFFIX,pixiv.org,Proxies\n" +
            " - DOMAIN-SUFFIX,pximg.net,Proxies\n" +
            " - DOMAIN-SUFFIX,redd.it,Proxies\n" +
            " - DOMAIN-SUFFIX,reddit.com,Proxies\n" +
            " - DOMAIN-SUFFIX,redditmedia.com,Proxies\n" +
            " - DOMAIN-SUFFIX,redditstatic.com,Proxies\n" +
            " - DOMAIN-SUFFIX,reuters.com,Proxies\n" +
            " - DOMAIN-SUFFIX,reutersmedia.net,Proxies\n" +
            " - DOMAIN-SUFFIX,steamcommunity.com,Proxies\n" +
            " - DOMAIN-SUFFIX,legra.ph,Proxies\n" +
            " - DOMAIN-SUFFIX,t.me,Proxies\n" +
            " - DOMAIN-SUFFIX,tdesktop.com,Proxies\n" +
            " - DOMAIN-SUFFIX,telegra.ph,Proxies\n" +
            " - DOMAIN-SUFFIX,telegram.me,Proxies\n" +
            " - DOMAIN-SUFFIX,telegram.org,Proxies\n" +
            " - DOMAIN-SUFFIX,telesco.pe,Proxies\n" +
            " - IP-CIDR,91.108.4.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.108.8.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.108.12.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.108.16.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.108.20.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.108.56.0/22,Proxies,no-resolve\n" +
            " - IP-CIDR,91.105.192.0/23,Proxies,no-resolve\n" +
            " - IP-CIDR,149.154.160.0/20,Proxies,no-resolve\n" +
            " - IP-CIDR,185.76.151.0/24,Proxies,no-resolve\n" +
            " - IP-CIDR6,2001:b28:f23d::/48,Proxies,no-resolve\n" +
            " - IP-CIDR6,2001:b28:f23f::/48,Proxies,no-resolve\n" +
            " - IP-CIDR6,2001:67c:4e8::/48,Proxies,no-resolve\n" +
            " - IP-CIDR6,2001:b28:f23c::/48,Proxies,no-resolve\n" +
            " - IP-CIDR6,2a0a:f280::/32,Proxies,no-resolve\n" +
            " - DOMAIN-SUFFIX,economist.com,Proxies\n" +
            " - DOMAIN-SUFFIX,static-economist.com,Proxies\n" +
            " - DOMAIN-SUFFIX,newyorktimes.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nyt.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nytco.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nytimes.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nytimg.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nytlog.com,Proxies\n" +
            " - DOMAIN-SUFFIX,nytstyle.com,Proxies\n" +
            " - DOMAIN-SUFFIX,tmagazine.com,Proxies\n" +
            " - DOMAIN-SUFFIX,periscope.tv,Proxies\n" +
            " - DOMAIN-SUFFIX,pscp.tv,Proxies\n" +
            " - DOMAIN-SUFFIX,t.co,Proxies\n" +
            " - DOMAIN-SUFFIX,tweetdeck.com,Proxies\n" +
            " - DOMAIN-SUFFIX,twimg.co,Proxies\n" +
            " - DOMAIN-SUFFIX,twimg.com,Proxies\n" +
            " - DOMAIN-SUFFIX,twitpic.com,Proxies\n" +
            " - DOMAIN-SUFFIX,twitter.com,Proxies\n" +
            " - DOMAIN-SUFFIX,twitter.jp,Proxies\n" +
            " - DOMAIN-SUFFIX,vine.co,Proxies\n" +
            " - DOMAIN-SUFFIX,mediawiki.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikibooks.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikidata.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikileaks.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikimedia.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikimediafoundation.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikinews.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikipedia.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikiquote.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikisource.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikiversity.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wikivoyage.org,Proxies\n" +
            " - DOMAIN-SUFFIX,wiktionary.org,Proxies\n" +
            " - DOMAIN-SUFFIX,yahoo.com,Proxies\n" +
            " - DOMAIN,search.yahoo.co.jp,Proxies\n" +
            " - DOMAIN-SUFFIX,yadi.sk,Proxies\n" +
            " - DOMAIN,disk.yandex.com,Proxies\n" +
            " - DOMAIN-SUFFIX,aicoin.com,Proxies\n" +
            " - DOMAIN-SUFFIX,aimoon.com,Proxies\n" +
            " - DOMAIN-SUFFIX,engadget.com,Proxies\n" +
            " - DOMAIN-SUFFIX,ifixit.com,Proxies\n" +
            " - DOMAIN-SUFFIX,terabox.com,Proxies\n" +
            " - DOMAIN-SUFFIX,zaobao.com.sg,Proxies\n" +
            " - DOMAIN,addons.mozilla.org // Firefox Add-ons HTTP 451,Proxies\n" +
            " - DOMAIN,wego.here.com,Proxies\n" +
            " - DOMAIN-SUFFIX,go.dev,Proxies\n" +
            " - DOMAIN-SUFFIX,golang.org,Proxies\n" +
            " - DOMAIN-SUFFIX,appsto.re // Apple URL Shortener,Proxies\n" +
            " - DOMAIN-SUFFIX,smoot.apple.com // Spotlight,Proxies\n" +
            " - DOMAIN,amp-api.podcasts.apple.com // Podcasts,Proxies\n" +
            " - DOMAIN,beta.music.apple.com // Apple Music Web,Proxies\n" +
            " - DOMAIN,books.itunes.apple.com // iBooks Store download,Proxies\n" +
            " - DOMAIN,lookup-api.apple.com // Look Up,Proxies\n" +
            " - DOMAIN,radio.itunes.apple.com // Apple Music Radio,Proxies\n" +
            " - DOMAIN,apps.apple.com,Proxies\n" +
            " - DOMAIN,books.apple.com,Proxies\n" +
            " - DOMAIN,itunes.apple.com,Proxies\n" +
            " - DOMAIN,tv.apple.com,Proxies\n" +
            " - DOMAIN,gateway.icloud.com,Proxies\n" +
            " - DOMAIN-SUFFIX,apple.news,Proxies\n" +
            " - DOMAIN,news-assets.apple.com,Proxies\n" +
            " - DOMAIN,news-client.apple.com,Proxies\n" +
            " - DOMAIN,news-client-search.apple.com,Proxies\n" +
            " - DOMAIN,news-edge.apple.com,Proxies\n" +
            " - DOMAIN,news-events.apple.com,Proxies\n" +
            " - DOMAIN,apple.comscoreresearch.com,Proxies\n" +
            " - DOMAIN-SUFFIX,bing.com,Proxies\n" +
            " - DOMAIN-SUFFIX,linkedin.com,Proxies\n" +
            " - DOMAIN-SUFFIX,licdn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,msn.com,Proxies\n" +
            " - DOMAIN-SUFFIX,skype.com,Proxies\n" +
            " - DOMAIN-SUFFIX,flyert.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,gandi.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,snapdrop.net,DIRECT\n" +
            " - DOMAIN,download.jetbrains.com,DIRECT\n" +
            " - DOMAIN,origin-a.akamaihd.net // Origin Download,DIRECT\n" +
            " - DOMAIN,outlook.office365.com,DIRECT\n" +
            " - DOMAIN,smtp-mail.outlook.com,DIRECT\n" +
            " - DOMAIN,smtp.office365.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,dl.delivery.mp.microsoft.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,update.microsoft.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,windowsupdate.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,windowsupdate.microsoft.com,DIRECT\n" +
            " - DOMAIN,download.microsoft.com,DIRECT\n" +
            " - DOMAIN,wustat.windows.com,DIRECT\n" +
            " - DOMAIN,ntservicepack.microsoft.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,paypal.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,paypal.me,DIRECT\n" +
            " - DOMAIN-SUFFIX,paypal-mktg.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,paypalobjects.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,cm.steampowered.com // Steam Connect Manager Servers,DIRECT\n" +
            " - DOMAIN,api.steampowered.com,DIRECT\n" +
            " - IP-CIDR,182.254.116.0/24,DIRECT,no-resolve\n" +
            " - IP-CIDR,203.205.238.0/23,DIRECT,no-resolve\n" +
            " - IP-CIDR,203.205.254.0/23,DIRECT,no-resolve\n" +
            " - DOMAIN,ip.istatmenus.app,DIRECT\n" +
            " - DOMAIN,sms.imagetasks.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,netspeedtestmaster.com,DIRECT\n" +
            " - DOMAIN,speedtest.macpaw.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,acg.rip,DIRECT\n" +
            " - DOMAIN-SUFFIX,animebytes.tv,DIRECT\n" +
            " - DOMAIN-SUFFIX,awesome-hd.me,DIRECT\n" +
            " - DOMAIN-SUFFIX,broadcasthe.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,chdbits.co,DIRECT\n" +
            " - DOMAIN-SUFFIX,classix-unlimited.co.uk,DIRECT\n" +
            " - DOMAIN-SUFFIX,comicat.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,empornium.me,DIRECT\n" +
            " - DOMAIN-SUFFIX,gazellegames.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,hdbits.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,hdchina.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,hddolby.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,hdhome.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,hdsky.me,DIRECT\n" +
            " - DOMAIN-SUFFIX,icetorrent.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,jpopsuki.eu,DIRECT\n" +
            " - DOMAIN-SUFFIX,keepfrds.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,madsrevolution.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,morethan.tv,DIRECT\n" +
            " - DOMAIN-SUFFIX,m-team.cc,DIRECT\n" +
            " - DOMAIN-SUFFIX,myanonamouse.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,nanyangpt.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,ncore.cc,DIRECT\n" +
            " - DOMAIN-SUFFIX,open.cd,DIRECT\n" +
            " - DOMAIN-SUFFIX,ourbits.club,DIRECT\n" +
            " - DOMAIN-SUFFIX,passthepopcorn.me,DIRECT\n" +
            " - DOMAIN-SUFFIX,privatehd.to,DIRECT\n" +
            " - DOMAIN-SUFFIX,pterclub.com,DIRECT\n" +
            " - DOMAIN-SUFFIX,redacted.ch,DIRECT\n" +
            " - DOMAIN-SUFFIX,springsunday.net,DIRECT\n" +
            " - DOMAIN-SUFFIX,tjupt.org,DIRECT\n" +
            " - DOMAIN-SUFFIX,totheglory.im,DIRECT\n" +
            " - GEOIP,CN,DIRECT,no-resolve\n" +
            " - DOMAIN-SUFFIX,local,DIRECT\n" +
            " - IP-CIDR,192.168.0.0/16,DIRECT,no-resolve\n" +
            " - IP-CIDR,10.0.0.0/8,DIRECT,no-resolve\n" +
            " - IP-CIDR,172.16.0.0/12,DIRECT,no-resolve\n" +
            " - IP-CIDR,127.0.0.0/8,DIRECT,no-resolve\n" +
            " - IP-CIDR,100.64.0.0/10,DIRECT,no-resolve\n" +
            " - IP-CIDR6,::1/128,DIRECT,no-resolve\n" +
            " - IP-CIDR6,fc00::/7,DIRECT,no-resolve\n" +
            " - IP-CIDR6,fe80::/10,DIRECT,no-resolve\n" +
            " - IP-CIDR6,fd00::/8,DIRECT,no-resolve\n" +
            " - GEOIP,CN,DIRECT\n" +
            " - MATCH,Proxies\n";
        return v2tun;
    }
}
