package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface Annotations {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
