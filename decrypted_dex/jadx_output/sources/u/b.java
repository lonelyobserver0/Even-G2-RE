package u;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21384a;

    public b(int i3) {
        switch (i3) {
            case 1:
                this.f21384a = new LinkedHashMap();
                break;
            default:
                this.f21384a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public int a(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        LinkedHashMap linkedHashMap = this.f21384a;
        Integer num = (Integer) linkedHashMap.get(sourceId);
        int intValue = (num != null ? num.intValue() : 0) + 1;
        linkedHashMap.put(sourceId, Integer.valueOf(intValue));
        return intValue;
    }
}
