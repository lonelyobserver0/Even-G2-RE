package c5;

import aa.C0398e;
import android.util.Log;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.location.Location;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxMapRecorder;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.PlaybackFinished;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.mapbox.navigation.core.telemetry.events.LifecycleStateProvider;
import com.stub.StubApp;
import i5.C1059c;
import ib.C1069c;
import io.flutter.plugin.common.BasicMessageChannel;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l4.C1223z;
import m8.F;
import org.json.JSONException;
import org.json.JSONObject;
import p0.AbstractC1482f;
import q1.C1505a;
import q4.InterfaceC1521b;
import r0.InterfaceC1542c;
import sb.C1635a;
import sb.C1637b;
import sb.C1649h;
import sb.C1667q;
import sb.C1669r;
import sb.C1681x;
import sb.C1683y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class B implements InterfaceC1521b, ObjectConstructor, q4.e, OfflineSwitchObserver, CameraChangedCoalescedCallback, MapLoadingErrorDelegate, PlaybackFinished, MapLoadedCallback, RenderFrameFinishedCallback, Expected.Action, BasicMessageChannel.Reply, q4.d, GetLocationCallback, InterfaceC1542c, BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10833b;

    public /* synthetic */ B(Object obj, int i3) {
        this.f10832a = i3;
        this.f10833b = obj;
    }

    @Override // q4.e
    public void C(Exception exc) {
        GoogleDeviceLocationProvider.doStop$lambda$3((GoogleDeviceLocationProvider) this.f10833b, exc);
    }

    public void a(O8.r result) {
        m8.r this$0 = (m8.r) this.f10833b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (D9.l.a(D9.l.g(), LoggingLevel.INFO)) {
            D9.l.f(StubApp.getString2(9417) + result + StubApp.getString2(9418) + this$0.f17229i.f7887s, StubApp.getString2(6668));
        }
        if (this$0.f17229i.f7887s) {
            this$0.h(result.f5273a, new F(result.f5274b), null);
        }
    }

    @Override // r0.InterfaceC1542c
    public void accept(Object obj) {
        C1505a c1505a = (C1505a) obj;
        switch (this.f10832a) {
            case 23:
                q1.h hVar = (q1.h) this.f10833b;
                hVar.getClass();
                q1.g gVar = new q1.g(c1505a.f19880b, C1223z.f(c1505a.f19881c, c1505a.f19879a));
                hVar.f19894c.add(gVar);
                long j = hVar.j;
                if (j == -9223372036854775807L || c1505a.f19880b >= j) {
                    hVar.a(gVar);
                    break;
                }
                break;
            default:
                ((M4.F) this.f10833b).a(c1505a);
                break;
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newDefaultConstructor$9;
        Object lambda$newUnsafeAllocator$19;
        switch (this.f10832a) {
            case 2:
                lambda$newDefaultConstructor$9 = ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) this.f10833b);
                return lambda$newDefaultConstructor$9;
            default:
                lambda$newUnsafeAllocator$19 = ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) this.f10833b);
                return lambda$newUnsafeAllocator$19;
        }
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        boolean z2;
        switch (this.f10832a) {
            case 0:
                ((C1059c) this.f10833b).getClass();
                if (jVar.isSuccessful()) {
                    C0568a c0568a = (C0568a) jVar.getResult();
                    Z4.c cVar = Z4.c.f8980a;
                    cVar.c(StubApp.getString2(9419) + c0568a.f10860b);
                    File file = c0568a.f10861c;
                    if (file.delete()) {
                        cVar.c(StubApp.getString2(9420) + file.getPath());
                    } else {
                        cVar.g(StubApp.getString2(9421) + file.getPath(), null);
                    }
                    z2 = true;
                } else {
                    Log.w(StubApp.getString2(280), StubApp.getString2(9422), jVar.getException());
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                ((CountDownLatch) this.f10833b).countDown();
                return null;
            case 14:
                return (q4.j) ((j) this.f10833b).call();
            default:
                ((Runnable) this.f10833b).run();
                return a4.f.m(null);
        }
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        Object obj = this.f10833b;
        switch (this.f10832a) {
            case 17:
                HashMap hashMap = C1069c.f14975c;
                ib.r rVar = (ib.r) obj;
                if (!jVar.isSuccessful()) {
                    rVar.a(jVar.getException());
                    break;
                } else {
                    rVar.b();
                    break;
                }
            default:
                HashMap hashMap2 = C1069c.f14975c;
                ib.q qVar = (ib.q) obj;
                if (!jVar.isSuccessful()) {
                    qVar.a(jVar.getException());
                    break;
                } else {
                    qVar.success(jVar.getResult());
                    break;
                }
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List listOf;
        List listOf2;
        switch (this.f10832a) {
            case 28:
                C1669r c1669r = (C1669r) this.f10833b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C1637b) c1669r.f20885a.f650b).a(((Long) obj2).longValue(), new C1667q(c1669r));
                    listOf = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    if (exception instanceof C1635a) {
                        C1635a c1635a = exception;
                        listOf = CollectionsKt.listOf(c1635a.f20922a, c1635a.f20923b, c1635a.f20924c);
                    } else {
                        listOf = CollectionsKt.listOf((Object[]) new String[]{exception.getClass().getSimpleName(), exception.toString(), E1.a.m(StubApp.getString2(6769), exception.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception))});
                    }
                }
                reply.reply(listOf);
                break;
            default:
                C1683y c1683y = (C1683y) this.f10833b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C1637b) c1683y.f20915a.f650b).a(longValue, new C1681x((String) obj4, c1683y));
                    listOf2 = CollectionsKt.listOf((Object) null);
                } catch (Throwable exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    if (exception2 instanceof C1635a) {
                        C1635a c1635a2 = exception2;
                        listOf2 = CollectionsKt.listOf(c1635a2.f20922a, c1635a2.f20923b, c1635a2.f20924c);
                    } else {
                        listOf2 = CollectionsKt.listOf((Object[]) new String[]{exception2.getClass().getSimpleName(), exception2.toString(), E1.a.m(StubApp.getString2(6769), exception2.getCause(), StubApp.getString2(604), Log.getStackTraceString(exception2))});
                    }
                }
                reply.reply(listOf2);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        boolean z2 = false;
        Object obj2 = this.f10833b;
        switch (this.f10832a) {
            case 16:
                if (obj != null) {
                    try {
                        z2 = ((JSONObject) obj).getBoolean(StubApp.getString2("9427"));
                    } catch (JSONException e10) {
                        Log.e(StubApp.getString2(9429), StubApp.getString2(9428) + e10);
                    }
                }
                ((C0398e) ((C2.d) obj2).f1057b).o(z2);
                break;
            default:
                C1649h c1649h = (C1649h) obj2;
                if (!(obj instanceof List)) {
                    Result.Companion companion = Result.INSTANCE;
                    c1649h.invoke(AbstractC1482f.o(StubApp.getString2(9424), StubApp.getString2(9423), StubApp.getString2(9425), StubApp.getString2(9426), ""));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        Result.Companion companion2 = Result.INSTANCE;
                        c1649h.invoke(Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE)));
                        break;
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object obj3 = list.get(0);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
                        c1649h.invoke(Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a((String) obj3, (String) obj4, (String) list.get(2))))));
                        break;
                    }
                }
        }
    }

    @Override // com.mapbox.maps.PlaybackFinished
    public void run() {
        MapboxMapRecorder.replay$lambda$4((Function0) this.f10833b);
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f10832a) {
            case 7:
                MapboxMap._init_$lambda$1((NativeObserver) this.f10833b, mapLoadingError);
                break;
            default:
                MapboxMap._init_$lambda$2((MapboxMap) this.f10833b, mapLoadingError);
                break;
        }
    }

    @Override // com.mapbox.common.OfflineSwitchObserver
    public void statusChanged(boolean z2) {
        MapboxHttpClient.offlineObserver$lambda$1((MapboxHttpClient) this.f10833b, z2);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced it) {
        switch (this.f10832a) {
            case 6:
                MapController._init_$lambda$4((X6.k) this.f10833b, it);
                break;
            case 11:
                DebugOptionsController.updateCameraSubscriptionIfNeeded$lambda$1((DebugOptionsController) this.f10833b, it);
                break;
            default:
                String string2 = StubApp.getString2(392);
                r7.g gVar = (r7.g) this.f10833b;
                Intrinsics.checkNotNullParameter(gVar, string2);
                Intrinsics.checkNotNullParameter(it, "it");
                CameraState cameraState = it.getCameraState();
                Intrinsics.checkNotNullExpressionValue(cameraState, "it.cameraState");
                gVar.b(cameraState);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        NativeObserver.addOnMapLoadedListener$lambda$3((h7.d) this.f10833b, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        MapboxRenderer.renderFrameFinishedCallback$lambda$0((MapboxRenderer) this.f10833b, renderFrameFinished);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        LifecycleStateProvider.init$lambda$1$lambda$0((LifecycleStateProvider) this.f10833b, (LifecycleState) obj);
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        if (location != null) {
            ((Sb.j) ((Sb.v) this.f10833b)).j(location);
        }
    }
}
