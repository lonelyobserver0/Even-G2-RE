package Ab;

import androidx.datastore.preferences.protobuf.AbstractC0410j;
import androidx.datastore.preferences.protobuf.AbstractC0420u;
import androidx.datastore.preferences.protobuf.AbstractC0422w;
import androidx.datastore.preferences.protobuf.C0407g;
import androidx.datastore.preferences.protobuf.C0413m;
import androidx.datastore.preferences.protobuf.C0424y;
import androidx.datastore.preferences.protobuf.InterfaceC0421v;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.p0;
import com.google.protobuf.AbstractC0733j;
import com.google.protobuf.AbstractC0741n;
import com.google.protobuf.C0716a0;
import com.google.protobuf.C0725f;
import com.google.protobuf.C0750u;
import com.google.protobuf.C0754y;
import com.google.protobuf.G;
import com.google.protobuf.T;
import com.google.protobuf.W;
import com.google.protobuf.r;
import com.google.protobuf.u0;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274a;

    /* renamed from: b, reason: collision with root package name */
    public int f275b;

    /* renamed from: c, reason: collision with root package name */
    public int f276c;

    /* renamed from: d, reason: collision with root package name */
    public int f277d;

    /* renamed from: e, reason: collision with root package name */
    public Object f278e;

    public /* synthetic */ g(int i3) {
        this.f274a = i3;
    }

    public static void T(int i3) {
        if ((i3 & 3) != 0) {
            throw T.f();
        }
    }

    public static void U(int i3) {
        if ((i3 & 7) != 0) {
            throw T.f();
        }
    }

    public void A(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0716a0;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0741n.r()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Long.valueOf(abstractC0741n.r()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                c0716a0.b(abstractC0741n.r());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            c0716a0.b(abstractC0741n.r());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public void B(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 2) {
            int w10 = abstractC0410j.w();
            if ((w10 & 3) != 0) {
                throw new C0424y(StubApp.getString2(445));
            }
            int c10 = abstractC0410j.c() + w10;
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.p()));
            } while (abstractC0410j.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw C0424y.b();
        }
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.p()));
            if (abstractC0410j.d()) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == this.f275b);
        this.f277d = v2;
    }

    public void C(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 2) {
                int A4 = abstractC0741n.A();
                T(A4);
                int d8 = abstractC0741n.d() + A4;
                do {
                    list.add(Integer.valueOf(abstractC0741n.t()));
                } while (abstractC0741n.d() < d8);
                return;
            }
            if (i3 != 5) {
                throw T.c();
            }
            do {
                list.add(Integer.valueOf(abstractC0741n.t()));
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z2 = abstractC0741n.z();
                }
            } while (z2 == this.f275b);
            this.f277d = z2;
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 2) {
            int A5 = abstractC0741n.A();
            T(A5);
            int d10 = abstractC0741n.d() + A5;
            do {
                g10.b(abstractC0741n.t());
            } while (abstractC0741n.d() < d10);
            return;
        }
        if (i10 != 5) {
            throw T.c();
        }
        do {
            g10.b(abstractC0741n.t());
            if (abstractC0741n.e()) {
                return;
            } else {
                z10 = abstractC0741n.z();
            }
        } while (z10 == this.f275b);
        this.f277d = z10;
    }

    public void D(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 1) {
            do {
                ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.q()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int w10 = abstractC0410j.w();
        if ((w10 & 7) != 0) {
            throw new C0424y(StubApp.getString2(445));
        }
        int c10 = abstractC0410j.c() + w10;
        do {
            ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.q()));
        } while (abstractC0410j.c() < c10);
    }

    public void E(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0716a0;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0741n.u()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int A4 = abstractC0741n.A();
            U(A4);
            int d8 = abstractC0741n.d() + A4;
            do {
                list.add(Long.valueOf(abstractC0741n.u()));
            } while (abstractC0741n.d() < d8);
            return;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i10 = this.f275b & 7;
        if (i10 == 1) {
            do {
                c0716a0.b(abstractC0741n.u());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int A5 = abstractC0741n.A();
        U(A5);
        int d10 = abstractC0741n.d() + A5;
        do {
            c0716a0.b(abstractC0741n.u());
        } while (abstractC0741n.d() < d10);
    }

    public void F(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.r()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.r()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void G(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0741n.v()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Integer.valueOf(abstractC0741n.v()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                g10.b(abstractC0741n.v());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            g10.b(abstractC0741n.v());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public void H(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.s()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.s()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void I(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0716a0;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0741n.w()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Long.valueOf(abstractC0741n.w()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                c0716a0.b(abstractC0741n.w());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            c0716a0.b(abstractC0741n.w());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public void J(InterfaceC0421v interfaceC0421v, boolean z2) {
        String t3;
        int v2;
        if ((this.f275b & 7) != 2) {
            throw C0424y.b();
        }
        do {
            AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
            if (z2) {
                R(2);
                t3 = abstractC0410j.u();
            } else {
                R(2);
                t3 = abstractC0410j.t();
            }
            ((S) interfaceC0421v).add(t3);
            if (abstractC0410j.d()) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == this.f275b);
        this.f277d = v2;
    }

    public void K(List list, boolean z2) {
        String x7;
        int z10;
        int z11;
        if ((this.f275b & 7) != 2) {
            throw T.c();
        }
        boolean z12 = list instanceof W;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (z12 && !z2) {
            W w10 = (W) list;
            do {
                w10.h(j());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z11 = abstractC0741n.z();
                }
            } while (z11 == this.f275b);
            this.f277d = z11;
            return;
        }
        do {
            if (z2) {
                R(2);
                x7 = abstractC0741n.y();
            } else {
                R(2);
                x7 = abstractC0741n.x();
            }
            list.add(x7);
            if (abstractC0741n.e()) {
                return;
            } else {
                z10 = abstractC0741n.z();
            }
        } while (z10 == this.f275b);
        this.f277d = z10;
    }

    public void L(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.w()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.w()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void M(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0741n.A()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Integer.valueOf(abstractC0741n.A()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                g10.b(abstractC0741n.A());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            g10.b(abstractC0741n.A());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public void N(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.x()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.x()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void O(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0716a0;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0741n.B()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Long.valueOf(abstractC0741n.B()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                c0716a0.b(abstractC0741n.B());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            c0716a0.b(abstractC0741n.B());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public long P() {
        int i3 = this.f276c;
        if (i3 == 0) {
            throw new NoSuchElementException();
        }
        int i10 = this.f275b;
        long j = ((long[]) this.f278e)[i10];
        this.f275b = (i10 + 1) & this.f277d;
        this.f276c = i3 - 1;
        return j;
    }

    public void Q(int i3) {
        switch (this.f274a) {
            case 1:
                if (((AbstractC0410j) this.f278e).c() != i3) {
                    throw C0424y.e();
                }
                return;
            default:
                if (((AbstractC0741n) this.f278e).d() != i3) {
                    throw T.g();
                }
                return;
        }
    }

    public void R(int i3) {
        switch (this.f274a) {
            case 1:
                if ((this.f275b & 7) != i3) {
                    throw C0424y.b();
                }
                return;
            default:
                if ((this.f275b & 7) != i3) {
                    throw T.c();
                }
                return;
        }
    }

    public boolean S() {
        int i3;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (abstractC0410j.d() || (i3 = this.f275b) == this.f276c) {
            return false;
        }
        return abstractC0410j.y(i3);
    }

    public void a(int i3) {
        int[] iArr = (int[]) this.f278e;
        int i10 = this.f276c;
        iArr[i10] = i3;
        int i11 = this.f277d & (i10 + 1);
        this.f276c = i11;
        int i12 = this.f275b;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException(StubApp.getString2(446));
            }
            int[] iArr2 = new int[i14];
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, i12, length);
            ArraysKt___ArraysJvmKt.copyInto((int[]) this.f278e, iArr2, i13, 0, this.f275b);
            this.f278e = iArr2;
            this.f275b = 0;
            this.f276c = length;
            this.f277d = i14 - 1;
        }
    }

    public int b() {
        switch (this.f274a) {
            case 1:
                int i3 = this.f277d;
                if (i3 != 0) {
                    this.f275b = i3;
                    this.f277d = 0;
                } else {
                    this.f275b = ((AbstractC0410j) this.f278e).v();
                }
                int i10 = this.f275b;
                return (i10 == 0 || i10 == this.f276c) ? IntCompanionObject.MAX_VALUE : i10 >>> 3;
            default:
                int i11 = this.f277d;
                if (i11 != 0) {
                    this.f275b = i11;
                    this.f277d = 0;
                } else {
                    this.f275b = ((AbstractC0741n) this.f278e).z();
                }
                int i12 = this.f275b;
                return (i12 == 0 || i12 == this.f276c) ? IntCompanionObject.MAX_VALUE : i12 >>> 3;
        }
    }

    public void c(Object obj, U u2, C0413m c0413m) {
        int i3 = this.f276c;
        this.f276c = ((this.f275b >>> 3) << 3) | 4;
        try {
            u2.f(obj, this, c0413m);
            if (this.f275b == this.f276c) {
            } else {
                throw new C0424y(StubApp.getString2("445"));
            }
        } finally {
            this.f276c = i3;
        }
    }

    public void d(Object obj, u0 u0Var, C0750u c0750u) {
        int i3 = this.f276c;
        this.f276c = ((this.f275b >>> 3) << 3) | 4;
        try {
            u0Var.g(obj, this, c0750u);
            if (this.f275b == this.f276c) {
            } else {
                throw T.f();
            }
        } finally {
            this.f276c = i3;
        }
    }

    public void e(Object obj, U u2, C0413m c0413m) {
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        int w10 = abstractC0410j.w();
        if (abstractC0410j.f9807a >= 100) {
            throw new C0424y(StubApp.getString2(447));
        }
        int f10 = abstractC0410j.f(w10);
        abstractC0410j.f9807a++;
        u2.f(obj, this, c0413m);
        abstractC0410j.a(0);
        abstractC0410j.f9807a--;
        abstractC0410j.e(f10);
    }

    public void f(Object obj, u0 u0Var, C0750u c0750u) {
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        int A4 = abstractC0741n.A();
        if (abstractC0741n.f12200a >= 100) {
            throw new T(StubApp.getString2(448));
        }
        int i3 = abstractC0741n.i(A4);
        abstractC0741n.f12200a++;
        u0Var.g(obj, this, c0750u);
        abstractC0741n.a(0);
        abstractC0741n.f12200a--;
        abstractC0741n.h(i3);
    }

    public void g(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Boolean.valueOf(abstractC0410j.g()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Boolean.valueOf(abstractC0410j.g()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void h(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0725f;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0741n.j()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Boolean.valueOf(abstractC0741n.j()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        C0725f c0725f = (C0725f) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                c0725f.b(abstractC0741n.j());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            c0725f.b(abstractC0741n.j());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public C0407g i() {
        R(2);
        return ((AbstractC0410j) this.f278e).h();
    }

    public AbstractC0733j j() {
        R(2);
        return ((AbstractC0741n) this.f278e).k();
    }

    public void k(InterfaceC0421v interfaceC0421v) {
        int v2;
        if ((this.f275b & 7) != 2) {
            throw C0424y.b();
        }
        do {
            ((S) interfaceC0421v).add(i());
            AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
            if (abstractC0410j.d()) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == this.f275b);
        this.f277d = v2;
    }

    public void l(List list) {
        int z2;
        if ((this.f275b & 7) != 2) {
            throw T.c();
        }
        do {
            list.add(j());
            AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
            if (abstractC0741n.e()) {
                return;
            } else {
                z2 = abstractC0741n.z();
            }
        } while (z2 == this.f275b);
        this.f277d = z2;
    }

    public void m(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 1) {
            do {
                ((S) interfaceC0421v).add(Double.valueOf(abstractC0410j.i()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int w10 = abstractC0410j.w();
        if ((w10 & 7) != 0) {
            throw new C0424y(StubApp.getString2(445));
        }
        int c10 = abstractC0410j.c() + w10;
        do {
            ((S) interfaceC0421v).add(Double.valueOf(abstractC0410j.i()));
        } while (abstractC0410j.c() < c10);
    }

    public void n(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof r;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(abstractC0741n.l()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int A4 = abstractC0741n.A();
            U(A4);
            int d8 = abstractC0741n.d() + A4;
            do {
                list.add(Double.valueOf(abstractC0741n.l()));
            } while (abstractC0741n.d() < d8);
            return;
        }
        r rVar = (r) list;
        int i10 = this.f275b & 7;
        if (i10 == 1) {
            do {
                rVar.b(abstractC0741n.l());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int A5 = abstractC0741n.A();
        U(A5);
        int d10 = abstractC0741n.d() + A5;
        do {
            rVar.b(abstractC0741n.l());
        } while (abstractC0741n.d() < d10);
    }

    public void o(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.j()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.j()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void p(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0741n.m()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Integer.valueOf(abstractC0741n.m()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                g10.b(abstractC0741n.m());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            g10.b(abstractC0741n.m());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public Object q(p0 p0Var, Class cls, C0413m c0413m) {
        int ordinal = p0Var.ordinal();
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        switch (ordinal) {
            case 0:
                R(1);
                return Double.valueOf(abstractC0410j.i());
            case 1:
                R(5);
                return Float.valueOf(abstractC0410j.m());
            case 2:
                R(0);
                return Long.valueOf(abstractC0410j.o());
            case 3:
                R(0);
                return Long.valueOf(abstractC0410j.x());
            case 4:
                R(0);
                return Integer.valueOf(abstractC0410j.n());
            case 5:
                R(1);
                return Long.valueOf(abstractC0410j.l());
            case 6:
                R(5);
                return Integer.valueOf(abstractC0410j.k());
            case 7:
                R(0);
                return Boolean.valueOf(abstractC0410j.g());
            case 8:
                R(2);
                return abstractC0410j.u();
            case 9:
            default:
                throw new IllegalArgumentException(StubApp.getString2(449));
            case 10:
                R(2);
                U a3 = Q.f9734c.a(cls);
                AbstractC0420u d8 = a3.d();
                e(d8, a3, c0413m);
                a3.b(d8);
                return d8;
            case 11:
                return i();
            case 12:
                R(0);
                return Integer.valueOf(abstractC0410j.w());
            case 13:
                R(0);
                return Integer.valueOf(abstractC0410j.j());
            case 14:
                R(5);
                return Integer.valueOf(abstractC0410j.p());
            case 15:
                R(1);
                return Long.valueOf(abstractC0410j.q());
            case 16:
                R(0);
                return Integer.valueOf(abstractC0410j.r());
            case 17:
                R(0);
                return Long.valueOf(abstractC0410j.s());
        }
    }

    public void r(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 2) {
            int w10 = abstractC0410j.w();
            if ((w10 & 3) != 0) {
                throw new C0424y(StubApp.getString2(445));
            }
            int c10 = abstractC0410j.c() + w10;
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.k()));
            } while (abstractC0410j.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw C0424y.b();
        }
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.k()));
            if (abstractC0410j.d()) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == this.f275b);
        this.f277d = v2;
    }

    public void s(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 2) {
                int A4 = abstractC0741n.A();
                T(A4);
                int d8 = abstractC0741n.d() + A4;
                do {
                    list.add(Integer.valueOf(abstractC0741n.n()));
                } while (abstractC0741n.d() < d8);
                return;
            }
            if (i3 != 5) {
                throw T.c();
            }
            do {
                list.add(Integer.valueOf(abstractC0741n.n()));
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z2 = abstractC0741n.z();
                }
            } while (z2 == this.f275b);
            this.f277d = z2;
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 2) {
            int A5 = abstractC0741n.A();
            T(A5);
            int d10 = abstractC0741n.d() + A5;
            do {
                g10.b(abstractC0741n.n());
            } while (abstractC0741n.d() < d10);
            return;
        }
        if (i10 != 5) {
            throw T.c();
        }
        do {
            g10.b(abstractC0741n.n());
            if (abstractC0741n.e()) {
                return;
            } else {
                z10 = abstractC0741n.z();
            }
        } while (z10 == this.f275b);
        this.f277d = z10;
    }

    public void t(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 1) {
            do {
                ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.l()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int w10 = abstractC0410j.w();
        if ((w10 & 7) != 0) {
            throw new C0424y(StubApp.getString2(445));
        }
        int c10 = abstractC0410j.c() + w10;
        do {
            ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.l()));
        } while (abstractC0410j.c() < c10);
    }

    public String toString() {
        switch (this.f274a) {
            case 3:
                return String.format(StubApp.getString2(450), Integer.valueOf(this.f275b), Integer.valueOf(this.f276c), Integer.valueOf(this.f277d));
            default:
                return super.toString();
        }
    }

    public void u(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0716a0;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0741n.o()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int A4 = abstractC0741n.A();
            U(A4);
            int d8 = abstractC0741n.d() + A4;
            do {
                list.add(Long.valueOf(abstractC0741n.o()));
            } while (abstractC0741n.d() < d8);
            return;
        }
        C0716a0 c0716a0 = (C0716a0) list;
        int i10 = this.f275b & 7;
        if (i10 == 1) {
            do {
                c0716a0.b(abstractC0741n.o());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int A5 = abstractC0741n.A();
        U(A5);
        int d10 = abstractC0741n.d() + A5;
        do {
            c0716a0.b(abstractC0741n.o());
        } while (abstractC0741n.d() < d10);
    }

    public void v(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 2) {
            int w10 = abstractC0410j.w();
            if ((w10 & 3) != 0) {
                throw new C0424y(StubApp.getString2(445));
            }
            int c10 = abstractC0410j.c() + w10;
            do {
                ((S) interfaceC0421v).add(Float.valueOf(abstractC0410j.m()));
            } while (abstractC0410j.c() < c10);
            return;
        }
        if (i3 != 5) {
            throw C0424y.b();
        }
        do {
            ((S) interfaceC0421v).add(Float.valueOf(abstractC0410j.m()));
            if (abstractC0410j.d()) {
                return;
            } else {
                v2 = abstractC0410j.v();
            }
        } while (v2 == this.f275b);
        this.f277d = v2;
    }

    public void w(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof C0754y;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 2) {
                int A4 = abstractC0741n.A();
                T(A4);
                int d8 = abstractC0741n.d() + A4;
                do {
                    list.add(Float.valueOf(abstractC0741n.p()));
                } while (abstractC0741n.d() < d8);
                return;
            }
            if (i3 != 5) {
                throw T.c();
            }
            do {
                list.add(Float.valueOf(abstractC0741n.p()));
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z2 = abstractC0741n.z();
                }
            } while (z2 == this.f275b);
            this.f277d = z2;
            return;
        }
        C0754y c0754y = (C0754y) list;
        int i10 = this.f275b & 7;
        if (i10 == 2) {
            int A5 = abstractC0741n.A();
            T(A5);
            int d10 = abstractC0741n.d() + A5;
            do {
                c0754y.b(abstractC0741n.p());
            } while (abstractC0741n.d() < d10);
            return;
        }
        if (i10 != 5) {
            throw T.c();
        }
        do {
            c0754y.b(abstractC0741n.p());
            if (abstractC0741n.e()) {
                return;
            } else {
                z10 = abstractC0741n.z();
            }
        } while (z10 == this.f275b);
        this.f277d = z10;
    }

    public void x(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.n()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Integer.valueOf(abstractC0410j.n()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public void y(List list) {
        int z2;
        int z10;
        boolean z11 = list instanceof G;
        AbstractC0741n abstractC0741n = (AbstractC0741n) this.f278e;
        if (!z11) {
            int i3 = this.f275b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0741n.q()));
                    if (abstractC0741n.e()) {
                        return;
                    } else {
                        z2 = abstractC0741n.z();
                    }
                } while (z2 == this.f275b);
                this.f277d = z2;
                return;
            }
            if (i3 != 2) {
                throw T.c();
            }
            int d8 = abstractC0741n.d() + abstractC0741n.A();
            do {
                list.add(Integer.valueOf(abstractC0741n.q()));
            } while (abstractC0741n.d() < d8);
            Q(d8);
            return;
        }
        G g10 = (G) list;
        int i10 = this.f275b & 7;
        if (i10 == 0) {
            do {
                g10.b(abstractC0741n.q());
                if (abstractC0741n.e()) {
                    return;
                } else {
                    z10 = abstractC0741n.z();
                }
            } while (z10 == this.f275b);
            this.f277d = z10;
            return;
        }
        if (i10 != 2) {
            throw T.c();
        }
        int d10 = abstractC0741n.d() + abstractC0741n.A();
        do {
            g10.b(abstractC0741n.q());
        } while (abstractC0741n.d() < d10);
        Q(d10);
    }

    public void z(InterfaceC0421v interfaceC0421v) {
        int v2;
        int i3 = this.f275b & 7;
        AbstractC0410j abstractC0410j = (AbstractC0410j) this.f278e;
        if (i3 == 0) {
            do {
                ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.o()));
                if (abstractC0410j.d()) {
                    return;
                } else {
                    v2 = abstractC0410j.v();
                }
            } while (v2 == this.f275b);
            this.f277d = v2;
            return;
        }
        if (i3 != 2) {
            throw C0424y.b();
        }
        int c10 = abstractC0410j.c() + abstractC0410j.w();
        do {
            ((S) interfaceC0421v).add(Long.valueOf(abstractC0410j.o()));
        } while (abstractC0410j.c() < c10);
        Q(c10);
    }

    public g() {
        this.f274a = 5;
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f277d = highestOneBit - 1;
        this.f278e = new int[highestOneBit];
    }

    public g(AbstractC0410j abstractC0410j) {
        this.f274a = 1;
        this.f277d = 0;
        Charset charset = AbstractC0422w.f9852a;
        this.f278e = abstractC0410j;
        abstractC0410j.f9808b = this;
    }

    public g(AbstractC0741n abstractC0741n) {
        this.f274a = 2;
        this.f277d = 0;
        com.google.protobuf.Q.a(abstractC0741n, StubApp.getString2(294));
        this.f278e = abstractC0741n;
        abstractC0741n.f12201b = this;
    }

    public g(wb.f fVar, int i3, int i10, int i11) {
        this.f274a = 0;
        this.f278e = fVar;
        this.f275b = i3;
        this.f276c = i10;
        this.f277d = i11;
    }
}
