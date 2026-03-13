package com.fasterxml.jackson.databind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface JsonPOJOBuilder {

    public static class Value {
        public final String buildMethodName;
        public final String withPrefix;

        public Value(JsonPOJOBuilder jsonPOJOBuilder) {
            this(jsonPOJOBuilder.buildMethodName(), jsonPOJOBuilder.withPrefix());
        }

        public Value(String str, String str2) {
            this.buildMethodName = str;
            this.withPrefix = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
