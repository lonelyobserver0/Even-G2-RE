package V8;

import com.mapbox.common.TelemetrySystemUtils;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v implements q8.e, F {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f7899a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public z f7900b = y.f7905a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7901c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7902d;

    @Override // q8.e
    public final void a(q8.g result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z2 = !result.f20095a.isEmpty();
        if (this.f7901c != z2) {
            this.f7901c = z2;
            c();
        }
    }

    @Override // V8.F
    public final void b(E tripSessionState) {
        Intrinsics.checkNotNullParameter(tripSessionState, "tripSessionState");
        Intrinsics.checkNotNullParameter(tripSessionState, "tripSessionState");
        int ordinal = tripSessionState.ordinal();
        boolean z2 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            z2 = false;
        }
        if (this.f7902d != z2) {
            this.f7902d = z2;
            c();
        }
    }

    public final void c() {
        Object obj;
        boolean z2 = this.f7902d;
        boolean z10 = this.f7901c;
        String string2 = StubApp.getString2(6735);
        if (z10 && z2) {
            String obtainUniversalUniqueIdentifier = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            Intrinsics.checkNotNullExpressionValue(obtainUniversalUniqueIdentifier, string2);
            obj = B.f7795e.invoke(obtainUniversalUniqueIdentifier);
        } else if (z2) {
            String obtainUniversalUniqueIdentifier2 = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            Intrinsics.checkNotNullExpressionValue(obtainUniversalUniqueIdentifier2, string2);
            obj = B.f7794d.invoke(obtainUniversalUniqueIdentifier2);
        } else {
            A.f7789c.getClass();
            obj = y.f7905a;
        }
        z value = (z) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.f7900b, value)) {
            return;
        }
        this.f7900b = value;
        Iterator it = this.f7899a.iterator();
        while (it.hasNext()) {
            ((n8.b) it.next()).a(value);
        }
    }
}
