package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PointProj {

    /* renamed from: X, reason: collision with root package name */
    long[][] f19464X;

    /* renamed from: Z, reason: collision with root package name */
    long[][] f19465Z;

    public PointProj(int i3) {
        Class cls = Long.TYPE;
        this.f19464X = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
        this.f19465Z = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
    }
}
