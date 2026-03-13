package com.fasterxml.jackson.databind.util;

import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NativeImageUtil {
    private static final boolean RUNNING_IN_SVM;

    static {
        RUNNING_IN_SVM = System.getProperty(StubApp.getString2(11106)) != null;
    }

    private static boolean isRunningInNativeImage() {
        if (RUNNING_IN_SVM) {
            return StubApp.getString2(11107).equals(System.getProperty(StubApp.getString2(11106)));
        }
        return false;
    }

    public static boolean isUnsupportedFeatureError(Throwable th) {
        if (!isRunningInNativeImage()) {
            return false;
        }
        if (th instanceof InvocationTargetException) {
            th = th.getCause();
        }
        return th.getClass().getName().equals(StubApp.getString2(11108));
    }

    public static boolean needsReflectionConfiguration(Class<?> cls) {
        if (isRunningInNativeImage()) {
            return (cls.getDeclaredFields().length == 0 || ClassUtil.isRecordType(cls)) && cls.getDeclaredMethods().length == 0 && cls.getDeclaredConstructors().length == 0;
        }
        return false;
    }
}
