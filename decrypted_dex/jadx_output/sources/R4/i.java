package R4;

import T0.o;
import T0.r;
import W4.m;
import W4.s;
import android.content.Context;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.geofencing.GeofencingError;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.navigator.SetRoutesResult;
import com.stub.StubApp;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class i implements F5.d, r, Expected.Transformer, InterfaceC1865a, W4.e, q4.e, GeofencingUtilsUserConsentResponseCallback, ObjectConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6202a;

    public /* synthetic */ i(int i3) {
        this.f6202a = i3;
    }

    private final void e(w5.b bVar) {
    }

    @Override // q4.e
    public void C(Exception exc) {
        switch (this.f6202a) {
            case 14:
                Log.e(StubApp.getString2(280), StubApp.getString2(5689), exc);
                break;
            case 27:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$10(exc);
                break;
            default:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$8(exc);
                break;
        }
    }

    @Override // T0.r
    public o[] a() {
        switch (this.f6202a) {
            case 4:
                return new o[]{new U0.a()};
            case 13:
                return new o[]{new Y0.c()};
            default:
                return new o[]{new Z0.b()};
        }
    }

    @Override // F5.d
    public String b(Context context) {
        switch (this.f6202a) {
            case 0:
                return context.getPackageManager().hasSystemFeature(StubApp.getString2(5690)) ? StubApp.getString2(5691) : context.getPackageManager().hasSystemFeature(StubApp.getString2(5692)) ? StubApp.getString2(5693) : context.getPackageManager().hasSystemFeature(StubApp.getString2(5626)) ? StubApp.getString2(3305) : context.getPackageManager().hasSystemFeature(StubApp.getString2(5694)) ? StubApp.getString2(5695) : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // w5.InterfaceC1865a
    public void c(w5.b bVar) {
        switch (this.f6202a) {
            case 8:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Map lambda$newMapConstructor$14;
        Map lambda$newMapConstructor$15;
        Map lambda$newMapConstructor$16;
        Map lambda$newMapConstructor$17;
        Map lambda$newMapConstructor$18;
        Collection lambda$newCollectionConstructor$10;
        Collection lambda$newCollectionConstructor$11;
        Collection lambda$newCollectionConstructor$12;
        Collection lambda$newCollectionConstructor$13;
        switch (this.f6202a) {
            case 18:
                lambda$newMapConstructor$14 = ConstructorConstructor.lambda$newMapConstructor$14();
                return lambda$newMapConstructor$14;
            case 19:
                lambda$newMapConstructor$15 = ConstructorConstructor.lambda$newMapConstructor$15();
                return lambda$newMapConstructor$15;
            case 20:
                lambda$newMapConstructor$16 = ConstructorConstructor.lambda$newMapConstructor$16();
                return lambda$newMapConstructor$16;
            case 21:
                lambda$newMapConstructor$17 = ConstructorConstructor.lambda$newMapConstructor$17();
                return lambda$newMapConstructor$17;
            case 22:
                lambda$newMapConstructor$18 = ConstructorConstructor.lambda$newMapConstructor$18();
                return lambda$newMapConstructor$18;
            case 23:
                lambda$newCollectionConstructor$10 = ConstructorConstructor.lambda$newCollectionConstructor$10();
                return lambda$newCollectionConstructor$10;
            case 24:
                lambda$newCollectionConstructor$11 = ConstructorConstructor.lambda$newCollectionConstructor$11();
                return lambda$newCollectionConstructor$11;
            case 25:
                lambda$newCollectionConstructor$12 = ConstructorConstructor.lambda$newCollectionConstructor$12();
                return lambda$newCollectionConstructor$12;
            default:
                lambda$newCollectionConstructor$13 = ConstructorConstructor.lambda$newCollectionConstructor$13();
                return lambda$newCollectionConstructor$13;
        }
    }

    public Constructor d() {
        switch (this.f6202a) {
            case 2:
                if (Boolean.TRUE.equals(Class.forName(StubApp.getString2(5697)).getMethod(StubApp.getString2(5698), new Class[0]).invoke(null, new Object[0]))) {
                    return Class.forName(StubApp.getString2(5699)).asSubclass(o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName(StubApp.getString2(5696)).asSubclass(o.class).getConstructor(new Class[0]);
        }
    }

    @Override // W4.e
    public Object h(s sVar) {
        switch (this.f6202a) {
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12044a.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12046c.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.f12045b.get();
            default:
                m mVar = ExecutorsRegistrar.f12044a;
                return X4.j.f8405a;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        LifecycleState lifeCycleStateCallback$lambda$4$lambda$3;
        switch (this.f6202a) {
            case 5:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new V8.r(it);
            case 6:
                SetRoutesResult it2 = (SetRoutesResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getAlternatives();
            case 7:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new V8.r(it3);
            default:
                lifeCycleStateCallback$lambda$4$lambda$3 = MapboxHttpClient.getLifeCycleStateCallback$lambda$4$lambda$3((String) obj);
                return lifeCycleStateCallback$lambda$4$lambda$3;
        }
    }

    @Override // com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback
    public void run(Expected result) {
        Intrinsics.checkNotNullParameter(result, "result");
        GeofencingError geofencingError = (GeofencingError) result.getError();
        if (geofencingError != null) {
            MapboxLogger.logW(StubApp.getString2(5701), StubApp.getString2(5700) + geofencingError.getType());
        }
    }
}
