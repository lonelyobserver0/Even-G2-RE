package m8;

import Qb.J;
import Qb.L;
import R8.C0246d;
import R8.C0248f;
import android.os.HandlerThread;
import android.os.Looper;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.location.LocationProvider;
import com.stub.StubApp;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f17181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(r rVar, int i3) {
        super(0);
        this.f17180a = i3;
        this.f17181b = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17180a) {
            case 0:
                break;
            case 1:
                r rVar = this.f17181b;
                V8.E e10 = rVar.f17229i.f7886r;
                rVar.g().a().resume();
                V8.q qVar = rVar.f17229i;
                V8.E e11 = qVar.f7886r;
                V8.E e12 = V8.E.f7802a;
                if (e11 != e12) {
                    if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
                        D9.l.f(StubApp.getString2(21108), StubApp.getString2(6675));
                    }
                    Z8.f fVar = qVar.f7872c;
                    String string2 = StubApp.getString2(6665);
                    V8.i iVar = qVar.f7869B;
                    Intrinsics.checkNotNullParameter(iVar, string2);
                    fVar.f9062o.add(iVar);
                    fVar.a().addObserver(iVar);
                    fVar.a().startNavigationSession();
                    if (qVar.f7886r != e12) {
                        qVar.f7886r = e12;
                        Iterator it = qVar.f7880l.iterator();
                        while (it.hasNext()) {
                            ((V8.F) it.next()).b(e12);
                        }
                    }
                }
                B3.h hVar = qVar.f7871b;
                String string22 = StubApp.getString2(21109);
                V8.l lVar = qVar.f7868A;
                Intrinsics.checkNotNullParameter(lVar, string22);
                if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
                    D9.l.d(StubApp.getString2(21110) + "" + StubApp.getString2(21111), StubApp.getString2(545));
                }
                hVar.k();
                hVar.f615f = lVar;
                LocationProvider locationProvider = (LocationProvider) hVar.f613d;
                hVar.f614e = locationProvider;
                if (locationProvider != null) {
                    Looper looper = ((HandlerThread) hVar.f616g).getLooper();
                    Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
                    locationProvider.addLocationObserver((V8.D) hVar.f618i, looper);
                }
                LocationProvider locationProvider2 = (LocationProvider) hVar.f614e;
                hVar.j = locationProvider2 != null ? locationProvider2.getLastLocation((C2.d) hVar.f617h) : null;
                P8.i iVar2 = rVar.f17237r;
                iVar2.getClass();
                iVar2.i(new P8.d(iVar2, 2));
                A3.s sVar = (A3.s) rVar.f17210D.f6297b;
                sVar.getClass();
                D9.l.f(StubApp.getString2(21112), StubApp.getString2(277));
                if (((Vb.f) sVar.f196h) == null) {
                    sVar.f196h = D9.l.i((Vb.f) sVar.f194f);
                    List list = (List) sVar.f197i;
                    if (list != null && ((i2.o) sVar.f195g).f14746a < 2) {
                        C0248f c0248f = new C0248f(sVar, list, true, null);
                        Vb.f fVar2 = (Vb.f) sVar.f196h;
                        if (fVar2 != null) {
                            L.j(fVar2, null, new C0246d(false, sVar, c0248f, null), 3);
                        }
                    }
                }
                if (e10 == V8.E.f7803b) {
                    L.j(rVar.f17222b.a().f1513b, Vb.q.f7968a.f6359c, new p(rVar, null), 2);
                }
                Field field = rVar.f17207A;
                if (field != null) {
                    Object obj = field.get(null);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<com.mapbox.navigation.base.trip.notification.NotificationAction>");
                    Sb.w channel = (Sb.w) obj;
                    Vb.f fVar3 = rVar.f17227g.f1513b;
                    l predicate = new l(rVar, null);
                    Intrinsics.checkNotNullParameter(fVar3, "<this>");
                    Intrinsics.checkNotNullParameter(channel, "channel");
                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                    D9.i onCancellation = D9.i.f1519a;
                    Intrinsics.checkNotNullParameter(onCancellation, "onCancellation");
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    booleanRef.element = true;
                    L.j(fVar3, null, new D9.j(booleanRef, predicate, channel, onCancellation, null), 3);
                    break;
                }
                break;
            default:
                r rVar2 = this.f17181b;
                P7.b bVar = rVar2.f17229i.f7890v;
                rVar2.f17213G = bVar != null ? Integer.valueOf(bVar.f5566e.f5553a) : null;
                P8.i iVar3 = rVar2.f17237r;
                iVar3.getClass();
                iVar3.i(new P8.d(iVar3, 1));
                A3.s sVar2 = (A3.s) rVar2.f17210D.f6297b;
                D9.l.f(StubApp.getString2(21107), StubApp.getString2(277));
                Vb.f fVar4 = (Vb.f) sVar2.f196h;
                if (fVar4 != null) {
                    J.b(fVar4);
                }
                sVar2.f196h = null;
                rVar2.f17229i.h();
                rVar2.g().a().pause();
                break;
        }
        return Unit.INSTANCE;
    }
}
