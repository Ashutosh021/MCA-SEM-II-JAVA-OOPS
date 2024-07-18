// Implement three classes: Storage, Counter and Printer
// The Storage class should store an integer.
// The Counter class should create a thread and starts counting from 0 (0,1,2, 3 ...) and stores each value in the
// Storage class.
// The Printer class should create a thread that keeps reading the value in the Storage class and printing it.
// Write a program that creates an instance of the Storage class and set up a Counter and Printer object to
// operate on it.

class Counter implements Runnable {

    Storage st;

    public Counter(Storage store) {
        st = store;
    }

    @Override
    public void run() {
        synchronized (st) {
            for (int i = 0; i < 10; i++) {
                while (!st.isPrinted()) {
                    // loop to take care of spontaneous wake-ups
                    try {
                        st.wait();
                    } catch (Exception e) {
                    }
                }
                st.setValue(i);
                st.setPrinted(false);
                st.notify();
            }
        }
    }
}

class Printer implements Runnable {
    Storage st;

    public Printer(Storage st) {
        this.st = st;
    }

    @Override
    public void run() {
        synchronized (st) {
            for (int i = 0; i < 10; i++) {
                while (st.isPrinted()) {
                    // loop to take care of spontaneous wake-ups
                    try {
                        st.wait();
                    } catch (Exception e) {
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " +
                        st.getValue());
                st.setPrinted(true);
                st.notify();
            }
        }
    }

}

class Storage {
    int i;
    boolean printed = true;

    public void setValue(int i) {
        this.i = i;
    }

    public int getValue() {
        return this.i;
    }

    public boolean isPrinted() {
        return printed;
    }

    public void setPrinted(boolean p) {
        printed = p;
    }
}

class prg4 {
    public static void main(String[] args) {
    Storage st = new Storage();
    Counter c = new Counter(st);
    Printer p = new Printer(st);
    new Thread(c,"Counter").start(); //start the counter
    new Thread(p,"Printer").start(); //start the printer
    }
}