import java.util.*;

public class activity3 {

    public static void main(String[] args) {
        List<Integer> numbersList = new Vector<>(5);
        Stack<Integer> numbersStack = new Stack<>();
        Queue<Integer> numbersQueue = new ArrayDeque<>(10);


        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        numbersStack = fromListToStack(numbersList);
        numbersQueue = fromStackToQueue(numbersStack, numbersQueue);

        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);

        numbersStack = fromListToStack(numbersList);
        numbersQueue = fromStackToQueue(numbersStack, numbersQueue);

        for (Integer number : numbersQueue) {
            System.out.println(number);
        }
    }

    public static Stack<Integer> fromListToStack(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        Integer size = list.size();
        for (int i = 0; i < size; i++) {
            Integer number= list.remove(0);
            stack.add(number);
        }

        return stack;
    }

    public static Queue<Integer> fromStackToQueue(Stack<Integer> stack, Queue<Integer> queue) {

        Integer size = stack.size();
        for (int i = 0; i < size; i++) {
            Integer number = stack.pop();
            queue.add(number);
        }

        return queue;
    }
}
