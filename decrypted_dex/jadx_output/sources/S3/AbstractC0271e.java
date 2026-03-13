package S3;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c4.AbstractC0566a;
import com.google.android.gms.common.api.Scope;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: S3.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0271e {

    /* renamed from: A, reason: collision with root package name */
    public static final com.google.android.gms.common.d[] f6490A = new com.google.android.gms.common.d[0];

    /* renamed from: b, reason: collision with root package name */
    public J1.t f6492b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6493c;

    /* renamed from: d, reason: collision with root package name */
    public final O f6494d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.e f6495e;

    /* renamed from: f, reason: collision with root package name */
    public final F f6496f;
    public z j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0270d f6499k;

    /* renamed from: l, reason: collision with root package name */
    public IInterface f6500l;

    /* renamed from: n, reason: collision with root package name */
    public H f6502n;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0268b f6504q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0269c f6505r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6506s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6507t;

    /* renamed from: v, reason: collision with root package name */
    public volatile String f6508v;

    /* renamed from: a, reason: collision with root package name */
    public volatile String f6491a = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6497g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f6498h = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f6501m = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public int f6503p = 1;

    /* renamed from: w, reason: collision with root package name */
    public com.google.android.gms.common.b f6509w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6510x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile K f6511y = null;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicInteger f6512z = new AtomicInteger(0);

    public AbstractC0271e(Context context, Looper looper, O o5, com.google.android.gms.common.e eVar, int i3, InterfaceC0268b interfaceC0268b, InterfaceC0269c interfaceC0269c, String str) {
        D.i(context, StubApp.getString2(5965));
        this.f6493c = context;
        D.i(looper, StubApp.getString2(5966));
        D.i(o5, StubApp.getString2(5967));
        this.f6494d = o5;
        D.i(eVar, StubApp.getString2(5968));
        this.f6495e = eVar;
        this.f6496f = new F(this, looper);
        this.f6506s = i3;
        this.f6504q = interfaceC0268b;
        this.f6505r = interfaceC0269c;
        this.f6507t = str;
    }

    public static /* bridge */ /* synthetic */ boolean z(AbstractC0271e abstractC0271e, int i3, int i10, IInterface iInterface) {
        synchronized (abstractC0271e.f6497g) {
            try {
                if (abstractC0271e.f6503p != i3) {
                    return false;
                }
                abstractC0271e.A(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(int i3, IInterface iInterface) {
        J1.t tVar;
        String string2 = StubApp.getString2(5969);
        String string22 = StubApp.getString2(5969);
        String string23 = StubApp.getString2(5970);
        String string24 = StubApp.getString2(5971);
        D.b((i3 == 4) == (iInterface != null));
        synchronized (this.f6497g) {
            try {
                this.f6503p = i3;
                this.f6500l = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    H h2 = this.f6502n;
                    if (h2 != null) {
                        O o5 = this.f6494d;
                        String str = this.f6492b.f3378b;
                        D.h(str);
                        this.f6492b.getClass();
                        if (this.f6507t == null) {
                            this.f6493c.getClass();
                        }
                        o5.c(str, h2, this.f6492b.f3379c);
                        this.f6502n = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    H h4 = this.f6502n;
                    if (h4 != null && (tVar = this.f6492b) != null) {
                        Log.e(StubApp.getString2("5933"), string24 + tVar.f3378b + string22);
                        O o10 = this.f6494d;
                        String str2 = this.f6492b.f3378b;
                        D.h(str2);
                        this.f6492b.getClass();
                        if (this.f6507t == null) {
                            this.f6493c.getClass();
                        }
                        o10.c(str2, h4, this.f6492b.f3379c);
                        this.f6512z.incrementAndGet();
                    }
                    H h5 = new H(this, this.f6512z.get());
                    this.f6502n = h5;
                    String v2 = v();
                    boolean w10 = w();
                    this.f6492b = new J1.t(v2, w10, 2);
                    if (w10 && j() < 17895000) {
                        throw new IllegalStateException(StubApp.getString2("5972").concat(String.valueOf(this.f6492b.f3378b)));
                    }
                    O o11 = this.f6494d;
                    String str3 = this.f6492b.f3378b;
                    D.h(str3);
                    this.f6492b.getClass();
                    String str4 = this.f6507t;
                    if (str4 == null) {
                        str4 = this.f6493c.getClass().getName();
                    }
                    com.google.android.gms.common.b b2 = o11.b(new L(str3, this.f6492b.f3379c), h5, str4, null);
                    if (!b2.d()) {
                        Log.w(StubApp.getString2("5933"), string23 + this.f6492b.f3378b + string2);
                        int i10 = b2.f11176b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b2.f11177c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(StubApp.getString2("5936"), b2.f11177c);
                        }
                        int i11 = this.f6512z.get();
                        J j = new J(this, i10, bundle);
                        F f10 = this.f6496f;
                        f10.sendMessage(f10.obtainMessage(7, i11, -1, j));
                    }
                } else if (i3 == 4) {
                    D.h(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final void a(Z9.q qVar) {
        ((R3.r) qVar.f9143b).f6159q.f6135p.post(new L9.n(qVar, 17));
    }

    public final void c(InterfaceC0270d interfaceC0270d) {
        this.f6499k = interfaceC0270d;
        A(2, null);
    }

    public final void d(String str) {
        this.f6491a = str;
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(InterfaceC0276j interfaceC0276j, Set set) {
        Bundle r8 = r();
        String str = Build.VERSION.SDK_INT < 31 ? this.f6508v : this.f6508v;
        int i3 = this.f6506s;
        int i10 = com.google.android.gms.common.e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = C0274h.f6521q;
        Bundle bundle = new Bundle();
        com.google.android.gms.common.d[] dVarArr = C0274h.f6522r;
        C0274h c0274h = new C0274h(6, i3, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0274h.f6526d = this.f6493c.getPackageName();
        c0274h.f6529g = r8;
        if (set != null) {
            c0274h.f6528f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account p8 = p();
            if (p8 == null) {
                p8 = new Account(StubApp.getString2(5973), StubApp.getString2(5612));
            }
            c0274h.f6530h = p8;
            if (interfaceC0276j != 0) {
                c0274h.f6527e = ((AbstractC0566a) interfaceC0276j).f10820f;
            }
        }
        c0274h.j = f6490A;
        c0274h.f6531k = q();
        if (y()) {
            c0274h.f6534n = true;
        }
        try {
            synchronized (this.f6498h) {
                try {
                    z zVar = this.j;
                    if (zVar != null) {
                        zVar.e(new G(this, this.f6512z.get()), c0274h);
                    } else {
                        Log.w(StubApp.getString2("5933"), StubApp.getString2("5974"));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e10) {
            Log.w(StubApp.getString2(5933), StubApp.getString2(5975), e10);
            int i11 = this.f6512z.get();
            F f10 = this.f6496f;
            f10.sendMessage(f10.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w(StubApp.getString2(5933), StubApp.getString2(5975), e);
            int i12 = this.f6512z.get();
            I i13 = new I(this, 8, null, null);
            F f11 = this.f6496f;
            f11.sendMessage(f11.obtainMessage(1, i12, -1, i13));
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w(StubApp.getString2(5933), StubApp.getString2(5975), e);
            int i122 = this.f6512z.get();
            I i132 = new I(this, 8, null, null);
            F f112 = this.f6496f;
            f112.sendMessage(f112.obtainMessage(1, i122, -1, i132));
        }
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.f6497g) {
            int i3 = this.f6503p;
            z2 = true;
            if (i3 != 2 && i3 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    public final void g() {
        if (!i() || this.f6492b == null) {
            throw new RuntimeException(StubApp.getString2(5976));
        }
    }

    public final void h() {
        this.f6512z.incrementAndGet();
        synchronized (this.f6501m) {
            try {
                int size = this.f6501m.size();
                for (int i3 = 0; i3 < size; i3++) {
                    x xVar = (x) this.f6501m.get(i3);
                    synchronized (xVar) {
                        xVar.f6575a = null;
                    }
                }
                this.f6501m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6498h) {
            this.j = null;
        }
        A(1, null);
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.f6497g) {
            z2 = this.f6503p == 4;
        }
        return z2;
    }

    public abstract int j();

    public final com.google.android.gms.common.d[] k() {
        K k3 = this.f6511y;
        if (k3 == null) {
            return null;
        }
        return k3.f6464b;
    }

    public final String l() {
        return this.f6491a;
    }

    public boolean m() {
        return false;
    }

    public final void n() {
        int isGooglePlayServicesAvailable = this.f6495e.isGooglePlayServicesAvailable(this.f6493c, j());
        if (isGooglePlayServicesAvailable == 0) {
            c(new C0280n(this));
            return;
        }
        A(1, null);
        this.f6499k = new C0280n(this);
        int i3 = this.f6512z.get();
        F f10 = this.f6496f;
        f10.sendMessage(f10.obtainMessage(3, i3, isGooglePlayServicesAvailable, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public com.google.android.gms.common.d[] q() {
        return f6490A;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f6497g) {
            try {
                if (this.f6503p == 5) {
                    throw new DeadObjectException();
                }
                if (!i()) {
                    throw new IllegalStateException(StubApp.getString2("5978"));
                }
                iInterface = this.f6500l;
                D.i(iInterface, StubApp.getString2("5977"));
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return j() >= 211700000;
    }

    public void x() {
        System.currentTimeMillis();
    }

    public boolean y() {
        return this instanceof f4.p;
    }
}
