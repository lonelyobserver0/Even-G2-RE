package c2;

import N.c0;
import android.graphics.Rect;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0559k {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.b f10805a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f10806b;

    public C0559k(Z1.b _bounds, c0 _windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(_bounds, "_bounds");
        Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
        this.f10805a = _bounds;
        this.f10806b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0559k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C0559k c0559k = (C0559k) obj;
        return Intrinsics.areEqual(this.f10805a, c0559k.f10805a) && Intrinsics.areEqual(this.f10806b, c0559k.f10806b);
    }

    public final int hashCode() {
        return this.f10806b.hashCode() + (this.f10805a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(9401) + this.f10805a + StubApp.getString2(9402) + this.f10806b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0559k(Rect bounds, c0 insets) {
        this(new Z1.b(bounds), insets);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
