package l4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.C0710z;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: l4.c0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ServiceConnectionC1167c0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f16400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1170d0 f16401b;

    public ServiceConnectionC1167c0(C1170d0 c1170d0, String str) {
        Objects.requireNonNull(c1170d0);
        this.f16401b = c1170d0;
        this.f16400a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1170d0 c1170d0 = this.f16401b;
        if (iBinder == null) {
            T t3 = c1170d0.f16407b.f16541f;
            C1200n0.l(t3);
            t3.j.b(StubApp.getString2(20380));
            return;
        }
        try {
            int i3 = com.google.android.gms.internal.measurement.A.f11229e;
            String string2 = StubApp.getString2("20376");
            IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
            com.google.android.gms.internal.measurement.B c0710z = queryLocalInterface instanceof com.google.android.gms.internal.measurement.B ? (com.google.android.gms.internal.measurement.B) queryLocalInterface : new C0710z(iBinder, string2, 1);
            if (c0710z == null) {
                T t10 = c1170d0.f16407b.f16541f;
                C1200n0.l(t10);
                t10.j.b(StubApp.getString2("20377"));
                return;
            }
            C1200n0 c1200n0 = c1170d0.f16407b;
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.f16249p.b(StubApp.getString2("20378"));
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.t(new Q4.b(this, c0710z, this));
        } catch (RuntimeException e10) {
            T t12 = c1170d0.f16407b.f16541f;
            C1200n0.l(t12);
            t12.j.c(e10, StubApp.getString2(20379));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        T t3 = this.f16401b.f16407b.f16541f;
        C1200n0.l(t3);
        t3.f16249p.b(StubApp.getString2(20381));
    }
}
