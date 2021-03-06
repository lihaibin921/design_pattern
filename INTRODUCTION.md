# 简介设计模式
## 三大类 23种
### 创建型模式 (5种 简单工厂不在23种内)
- 单例模式
- (简单工厂模式)
- 工厂方法模式
- 抽象工厂模式
- 建造者模式
- 原型模式
### 结构型模式 (7种)
- 适配器模式
- 装饰模式
- 代理模式
- 外观模式
- 桥接模式
- 组合模式
- 享元模式
### 行为型模式 (11种)
- 策略模式
- 模板方法模式
- 观察者模式
- 迭代子模式
- 责任链模式
- 命令模式
- 备忘录模式
- 状态模式
- 访问者模式
- 中介者模式
- 解释器模式
---
## 六大原则
### 开闭原则
>对拓展开放,对修改关闭
### 里氏替换原则
>父类出现的地方,都可以替换成子类  
>包含四层含义:
>- 子类可以实现父类的抽象方法，但是不能覆盖父类的非抽象方法
>- 子类可以增加自己特有的方法
>- 子类覆盖或实现父类方法时,方法参数要比父类方法更宽松
>- 子类方法实现父类抽象方法时,返回值要比父类更严格
### 依赖倒置原则
>真正面向抽象编程,而不是依赖具体  
>即高层模块不应依赖低层模块,二者都应该依赖其抽象;抽象不应该依赖细节;细节应该依赖抽象
### 接口隔离原则
>多个隔离的接口比单一的接口要好  
>即接口应该尽量小,不相关的接口隔离开,不要糅合在一起
### 迪米特法则
>最少知道原则,一个类尽量少的和其他类发生相互作用  
>两点要义:
>- 被依赖者来讲:只暴露必要的方法或属性
>- 依赖者来讲:只依赖应该依赖的对象
### 单一职责原则
>一个类只负责一项职责,或者说引起类变化的原因只有一个  