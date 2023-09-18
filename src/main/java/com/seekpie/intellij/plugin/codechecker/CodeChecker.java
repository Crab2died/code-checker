package com.seekpie.intellij.plugin.codechecker;

import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.JavaElementVisitor;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiMethod;
import org.jetbrains.annotations.NotNull;

public class CodeChecker extends LocalInspectionTool {


    @Override
    public @NotNull PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {

        return super.buildVisitor(holder, isOnTheFly);
    }

    public class JavaMethodVisitor extends JavaElementVisitor {

        @Override
        public void visitMethod(PsiMethod method) {
            super.visitMethod(method);
        }

    }
}
