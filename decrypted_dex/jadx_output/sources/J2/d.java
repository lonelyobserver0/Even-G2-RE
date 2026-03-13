package J2;

import B3.s;
import L7.f;
import L7.g;
import L7.i;
import L7.j;
import L7.k;
import L7.l;
import L7.m;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.media.AudioManager;
import androidx.lifecycle.L;
import androidx.lifecycle.W;
import b3.C0503e;
import c3.C0565b;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.navigation.base.route.n;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.AbstractLongTimeSource;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3402b;

    public /* synthetic */ d(Object obj, int i3) {
        this.f3401a = i3;
        this.f3402b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long read;
        Object obj = this.f3402b;
        switch (this.f3401a) {
            case 0:
                MethodChannel methodChannel = ((e) obj).f3403a;
                if (methodChannel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                    methodChannel = null;
                }
                methodChannel.invokeMethod(StubApp.getString2(2977), null);
                return Unit.INSTANCE;
            case 1:
                M1.e eVar = (M1.e) obj;
                eVar.i().a(new M1.b(eVar));
                return Unit.INSTANCE;
            case 2:
                s sVar = (s) obj;
                Context context = (AbstractActivityC0364d) sVar.f650b;
                if (context != null) {
                    Intrinsics.checkNotNull(context);
                } else {
                    context = (Context) sVar.f651c;
                }
                return AbstractC1482f.g(context.getPackageName(), StubApp.getString2(2976));
            case 3:
                return L.d((W) obj);
            case 4:
                Context applicationContext = ((C0503e) obj).f10611a;
                Intrinsics.checkNotNull(applicationContext);
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Context applicationContext2 = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Context origApplicationContext = StubApp.getOrigApplicationContext(applicationContext.getApplicationContext());
                Intrinsics.checkNotNullExpressionValue(origApplicationContext, "applicationContext.applicationContext");
                Locale t3 = Oc.a.t(applicationContext);
                y7.b bVar = new y7.b(origApplicationContext, t3, Tc.d.l(t3));
                l lVar = new l(new URI(StubApp.getString2(2971)));
                L7.c cVar = new L7.c();
                L7.d dVar = new L7.d(new L7.a());
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(5L);
                long j = n.f12513b;
                if (millis < j) {
                    StringBuilder m4 = AbstractC1482f.m(millis, StubApp.getString2(2974), StubApp.getString2(2975));
                    m4.append(j);
                    throw new IllegalStateException(m4.toString().toString());
                }
                n nVar = new n(millis);
                j jVar = new j();
                com.mapbox.navigation.base.route.l lVar2 = new com.mapbox.navigation.base.route.l(timeUnit.toMillis(5L));
                f fVar = new f();
                L7.e eVar2 = new L7.e();
                LocationProviderRequest request = g.f4273b;
                Intrinsics.checkNotNullExpressionValue(request, "request");
                g gVar = new g(request);
                L7.b bVar2 = new L7.b();
                m mVar = new m(J7.e.f3416a, J7.e.f3417b, J7.e.f3418c, J7.e.f3419d);
                k kVar = new k();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                i navigationOptions = new i(applicationContext2, bVar, lVar, cVar, dVar, nVar, jVar, lVar2, fVar, eVar2, bVar2, gVar, mVar, kVar);
                Lazy lazy = H8.b.f2941a;
                Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
                D9.l.d(StubApp.getString2(2973), StubApp.getString2(2972));
                H8.b.a().b(new C2.d(navigationOptions, 17));
                return Unit.INSTANCE;
            case 5:
                AbstractActivityC0364d abstractActivityC0364d = ((C0565b) obj).f10816c;
                Object systemService = abstractActivityC0364d != null ? abstractActivityC0364d.getSystemService(StubApp.getString2(643)) : null;
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                return (AudioManager) systemService;
            default:
                read = ((AbstractLongTimeSource) obj).read();
                return Long.valueOf(read);
        }
    }
}
