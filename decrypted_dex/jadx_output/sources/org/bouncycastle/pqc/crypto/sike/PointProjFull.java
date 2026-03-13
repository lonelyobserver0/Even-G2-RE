package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class PointProjFull {

    /* renamed from: X, reason: collision with root package name */
    long[][] f19466X;

    /* renamed from: Y, reason: collision with root package name */
    long[][] f19467Y;

    /* renamed from: Z, reason: collision with root package name */
    long[][] f19468Z;

    public PointProjFull(int i3) {
        Class cls = Long.TYPE;
        this.f19466X = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
        this.f19467Y = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
        this.f19468Z = (long[][]) Array.newInstance((Class<?>) cls, 2, i3);
    }
}
