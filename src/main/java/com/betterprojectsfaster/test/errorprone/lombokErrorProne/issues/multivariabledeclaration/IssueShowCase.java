package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.multivariabledeclaration;

import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("AlmostJavadoc")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IssueShowCase {
  private Long id;
  private String createdBy;
  private Instant createdDate;
  private String lastModifiedBy;
  private Instant lastModifiedDate;
  private boolean deleted;
  private short version;
}
