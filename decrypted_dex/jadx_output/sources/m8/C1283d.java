package m8;

import com.mapbox.common.TelemetrySystemUtils;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import u8.AbstractC1780d;
import u8.C1779c;

/* renamed from: m8.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1283d implements V8.F {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1780d f17160a = C1779c.f21464a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f17161b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f17162c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f17163d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17164e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17165f;

    public final void a(Function2 function2) {
        Object obj;
        boolean z2 = this.f17165f;
        boolean z10 = this.f17164e;
        String string2 = StubApp.getString2(6735);
        if (z10 && z2) {
            String obtainUniversalUniqueIdentifier = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            Intrinsics.checkNotNullExpressionValue(obtainUniversalUniqueIdentifier, string2);
            obj = V8.B.f7793c.invoke(obtainUniversalUniqueIdentifier);
        } else if (z2) {
            String obtainUniversalUniqueIdentifier2 = TelemetrySystemUtils.obtainUniversalUniqueIdentifier();
            Intrinsics.checkNotNullExpressionValue(obtainUniversalUniqueIdentifier2, string2);
            obj = V8.B.f7792b.invoke(obtainUniversalUniqueIdentifier2);
        } else {
            V8.A.f7788b.getClass();
            obj = C1779c.f21464a;
        }
        AbstractC1780d abstractC1780d = (AbstractC1780d) obj;
        if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(abstractC1780d.getClass()), Reflection.getOrCreateKotlinClass(this.f17160a.getClass()))) {
            return;
        }
        AbstractC1780d abstractC1780d2 = this.f17160a;
        this.f17160a = abstractC1780d;
        boolean z11 = abstractC1780d2 instanceof C1779c;
        CopyOnWriteArraySet copyOnWriteArraySet = this.f17161b;
        if (!z11) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                u8.e it2 = (u8.e) it.next();
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                function2.invoke(it2, abstractC1780d2);
            }
        }
        if (!(abstractC1780d instanceof C1779c)) {
            Iterator it3 = copyOnWriteArraySet.iterator();
            while (it3.hasNext()) {
                ((j8.d) ((u8.e) it3.next())).a(abstractC1780d);
            }
        }
        Iterator it4 = this.f17162c.iterator();
        while (it4.hasNext()) {
            ((C1281b) it4.next()).a(abstractC1780d);
        }
    }

    @Override // V8.F
    public final void b(V8.E tripSessionState) {
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
        if (this.f17165f != z2) {
            this.f17165f = z2;
            a(C1282c.f17157c);
        }
    }
}
