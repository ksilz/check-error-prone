package com.betterprojectsfaster.test.errorprone.lombokErrorProne.issues.missingoverride;

import lombok.EqualsAndHashCode;
import lombok.Value;

@SuppressWarnings({"AlmostJavadoc", "MultiVariableDeclaration", "Var"})
@Value
@EqualsAndHashCode(callSuper = true)
public class IssueShowCase extends Base {}
