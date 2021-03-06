/**
 * @notes：清理与垃圾回收
 * 
 * Java对象不一定总被回收
 * 1. 对象可能不被垃圾回收
 * 2. 垃圾回收并不等于析构
 * 3. 垃圾回收只和内存有关
 * 
 * finalize()会用到，是在内存分配时采用了和C类似的做法（通过malloc分配等），而非Java中的通用做法，所以finalize()只会在特定情况下用到，
 * 
 * 另外finalize()可以验证终结条件
 * 
 * 垃圾回收：
 * 
 * (1)其他系统的垃圾回收：引用计数，简单很慢的技术，每个对象都有一个引用计数器，有引用接至对象时计数器加1，当引用离开作用域
 * 或者置为null,计数器减1。垃圾回收器在所有的引用上遍历，计数器为0则释放空间（缺陷：对象之间循环引用会得不到释放，本来应该释放的）
 * (2)更快的模式，“活”的对象一定可以追溯到堆栈或者静态存储区的引用，这个链条可能会穿过多个对象层次。如果从堆栈与静态存储区
 * 开始，遍历所有引用，就能找到所有活的对象（引用找所有的对象，对象找包含的所有的引用，反复进行，直到全部被访问为止）。可解决
 * “交互引用对象组”的问题。在这种方式下采用一种自适应的垃圾回收技术，如何处理活的对象有两种（取决于JVM的实现）：
 * A. 停止-复制：暂停程序运行（不属于后台回收模式），将所有活的对象从当前堆复制到另外一个堆，没被复制的是垃圾。同时新堆可以保持
 * 紧凑排列，当然必须修正对象的引用。
 * B. 标记-清扫：（也要暂停程序运行）遍历所有的引用，找到存活对象设一个标记，标记工作全部完成时开始清理，没有标记的对象将被释放。，但是剩下的对象
 * 空间不是连续的，需要进行重新整理剩下的对象。
 */
package com.lpw.chapter5;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月20日 上午8:19:17
 */
public class MyFinalize {
	public static void main(String[] args) {
		System.out.println("清理与垃圾回收");
	}
}
