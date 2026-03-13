package Mb;

import Cb.e;
import S3.D;
import T0.H;
import android.content.Context;
import android.view.View;
import cb.C0585c;
import com.stub.StubApp;
import d0.a0;
import d0.c0;
import i2.u;
import kotlin.jvm.internal.Intrinsics;
import l4.C1191k0;
import l4.C1200n0;
import l4.InterfaceC1216v0;
import l4.T;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class b implements InterfaceC1216v0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f4728a;

    public b(C1200n0 c1200n0) {
        D.h(c1200n0);
        this.f4728a = c1200n0;
    }

    @Override // l4.InterfaceC1216v0
    public T a() {
        throw null;
    }

    @Override // l4.InterfaceC1216v0
    public C1191k0 b() {
        throw null;
    }

    @Override // l4.InterfaceC1216v0
    public C0585c c() {
        throw null;
    }

    @Override // l4.InterfaceC1216v0
    public Context e() {
        throw null;
    }

    @Override // l4.InterfaceC1216v0
    public W3.a f() {
        throw null;
    }

    public boolean g() {
        a aVar = (a) this.f4728a;
        return (aVar != null ? (e) aVar.f4725d : null) != null;
    }

    public boolean h() {
        c0 c0Var;
        a0 a0Var = (a0) this.f4728a;
        View view = a0Var.f13259c.f13354I;
        c0 c0Var2 = c0.f13288b;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            c0Var = c0.f13290d;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    c0Var = c0Var2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(u.p(visibility, StubApp.getString2(16478)));
                    }
                    c0Var = c0.f13289c;
                }
            }
        } else {
            c0Var = null;
        }
        c0 c0Var3 = a0Var.f13257a;
        if (c0Var != c0Var3) {
            return (c0Var == c0Var2 || c0Var3 == c0Var2) ? false : true;
        }
        return true;
    }

    public abstract b i(Context context);

    public abstract void j(int i3, long j);

    public void k() {
        C1191k0 c1191k0 = ((C1200n0) this.f4728a).f16542g;
        C1200n0.l(c1191k0);
        c1191k0.k();
    }

    public b(H h2) {
        this.f4728a = h2;
    }

    public b(a0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f4728a = operation;
    }
}
