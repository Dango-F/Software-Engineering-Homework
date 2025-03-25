FROM maven:3.9.9-eclipse-temurin-17 AS build

# 设置工作目录
WORKDIR /app

# 复制pom.xml
COPY pom.xml .

# 下载所有依赖
RUN mvn dependency:go-offline -B

# 复制源代码
COPY src ./src

# 打包应用
RUN mvn package -DskipTests

# 第二阶段：运行阶段
FROM eclipse-temurin:17-jre

WORKDIR /app

# 从构建阶段复制jar
COPY --from=build /app/target/*.jar app.jar

# 对外暴露8080端口
EXPOSE 8080

# 启动应用
ENTRYPOINT ["java", "-jar", "app.jar"] 