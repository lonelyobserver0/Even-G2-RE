package V8;

import Qb.L;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.common.location.Location;
import com.stub.StubApp;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.TimeSource;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f7840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, int i3) {
        super(1);
        this.f7839a = i3;
        this.f7840b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q qVar = this.f7840b;
        switch (this.f7839a) {
            case 0:
                Location rawLocation = (Location) obj;
                Intrinsics.checkNotNullParameter(rawLocation, "rawLocation");
                int hashCode = rawLocation.hashCode();
                L.j(qVar.f7877h.f1513b, null, new j(qVar, rawLocation, null), 3);
                L.j(qVar.f7877h.f1513b, null, new k(qVar, rawLocation, hashCode, null), 1);
                return Unit.INSTANCE;
            default:
                BannerInstructions bannerInstruction = (BannerInstructions) obj;
                Intrinsics.checkNotNullParameter(bannerInstruction, "bannerInstruction");
                E7.a aVar = E7.a.f1927a;
                if (E7.a.a()) {
                    String string2 = StubApp.getString2(6682);
                    E7.a.c(string2);
                    try {
                        long m1480markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m1480markNowz9LOYto();
                        Iterator it = qVar.f7881m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        Unit unit = Unit.INSTANCE;
                        Duration.m1366boximpl(TimeSource.Monotonic.ValueTimeMark.m1485elapsedNowUwyO8pc(m1480markNowz9LOYto));
                    } finally {
                        E7.a.b(string2);
                    }
                } else {
                    Iterator it2 = qVar.f7881m.iterator();
                    if (it2.hasNext()) {
                        throw com.mapbox.common.b.e(it2);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
