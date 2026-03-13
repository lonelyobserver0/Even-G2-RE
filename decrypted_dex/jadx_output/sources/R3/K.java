package R3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0791v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K extends AbstractComponentCallbacksC0789t implements InterfaceC0240i {

    /* renamed from: p0, reason: collision with root package name */
    public static final WeakHashMap f6108p0 = new WeakHashMap();

    /* renamed from: o0, reason: collision with root package name */
    public final Bc.i f6109o0 = new Bc.i();

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void C() {
        this.f13352G = true;
        Bc.i iVar = this.f6109o0;
        iVar.f766b = 3;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).f();
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void D(Bundle bundle) {
        this.f6109o0.x(bundle);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void E() {
        this.f13352G = true;
        Bc.i iVar = this.f6109o0;
        iVar.f766b = 2;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).h();
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void F() {
        this.f13352G = true;
        Bc.i iVar = this.f6109o0;
        iVar.f766b = 4;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).i();
        }
    }

    @Override // R3.InterfaceC0240i
    public final AbstractC0239h b(Class cls, String str) {
        return (AbstractC0239h) cls.cast(((Map) this.f6109o0.f767c).get(str));
    }

    @Override // R3.InterfaceC0240i
    public final Activity c() {
        C0791v c0791v = this.f13385w;
        if (c0791v == null) {
            return null;
        }
        return c0791v.f13391a;
    }

    @Override // R3.InterfaceC0240i
    public final void g(String str, AbstractC0239h abstractC0239h) {
        this.f6109o0.v(str, abstractC0239h);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f6109o0.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).getClass();
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void u(int i3, int i10, Intent intent) {
        super.u(i3, i10, intent);
        Iterator it = ((Map) this.f6109o0.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).c(i3, i10, intent);
        }
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void w(Bundle bundle) {
        super.w(bundle);
        this.f6109o0.w(bundle);
    }

    @Override // d0.AbstractComponentCallbacksC0789t
    public final void y() {
        this.f13352G = true;
        Bc.i iVar = this.f6109o0;
        iVar.f766b = 5;
        Iterator it = ((Map) iVar.f767c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC0239h) it.next()).e();
        }
    }
}
