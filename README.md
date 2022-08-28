# DesignPatterns

第一章  策略模式
  策略模式：定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立与使用算法的客户。

  设计原则
   1. 把变化（鸭子的飞和呱呱的叫的行为）的部分取出来，封装起来，好让其他部分不会受到影响。这样代码会变少，系统更具有弹性。
   2. 针对接口编程，不是针对实现编程。（鸭子的飞和呱呱的叫的行为是两个接口）
   3. 多用组合，少用继承

