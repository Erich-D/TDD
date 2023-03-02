package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {
        return numbers.stream().max((i,j)->i.compareTo(j)).get();
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {

        return numbers.stream().max((i,j)->j.compareTo(i)).get();
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {
        List<Integer> results = numbers.stream().filter(n->n<target).collect(Collectors.toList());
        results.stream().forEach(i-> numbers.remove(i));
    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        List<Integer> results = numbers.stream().filter(n->n>target).collect(Collectors.toList());
        results.stream().forEach(i-> numbers.remove(i));
    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        int cnt = strings.size()/2;
        while (strings.size()>cnt){
            strings.poll();
        }
    }
}
