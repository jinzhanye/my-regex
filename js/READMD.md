## API
### Pattern
- toString、toLocaleString、valueOf 都是返回表达式本身
- test
- exec


以下两种写法是等价的，都是返回一个match对象

pattern.exec(text)
text.match(pattern)

### String
- search
- replace
- split

RegExp.$ 只支持1~9，但replace捕获分组支持0~99

## 不支持
- 向后查找(lookbehind)
- s(single，单行)和x(free-spacing， 无间隔)匹配模式
- 正则表达式注释
