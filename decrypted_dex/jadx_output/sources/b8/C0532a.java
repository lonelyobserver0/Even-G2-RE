package b8;

import R7.b;
import com.mapbox.navigator.RoadObject;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0532a extends b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0532a(String str, int i3, Double d8, String str2, Boolean bool, RoadObject roadObject, int i10) {
        super(str, i3, d8, str2, bool, roadObject);
        this.f10723h = i10;
    }

    @Override // R7.b
    public boolean equals(Object obj) {
        switch (this.f10723h) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return Intrinsics.areEqual(C0532a.class, obj != null ? obj.getClass() : null) && super.equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // R7.b
    public final String toString() {
        switch (this.f10723h) {
            case 0:
                return StubApp.getString2(9326);
            case 1:
                return StubApp.getString2(9325) + super.toString();
            case 2:
                return StubApp.getString2(9324) + super.toString();
            default:
                return StubApp.getString2(9323) + super.toString();
        }
    }
}
