package Tb;

import Ub.AbstractC0347c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

/* renamed from: Tb.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0325f implements InterfaceC0327h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0327h f7357a;

    /* renamed from: b, reason: collision with root package name */
    public final C0332m f7358b;

    /* renamed from: c, reason: collision with root package name */
    public final C0331l f7359c;

    public C0325f(InterfaceC0327h interfaceC0327h, C0332m c0332m, C0331l c0331l) {
        this.f7357a = interfaceC0327h;
        this.f7358b = c0332m;
        this.f7359c = c0331l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F5.c, T] */
    @Override // Tb.InterfaceC0327h
    public final Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AbstractC0347c.f7577b;
        Object p8 = this.f7357a.p(new C0324e(this, objectRef, interfaceC0328i), continuation);
        return p8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p8 : Unit.INSTANCE;
    }
}
