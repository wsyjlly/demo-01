package cn.wsyjlly.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.*;

/**
 * @author wsyjlly
 * @create 2019.07.17 - 14:47
 **/
//@Configuration
public class QuartzConfig {

    @Bean
    MethodInvokingJobDetailFactoryBean jobDetail1(){
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        bean.setTargetBeanName("scheduleDemo2");
        bean.setTargetMethod("schedule");
        return bean;
    }

    @Bean
    JobDetailFactoryBean jobDetail2(){
        JobDetailFactoryBean bean = new JobDetailFactoryBean();
        bean.setJobClass(ScheduleDemo3.class);
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","ysw");
        bean.setJobDataMap(jobDataMap);
        bean.setDurability(true);
        return bean;
    }

    @Bean
    SimpleTriggerFactoryBean simpleTrigger(){
        SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
        bean.setJobDetail(jobDetail1().getObject());
        bean.setRepeatCount(3);
        bean.setStartDelay(1000);
        bean.setRepeatInterval(2000);
        return bean;
    }

    @Bean
    CronTriggerFactoryBean cronTrigger(){
        CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
        bean.setJobDetail(jobDetail2().getObject());
        bean.setCronExpression("* * * * * ?");
        return bean;
    }

    @Bean
    SchedulerFactoryBean schedulerFactory(){
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        SimpleTrigger simpleTrigger = simpleTrigger().getObject();
        CronTrigger cronTrigger = cronTrigger().getObject();
        bean.setTriggers(simpleTrigger,cronTrigger);
        return bean;
    }
}
