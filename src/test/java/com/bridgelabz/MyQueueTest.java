package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3Numbers_InQueueWhenAdded_ShouldPassQueueTest() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode<Integer> myNode = myQueue.peak();
        myQueue.printQueue();
        Assert.assertEquals(myNode, myFirstNode);
    }

    @Test
    public void given3Numbers_InStackWhenPopped_ShouldMatchWithLastAddedNode(){
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode<Integer> dequeueNode = myQueue.dequeue();
        myQueue.printQueue();
        Assert.assertEquals(dequeueNode,myThirdNode);
    }
}
