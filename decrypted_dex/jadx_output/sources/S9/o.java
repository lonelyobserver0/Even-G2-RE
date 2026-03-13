package S9;

import Kc.C0101h;
import Kc.C0104k;
import Kc.InterfaceC0102i;
import com.stub.StubApp;
import i2.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C0101h f6646a;

    /* renamed from: b, reason: collision with root package name */
    public long f6647b;

    /* renamed from: c, reason: collision with root package name */
    public long f6648c;

    /* renamed from: d, reason: collision with root package name */
    public int f6649d;

    /* renamed from: e, reason: collision with root package name */
    public int f6650e;

    /* renamed from: f, reason: collision with root package name */
    public int f6651f;

    /* renamed from: g, reason: collision with root package name */
    public long f6652g;

    /* renamed from: h, reason: collision with root package name */
    public d f6653h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6654i;

    public o(C0101h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6646a = source;
        this.f6648c = LongCompanionObject.MAX_VALUE;
        this.f6650e = 2;
        this.f6651f = -1;
        this.f6652g = -1L;
        this.f6654i = new ArrayList();
    }

    public final void a(int i3, d fieldEncoding, Object obj) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        s2.d dVar = new s2.d((InterfaceC0102i) this.f6654i.get(this.f6649d - 1));
        i a3 = fieldEncoding.a();
        Intrinsics.checkNotNull(a3, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a3.g(dVar, i3, obj);
    }

    public final void b(int i3) {
        if (this.f6650e == i3) {
            this.f6650e = 6;
            return;
        }
        long j = this.f6647b;
        long j3 = this.f6648c;
        if (j > j3) {
            throw new IOException(StubApp.getString2(6048) + this.f6648c + StubApp.getString2(6049) + this.f6647b);
        }
        if (j != j3) {
            this.f6650e = 7;
            return;
        }
        this.f6648c = this.f6652g;
        this.f6652g = -1L;
        this.f6650e = 6;
    }

    public final long c() {
        if (this.f6650e != 2) {
            throw new ProtocolException(StubApp.getString2(6050) + this.f6650e);
        }
        long j = this.f6648c - this.f6647b;
        this.f6646a.D(j);
        this.f6650e = 6;
        this.f6647b = this.f6648c;
        this.f6648c = this.f6652g;
        this.f6652g = -1L;
        return j;
    }

    public final long d() {
        if (this.f6650e != 2) {
            throw new IllegalStateException(StubApp.getString2(6052));
        }
        int i3 = this.f6649d + 1;
        this.f6649d = i3;
        if (i3 > 65) {
            throw new IOException(StubApp.getString2(6051));
        }
        ArrayList arrayList = this.f6654i;
        if (i3 > arrayList.size()) {
            arrayList.add(new C0101h());
        }
        long j = this.f6652g;
        this.f6652g = -1L;
        this.f6650e = 6;
        return j;
    }

    public final C0104k e(long j) {
        if (this.f6650e != 6) {
            throw new IllegalStateException(StubApp.getString2(6054));
        }
        int i3 = this.f6649d - 1;
        this.f6649d = i3;
        if (i3 < 0 || this.f6652g != -1) {
            throw new IllegalStateException(StubApp.getString2(6053));
        }
        if (this.f6647b == this.f6648c || i3 == 0) {
            this.f6648c = j;
            C0101h c0101h = (C0101h) this.f6654i.get(i3);
            long j3 = c0101h.f3819b;
            return j3 > 0 ? c0101h.f(j3) : C0104k.f3820d;
        }
        throw new IOException(StubApp.getString2(6048) + this.f6648c + StubApp.getString2(6049) + this.f6647b);
    }

    public final int f() {
        int i3;
        C0101h c0101h = this.f6646a;
        c0101h.D(1L);
        this.f6647b++;
        byte readByte = c0101h.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i10 = readByte & ByteCompanionObject.MAX_VALUE;
        c0101h.D(1L);
        this.f6647b++;
        byte readByte2 = c0101h.readByte();
        if (readByte2 >= 0) {
            i3 = readByte2 << 7;
        } else {
            i10 |= (readByte2 & ByteCompanionObject.MAX_VALUE) << 7;
            c0101h.D(1L);
            this.f6647b++;
            byte readByte3 = c0101h.readByte();
            if (readByte3 >= 0) {
                i3 = readByte3 << 14;
            } else {
                i10 |= (readByte3 & ByteCompanionObject.MAX_VALUE) << 14;
                c0101h.D(1L);
                this.f6647b++;
                byte readByte4 = c0101h.readByte();
                if (readByte4 < 0) {
                    int i11 = i10 | ((readByte4 & ByteCompanionObject.MAX_VALUE) << 21);
                    c0101h.D(1L);
                    this.f6647b++;
                    byte readByte5 = c0101h.readByte();
                    int i12 = i11 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i13 = 0; i13 < 5; i13++) {
                            c0101h.D(1L);
                            this.f6647b++;
                            if (c0101h.readByte() < 0) {
                            }
                        }
                        throw new ProtocolException(StubApp.getString2(6055));
                    }
                    return i12;
                }
                i3 = readByte4 << 21;
            }
        }
        return i3 | i10;
    }

    public final int g() {
        int i3 = this.f6650e;
        if (i3 == 7) {
            this.f6650e = 2;
            return this.f6651f;
        }
        if (i3 != 6) {
            throw new IllegalStateException(StubApp.getString2(6060));
        }
        while (this.f6647b < this.f6648c && !this.f6646a.e()) {
            int f10 = f();
            if (f10 == 0) {
                throw new ProtocolException(StubApp.getString2(6059));
            }
            int i10 = f10 >> 3;
            this.f6651f = i10;
            int i11 = f10 & 7;
            if (i11 == 0) {
                this.f6653h = d.f6614b;
                this.f6650e = 0;
                return i10;
            }
            if (i11 == 1) {
                this.f6653h = d.f6615c;
                this.f6650e = 1;
                return i10;
            }
            if (i11 == 2) {
                this.f6653h = d.f6616d;
                this.f6650e = 2;
                int f11 = f();
                if (f11 < 0) {
                    throw new ProtocolException(u.p(f11, StubApp.getString2(6058)));
                }
                if (this.f6652g != -1) {
                    throw new IllegalStateException();
                }
                long j = this.f6648c;
                this.f6652g = j;
                long j3 = this.f6647b + f11;
                this.f6648c = j3;
                if (j3 <= j) {
                    return this.f6651f;
                }
                throw new EOFException();
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    throw new ProtocolException(StubApp.getString2(6057));
                }
                if (i11 != 5) {
                    throw new ProtocolException(u.p(i11, StubApp.getString2(6056)));
                }
                this.f6653h = d.f6617e;
                this.f6650e = 5;
                return i10;
            }
            n(i10);
        }
        return -1;
    }

    public final int h() {
        int i3 = this.f6650e;
        if (i3 != 5 && i3 != 2) {
            throw new ProtocolException(StubApp.getString2(6061) + this.f6650e);
        }
        C0101h c0101h = this.f6646a;
        c0101h.D(4L);
        this.f6647b += 4;
        int F3 = c0101h.F();
        b(5);
        return F3;
    }

    public final long i() {
        int i3 = this.f6650e;
        if (i3 != 1 && i3 != 2) {
            throw new ProtocolException(StubApp.getString2(6062) + this.f6650e);
        }
        C0101h c0101h = this.f6646a;
        c0101h.D(8L);
        this.f6647b += 8;
        long H2 = c0101h.H();
        b(1);
        return H2;
    }

    public final void j(int i3) {
        d dVar = this.f6653h;
        Intrinsics.checkNotNull(dVar);
        a(i3, dVar, dVar.a().b(this));
    }

    public final int k() {
        int i3 = this.f6650e;
        if (i3 == 0 || i3 == 2) {
            int f10 = f();
            b(0);
            return f10;
        }
        throw new ProtocolException(StubApp.getString2(6063) + this.f6650e);
    }

    public final long l() {
        int i3 = this.f6650e;
        if (i3 != 0 && i3 != 2) {
            throw new ProtocolException(StubApp.getString2(6063) + this.f6650e);
        }
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            C0101h c0101h = this.f6646a;
            c0101h.D(1L);
            this.f6647b++;
            j |= (r4 & ByteCompanionObject.MAX_VALUE) << i10;
            if ((c0101h.readByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                b(0);
                return j;
            }
        }
        throw new ProtocolException(StubApp.getString2(6064));
    }

    public final void m() {
        int i3 = this.f6650e;
        if (i3 == 0) {
            l();
            return;
        }
        if (i3 == 1) {
            i();
            return;
        }
        if (i3 == 2) {
            this.f6646a.skip(c());
        } else {
            if (i3 != 5) {
                throw new IllegalStateException(StubApp.getString2(6065));
            }
            h();
        }
    }

    public final void n(int i3) {
        while (this.f6647b < this.f6648c) {
            C0101h c0101h = this.f6646a;
            if (c0101h.e()) {
                break;
            }
            int f10 = f();
            if (f10 == 0) {
                throw new ProtocolException(StubApp.getString2(6059));
            }
            int i10 = f10 >> 3;
            int i11 = f10 & 7;
            if (i11 == 0) {
                this.f6650e = 0;
                l();
            } else if (i11 == 1) {
                this.f6650e = 1;
                i();
            } else if (i11 == 2) {
                long f11 = f();
                this.f6647b += f11;
                c0101h.skip(f11);
            } else if (i11 == 3) {
                n(i10);
            } else if (i11 == 4) {
                if (i10 != i3) {
                    throw new ProtocolException(StubApp.getString2(6057));
                }
                return;
            } else {
                if (i11 != 5) {
                    throw new ProtocolException(u.p(i11, StubApp.getString2(6056)));
                }
                this.f6650e = 5;
                h();
            }
        }
        throw new EOFException();
    }
}
