package X2;

import android.content.Context;
import b3.C0503e;
import com.google.android.gms.internal.measurement.F1;
import com.mapbox.common.location.LocationProviderRequest;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: X2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0360b implements BasicMessageChannel.MessageHandler, H8.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0503e f8260b;

    public /* synthetic */ C0360b(C0503e c0503e, int i3) {
        this.f8259a = i3;
        this.f8260b = c0503e;
    }

    @Override // H8.g
    public L7.i g() {
        Context applicationContext = this.f8260b.f10611a;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Context applicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Context origApplicationContext = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(origApplicationContext, "applicationContext.applicationContext");
        Locale t3 = Oc.a.t(applicationContext);
        y7.b bVar = new y7.b(origApplicationContext, t3, Tc.d.l(t3));
        L7.l lVar = new L7.l(new URI(StubApp.getString2(2971)));
        L7.c cVar = new L7.c();
        L7.d dVar = new L7.d(new L7.a());
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(5L);
        long j = com.mapbox.navigation.base.route.n.f12513b;
        if (millis < j) {
            StringBuilder m4 = AbstractC1482f.m(millis, StubApp.getString2(2974), StubApp.getString2(2975));
            m4.append(j);
            throw new IllegalStateException(m4.toString().toString());
        }
        com.mapbox.navigation.base.route.n nVar = new com.mapbox.navigation.base.route.n(millis);
        L7.j jVar = new L7.j();
        com.mapbox.navigation.base.route.l lVar2 = new com.mapbox.navigation.base.route.l(timeUnit.toMillis(5L));
        L7.f fVar = new L7.f();
        L7.e eVar = new L7.e();
        LocationProviderRequest request = L7.g.f4273b;
        Intrinsics.checkNotNullExpressionValue(request, "request");
        L7.g gVar = new L7.g(request);
        L7.b bVar2 = new L7.b();
        L7.m mVar = new L7.m(J7.e.f3416a, J7.e.f3417b, J7.e.f3418c, J7.e.f3419d);
        L7.k kVar = new L7.k();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        return new L7.i(applicationContext2, bVar, lVar, cVar, dVar, nVar, jVar, lVar2, fVar, eVar, bVar2, gVar, mVar, kVar);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List b2;
        List b10;
        List b11;
        switch (this.f8259a) {
            case 0:
                C0503e c0503e = this.f8260b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.even.navigate.LocationModel>");
                try {
                    c0503e.a((List) obj2);
                    b2 = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    b2 = F1.b(th);
                }
                reply.reply(b2);
                break;
            case 1:
                C0503e c0503e2 = this.f8260b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                try {
                    c0503e2.c(((Long) obj3).longValue());
                    b10 = CollectionsKt.listOf((Object) null);
                } catch (Throwable th2) {
                    b10 = F1.b(th2);
                }
                reply.reply(b10);
                break;
            default:
                C0503e c0503e3 = this.f8260b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    c0503e3.dispose();
                    b11 = CollectionsKt.listOf((Object) null);
                } catch (Throwable th3) {
                    b11 = F1.b(th3);
                }
                reply.reply(b11);
                break;
        }
    }
}
