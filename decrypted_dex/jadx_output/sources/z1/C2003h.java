package z1;

import T0.H;
import com.stub.StubApp;
import java.util.Collections;
import java.util.List;
import o0.AbstractC1405B;
import o0.C1437l;
import r0.AbstractC1550k;
import r0.C1553n;

/* renamed from: z1.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2003h implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23822a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23823b;

    /* renamed from: c, reason: collision with root package name */
    public long f23824c;

    /* renamed from: d, reason: collision with root package name */
    public int f23825d;

    /* renamed from: e, reason: collision with root package name */
    public int f23826e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23827f;

    /* renamed from: g, reason: collision with root package name */
    public Object f23828g;

    public C2003h(List list) {
        this.f23822a = 0;
        this.f23827f = list;
        this.f23828g = new H[list.size()];
        this.f23824c = -9223372036854775807L;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        switch (this.f23822a) {
            case 0:
                this.f23823b = false;
                this.f23824c = -9223372036854775807L;
                break;
            default:
                this.f23823b = false;
                this.f23824c = -9223372036854775807L;
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void c(C1553n c1553n) {
        boolean z2;
        boolean z10;
        switch (this.f23822a) {
            case 0:
                if (this.f23823b) {
                    if (this.f23825d == 2) {
                        if (c1553n.a() == 0) {
                            z10 = false;
                        } else {
                            if (c1553n.u() != 32) {
                                this.f23823b = false;
                            }
                            this.f23825d--;
                            z10 = this.f23823b;
                        }
                        if (!z10) {
                        }
                    }
                    if (this.f23825d == 1) {
                        if (c1553n.a() == 0) {
                            z2 = false;
                        } else {
                            if (c1553n.u() != 0) {
                                this.f23823b = false;
                            }
                            this.f23825d--;
                            z2 = this.f23823b;
                        }
                        if (!z2) {
                        }
                    }
                    int i3 = c1553n.f20177b;
                    int a3 = c1553n.a();
                    for (H h2 : (H[]) this.f23828g) {
                        c1553n.G(i3);
                        h2.a(c1553n, a3, 0);
                    }
                    this.f23826e += a3;
                    break;
                }
                break;
            default:
                AbstractC1550k.h((H) this.f23828g);
                if (this.f23823b) {
                    int a9 = c1553n.a();
                    int i10 = this.f23826e;
                    if (i10 < 10) {
                        int min = Math.min(a9, 10 - i10);
                        byte[] bArr = c1553n.f20176a;
                        int i11 = c1553n.f20177b;
                        C1553n c1553n2 = (C1553n) this.f23827f;
                        System.arraycopy(bArr, i11, c1553n2.f20176a, this.f23826e, min);
                        if (this.f23826e + min == 10) {
                            c1553n2.G(0);
                            if (73 != c1553n2.u() || 68 != c1553n2.u() || 51 != c1553n2.u()) {
                                AbstractC1550k.w(StubApp.getString2(24870), StubApp.getString2(24871));
                                this.f23823b = false;
                                break;
                            } else {
                                c1553n2.H(3);
                                this.f23825d = c1553n2.t() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a9, this.f23825d - this.f23826e);
                    ((H) this.f23828g).a(c1553n, min2, 0);
                    this.f23826e += min2;
                    break;
                }
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
        int i3;
        switch (this.f23822a) {
            case 0:
                if (this.f23823b) {
                    AbstractC1550k.g(this.f23824c != -9223372036854775807L);
                    for (H h2 : (H[]) this.f23828g) {
                        h2.c(this.f23824c, 1, this.f23826e, 0, null);
                    }
                    this.f23823b = false;
                    break;
                }
                break;
            default:
                AbstractC1550k.h((H) this.f23828g);
                if (this.f23823b && (i3 = this.f23825d) != 0 && this.f23826e == i3) {
                    AbstractC1550k.g(this.f23824c != -9223372036854775807L);
                    ((H) this.f23828g).c(this.f23824c, 1, this.f23825d, 0, null);
                    this.f23823b = false;
                    break;
                }
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        switch (this.f23822a) {
            case 0:
                if ((i3 & 4) != 0) {
                    this.f23823b = true;
                    this.f23824c = j;
                    this.f23826e = 0;
                    this.f23825d = 2;
                    break;
                }
                break;
            default:
                if ((i3 & 4) != 0) {
                    this.f23823b = true;
                    this.f23824c = j;
                    this.f23825d = 0;
                    this.f23826e = 0;
                    break;
                }
                break;
        }
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        switch (this.f23822a) {
            case 0:
                int i3 = 0;
                while (true) {
                    H[] hArr = (H[]) this.f23828g;
                    if (i3 >= hArr.length) {
                        break;
                    } else {
                        C1993E c1993e = (C1993E) ((List) this.f23827f).get(i3);
                        c1994f.a();
                        c1994f.b();
                        H w10 = qVar.w(c1994f.f23754d, 3);
                        C1437l c1437l = new C1437l();
                        c1994f.b();
                        c1437l.f18166a = c1994f.f23755e;
                        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(19274));
                        c1437l.f18180p = Collections.singletonList(c1993e.f23750b);
                        c1437l.f18169d = c1993e.f23749a;
                        E1.a.w(c1437l, w10);
                        hArr[i3] = w10;
                        i3++;
                    }
                }
            default:
                c1994f.a();
                c1994f.b();
                H w11 = qVar.w(c1994f.f23754d, 5);
                this.f23828g = w11;
                C1437l c1437l2 = new C1437l();
                c1994f.b();
                c1437l2.f18166a = c1994f.f23755e;
                c1437l2.f18177m = AbstractC1405B.m(StubApp.getString2(474));
                E1.a.w(c1437l2, w11);
                break;
        }
    }

    public C2003h() {
        this.f23822a = 1;
        this.f23827f = new C1553n(10);
        this.f23824c = -9223372036854775807L;
    }
}
