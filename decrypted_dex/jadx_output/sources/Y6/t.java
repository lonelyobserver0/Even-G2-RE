package Y6;

import android.animation.TimeInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f8826a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f8827b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f8828c;

    public t(String str, Long l9, TimeInterpolator timeInterpolator) {
        this.f8826a = str;
        this.f8827b = l9;
        this.f8828c = timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(t.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.MapAnimationOptions");
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f8826a, tVar.f8826a) && Intrinsics.areEqual(this.f8827b, tVar.f8827b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f8828c, tVar.f8828c);
    }

    public final int hashCode() {
        String str = this.f8826a;
        int hashCode = (this.f8827b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 961;
        TimeInterpolator timeInterpolator = this.f8828c;
        return hashCode + (timeInterpolator != null ? timeInterpolator.hashCode() : 0);
    }
}
