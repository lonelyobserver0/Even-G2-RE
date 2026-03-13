package P7;

import com.mapbox.api.directions.v5.models.LegStep;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5586b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5587c;

    /* renamed from: d, reason: collision with root package name */
    public final LegStep f5588d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5589e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5590f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5591g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5592h;

    /* renamed from: i, reason: collision with root package name */
    public final double f5593i;

    public d(int i3, int i10, Integer num, LegStep legStep, List list, float f10, float f11, float f12, double d8) {
        this.f5585a = i3;
        this.f5586b = i10;
        this.f5587c = num;
        this.f5588d = legStep;
        this.f5589e = list;
        this.f5590f = f10;
        this.f5591g = f11;
        this.f5592h = f12;
        this.f5593i = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.trip.model.RouteStepProgress");
        d dVar = (d) obj;
        return this.f5585a == dVar.f5585a && this.f5586b == dVar.f5586b && Intrinsics.areEqual(this.f5587c, dVar.f5587c) && Intrinsics.areEqual(this.f5588d, dVar.f5588d) && Intrinsics.areEqual(this.f5589e, dVar.f5589e) && this.f5590f == dVar.f5590f && this.f5591g == dVar.f5591g && this.f5592h == dVar.f5592h && this.f5593i == dVar.f5593i;
    }

    public final int hashCode() {
        int i3 = ((this.f5585a * 31) + this.f5586b) * 31;
        Integer num = this.f5587c;
        int hashCode = (i3 + (num != null ? num.hashCode() : 0)) * 31;
        LegStep legStep = this.f5588d;
        int hashCode2 = (hashCode + (legStep != null ? legStep.hashCode() : 0)) * 31;
        List list = this.f5589e;
        return Double.hashCode(this.f5593i) + ((Float.hashCode(this.f5592h) + ((Float.hashCode(this.f5591g) + ((Float.hashCode(this.f5590f) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(5015) + this.f5585a + StubApp.getString2(2691) + this.f5586b + StubApp.getString2(5016) + this.f5587c + StubApp.getString2(5017) + this.f5588d + StubApp.getString2(5018) + this.f5589e + StubApp.getString2(4989) + this.f5590f + StubApp.getString2(4988) + this.f5591g + StubApp.getString2(4991) + this.f5592h + StubApp.getString2(4990) + this.f5593i + ')';
    }
}
