package com.harunugur.schedule.jobs;

import com.harunugur.schedule.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTasksService {

    @Autowired
    EmailService emailService;

    @Scheduled(fixedRate = 5000)
    public void fixedRate() throws IOException, MessagingException {
        emailService.sendmail();
        System.out.println(Thread.currentThread().getName()+" Task 1 executed at "+ new Date());
    }

    @Scheduled(cron="*/20 * * * * *", zone="Europe/Istanbul")
    public void cron() {
        System.out.println(Thread.currentThread().getName()+" Task 2 executed at "+ new Date());
    }

    @Scheduled(fixedDelay = 3000, initialDelay = 3000)
    public void fixedDelaySch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Fixed Delay scheduler:: " + sdf.format(new Date()));
    }
}
