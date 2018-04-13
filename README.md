花了点时间搭建了一个spring cloud demo
servlet容器选择的是undertow
register服务注册中心
client1 和 client10 是模拟2个后端接口
zuul路由网关,实现负载均衡高可用
config是配置中心,从Git上获取配置
 
依次启动 register -> config -> client1 -> client10 -> zuul
 
访问本地 http://127.0.0.1:8088/api/test 不断刷新依次请求的是 client1 和 client2
配置文件访问http://127.0.0.1:8088/api/getConfig
