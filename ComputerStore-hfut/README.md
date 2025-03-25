# 电脑商城系统

## 项目介绍
这是一个基于Spring Boot + MySQL的电脑商城系统，包含用户管理、商品管理、购物车、订单处理和支付功能。

## 使用Docker运行项目

### 前提条件
- 安装 [Docker](https://www.docker.com/get-started)
- 安装 [Docker Compose](https://docs.docker.com/compose/install/)

### 运行步骤

1. 克隆或下载项目代码
```
git clone <项目仓库URL>
```

2. 进入项目目录
```
cd ComputerStore-hfut
```

3. 使用Docker Compose构建并启动项目
```
docker-compose up -d
```

4. 等待容器启动完成（可能需要几分钟时间）
```
docker-compose logs -f
```

5. 打开浏览器访问应用
```
http://localhost:8080/web/index.html
```

### 停止项目
```
docker-compose down
```

### 数据持久化
MySQL数据将持久化保存在Docker卷中，即使删除容器也不会丢失数据。
如果需要完全重置数据，可以使用以下命令：
```
docker-compose down -v
```

## 本地开发设置
如果你想在本地开发环境中运行项目，需要以下设置：

1. 安装JDK 17
2. 安装Maven 3.9.9
3. 安装MySQL 8.0
4. 运行 database/init.sql 脚本创建数据库和表
5. 修改 application.yml 中的数据库连接配置
6. 使用Maven构建和运行项目
```
mvn clean package -DskipTests
java -jar target/computerstore-0.0.1-SNAPSHOT.jar
```

## 技术栈
- 后端：Spring Boot 2.7.0
- 数据库：MySQL 8.0
- 构建工具：Maven 3.9.9
- JDK版本：Java 17
- 前端：HTML, CSS, JavaScript, jQuery, Bootstrap

## 支付宝沙箱支付
本系统集成了支付宝沙箱支付功能，需要在 AlipayConfig.java 文件中配置相关参数。

## 常见问题

### 1. 数据库连接问题
如果遇到数据库连接问题，请检查MySQL容器是否正常运行。可以使用以下命令查看容器状态：
```
docker ps
docker logs computerstore-mysql
```

### 2. 端口冲突问题
如果端口被占用，可以在docker-compose.yml文件中修改映射端口，例如：
```yaml
ports:
  - "8081:8080"  # 将主机的8081端口映射到容器的8080端口
```

### 3. MySQL 8.0认证问题
MySQL 8.0默认使用`caching_sha2_password`认证插件，如果遇到认证问题，有以下解决方案：

#### 方案1：修改application.yml中的数据库URL
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/computer_store?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8
```

#### 方案2：在MySQL容器中修改认证方式
```
docker exec -it computerstore-mysql mysql -uroot -p
```
输入密码后执行：
```sql
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY '062512';
ALTER USER 'user'@'%' IDENTIFIED WITH mysql_native_password BY 'password';
FLUSH PRIVILEGES;
```

### 4. JDK 17兼容性问题
如果某些依赖库与JDK 17不兼容，可能需要在pom.xml中添加以下配置：
```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <configuration>
                <source>17</source>
                <target>17</target>
                <compilerArgs>
                    <arg>--add-opens=java.base/java.lang=ALL-UNNAMED</arg>
                </compilerArgs>
            </configuration>
        </plugin>
    </plugins>
</build>
``` 