package Qb;

import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0189d extends AbstractC0199i {

    /* renamed from: a, reason: collision with root package name */
    public final C0187c[] f5857a;

    public C0189d(C0187c[] c0187cArr) {
        this.f5857a = c0187cArr;
    }

    @Override // Qb.AbstractC0199i
    public final void b(Throwable th) {
        c();
    }

    public final void c() {
        for (C0187c c0187c : this.f5857a) {
            Y y10 = c0187c.f5853f;
            if (y10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                y10 = null;
            }
            y10.dispose();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        c();
        return Unit.INSTANCE;
    }

    public final String toString() {
        return StubApp.getString2(25498) + this.f5857a + ']';
    }
}
