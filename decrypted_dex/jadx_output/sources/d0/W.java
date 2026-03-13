package d0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.InterfaceC0434i;
import com.stub.StubApp;
import i0.C1031d;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class W implements InterfaceC0434i, M1.e, androidx.lifecycle.W {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC0789t f13228a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.V f13229b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.o f13230c;

    /* renamed from: d, reason: collision with root package name */
    public C0446v f13231d = null;

    /* renamed from: e, reason: collision with root package name */
    public Z9.C f13232e = null;

    public W(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, androidx.lifecycle.V v2, B0.o oVar) {
        this.f13228a = abstractComponentCallbacksC0789t;
        this.f13229b = v2;
        this.f13230c = oVar;
    }

    public final void b(EnumC0438m enumC0438m) {
        this.f13231d.e(enumC0438m);
    }

    public final void c() {
        if (this.f13231d == null) {
            this.f13231d = new C0446v(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            C2.c cVar = new C2.c(this, new J2.d(this, 1));
            this.f13232e = new Z9.C(cVar);
            cVar.a();
            this.f13230c.run();
        }
    }

    @Override // androidx.lifecycle.InterfaceC0434i
    public final C1031d d() {
        Application application;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = this.f13228a;
        Context origApplicationContext = StubApp.getOrigApplicationContext(abstractComponentCallbacksC0789t.I().getApplicationContext());
        while (true) {
            if (!(origApplicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (origApplicationContext instanceof Application) {
                application = (Application) origApplicationContext;
                break;
            }
            origApplicationContext = ((ContextWrapper) origApplicationContext).getBaseContext();
        }
        C1031d c1031d = new C1031d(0);
        if (application != null) {
            c1031d.b(androidx.lifecycle.T.f9898f, application);
        }
        c1031d.b(androidx.lifecycle.L.f9880a, abstractComponentCallbacksC0789t);
        c1031d.b(androidx.lifecycle.L.f9881b, this);
        Bundle bundle = abstractComponentCallbacksC0789t.f13369f;
        if (bundle != null) {
            c1031d.b(androidx.lifecycle.L.f9882c, bundle);
        }
        return c1031d;
    }

    @Override // androidx.lifecycle.W
    public final androidx.lifecycle.V e() {
        c();
        return this.f13229b;
    }

    @Override // M1.e
    public final E0 f() {
        c();
        return (E0) this.f13232e.f9078c;
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        c();
        return this.f13231d;
    }
}
