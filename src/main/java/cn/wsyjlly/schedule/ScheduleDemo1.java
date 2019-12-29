package cn.wsyjlly.schedule;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 10:25
 **/
@Component
@EnableAsync
public class ScheduleDemo1 {
    private AtomicInteger number = new AtomicInteger();
    /*@Scheduled(
            initialDelay = 5000,        //第一次执行前延迟的毫秒数
            initialDelayString = "5000",    //同上面作用一样，只是String类型
            fixedDelay = 50000,         //在最后一次调用结束和下一次调用开始之间以固定周期（以毫秒为单位）执行带注释的方法。（要等待上次任务完成后）
            fixedDelayString = "50000",      //同上面作用一样，只是String类型
            fixedRate = 5000,           //在调用之间以固定的周期（以毫秒为单位）执行带注释的方法。（不需要等待上次任务完成）
            fixedRateString = "5000",       //同上面作用一样，只是String类型
            cron = "",                  //一个类似cron的表达式，扩展了通常的UN * X定义，包括秒，分，时，星期，月，年的触发器。
            zone = ""                   //指明解析cron表达式的时区
    )
    public void schedule(){
        System.out.println("task-schedule...");
    }*/


//    @Scheduled(cron = "0-20/10 * * * * ?")
    @Async
    public void schedule(){
        System.out.println("task-schedule...");
    }



//    @Scheduled(fixedRate = 5000,initialDelay = 3000)
    @Async
    public void job(){

        LocalTime start = LocalTime.now();
        //前面和末尾几个字符串是用来改变打印的颜色的
        System.out.println("\033[36;4m" + Thread.currentThread() + " start " + number.incrementAndGet()
                + " @ " + start + "\033[0m");
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(15)*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalTime end = LocalTime.now();

        System.out.println(Thread.currentThread() + " end " + number.get() + " @ "+
                end + ", seconds cost "+ (ChronoUnit.SECONDS.between(start, end)));
    }
}
