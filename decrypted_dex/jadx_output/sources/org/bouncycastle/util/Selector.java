package org.bouncycastle.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Selector<T> extends Cloneable {
    Object clone();

    boolean match(T t3);
}
