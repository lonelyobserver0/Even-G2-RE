package Zb;

import Qb.C0203k;
import Qb.InterfaceC0201j;
import Qb.V0;
import Vb.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c implements InterfaceC0201j, V0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0203k f9203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9204b;

    public c(e eVar, C0203k c0203k) {
        this.f9204b = eVar;
        this.f9203a = c0203k;
    }

    @Override // Qb.V0
    public final void a(v vVar, int i3) {
        this.f9203a.a(vVar, i3);
    }

    @Override // Qb.InterfaceC0201j
    public final F5.c c(Object obj, Function1 function1) {
        e eVar = this.f9204b;
        b bVar = new b(eVar, this, 1);
        F5.c E10 = this.f9203a.E((Unit) obj, bVar);
        if (E10 != null) {
            e.f9207h.set(eVar, null);
        }
        return E10;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f9203a.f5877e;
    }

    @Override // Qb.InterfaceC0201j
    public final void i(Object obj, Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f9207h;
        e eVar = this.f9204b;
        atomicReferenceFieldUpdater.set(eVar, null);
        b bVar = new b(eVar, this, 0);
        this.f9203a.i((Unit) obj, bVar);
    }

    @Override // Qb.InterfaceC0201j
    public final void l(Object obj) {
        this.f9203a.l(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f9203a.resumeWith(obj);
    }
}
