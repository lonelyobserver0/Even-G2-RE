package e8;

import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0852b extends R7.b {

    /* renamed from: h, reason: collision with root package name */
    public final int f13668h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13669i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final String f13670k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0852b(String id, int i3, String str, ArrayList arrayList, String str2, Double d8, String provider, Boolean bool, RoadObject roadObject) {
        super(id, 3, d8, provider, bool, roadObject);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(roadObject, StubApp.getString2(17381));
        this.f13668h = i3;
        this.f13669i = str;
        this.j = arrayList;
        this.f13670k = str2;
    }

    @Override // R7.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C0852b.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.roadobject.reststop.RestStop");
        C0852b c0852b = (C0852b) obj;
        return this.f13668h == c0852b.f13668h && Intrinsics.areEqual(this.f13669i, c0852b.f13669i) && Intrinsics.areEqual(this.j, c0852b.j) && Intrinsics.areEqual(this.f13670k, c0852b.f13670k);
    }

    @Override // R7.b
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f13668h) * 31;
        String str = this.f13669i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ArrayList arrayList = this.j;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str2 = this.f13670k;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // R7.b
    public final String toString() {
        return StubApp.getString2(17382) + this.f13668h + StubApp.getString2(12820) + this.j + StubApp.getString2(1065) + this.f13669i + StubApp.getString2(17383) + this.f13670k + StubApp.getString2(6022) + super.toString();
    }
}
