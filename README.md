本工程目的是学习Redis并且使用Redis作为数据落地存储实现一个简单的博客系统.

**准备工作**
1.maven使用Apache Maven 3.6.0版本,使用的仓库地址是:https://maven.aliyun.com/repository/public
2.引入Redis包,项目pom文件配置如下:
    <dependency>
        <groupId>redis.clients</groupId>
        <artifactId>jedis</artifactId>
        <version>2.10.2</version>
        <type>jar</type>
        <scope>compile</scope>
    </dependency>
3.Idea建立一个web工程用于学习Redis,至于如何创建web工程参考网上已有的资源.

**使用Jedis连接阿里云Redis遇到的问题及解决方法**
Redis后台直接运行修改配置文件中的daemonize值为yes

首先需要在阿里云安全组中添加入方向的安全组规则,允许外网访问Redis的TCP协议端口号,模仿阿里云已有的安全组规则实例即可,
如果没有添加允许外网访问Redis的端口号,那么远程连接会一直出现连接超时问题
出现连接超时问题java.net.SocketTimeoutException: Read timed out
免密码远程访问阿里云Redis
修改Redis的配置文件redis.conf把bind 127.0.0.1注释,protected-mode的值修改为no
保护模式使用密码登录
修改Redis的配置文件redis.conf把bind 127.0.0.1注释,打开requirepass设置并且设置密码例如:requirepass foobared
使用Redis自带的redis-cli直接访问保护模式需要密码登录出现NOAUTH Authentication required
使用命令auth password认证即可

**使用CentOS系统动态网络冲突问题解决方案**
修改网络配置如下:
增加项
IPADDR=192.168.1.149
NETMASK=255.255.255.0
GATEWAY=192.168.1.1
修改项
BOOTPROTO=static(把默认值dhcp修改为static)
ONBOOT=yes(把默认值no修改为yes)
然后重启网络service network restart