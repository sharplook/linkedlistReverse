package com.example;
/**
 *  第一种方法: 头插法
 */
public class LinkedListReverse1 {


    private  static Node headInsertReverse(Node head) {
        //新的头节点
        Node newHead = new Node();

        //防止断链
        Node next;
        while( head != null ){
            //将链表next赋值
            next = head.next;
            //
            head.next = newHead.next;
            newHead.next = head;

            head = next;
        }

        //输出反转后的节点
        return newHead.next;
    }


    public static void main(String[] args) {
        Node node =  new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node4.next=node5;
        node3.next=node4;
        node2.next=node3;
        node.next =node2;

        /**
         * 正常顺序输出
         */
        Node listNode =node;
        System.out.println("顺序输出:");
        while( listNode!=null){

            System.out.println(listNode.value);
            listNode = listNode.next;
        }

       Node ret = headInsertReverse(node);


        System.out.println("逆序输出:");
        while(ret !=null){
            System.out.println(ret.value);
            ret = ret.next;
        }
    }
}
