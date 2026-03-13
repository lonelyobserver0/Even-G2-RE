package com.google.protobuf;

import com.stub.StubApp;
import org.bouncycastle.asn1.eac.CertificateBody;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0743o extends AbstractC0747q {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f12202g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12203h;

    /* renamed from: i, reason: collision with root package name */
    public int f12204i;

    public C0743o(byte[] bArr, int i3) {
        if (((bArr.length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format(StubApp.getString2(12654), Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
        }
        this.f12202g = bArr;
        this.f12204i = 0;
        this.f12203h = i3;
    }

    @Override // Ec.d
    public final void M(int i3, int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, i3, this.f12202g, this.f12204i, i10);
            this.f12204i += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), Integer.valueOf(i10)), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void V(byte b2) {
        try {
            byte[] bArr = this.f12202g;
            int i3 = this.f12204i;
            this.f12204i = i3 + 1;
            bArr[i3] = b2;
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void W(int i3, boolean z2) {
        g0(i3, 0);
        V(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void X(int i3, AbstractC0733j abstractC0733j) {
        g0(i3, 2);
        i0(abstractC0733j.size());
        abstractC0733j.o(this);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void Y(int i3, int i10) {
        g0(i3, 5);
        Z(i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void Z(int i3) {
        try {
            byte[] bArr = this.f12202g;
            int i10 = this.f12204i;
            int i11 = i10 + 1;
            this.f12204i = i11;
            bArr[i10] = (byte) (i3 & 255);
            int i12 = i10 + 2;
            this.f12204i = i12;
            bArr[i11] = (byte) ((i3 >> 8) & 255);
            int i13 = i10 + 3;
            this.f12204i = i13;
            bArr[i12] = (byte) ((i3 >> 16) & 255);
            this.f12204i = i10 + 4;
            bArr[i13] = (byte) ((i3 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void a0(int i3, long j) {
        g0(i3, 1);
        b0(j);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void b0(long j) {
        try {
            byte[] bArr = this.f12202g;
            int i3 = this.f12204i;
            int i10 = i3 + 1;
            this.f12204i = i10;
            bArr[i3] = (byte) (((int) j) & 255);
            int i11 = i3 + 2;
            this.f12204i = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i3 + 3;
            this.f12204i = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i3 + 4;
            this.f12204i = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i3 + 5;
            this.f12204i = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i3 + 6;
            this.f12204i = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i3 + 7;
            this.f12204i = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.f12204i = i3 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void c0(int i3, int i10) {
        g0(i3, 0);
        d0(i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void d0(int i3) {
        if (i3 >= 0) {
            i0(i3);
        } else {
            k0(i3);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void e0(int i3, InterfaceC0732i0 interfaceC0732i0, u0 u0Var) {
        g0(i3, 2);
        i0(((AbstractC0719c) interfaceC0732i0).getSerializedSize(u0Var));
        u0Var.e(interfaceC0732i0, this.f12212d);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void f0(int i3, String str) {
        g0(i3, 2);
        int i10 = this.f12204i;
        try {
            int S5 = AbstractC0747q.S(str.length() * 3);
            int S10 = AbstractC0747q.S(str.length());
            byte[] bArr = this.f12202g;
            if (S10 != S5) {
                i0(J0.b(str));
                this.f12204i = J0.f12106a.j(str, bArr, this.f12204i, l0());
                return;
            }
            int i11 = i10 + S10;
            this.f12204i = i11;
            int j = J0.f12106a.j(str, bArr, i11, l0());
            this.f12204i = i10;
            i0((j - i10) - S10);
            this.f12204i = j;
        } catch (I0 e10) {
            this.f12204i = i10;
            U(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new B0.v(e11);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void g0(int i3, int i10) {
        i0((i3 << 3) | i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void h0(int i3, int i10) {
        g0(i3, 0);
        i0(i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void i0(int i3) {
        while (true) {
            int i10 = i3 & (-128);
            byte[] bArr = this.f12202g;
            if (i10 == 0) {
                int i11 = this.f12204i;
                this.f12204i = i11 + 1;
                bArr[i11] = (byte) i3;
                return;
            } else {
                try {
                    int i12 = this.f12204i;
                    this.f12204i = i12 + 1;
                    bArr[i12] = (byte) ((i3 & CertificateBody.profileType) | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
                }
            }
            throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void j0(int i3, long j) {
        g0(i3, 0);
        k0(j);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void k0(long j) {
        byte[] bArr = this.f12202g;
        if (AbstractC0747q.f12211f && l0() >= 10) {
            while ((j & (-128)) != 0) {
                int i3 = this.f12204i;
                this.f12204i = i3 + 1;
                G0.k(bArr, i3, (byte) ((((int) j) & CertificateBody.profileType) | 128));
                j >>>= 7;
            }
            int i10 = this.f12204i;
            this.f12204i = i10 + 1;
            G0.k(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i11 = this.f12204i;
                this.f12204i = i11 + 1;
                bArr[i11] = (byte) ((((int) j) & CertificateBody.profileType) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new B0.v(String.format(StubApp.getString2(12655), Integer.valueOf(this.f12204i), Integer.valueOf(this.f12203h), 1), e10);
            }
        }
        int i12 = this.f12204i;
        this.f12204i = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final int l0() {
        return this.f12203h - this.f12204i;
    }
}
