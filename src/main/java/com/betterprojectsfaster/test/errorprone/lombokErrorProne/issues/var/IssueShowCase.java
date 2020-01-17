package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.var;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings({"AlmostJavadoc", "MultiVariableDeclaration"})
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IssueShowCase {
  private Long id;
}
