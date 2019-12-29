package cn.wsyjlly.quartz;

import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 14:40
 **/

public class ScheduleDemo3 extends QuartzJobBean {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext){
        System.out.println("ScheduleDemo3.executeInternal..."+name);
    }
}
