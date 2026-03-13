package d;

import d0.C0766D;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x implements InterfaceC0760b {

    /* renamed from: a, reason: collision with root package name */
    public final C0766D f13113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f13114b;

    public x(z zVar, C0766D onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f13114b = zVar;
        this.f13113a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // d.InterfaceC0760b
    public final void cancel() {
        z zVar = this.f13114b;
        ArrayDeque arrayDeque = zVar.f13117b;
        C0766D c0766d = this.f13113a;
        arrayDeque.remove(c0766d);
        if (Intrinsics.areEqual(zVar.f13118c, c0766d)) {
            c0766d.a();
            zVar.f13118c = null;
        }
        c0766d.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        c0766d.f13129b.remove(this);
        ?? r02 = c0766d.f13130c;
        if (r02 != 0) {
            r02.invoke();
        }
        c0766d.f13130c = null;
    }
}
