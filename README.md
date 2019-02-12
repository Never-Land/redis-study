本工程目的是学习Redis并且使用Redis作为数据落地存储实现一个简单的博客系统.

准备工作:
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