package com.google.android.gms.internal.measurement;

import com.stub.StubApp;

/* renamed from: com.google.android.gms.internal.measurement.a2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0589a2 extends C0594b2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f11444d;

    public C0589a2(byte[] bArr, int i3) {
        super(bArr);
        C0594b2.f(0, i3, bArr.length);
        this.f11444d = i3;
    }

    @Override // com.google.android.gms.internal.measurement.C0594b2
    public final byte a(int i3) {
        int i10 = this.f11444d;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.f11455b[i3];
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 11);
            sb2.append(StubApp.getString2(11882));
            sb2.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 18 + String.valueOf(i10).length());
        sb3.append(StubApp.getString2(11883));
        sb3.append(i3);
        sb3.append(StubApp.getString2(81));
        sb3.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.C0594b2
    public final byte b(int i3) {
        return this.f11455b[i3];
    }

    @Override // com.google.android.gms.internal.measurement.C0594b2
    public final int c() {
        return this.f11444d;
    }
}
