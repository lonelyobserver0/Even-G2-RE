package e2;

import Xa.o;
import android.content.Context;
import c2.C0558j;
import d2.InterfaceC0798a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0837a implements InterfaceC0798a {
    @Override // d2.InterfaceC0798a
    public final void a(Context context, G1.c executor, o callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new C0558j(CollectionsKt.emptyList()));
    }

    @Override // d2.InterfaceC0798a
    public final void b(o callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
