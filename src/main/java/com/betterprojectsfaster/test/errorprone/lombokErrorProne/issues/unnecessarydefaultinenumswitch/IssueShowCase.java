package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch;

import com.google.errorprone.annotations.Var;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

@SuppressWarnings("UnusedVariable")
@RequiredArgsConstructor
@Slf4j
@ToString
@Service
public class IssueShowCase implements IProcessor {

  @Override
  @Nullable
  public String showIssue(Attachment attachment) {
    @Var String feedback = null;
    Parent parent = attachment.getParent();

    switch (parent.getParent()) {
      case VISIT:
        feedback = "I got a visit";
        break;

      default:
        feedback = "I got a default";
        break;
    }

    return feedback;
  }
}
