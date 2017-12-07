package analyzer.old.lexical.test;

import java.util.LinkedList;

/**
 * Created by David on 13/06/2016.
 */
public class AllList {

    public static void main(String[] args) {
        LinkedList<Integer> levels = new LinkedList<>();

        levels.add(1);
        System.out.println(levels.getFirst());

        levels.add(0);
        System.out.println(levels.getFirst());

        System.out.println("====================================");
        for (Integer integer: levels) {
            System.out.println(integer);
        }
    }
}
