# kotless-ping-pong

サーバレスフレームワーク [kotless](https://github.com/JetBrains/kotless) を使った簡単なサービスです。

AWS Lambdaにデブロイしています。

kotless: [v0.2.0](https://github.com/JetBrains/kotless/releases/tag/0.2.0)

## サンプル

### [/](https://pvorwg8jr7.execute-api.ap-northeast-1.amazonaws.com/1)
説明文を返します。
### [/ping](https://pvorwg8jr7.execute-api.ap-northeast-1.amazonaws.com/1/ping)
`pong!`を返します。

## コード

`ktor-lang`を使っています。
Ktor風のルーティングができます。