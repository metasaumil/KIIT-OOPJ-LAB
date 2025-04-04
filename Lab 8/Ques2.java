class Ques2 extends Thread {
    private final String threadName;
    private final String[] words = {"I", "Love", "java", "Very", "Much"};

    public Ques2(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (String word : words) {
            System.out.println(threadName + ": " + word);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        Ques2 t1 = new Ques2("Thread 1");
        Ques2 t2 = new Ques2("Thread 2");

        t1.start();
        t2.start();
    }
}