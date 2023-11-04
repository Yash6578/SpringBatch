package com.learn.springbatch.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JobController {
    private final JobLauncher jobLauncher;
    private final Job job;

    @GetMapping("/import")
    public void loadDataToDB() throws Exception{
        JobParameters jobParams = new JobParametersBuilder()
                .addLong("startAt", System.currentTimeMillis()).toJobParameters();

        jobLauncher.run(job, jobParams);
    }
}
