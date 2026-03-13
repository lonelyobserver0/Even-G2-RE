package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0404d;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0731i extends AbstractC0733j {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12157d;

    public C0731i(byte[] bArr) {
        this.f12160a = 0;
        bArr.getClass();
        this.f12157d = bArr;
    }

    @Override // com.google.protobuf.AbstractC0733j
    public byte a(int i3) {
        return this.f12157d[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0733j) || size() != ((AbstractC0733j) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0731i)) {
            return obj.equals(this);
        }
        C0731i c0731i = (C0731i) obj;
        int i3 = this.f12160a;
        int i10 = c0731i.f12160a;
        if (i3 != 0 && i10 != 0 && i3 != i10) {
            return false;
        }
        int size = size();
        if (size > c0731i.size()) {
            throw new IllegalArgumentException(StubApp.getString2(12645) + size + size());
        }
        if (size > c0731i.size()) {
            StringBuilder u2 = Xa.h.u(size, StubApp.getString2(12644), StubApp.getString2(81));
            u2.append(c0731i.size());
            throw new IllegalArgumentException(u2.toString());
        }
        int p8 = p() + size;
        int p9 = p();
        int p10 = c0731i.p();
        while (p9 < p8) {
            if (this.f12157d[p9] != c0731i.f12157d[p10]) {
                return false;
            }
            p9++;
            p10++;
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC0733j
    public byte f(int i3) {
        return this.f12157d[i3];
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final boolean g() {
        int p8 = p();
        return J0.f12106a.n(p8, size() + p8, this.f12157d);
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final AbstractC0741n i() {
        return AbstractC0741n.f(this.f12157d, p(), size(), true);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0404d(this);
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final int j(int i3, int i10) {
        int p8 = p();
        Charset charset = Q.f12119a;
        for (int i11 = p8; i11 < p8 + i10; i11++) {
            i3 = (i3 * 31) + this.f12157d[i11];
        }
        return i3;
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final AbstractC0733j l(int i3) {
        int b2 = AbstractC0733j.b(0, i3, size());
        if (b2 == 0) {
            return AbstractC0733j.f12158b;
        }
        return new C0729h(this.f12157d, p(), b2);
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final String m(Charset charset) {
        return new String(this.f12157d, p(), size(), charset);
    }

    @Override // com.google.protobuf.AbstractC0733j
    public final void o(AbstractC0747q abstractC0747q) {
        abstractC0747q.M(p(), size(), this.f12157d);
    }

    public int p() {
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0733j
    public int size() {
        return this.f12157d.length;
    }
}
