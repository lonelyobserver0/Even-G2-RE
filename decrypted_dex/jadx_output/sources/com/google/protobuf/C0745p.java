package com.google.protobuf;

import com.stub.StubApp;
import java.io.OutputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0745p extends AbstractC0747q {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f12207g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12208h;

    /* renamed from: i, reason: collision with root package name */
    public int f12209i;
    public final OutputStream j;

    public C0745p(OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(12657));
        }
        int max = Math.max(i3, 20);
        this.f12207g = new byte[max];
        this.f12208h = max;
        if (outputStream == null) {
            throw new NullPointerException(StubApp.getString2(12656));
        }
        this.j = outputStream;
    }

    @Override // Ec.d
    public final void M(int i3, int i10, byte[] bArr) {
        s0(bArr, i3, i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void V(byte b2) {
        if (this.f12209i == this.f12208h) {
            q0();
        }
        int i3 = this.f12209i;
        this.f12209i = i3 + 1;
        this.f12207g[i3] = b2;
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void W(int i3, boolean z2) {
        r0(11);
        n0(i3, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i10 = this.f12209i;
        this.f12209i = i10 + 1;
        this.f12207g[i10] = b2;
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void X(int i3, AbstractC0733j abstractC0733j) {
        g0(i3, 2);
        i0(abstractC0733j.size());
        abstractC0733j.o(this);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void Y(int i3, int i10) {
        r0(14);
        n0(i3, 5);
        l0(i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void Z(int i3) {
        r0(4);
        l0(i3);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void a0(int i3, long j) {
        r0(18);
        n0(i3, 1);
        m0(j);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void b0(long j) {
        r0(8);
        m0(j);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void c0(int i3, int i10) {
        r0(20);
        n0(i3, 0);
        if (i10 >= 0) {
            o0(i10);
        } else {
            p0(i10);
        }
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
        try {
            int length = str.length() * 3;
            int S5 = AbstractC0747q.S(length);
            int i10 = S5 + length;
            int i11 = this.f12208h;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int j = J0.f12106a.j(str, bArr, 0, length);
                i0(j);
                s0(bArr, 0, j);
                return;
            }
            if (i10 > i11 - this.f12209i) {
                q0();
            }
            int S10 = AbstractC0747q.S(str.length());
            int i12 = this.f12209i;
            byte[] bArr2 = this.f12207g;
            try {
                if (S10 != S5) {
                    int b2 = J0.b(str);
                    o0(b2);
                    this.f12209i = J0.f12106a.j(str, bArr2, this.f12209i, b2);
                    return;
                }
                int i13 = i12 + S10;
                this.f12209i = i13;
                int j3 = J0.f12106a.j(str, bArr2, i13, i11 - i13);
                this.f12209i = i12;
                o0((j3 - i12) - S10);
                this.f12209i = j3;
            } catch (I0 e10) {
                this.f12209i = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new B0.v(e11);
            }
        } catch (I0 e12) {
            U(str, e12);
        }
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void g0(int i3, int i10) {
        i0((i3 << 3) | i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void h0(int i3, int i10) {
        r0(20);
        n0(i3, 0);
        o0(i10);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void i0(int i3) {
        r0(5);
        o0(i3);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void j0(int i3, long j) {
        r0(20);
        n0(i3, 0);
        p0(j);
    }

    @Override // com.google.protobuf.AbstractC0747q
    public final void k0(long j) {
        r0(10);
        p0(j);
    }

    public final void l0(int i3) {
        int i10 = this.f12209i;
        int i11 = i10 + 1;
        this.f12209i = i11;
        byte[] bArr = this.f12207g;
        bArr[i10] = (byte) (i3 & 255);
        int i12 = i10 + 2;
        this.f12209i = i12;
        bArr[i11] = (byte) ((i3 >> 8) & 255);
        int i13 = i10 + 3;
        this.f12209i = i13;
        bArr[i12] = (byte) ((i3 >> 16) & 255);
        this.f12209i = i10 + 4;
        bArr[i13] = (byte) ((i3 >> 24) & 255);
    }

    public final void m0(long j) {
        int i3 = this.f12209i;
        int i10 = i3 + 1;
        this.f12209i = i10;
        byte[] bArr = this.f12207g;
        bArr[i3] = (byte) (j & 255);
        int i11 = i3 + 2;
        this.f12209i = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i3 + 3;
        this.f12209i = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i3 + 4;
        this.f12209i = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i3 + 5;
        this.f12209i = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i3 + 6;
        this.f12209i = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i3 + 7;
        this.f12209i = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f12209i = i3 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void n0(int i3, int i10) {
        o0((i3 << 3) | i10);
    }

    public final void o0(int i3) {
        boolean z2 = AbstractC0747q.f12211f;
        byte[] bArr = this.f12207g;
        if (z2) {
            while ((i3 & (-128)) != 0) {
                int i10 = this.f12209i;
                this.f12209i = i10 + 1;
                G0.k(bArr, i10, (byte) ((i3 & CertificateBody.profileType) | 128));
                i3 >>>= 7;
            }
            int i11 = this.f12209i;
            this.f12209i = i11 + 1;
            G0.k(bArr, i11, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i12 = this.f12209i;
            this.f12209i = i12 + 1;
            bArr[i12] = (byte) ((i3 & CertificateBody.profileType) | 128);
            i3 >>>= 7;
        }
        int i13 = this.f12209i;
        this.f12209i = i13 + 1;
        bArr[i13] = (byte) i3;
    }

    public final void p0(long j) {
        boolean z2 = AbstractC0747q.f12211f;
        byte[] bArr = this.f12207g;
        if (z2) {
            while ((j & (-128)) != 0) {
                int i3 = this.f12209i;
                this.f12209i = i3 + 1;
                G0.k(bArr, i3, (byte) ((((int) j) & CertificateBody.profileType) | 128));
                j >>>= 7;
            }
            int i10 = this.f12209i;
            this.f12209i = i10 + 1;
            G0.k(bArr, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f12209i;
            this.f12209i = i11 + 1;
            bArr[i11] = (byte) ((((int) j) & CertificateBody.profileType) | 128);
            j >>>= 7;
        }
        int i12 = this.f12209i;
        this.f12209i = i12 + 1;
        bArr[i12] = (byte) j;
    }

    public final void q0() {
        this.j.write(this.f12207g, 0, this.f12209i);
        this.f12209i = 0;
    }

    public final void r0(int i3) {
        if (this.f12208h - this.f12209i < i3) {
            q0();
        }
    }

    public final void s0(byte[] bArr, int i3, int i10) {
        int i11 = this.f12209i;
        int i12 = this.f12208h;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f12207g;
        if (i13 >= i10) {
            System.arraycopy(bArr, i3, bArr2, i11, i10);
            this.f12209i += i10;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i11, i13);
        int i14 = i3 + i13;
        int i15 = i10 - i13;
        this.f12209i = i12;
        q0();
        if (i15 > i12) {
            this.j.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f12209i = i15;
        }
    }
}
