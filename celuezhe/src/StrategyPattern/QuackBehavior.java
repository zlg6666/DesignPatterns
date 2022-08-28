package StrategyPattern;

/**
 * 变化的部分
 * 所有的呱呱叫行为必须实现该接口
 */
public interface QuackBehavior {
    public void quack();
}
