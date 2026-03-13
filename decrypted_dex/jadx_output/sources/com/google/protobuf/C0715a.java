package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0715a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f12137a;

    public C0715a(InputStream inputStream, int i3) {
        super(inputStream);
        this.f12137a = i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f12137a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f12137a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f12137a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int skip = (int) super.skip(Math.min(j, this.f12137a));
        if (skip >= 0) {
            this.f12137a -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = this.f12137a;
        if (i11 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i3, Math.min(i10, i11));
        if (read >= 0) {
            this.f12137a -= read;
        }
        return read;
    }
}
