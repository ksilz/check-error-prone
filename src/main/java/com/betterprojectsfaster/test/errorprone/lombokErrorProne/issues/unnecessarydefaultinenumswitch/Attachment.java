package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.unnecessarydefaultinenumswitch;

import lombok.NonNull;
import lombok.Value;

@SuppressWarnings({"AlmostJavadoc", "MultiVariableDeclaration", "MissingOverride", "Var"})
@Value
public class Attachment {
  @NonNull Parent parent;
}
