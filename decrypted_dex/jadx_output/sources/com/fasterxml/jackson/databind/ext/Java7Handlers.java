package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Java7Handlers {
    static {
        try {
            if (ClassUtil.createInstance(Java7HandlersImpl.class, false) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (Throwable unused) {
        }
    }

    public static Java7Handlers instance() {
        return null;
    }
}
