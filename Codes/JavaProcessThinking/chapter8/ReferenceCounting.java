/**
 * @notes：计数器清理对象
 * 
 * 当成员对象存在于其他一个或者多个对象共享的情况，需要使用计数器跟踪仍旧访问的共享对象数量，当计数器为0时即可dispose
 */
package com.lpw.chapter8;

/**
 * @author lpw
 * @version 1.0
 * @Time 2020年9月17日 上午9:46:58
 */
class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		System.out.println("Creating " + this);
	}

	// 被创建时数量加1
	public void addRef() {
		refcount++;
	}

	// 当数量为0时才能销毁
	protected void dispose() {
		if (--refcount == 0) {
			System.out.println("Disposing " + this);
		}
	}

	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared share;
	// 用来计算共享对象实例数量
	private static int counter = 0;
	private final long id = counter++; // 不希望再对象周期被改变

	public Composing(Shared share) {
		System.out.println("Creating " + this);
		this.share = share;
		this.share.addRef();// 一旦创建共享对象，则必须调用使得counter++
	}

	protected void Disposing() {
		System.out.println("Disposing " + this);
		share.dispose();//成员对象销毁
	}

	public String toString() {
		return "Composing " + id;
	}

}

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared share = new Shared();
		// 创建多个共享对象，销毁一次仍旧被其他对象使用，故共享对象暂时不能被销毁
		Composing[] com = { new Composing(share), new Composing(share), new Composing(share), new Composing(share),
				new Composing(share) };
		for (Composing c : com) {
			c.Disposing();
		}
	}
}
