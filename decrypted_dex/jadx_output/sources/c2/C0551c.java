package c2;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0551c {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.b f10787a;

    /* renamed from: b, reason: collision with root package name */
    public final C0550b f10788b;

    /* renamed from: c, reason: collision with root package name */
    public final C0550b f10789c;

    public C0551c(Z1.b bounds, C0550b type, C0550b state) {
        Intrinsics.checkNotNullParameter(bounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f10787a = bounds;
        this.f10788b = type;
        this.f10789c = state;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int i3 = bounds.f8947c;
        int i10 = bounds.f8945a;
        int i11 = i3 - i10;
        int i12 = bounds.f8946b;
        if (i11 == 0 && bounds.f8948d - i12 == 0) {
            throw new IllegalArgumentException(StubApp.getString2(9381));
        }
        if (i10 != 0 && i12 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(9382));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0551c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0551c c0551c = (C0551c) obj;
        if (Intrinsics.areEqual(this.f10787a, c0551c.f10787a) && Intrinsics.areEqual(this.f10788b, c0551c.f10788b)) {
            return Intrinsics.areEqual(this.f10789c, c0551c.f10789c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10789c.hashCode() + ((this.f10788b.hashCode() + (this.f10787a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0551c.class.getSimpleName() + StubApp.getString2(9383) + this.f10787a + StubApp.getString2(2148) + this.f10788b + StubApp.getString2(9384) + this.f10789c + StubApp.getString2(9385);
    }
}
