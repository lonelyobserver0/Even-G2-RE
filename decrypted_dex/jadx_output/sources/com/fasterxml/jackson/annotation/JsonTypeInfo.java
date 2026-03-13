package com.fasterxml.jackson.annotation;

import com.stub.StubApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface JsonTypeInfo {

    public enum As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    public enum Id {
        NONE(null),
        CLASS(StubApp.getString2(10210)),
        MINIMAL_CLASS(StubApp.getString2(10212)),
        NAME(StubApp.getString2(10214)),
        DEDUCTION(null),
        CUSTOM(null);

        private final String _defaultPropertyName;

        Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    @Deprecated
    public static abstract class None {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    As include() default As.PROPERTY;

    String property() default "";

    Id use();

    boolean visible() default false;
}
