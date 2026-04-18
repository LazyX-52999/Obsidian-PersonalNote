---
tags:
  - "#KeyPoints"
---
## [[2026-04-17]]
在构造器中，默认会有 super 和 普通代码块 
```java
public A {
	A() {
		super();
		{  };
		System.out.println("A构造器");
	}
}
```

