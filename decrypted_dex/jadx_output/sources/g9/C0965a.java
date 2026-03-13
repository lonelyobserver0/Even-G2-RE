package g9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0965a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14236a;

    /* renamed from: b, reason: collision with root package name */
    public final e f14237b;

    /* renamed from: c, reason: collision with root package name */
    public final e f14238c;

    public C0965a(int i3, e eVar, e eVar2) {
        this.f14236a = i3;
        this.f14237b = eVar;
        this.f14238c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0965a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions");
        C0965a c0965a = (C0965a) obj;
        return this.f14236a == c0965a.f14236a && Intrinsics.areEqual(this.f14237b, c0965a.f14237b) && Intrinsics.areEqual(this.f14238c, c0965a.f14238c);
    }

    public final int hashCode() {
        return this.f14238c.hashCode() + ((this.f14237b.hashCode() + (Integer.hashCode(this.f14236a) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(17810) + this.f14236a + StubApp.getString2(17811) + this.f14237b + StubApp.getString2(17812) + this.f14238c + ')';
    }
}
