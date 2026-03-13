package l4;

import S3.InterfaceC0268b;
import S3.InterfaceC0269c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.stub.StubApp;
import i.RunnableC1018B;
import java.util.Objects;

/* renamed from: l4.i1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ServiceConnectionC1186i1 implements ServiceConnection, InterfaceC0268b, InterfaceC0269c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f16465a;

    /* renamed from: b, reason: collision with root package name */
    public volatile P f16466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16467c;

    public ServiceConnectionC1186i1(C1189j1 c1189j1) {
        Objects.requireNonNull(c1189j1);
        this.f16467c = c1189j1;
    }

    @Override // S3.InterfaceC0268b
    public final void e(int i3) {
        C1200n0 c1200n0 = (C1200n0) this.f16467c.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.p();
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16248n.b(StubApp.getString2(20476));
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        c1191k02.t(new RunnableC1018B(this));
    }

    @Override // S3.InterfaceC0268b
    public final void f() {
        C1191k0 c1191k0 = ((C1200n0) this.f16467c.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.p();
        synchronized (this) {
            try {
                S3.D.h(this.f16466b);
                InterfaceC1151G interfaceC1151G = (InterfaceC1151G) this.f16466b.t();
                C1191k0 c1191k02 = ((C1200n0) this.f16467c.f4728a).f16542g;
                C1200n0.l(c1191k02);
                c1191k02.t(new RunnableC1180g1(this, interfaceC1151G, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16466b = null;
                this.f16465a = false;
            }
        }
    }

    @Override // S3.InterfaceC0269c
    public final void g(com.google.android.gms.common.b bVar) {
        C1189j1 c1189j1 = this.f16467c;
        C1191k0 c1191k0 = ((C1200n0) c1189j1.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.p();
        T t3 = ((C1200n0) c1189j1.f4728a).f16541f;
        if (t3 == null || !t3.f16634b) {
            t3 = null;
        }
        if (t3 != null) {
            t3.f16249p.c(bVar, StubApp.getString2(20477));
        }
        synchronized (this) {
            this.f16465a = false;
            this.f16466b = null;
        }
        C1191k0 c1191k02 = ((C1200n0) this.f16467c.f4728a).f16542g;
        C1200n0.l(c1191k02);
        c1191k02.t(new O0(this, bVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1191k0 c1191k0 = ((C1200n0) this.f16467c.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.p();
        synchronized (this) {
            if (iBinder == null) {
                this.f16465a = false;
                T t3 = ((C1200n0) this.f16467c.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.b(StubApp.getString2("20478"));
                return;
            }
            InterfaceC1151G interfaceC1151G = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if (StubApp.getString2("19671").equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2("19671"));
                    interfaceC1151G = queryLocalInterface instanceof InterfaceC1151G ? (InterfaceC1151G) queryLocalInterface : new C1149E(iBinder);
                    T t10 = ((C1200n0) this.f16467c.f4728a).f16541f;
                    C1200n0.l(t10);
                    t10.f16249p.b(StubApp.getString2("20479"));
                } else {
                    T t11 = ((C1200n0) this.f16467c.f4728a).f16541f;
                    C1200n0.l(t11);
                    t11.f16242f.c(interfaceDescriptor, StubApp.getString2("20480"));
                }
            } catch (RemoteException unused) {
                T t12 = ((C1200n0) this.f16467c.f4728a).f16541f;
                C1200n0.l(t12);
                t12.f16242f.b(StubApp.getString2("20481"));
            }
            if (interfaceC1151G == null) {
                this.f16465a = false;
                try {
                    V3.a b2 = V3.a.b();
                    C1189j1 c1189j1 = this.f16467c;
                    b2.c(((C1200n0) c1189j1.f4728a).f16536a, c1189j1.f16479c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C1191k0 c1191k02 = ((C1200n0) this.f16467c.f4728a).f16542g;
                C1200n0.l(c1191k02);
                c1191k02.t(new RunnableC1180g1(this, interfaceC1151G, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1200n0 c1200n0 = (C1200n0) this.f16467c.f4728a;
        C1191k0 c1191k0 = c1200n0.f16542g;
        C1200n0.l(c1191k0);
        c1191k0.p();
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        t3.f16248n.b(StubApp.getString2(4878));
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        c1191k02.t(new O0(this, componentName, 2, false));
    }
}
