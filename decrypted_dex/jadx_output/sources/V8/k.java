package V8;

import Qb.C0203k;
import Qb.I;
import com.mapbox.bindgen.Value;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.FixLocation;
import com.stub.StubApp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f7834a;

    /* renamed from: b, reason: collision with root package name */
    public int f7835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f7836c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Location f7837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Location location, int i3, Continuation continuation) {
        super(2, continuation);
        this.f7836c = qVar;
        this.f7837d = location;
        this.f7838e = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f7836c, this.f7837d, this.f7838e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f7835b;
        Location location = this.f7837d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            long nanoTime = System.nanoTime();
            Z8.f fVar = this.f7836c.f7872c;
            Intrinsics.checkNotNullParameter(location, "<this>");
            Value extra = location.getExtra();
            Object contents = extra != null ? extra.getContents() : null;
            Map map = contents instanceof HashMap ? (HashMap) contents : null;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            HashMap hashMap = new HashMap(map);
            String string2 = StubApp.getString2(6677);
            Value value = (Value) hashMap.get(string2);
            Object contents2 = value != null ? value.getContents() : null;
            boolean areEqual = Intrinsics.areEqual(contents2 instanceof Boolean ? (Boolean) contents2 : null, Boolean.TRUE);
            hashMap.remove(string2);
            Point fromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
            Long monotonicTimestamp = location.getMonotonicTimestamp();
            if (monotonicTimestamp == null) {
                monotonicTimestamp = 0L;
            }
            long longValue = monotonicTimestamp.longValue();
            Date date = new Date(location.getTimestamp());
            Double speed = location.getSpeed();
            Float valueOf = speed != null ? Float.valueOf((float) speed.doubleValue()) : null;
            Double bearing = location.getBearing();
            Float f10 = valueOf;
            Float valueOf2 = bearing != null ? Float.valueOf((float) bearing.doubleValue()) : null;
            Double altitude = location.getAltitude();
            Float valueOf3 = altitude != null ? Float.valueOf((float) altitude.doubleValue()) : null;
            Double horizontalAccuracy = location.getHorizontalAccuracy();
            Float valueOf4 = horizontalAccuracy != null ? Float.valueOf((float) horizontalAccuracy.doubleValue()) : null;
            String source = location.getSource();
            Double bearingAccuracy = location.getBearingAccuracy();
            Float valueOf5 = bearingAccuracy != null ? Float.valueOf((float) bearingAccuracy.doubleValue()) : null;
            Double speedAccuracy = location.getSpeedAccuracy();
            Float valueOf6 = speedAccuracy != null ? Float.valueOf((float) speedAccuracy.doubleValue()) : null;
            Double verticalAccuracy = location.getVerticalAccuracy();
            FixLocation fixLocation = new FixLocation(fromLngLat, longValue, date, f10, valueOf2, valueOf3, valueOf4, source, valueOf5, valueOf6, verticalAccuracy != null ? Float.valueOf((float) verticalAccuracy.doubleValue()) : null, hashMap, areEqual);
            this.f7834a = nanoTime;
            this.f7835b = 1;
            C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(this));
            c0203k.s();
            fVar.a().updateLocation(fixLocation, new Z8.e(c0203k));
            Object r8 = c0203k.r();
            if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (r8 == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = nanoTime;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            j = this.f7834a;
            ResultKt.throwOnFailure(obj);
        }
        D9.l.d(StubApp.getString2(6678) + System.nanoTime() + StubApp.getString2(6679) + this.f7838e + StubApp.getString2(6680) + location.getMonotonicTimestamp() + StubApp.getString2(6681) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j) + StubApp.getString2(559), StubApp.getString2(6675));
        return Unit.INSTANCE;
    }
}
