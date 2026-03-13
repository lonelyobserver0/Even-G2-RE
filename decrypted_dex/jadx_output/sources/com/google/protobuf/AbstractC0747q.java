package com.google.protobuf;

import com.stub.StubApp;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0747q extends Ec.d {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f12210e = Logger.getLogger(AbstractC0747q.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f12211f = G0.f12101e;

    /* renamed from: d, reason: collision with root package name */
    public C0720c0 f12212d;

    public static int N(int i3, AbstractC0733j abstractC0733j) {
        return O(abstractC0733j) + R(i3);
    }

    public static int O(AbstractC0733j abstractC0733j) {
        int size = abstractC0733j.size();
        return S(size) + size;
    }

    public static int P(int i3) {
        if (i3 >= 0) {
            return S(i3);
        }
        return 10;
    }

    public static int Q(String str) {
        int length;
        try {
            length = J0.b(str);
        } catch (I0 unused) {
            length = str.getBytes(Q.f12119a).length;
        }
        return S(length) + length;
    }

    public static int R(int i3) {
        return S(i3 << 3);
    }

    public static int S(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int T(long j) {
        int i3;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j) != 0) {
            i3 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public final void U(String str, I0 i02) {
        f12210e.log(Level.WARNING, StubApp.getString2(11899), (Throwable) i02);
        byte[] bytes = str.getBytes(Q.f12119a);
        try {
            i0(bytes.length);
            M(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e10) {
            throw new B0.v(e10);
        }
    }

    public abstract void V(byte b2);

    public abstract void W(int i3, boolean z2);

    public abstract void X(int i3, AbstractC0733j abstractC0733j);

    public abstract void Y(int i3, int i10);

    public abstract void Z(int i3);

    public abstract void a0(int i3, long j);

    public abstract void b0(long j);

    public abstract void c0(int i3, int i10);

    public abstract void d0(int i3);

    public abstract void e0(int i3, InterfaceC0732i0 interfaceC0732i0, u0 u0Var);

    public abstract void f0(int i3, String str);

    public abstract void g0(int i3, int i10);

    public abstract void h0(int i3, int i10);

    public abstract void i0(int i3);

    public abstract void j0(int i3, long j);

    public abstract void k0(long j);
}
