package live;

import java.util.Stack;

/**
 * 1. inBox �� �����͸� push(����)�Ѵ�. - A,B

2. inBox �� �ִ� �����͸� pop(����) �Ͽ� outBox �� push(����) �Ѵ�. - B,A

3. outBox �� �ִ� �����͸� pop(����) �Ѵ�. - A,B ������ ��µ�


 * @author men16
 *
 */
public class live_2stackqueue {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
class Queue<T> {
	  Stack<T> stack1 = new Stack<>();
	  Stack<T> stack2 = new Stack<>();

	  private void moveIfAbsent() {
	    if (stack2.size() == 0)
	      while (stack1.size() != 0)
	        stack2.add(stack1.pop());
	  }

	  public void add(T t) {
	    stack1.add(t);
	  }

	  public T peek() {
	    moveIfAbsent();
	    return stack2.peek();
	  }

	  public T poll() {
	    moveIfAbsent();
	    return stack2.pop();
	  }

	  public int size() {
	    return stack1.size() + stack2.size();
	  }
	}