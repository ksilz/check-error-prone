package com.betterprojectsfaster.test.errorprone.lombokErrorProne;

import com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch.Attachment;
import com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch.EAttachmentParent;
import com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch.IProcessor;
import com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch.Parent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SuppressWarnings("PrivateConstructorForUtilityClass")
@Slf4j
@SpringBootApplication
public class LombokErrorProneApplication {

  private final IProcessor processor;

  public LombokErrorProneApplication(IProcessor processor) {
    this.processor = processor;
  }

  public static void main(String[] args) {
    SpringApplication.run(LombokErrorProneApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void doSomethingAfterStartup() {

    Parent parameter = new Parent(EAttachmentParent.VISIT, 49L);
    Attachment attachment = new Attachment(parameter);

    String result = this.processor.showIssue(attachment);

    log.info(result);
  }
}
