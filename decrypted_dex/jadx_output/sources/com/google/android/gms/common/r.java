package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends q {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f11213g;

    public r(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f11213g = bArr;
    }

    @Override // com.google.android.gms.common.q
    public final byte[] O() {
        return this.f11213g;
    }
}
