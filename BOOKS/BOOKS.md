---
cssclasses:
  - cards
  - cards-cover
  - cards-cols-5
tags:
  - "#books"
---

```button
name + 添加想看的书籍```button
name Add a book
type command
action Douban: 搜索并创建文档
color blue
```

```dataview
	table without ID
		("![](" + cover + ")") as Poster,
		file.linke as Title,
		"Author:" + author as Author,
		"Type:" type as Type
	from #BOOKS
```