## API
### Pattern
- toString、toLocaleString、valueOf 都是返回表达式本身
- test
- exec


pattern.exec(text)
当 exec() 再也找不到匹配的文本时，它将返回 null，并把 lastIndex 属性重置为 0
那当要获取全局匹配的全部匹配项时，可以通过循环来获取：

注意下面例子，如果加上g，因为pattern.lastIndex没有被重置，所以第二条数据会在index为23的位置开始搜索，会导致匹配失败
````js
console.log('匹配HTML tag ****************');
const textArr = ['<title a="2" dd="2222">', '<img src="http://xxx" alt="">'];
const pattern = /<(("[^"]*"|'[^']*'|[^'">])*)>/;
// 匹配第二条文本失败的正则 const pattern = /<(("[^"]*"|'[^']*'|[^'">])*)>/g;
textArr.forEach(text => {
    const match = pattern.exec(text);
    console.log(match[1]);
    console.log(pattern.lastIndex);
});
````

- text.match(pattern) 返回匹配字符串数组

### String
- search
- replace
- split

RegExp.$ 只支持1~9，但replace捕获分组支持0~99



## 不支持
- 向后查找(lookbehind)
- s(single，单行)和x(free-spacing， 无间隔)匹配模式
- 正则表达式注释
