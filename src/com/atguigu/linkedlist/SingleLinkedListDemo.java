
package com.atguigu.linkedlist;

import java.security.PublicKey;

/**
 *  代码实现单链表结构
 * @author ：wangsg
 * @date ： 2020/6/9 12:08
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "宋江","及时雨");
        HeroNode heroNode3 = new HeroNode(3, "吴用","智多星");
        HeroNode heroNode2 = new HeroNode(2, "卢俊义","玉麒麟");

        HeroNode heroNode4 = new HeroNode(4, "林冲","豹子头");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(heroNode1);
        singleLinkedList.add(heroNode2);
        singleLinkedList.add(heroNode3);
        singleLinkedList.add(heroNode4);

        singleLinkedList.list();


    }

}
// 定义list 管理英雄
/**
 *  后面每添加一个直接加到链表最后
 *
 */
class SingleLinkedList{
    //定义一个头节点，头节点不要动
    private  HeroNode head = new HeroNode(0,"","");
    //当不考虑编号的顺序时，找到链表的最后一个节点， 将最后一个节点的next 指向新节点
    public  void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            if(temp.next == null){
                break;//找到链表的最后
            }
            temp = temp.next;
        }
        //将最后这个节点的next 指向新节点
        temp.next = heroNode;
    }
    //显示连接 [遍历]
    public void list(){
        if(head.next ==null){
            System.out.println("链表为空");
            return;
        }
       HeroNode temp = head.next;
        while (true){
            //判断是否到链表最后
            if(temp == null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            temp = temp.next;
        }
    }
    //第二种方式添加英雄 ， 根据排名蒋英雄按顺序插入
    public  void addOrder(HeroNode heroNode){
        //因为对象头不能动 ，添加临时变量
        HeroNode temp = head;
        boolean flag = false;
        while (true){

        }

    }


}

//定义heroNode 节点，
class HeroNode{
    public int no ;
    public String name;
    public String nikename;
    public HeroNode next;//指向下一个节点

    public HeroNode(int no, String name, String nikename){
        this.name= name;
        this.no = no;
        this.nikename = nikename;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikename='" + nikename + '\'' +
                '}';
    }
}