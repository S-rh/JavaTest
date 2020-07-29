package com.mypackage.java.demo;

class BaoZi {
    String pier ;
    String xianer ;
    boolean flag = false ;//包子资源 是否存在 包子资源状态
}

class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(String name,BaoZi bz){
        super(name);
        this.bz = bz;
    }
    @Override
    public void run() {
        while(true){
            synchronized (bz){
                if(bz.flag == false){//没包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pier+bz.xianer+"包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}

class BaoZiPu extends Thread {
    private BaoZi bz;
    public BaoZiPu(String name,BaoZi bz) {
        super(name);
        this.bz = bz;
    }
    @Override
    public void run() {
        int count = 0;
        //造包子
        while (true) {
            //同步
            synchronized (bz) {
                if(bz.flag == true){//包子资源 存在
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 没有包子 造包子
                System.out.println("包子铺开始做包子");
                if (count%2 == 0) {
                    // 冰皮 五仁
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                } else {
                    // 薄皮 牛肉大葱
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                bz.flag = true;
                System.out.println("包子造好了：" + bz.pier+bz.xianer);
                System.out.println("吃货来吃吧");
                //唤醒等待线程 （吃货）
                bz.notify();
            }
        }
    }
}

public class WaitNotifyDemo {

    public static void main(String[] args) {
        //等待唤醒案例
        BaoZi bz = new BaoZi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();
    }

}


