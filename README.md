# 设计模式学习记录
## 创建型
## 结构型
>处理**类**和**对象**的组合,以形成更大的结构
### 适配器模式
>**作用**:将一个接口转换成客户期望的另一个接口  
>**动机**:现有的类提供与需求相同或类似的功能, 但提供的接口不兼容, 又不能或不方便修改时  
>**特征**:增加一个新的类来解决接口不兼容  
>**场景**:别人的写的类你要用,第三方类等  
>**经验**:软件设计之初很少涉及适配器模式,一般出现在不断迭代过程中遇到相似需求时使用  
#### 适配器模式中的角色
>Target : 目标接口,客户需要的新接口  
>Adaptee : 适配者类,包含实现用户需求的的业务 , 但不够兼容  
>Adapter : 适配器类,对适配者进行调节,以提供用户需要的接口
#### 类适配器
>适配器模式通常分为类适配器和对象适配器  
>类适配器实现Target接口,继承Adaptee类  
>优点:作为适配者类的子类, 可以方便的置换父类方法
#### 对象适配器
>对象适配器实现Target接口,以组合方式引用Adaptee类  
>优点:可以适配多个适配者  
>类适配器与对象适配器只在引入Adaptee类上有区别, 因此产生了不同的优点
---
### 外观模式 (门面模式)
>在子系统和客户端间增加外观角色,客户端只与外观对象交互,由外观对象调用相应子系统功能  
>**作用**:简化客户端与子系统的交互,是客户端与子系统解耦(封装交互,简化调用)   
>**场景**:子系统较复杂/客户端与多个子系统存在很大的依赖/层次化结构等  
>**经验**:外观模式是使用频率很高的一种对象结构型模式,(web开发中controller,service,dao三层架构是外观模式)  
>**优点**:减少客户端交互的对象数,简化客户端代码;客户端与子系统松耦合等  
>**缺点**:客户端对子系统细节知之甚少,减少了灵活性;子系统的修改可能导致外观类的修改
#### 外观模式中的角色
>Facade: 外观角色,可关联一个/多个子系统,客户端可调用它的方法,它将请求委派给对应的子系统处理  
>SubSysterm: 子系统角色,是类的集合,实现子系统的功能,可以直接被客户端/外观类调用,实际上外观类也是个客户端而已
---
### 组合模式 (整体-部分模式)
>树形结构问题中,让叶子和枝干节点继承统一的接口,使客户端可以一致的处理俩类节点,无需区分
>**作用**:对叶子对象和容器对象一致性处理,简化程序  
>**场景**:文件系统,xml解析等树状结构问题中都可能用到  
>**经验**:面对树形结构是考虑使用(感觉自己没怎么用过这模式)  
#### 组合模式中角色
>Component: 抽象构件,可以试接口或抽象类,为叶子节点和枝干节点声明接口  
>Leaf: 叶子构件(叶子节点),没有子节点,继承抽象构件  
>Composite: 容器构件(枝干节点),可以包含容器节点和叶子节点,继承抽象构件,提供一个子节点集合
#### 透明组合模式 和 安全组合模式
>透明组合模式,抽象构件中声明所有用于管理成员对象的方法(如例子中的add,remove等),使任何构件类都有相同的接口  
>>当叶子构件错误调用这些方法可能报错  
>
>安全组合模式,抽象构件中不声明任何用于管理成员对象的方法,只在容器构件中声明  
>>这使得客户端不能只针对抽象构件编程,还是要区分叶子和容器构件
---
### 桥接模式(桥梁模式) [这个模式理解不好 , TODO]
>将抽象化和实现化解耦,使两者独立变化  
>这里的抽象/实现不是指抽象类 , 继承接口等 , 而是代表了两个不同维度.桥接模式就是把一个对象中两个不同的变化维度拆分
>(我感觉这个模式不太好懂,要正确的区分两个维度挺难的,画笔的例子也比较一般,最经典的时JDBC中的运用)  
#### 桥接模式中的角色
>Abstraction:抽象化角色,一般为持有一个Implementor引用的抽象类,主要定义如何使用Implementor对象的方法  
>RefinedAbstraction:修正抽象,具体实现Abstraction,并进行完善和拓展  
>Implementor:实现化角色,一般为接口或抽象类,定义实现维度的接口给Abstraction使用  
>ConcreteImplementor:具体实现化角色,具体实现Implementor  
>**代码特征**:抽象角色引用实现角色,抽象角色的方法需要调用实现角色的接口
## 行为型