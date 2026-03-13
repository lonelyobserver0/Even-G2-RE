package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.stub.StubApp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BeanUtil {
    public static String checkUnsupportedType(JavaType javaType) {
        String string2;
        String string22;
        String name = javaType.getRawClass().getName();
        if (isJava8TimeClass(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            string2 = StubApp.getString2(11059);
            string22 = StubApp.getString2(11060);
        } else {
            if (!isJodaTimeClass(name)) {
                return null;
            }
            string2 = StubApp.getString2(11061);
            string22 = StubApp.getString2(11062);
        }
        return string2 + StubApp.getString2(11063) + ClassUtil.getTypeDescription(javaType) + StubApp.getString2(11064) + string22 + StubApp.getString2(11065);
    }

    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> primitiveType = ClassUtil.primitiveType(rawClass);
        if (primitiveType != null) {
            return ClassUtil.defaultValue(primitiveType);
        }
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        }
        if (rawClass == String.class) {
            return "";
        }
        if (javaType.isTypeOrSubTypeOf(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    private static boolean isJava8TimeClass(String str) {
        return str.startsWith(StubApp.getString2(11066));
    }

    private static boolean isJodaTimeClass(String str) {
        return str.startsWith(StubApp.getString2(11067));
    }
}
