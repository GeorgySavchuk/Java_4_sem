package practice3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {
    public static void main(String[] args) {
        testSyncList();
        testList();
        testSemSet();
        testSet();
    }
    public static void testSyncList() {
        SyncList<Integer> syncList = new SyncList<>();
        Runnable task = () -> {
            for(int i = 0; i < 5000; i++) {
                syncList.add(i);
            }
        };
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            threads.add(new Thread(task));
        }
        threads.forEach(Thread::start);
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("SyncList size: " + syncList.size());
    }
    public static void testList() {
        List<Integer> list = new ArrayList<>();
        Runnable task2 = () -> {
            for(int i = 0; i < 5000; i++) {
                list.add(i);
            }
        };
        List<Thread> threads2 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            threads2.add(new Thread(task2));
        }
        threads2.forEach(Thread::start);
        threads2.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("List size: " + list.size());
    }
    public static void testSemSet(){
        SemSet<Integer> semSet = new SemSet<>();
        Runnable task3 = () -> {
            for(int i = 0; i < 5000; i++) {
                try {
                    semSet.add(i);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        List<Thread> threads3 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            threads3.add(new Thread(task3));
        }
        threads3.forEach(Thread::start);
        threads3.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            System.out.println("SemSet size: " + semSet.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void testSet() {
        Set<Integer> set = new HashSet<>();
        Runnable task4 = () -> {
            for(int i = 0; i < 5000; i++) {
                set.add(i);
            }
        };
        List<Thread> threads4 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            threads4.add(new Thread(task4));
        }
        threads4.forEach(Thread::start);
        threads4.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Set size: " + set.size());
    }
}
