package com.google.protobuf;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0739m extends AbstractC0741n {

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f12190c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12191d;

    /* renamed from: e, reason: collision with root package name */
    public long f12192e;

    /* renamed from: f, reason: collision with root package name */
    public long f12193f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12194g;

    /* renamed from: h, reason: collision with root package name */
    public int f12195h;

    /* renamed from: i, reason: collision with root package name */
    public int f12196i;
    public int j = IntCompanionObject.MAX_VALUE;

    public C0739m(ByteBuffer byteBuffer, boolean z2) {
        this.f12190c = byteBuffer;
        long j = G0.f12099c.j(G0.f12103g, byteBuffer);
        this.f12191d = j;
        this.f12192e = byteBuffer.limit() + j;
        long position = j + byteBuffer.position();
        this.f12193f = position;
        this.f12194g = position;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int A() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long B() {
        return F();
    }

    public final int C() {
        long j = this.f12193f;
        if (this.f12192e - j < 4) {
            throw T.g();
        }
        this.f12193f = 4 + j;
        F0 f02 = G0.f12099c;
        return ((f02.e(j + 3) & UByte.MAX_VALUE) << 24) | (f02.e(j) & UByte.MAX_VALUE) | ((f02.e(1 + j) & UByte.MAX_VALUE) << 8) | ((f02.e(2 + j) & UByte.MAX_VALUE) << 16);
    }

    public final long D() {
        long j = this.f12193f;
        if (this.f12192e - j < 8) {
            throw T.g();
        }
        this.f12193f = 8 + j;
        F0 f02 = G0.f12099c;
        return ((f02.e(j + 7) & 255) << 56) | (f02.e(j) & 255) | ((f02.e(1 + j) & 255) << 8) | ((f02.e(2 + j) & 255) << 16) | ((f02.e(3 + j) & 255) << 24) | ((f02.e(4 + j) & 255) << 32) | ((f02.e(5 + j) & 255) << 40) | ((f02.e(6 + j) & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E() {
        /*
            r12 = this;
            long r0 = r12.f12193f
            long r2 = r12.f12192e
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.F0 r4 = com.google.protobuf.G0.f12099c
            byte r5 = r4.e(r0)
            if (r5 < 0) goto L18
            r12.f12193f = r2
            return r5
        L18:
            long r6 = r12.f12192e
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.G()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f12193f = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0739m.E():int");
    }

    public final long F() {
        long j;
        long j3;
        long j10;
        int i3;
        long j11 = this.f12193f;
        if (this.f12192e != j11) {
            long j12 = 1 + j11;
            F0 f02 = G0.f12099c;
            byte e10 = f02.e(j11);
            if (e10 >= 0) {
                this.f12193f = j12;
                return e10;
            }
            if (this.f12192e - j12 >= 9) {
                long j13 = 2 + j11;
                int e11 = (f02.e(j12) << 7) ^ e10;
                if (e11 >= 0) {
                    long j14 = 3 + j11;
                    int e12 = e11 ^ (f02.e(j13) << 14);
                    if (e12 >= 0) {
                        j = e12 ^ 16256;
                    } else {
                        j13 = j11 + 4;
                        int e13 = e12 ^ (f02.e(j14) << 21);
                        if (e13 < 0) {
                            i3 = (-2080896) ^ e13;
                        } else {
                            j14 = 5 + j11;
                            long e14 = e13 ^ (f02.e(j13) << 28);
                            if (e14 < 0) {
                                long j15 = 6 + j11;
                                long e15 = e14 ^ (f02.e(j14) << 35);
                                if (e15 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j14 = 7 + j11;
                                    e14 = e15 ^ (f02.e(j15) << 42);
                                    if (e14 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        j15 = 8 + j11;
                                        e15 = e14 ^ (f02.e(j14) << 49);
                                        if (e15 >= 0) {
                                            long j16 = j11 + 9;
                                            long e16 = (e15 ^ (f02.e(j15) << 56)) ^ 71499008037633920L;
                                            if (e16 < 0) {
                                                long j17 = j11 + 10;
                                                if (f02.e(j16) >= 0) {
                                                    j13 = j17;
                                                    j = e16;
                                                }
                                            } else {
                                                j = e16;
                                                j13 = j16;
                                            }
                                            this.f12193f = j13;
                                            return j;
                                        }
                                        j3 = -558586000294016L;
                                    }
                                }
                                j = j3 ^ e15;
                                j13 = j15;
                                this.f12193f = j13;
                                return j;
                            }
                            j10 = 266354560;
                            j = j10 ^ e14;
                        }
                    }
                    j13 = j14;
                    this.f12193f = j13;
                    return j;
                }
                i3 = e11 ^ (-128);
                j = i3;
                this.f12193f = j13;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            long j3 = this.f12193f;
            if (j3 == this.f12192e) {
                throw T.g();
            }
            this.f12193f = 1 + j3;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i3;
            if ((G0.f12099c.e(j3) & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw T.d();
    }

    public final void H() {
        long j = this.f12192e + this.f12195h;
        this.f12192e = j;
        int i3 = (int) (j - this.f12194g);
        int i10 = this.j;
        if (i3 <= i10) {
            this.f12195h = 0;
            return;
        }
        int i11 = i3 - i10;
        this.f12195h = i11;
        this.f12192e = j - i11;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void a(int i3) {
        if (this.f12196i != i3) {
            throw new T(StubApp.getString2(12646));
        }
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int d() {
        return (int) (this.f12193f - this.f12194g);
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean e() {
        return this.f12193f == this.f12192e;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void h(int i3) {
        this.j = i3;
        H();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int i(int i3) {
        if (i3 < 0) {
            throw T.e();
        }
        int d8 = d() + i3;
        int i10 = this.j;
        if (d8 > i10) {
            throw T.g();
        }
        this.j = d8;
        H();
        return i10;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean j() {
        return F() != 0;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final C0731i k() {
        int E10 = E();
        if (E10 > 0) {
            long j = this.f12192e;
            long j3 = this.f12193f;
            if (E10 <= ((int) (j - j3))) {
                byte[] bArr = new byte[E10];
                long j10 = E10;
                G0.f12099c.c(j3, bArr, j10);
                this.f12193f += j10;
                C0731i c0731i = AbstractC0733j.f12158b;
                return new C0731i(bArr);
            }
        }
        if (E10 == 0) {
            return AbstractC0733j.f12158b;
        }
        if (E10 < 0) {
            throw T.e();
        }
        throw T.g();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final double l() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int m() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int n() {
        return C();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long o() {
        return D();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final float p() {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int q() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long r() {
        return F();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int t() {
        return C();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long u() {
        return D();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int v() {
        return AbstractC0741n.b(E());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long w() {
        return AbstractC0741n.c(F());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String x() {
        int E10 = E();
        if (E10 > 0) {
            long j = this.f12192e;
            long j3 = this.f12193f;
            if (E10 <= ((int) (j - j3))) {
                byte[] bArr = new byte[E10];
                long j10 = E10;
                G0.f12099c.c(j3, bArr, j10);
                String str = new String(bArr, Q.f12119a);
                this.f12193f += j10;
                return str;
            }
        }
        if (E10 == 0) {
            return "";
        }
        if (E10 < 0) {
            throw T.e();
        }
        throw T.g();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String y() {
        int E10 = E();
        if (E10 > 0) {
            long j = this.f12192e;
            long j3 = this.f12193f;
            if (E10 <= ((int) (j - j3))) {
                int i3 = (int) (j3 - this.f12191d);
                Tc.d dVar = J0.f12106a;
                dVar.getClass();
                ByteBuffer byteBuffer = this.f12190c;
                String g10 = byteBuffer.hasArray() ? dVar.g(byteBuffer.arrayOffset() + i3, E10, byteBuffer.array()) : byteBuffer.isDirect() ? dVar.i(i3, byteBuffer, E10) : Tc.d.h(i3, byteBuffer, E10);
                this.f12193f += E10;
                return g10;
            }
        }
        if (E10 == 0) {
            return "";
        }
        if (E10 <= 0) {
            throw T.e();
        }
        throw T.g();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int z() {
        if (e()) {
            this.f12196i = 0;
            return 0;
        }
        int E10 = E();
        this.f12196i = E10;
        if ((E10 >>> 3) != 0) {
            return E10;
        }
        throw T.a();
    }
}
