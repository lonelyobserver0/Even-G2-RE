package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.Linked;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
interface Linked<T extends Linked<T>> {
    T getNext();

    T getPrevious();

    void setNext(T t3);

    void setPrevious(T t3);
}
