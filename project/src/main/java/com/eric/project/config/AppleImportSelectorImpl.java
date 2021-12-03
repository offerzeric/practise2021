package com.eric.project.config;


import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description
 *
 * @author ericzhang 2021/11/14 5:09 下午
 */
public class AppleImportSelectorImpl implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{};
    }
}
