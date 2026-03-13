package l4;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t.C1696i;

/* renamed from: l4.e0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1173e0 extends C1696i {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1179g0 f16420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1173e0(C1179g0 c1179g0) {
        super(20);
        Objects.requireNonNull(c1179g0);
        this.f16420g = c1179g0;
    }

    @Override // t.C1696i
    public final Object a(Object obj) {
        String str = (String) obj;
        S3.D.e(str);
        C1179g0 c1179g0 = this.f16420g;
        c1179g0.l();
        S3.D.e(str);
        C1199n c1199n = c1179g0.f16651b.f16061c;
        F1.S(c1199n);
        a5.c s02 = c1199n.s0(str);
        if (s02 == null) {
            return null;
        }
        T t3 = ((C1200n0) c1179g0.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16249p.c(str, StubApp.getString2(20403));
        c1179g0.s(str, c1179g0.t(str, (byte[]) s02.f9282b));
        C1173e0 c1173e0 = c1179g0.f16438k;
        c1173e0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (c1173e0.f21034c) {
            try {
                Set<Map.Entry> entrySet = c1173e0.f21033b.f21384a.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
                for (Map.Entry entry : entrySet) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (com.google.android.gms.internal.measurement.D) linkedHashMap.get(str);
    }
}
