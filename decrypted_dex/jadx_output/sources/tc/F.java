package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class F extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final E f21264h = new E(S9.d.f6616d, Reflection.getOrCreateKotlinClass(F.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21265d;

    /* renamed from: e, reason: collision with root package name */
    public final C0104k f21266e;

    /* renamed from: f, reason: collision with root package name */
    public final C0104k f21267f;

    /* renamed from: g, reason: collision with root package name */
    public final C1762h f21268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String device_uuid, C0104k c0104k, C0104k firmware_data, C1762h c1762h, C0104k unknownFields) {
        super(f21264h, unknownFields);
        Intrinsics.checkNotNullParameter(device_uuid, "device_uuid");
        Intrinsics.checkNotNullParameter(firmware_data, "firmware_data");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21265d = device_uuid;
        this.f21266e = c0104k;
        this.f21267f = firmware_data;
        this.f21268g = c1762h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return Intrinsics.areEqual(b(), f10.b()) && Intrinsics.areEqual(this.f21265d, f10.f21265d) && Intrinsics.areEqual(this.f21266e, f10.f21266e) && Intrinsics.areEqual(this.f21267f, f10.f21267f) && Intrinsics.areEqual(this.f21268g, f10.f21268g);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int d8 = i2.u.d(b().hashCode() * 37, 37, this.f21265d);
        C0104k c0104k = this.f21266e;
        int hashCode = (this.f21267f.hashCode() + ((d8 + (c0104k != null ? c0104k.hashCode() : 0)) * 37)) * 37;
        C1762h c1762h = this.f21268g;
        int hashCode2 = hashCode + (c1762h != null ? c1762h.hashCode() : 0);
        this.f6625c = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35325) + L1.E(this.f21265d));
        C0104k c0104k = this.f21266e;
        if (c0104k != null) {
            arrayList.add(StubApp.getString2(35326) + c0104k);
        }
        arrayList.add(StubApp.getString2(35327) + this.f21267f);
        C1762h c1762h = this.f21268g;
        if (c1762h != null) {
            arrayList.add(StubApp.getString2(35328) + c1762h);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35329), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
