## trident-java
### 简介
1. 本项目使用`Java`的方式实现波场API调用
2. 需要使用的波场API`jar`已打包好，并放置在 ` ./src/main/resource/jar/ `，pom.xml文件已引入
3. 波场现在已经不提供`jar`包，需要自己去GtiHub上下载后，自行打包，如有需要请自取 [GitHub](https://github.com/tronprotocol/trident)
### 使用
#### 开发环境
* JDK 1.8+
* Maven 3.6.3+
* Gradle 7.5.1

#### 配置文件
* apiKey：测试环境非必须，使用主网络时必须要有，可自行注册[申请地址](https://www.trongrid.io/)
* address：注册地址（必须）
* privateKey：私钥（必须）
* publicKey：公钥（非必须）
* hexAddress：hex格式的地址（非必须）

### 一些注意点
* 正常注册的账户，只是生成了账户的信息，在发生交易之前在链上都是查不到账户信息的
* 测试账户需要添加金额的话，可以通过该种方式添加 [trongrid.io](https://www.trongrid.io/faucet)（需科学上网）


