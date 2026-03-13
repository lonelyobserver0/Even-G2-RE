package org.bouncycastle.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface StringList extends Iterable<String> {
    boolean add(String str);

    String get(int i3);

    int size();

    String[] toStringArray();

    String[] toStringArray(int i3, int i10);
}
