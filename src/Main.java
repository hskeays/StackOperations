public class Main {
    public static void main(String[] args) {
        int plate = 25;
        LinkedStack lottaPlates = new LinkedStack();

        for (int i = plate; i < 150; i++) {
            lottaPlates.push(i + 5);
        }

        if (lottaPlates.isEmpty()) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("Peeking at the top = " + lottaPlates.peek());
            System.out.println("Size of the stack = " + lottaPlates.size());
            System.out.println("Popping the top = " + lottaPlates.pop());
        }

        for (int j = lottaPlates.size(); j >= 50; j--) {
            System.out.println(lottaPlates.size());
            lottaPlates.pop();
        }
    }
}