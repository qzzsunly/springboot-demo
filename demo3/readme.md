在banner.txt中可以使用`${Ansi.NAME}`， `${AnsiColor.NAME}`, `${AnsiBackground.NAME}`, `${AnsiStyle.NAME}`来定义banner的样式，文字的颜色，背景颜色。也可以使用缩写`Ansi.BG_Name`来使用背景颜色。`Name`代表了具体的值，值在对应的类中可以查看。
具体可以在`org.springframework.boot.ansi.AnsiColor`, `org.springframework.boot.ansi.AnsiBackground`, `org.springframework.boot.ansi.AnsiStyle`中找。这些前缀在`org.springframework.boot.ansi.AnsiPropertySource`中定义。
```java
List<MappedEnum<?>> enums = new ArrayList<>();
enums.add(new MappedEnum<>("AnsiStyle.", AnsiStyle.class));
enums.add(new MappedEnum<>("AnsiColor.", AnsiColor.class));
enums.add(new MappedEnum<>("AnsiBackground.", AnsiBackground.class));
enums.add(new MappedEnum<>("Ansi.", AnsiStyle.class));
enums.add(new MappedEnum<>("Ansi.", AnsiColor.class));
enums.add(new MappedEnum<>("Ansi.BG_", AnsiBackground.class));
```
比如：
```text
${AnsiColor.BRIGHT_BLUE}
${AnsiStyle.UNDERLINE}
${Ansi.BG_BRIGHT_GREEN}
```

