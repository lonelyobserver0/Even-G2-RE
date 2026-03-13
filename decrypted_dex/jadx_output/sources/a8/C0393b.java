package a8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0393b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9326a;

    public C0393b(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f9326a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0393b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.merge.MergingAreaInfo");
        return Intrinsics.areEqual(this.f9326a, ((C0393b) obj).f9326a);
    }

    public final int hashCode() {
        return this.f9326a.hashCode();
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(8566)), this.f9326a, StubApp.getString2(2142));
    }
}
