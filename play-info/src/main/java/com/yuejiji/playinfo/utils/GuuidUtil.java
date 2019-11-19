package com.yuejiji.playinfo.utils;


import org.springframework.beans.factory.annotation.Value;

public class GuuidUtil {
    @Value("${IdWorker.machineId}")
    private static long machineId;
    @Value("${IdWorker.workerId}")
    private static long datacenterId;

    /**
     * 单例模式创建学法算法对象
     * */
    private enum SnowFlakeSingleton{
        Singleton;
        private SnowFlake snowFlake;
        SnowFlakeSingleton(){
            snowFlake = new SnowFlake(datacenterId,machineId);
        }
        public SnowFlake getInstance(){
            return snowFlake;
        }
    }


    public static long getUUID(){
        return SnowFlakeSingleton.Singleton.getInstance().nextId();
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(GuuidUtil.getUUID());
        }
        System.out.print("雪花算法用时： ");
        System.out.println(System.currentTimeMillis() - start);

    }

}
