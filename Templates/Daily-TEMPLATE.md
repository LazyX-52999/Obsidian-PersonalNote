<%*
let d = moment(tp.file.title, "YYYY-MM-DD");
let q = "Q" + (Math.floor(d.month() / 3) + 1);
let w = d.isoWeek().toString().padStart(2, '0');
-%>
---
week: '[[<% d.format("YYYY") %>-W<% w %>]]'
date: '<% tp.file.title %>'
cssclasses:

  - daily
  
---

## [[<% d.format("YYYY")%>]] / [[<%d.format("YYYY")%>-<% q %>|<% q %>]] / [[<% d.format("YYYY-MM") %>|<% d.format("MMMM") %>]] / [[<% d.format("YYYY") %>-W<% w %>|Week <% d.isoWeek() %>]]
# DAILY NOTE
##### ❮ [[<% d.clone().subtract(1, 'days').format("YYYY-MM-DD") %>]] | <% tp.file.title %> | [[<% d.clone().add(1, 'days').format("YYYY-MM-DD") %>]] ❯
---
### 📖Freewrite
#### Conclusion
今日，课，学习时间为：h min

#### JavaSE


#### 健身



---
### ☀️To-do
- [ ] 


### 🥦Health
- [ ] ==喝水==
- [ ] 米糊
- [ ] 肌酸
- [ ] 蛋白粉

### 💪[[Workout]]
-[workout::] 
- [ ] 


### 📕Java 
-[java::] 
- [ ] 


### 📕[[English Words]]
-[words::] 

| 单词  | 英文 English | 中文 Chinese |     | 中文 Chinese | 英文 English |
| :-: | :--------: | :--------: | :-: | :--------: | :--------: |
|  1  |            |            |     |            |            |
|  2  |            |            |     |            |            |
|  3  |            |            |     |            |            |
|  4  |            |            |     |            |            |
|  5  |            |            |     |            |            |
|  6  |            |            |     |            |            |
|  7  |            |            |     |            |            |
|  8  |            |            |     |            |            |
|  9  |            |            |     |            |            |
| 10  |            |            |     |            |            |
| 11  |            |            |     |            |            |
| 12  |            |            |     |            |            |
| 13  |            |            |     |            |            |
| 14  |            |            |     |            |            |
| 15  |            |            |     |            |            |
| 16  |            |            |     |            |            |
| 17  |            |            |     |            |            |
| 18  |            |            |     |            |            |
| 19  |            |            |     |            |            |
| 20  |            |            |     |            |            |


