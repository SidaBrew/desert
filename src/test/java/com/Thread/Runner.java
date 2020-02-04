package com.Thread;

class  Runner implements  Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<100;i++)
        {
            try{
                Thread.sleep(100);
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"i="+i);
        }
    }
}