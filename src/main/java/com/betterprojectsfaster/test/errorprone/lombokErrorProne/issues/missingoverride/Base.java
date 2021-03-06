package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.missingoverride;

import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings({"AlmostJavadoc", "MultiVariableDeclaration", "Var"})
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Base {
  private Long id;
  private String createdBy;
  private Instant createdDate;
  private String lastModifiedBy;
  private Instant lastModifiedDate;
  private boolean deleted;
  private short version;
}
