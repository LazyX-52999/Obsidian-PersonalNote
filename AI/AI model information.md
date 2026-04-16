---
tags:
  - AI
  - confidential
---
# Claude Code接入模型

## Kimi - K2.5 - 长文本，解析文件
#### API_KEY: sk-kpBNURAejRJ2JYiWVSzA6M8qSSA6uiHzIIDwEBYrNsyUDGcw
#### BASE_URL: https://api.moonshot.cn/anthropic
##### 配置方法：
```
$env:ANTHROPIC_BASE_URL="https://api.moonshot.cn/anthropic";
$env:ANTHROPIC_AUTH_TOKEN="sk-kpBNURAejRJ2JYiWVSzA6M8qSSA6uiHzIIDwEBYrNsyUDGcw"
$env:ANTHROPIC_MODEL="kimi-k2-thinking-turbo"
$env:ANTHROPIC_DEFAULT_OPUS_MODEL="kimi-k2-thinking-turbo"
$env:ANTHROPIC_DEFAULT_SONNET_MODEL="kimi-k2-thinking-turbo"
$env:ANTHROPIC_DEFAULT_HAIKU_MODEL="kimi-k2-thinking-turbo"
$env:CLAUDE_CODE_SUBAGENT_MODEL="kimi-k2-thinking-turbo"
claude
```


## GLM - 4.7 - 代码
#### API_KEY: 368b93fe29754f72bf5ecc106c16f9b2.xmXzBWRCXoJvyyZM
#### BASE_URL: https://open.bigmodel.cn/api/anthropic
##### 配置方法：
```
$env:ANTHROPIC_AUTH_TOKEN="368b93fe29754f72bf5ecc106c16f9b2.xmXzBWRCXoJvyyZM"
$env:ANTHROPIC_BASE_URL="https://open.bigmodel.cn/api/anthropic"
$env:API_TIMEOUT_MS=300000
$env:CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1
claude
```


## DeepSeek - 代码（便宜）
#### API_KEY: sk-e9971f903fd3403783b9be11183af545
#### BASE_URL: https://api.deepseek.com/anthropic
##### 配置方法：
```
$env:ANTHROPIC_BASE_URL="https://api.deepseek.com/anthropic"
$env:ANTHROPIC_AUTH_TOKEN="sk-e9971f903fd3403783b9be11183af545"
$env:API_TIMEOUT_MS=600000  
$env:ANTHROPIC_MODEL="deepseek-chat"  
$env:ANTHROPIC_SMALL_FAST_MODEL="deepseek-chat"
$env:CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC=1
claude
```


> [!error] 解决“Claude Code might not be available in your country.”问题
win+R cmd  
输入
powershell -Command "$ f='%USERPROFILE%\.claude.json';$j=Get-Content $f|ConvertFrom-Json;$j|Add-Member -NotePropertyName 'hasCompletedOnboarding' -NotePropertyValue $true -Force;$j|ConvertTo-Json|Set-Content $f"

> [!attention]  输入中的第一行 $ 和 f 中没有空格


# obsidian接入模型
## Kimi
#### API KEY: sk-s3UraEayRiLZNRo0dgdp4WnTRFBwfsEeK1zf2wcOPNCNtJuG

## DeepSeek
#### API KEY: sk-758f8a1ac2b349548fe80aa7950c5f28


# 提示词优化器接入模型
## DeepSeek
#### API KEY: sk-9eb133cea2e94a939a8625fedc1c2559


# Smart_todo接入模型
## DeepSeek
#### API KEY: sk-5ab51a9ecb3e46fe8fb1d07817968730
#### BASE_URL: https://api.deepseek.com/v1/chat/completions

# Codex接入模型
## DeepSeek
#### API KEY: sk-60f1e73274644a36b65cb7f63c61b610

# openclaw接入模型
## DeepSeek
#### API KEY: sk-ba0ea8371a8f4476980e7fdd63d9cf3d