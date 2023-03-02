package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class CollectionTest {
    Integer[] nums = new Integer[]{7, 8, 9, 4, 5, 6, 1, 2, 3};
    List<Integer> list;
    Set<Integer> set;
    Queue<String> que;

    @Test
    public void testFindMax(){
        list = new ArrayList<>(Arrays.asList(nums));
        int max = Collection.findMax(list);
        Assert.assertEquals(9,max);
    }

    @Test
    public void testFindMin(){
        list = new ArrayList<>(Arrays.asList(nums));
        int min = Collection.findMin(list);
        Assert.assertEquals(1,min);
    }

    @Test
    public void testRemoveLessThan(){
        set = new HashSet<>(Arrays.asList(nums));
        Collection.removeLessThan(set,6);
        Assert.assertFalse(set.contains((Integer) 1));
        Assert.assertFalse(set.contains((Integer) 2));
        Assert.assertFalse(set.contains((Integer) 3));
        Assert.assertFalse(set.contains((Integer) 4));
        Assert.assertFalse(set.contains((Integer) 5));
        Assert.assertTrue(set.contains((Integer) 6));
        Assert.assertTrue(set.contains((Integer) 7));
        Assert.assertTrue(set.contains((Integer) 8));
        Assert.assertTrue(set.contains((Integer) 9));
    }

    @Test
    public void testRemoveGreaterThan(){
        set = new HashSet<>(Arrays.asList(nums));
        Collection.removeGreaterThan(set,6);
        Assert.assertTrue(set.contains((Integer) 1));
        Assert.assertTrue(set.contains((Integer) 2));
        Assert.assertTrue(set.contains((Integer) 3));
        Assert.assertTrue(set.contains((Integer) 4));
        Assert.assertTrue(set.contains((Integer) 5));
        Assert.assertTrue(set.contains((Integer) 6));
        Assert.assertFalse(set.contains((Integer) 7));
        Assert.assertFalse(set.contains((Integer) 8));
        Assert.assertFalse(set.contains((Integer) 9));

    }
    @Test
    public void testRemoveHalf(){
        que = new LinkedList<>();
        que.add("blue");
        que.add("red");
        que.add("purple");
        que.add("green");
        que.add("yellow");
        que.add("aqua");
        que.add("brown");
        int cnt = que.size()/2;
        Collection.removeHalf(que);
        Assert.assertEquals(cnt,que.size());
    }

}
