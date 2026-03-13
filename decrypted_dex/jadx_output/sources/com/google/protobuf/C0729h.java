package com.google.protobuf;

import com.stub.StubApp;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0729h extends C0731i {

    /* renamed from: e, reason: collision with root package name */
    public final int f12155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12156f;

    public C0729h(byte[] bArr, int i3, int i10) {
        super(bArr);
        AbstractC0733j.b(i3, i3 + i10, bArr.length);
        this.f12155e = i3;
        this.f12156f = i10;
    }

    @Override // com.google.protobuf.C0731i, com.google.protobuf.AbstractC0733j
    public final byte a(int i3) {
        int i10 = this.f12156f;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.f12157d[this.f12155e + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2.u.p(i3, StubApp.getString2(11882)));
        }
        throw new ArrayIndexOutOfBoundsException(Xa.h.o(StubApp.getString2(11883), i3, i10, StubApp.getString2(81)));
    }

    @Override // com.google.protobuf.C0731i, com.google.protobuf.AbstractC0733j
    public final byte f(int i3) {
        return this.f12157d[this.f12155e + i3];
    }

    @Override // com.google.protobuf.C0731i
    public final int p() {
        return this.f12155e;
    }

    @Override // com.google.protobuf.C0731i, com.google.protobuf.AbstractC0733j
    public final int size() {
        return this.f12156f;
    }
}
