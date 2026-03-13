package l7;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f16773a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f16774b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f16775c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f16776d;

    /* renamed from: e, reason: collision with root package name */
    public final Sensor f16777e;

    /* renamed from: f, reason: collision with root package name */
    public final Sensor f16778f;

    /* renamed from: g, reason: collision with root package name */
    public final Sensor f16779g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f16780h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f16781i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f16782k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f16783l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f16784m;

    public o(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(526));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f16773a = (WindowManager) systemService;
        Object systemService2 = StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(9580));
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService2;
        this.f16774b = sensorManager;
        this.f16775c = new LinkedHashSet();
        this.f16776d = new LinkedHashSet();
        this.f16780h = new float[9];
        this.f16782k = new float[3];
        this.f16783l = new float[3];
        this.f16784m = new float[3];
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.f16777e = defaultSensor;
        if (defaultSensor == null) {
            MapboxLogger.logW(StubApp.getString2(20931), StubApp.getString2(20932));
            this.f16778f = sensorManager.getDefaultSensor(1);
            this.f16779g = sensorManager.getDefaultSensor(2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
        if (i3 == 0) {
            MapboxLogger.logW(StubApp.getString2(20931), StubApp.getString2(20933));
            Iterator it = this.f16776d.iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        int i3;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(event, "event");
        int type = event.sensor.getType();
        int i12 = 1;
        String string2 = StubApp.getString2(20934);
        if (type == 1) {
            float[] fArr = event.values;
            Intrinsics.checkNotNullExpressionValue(fArr, string2);
            float[] fArr2 = this.f16782k;
            if (fArr2 != null) {
                int length = fArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    float f10 = fArr2[i13];
                    fArr2[i13] = E1.a.c(fArr[i13], f10, 0.45f, f10);
                }
                fArr = fArr2;
            }
            this.f16782k = fArr;
        } else if (type == 2) {
            float[] fArr3 = event.values;
            Intrinsics.checkNotNullExpressionValue(fArr3, string2);
            float[] fArr4 = this.f16783l;
            if (fArr4 != null) {
                int length2 = fArr3.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    float f11 = fArr4[i14];
                    fArr4[i14] = E1.a.c(fArr3[i14], f11, 0.45f, f11);
                }
                fArr3 = fArr4;
            }
            this.f16783l = fArr3;
        } else if (type == 11) {
            this.f16781i = event.values;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < this.j) {
            return;
        }
        float[] fArr5 = this.f16781i;
        float[] fArr6 = this.f16780h;
        if (fArr5 != null) {
            SensorManager.getRotationMatrixFromVector(fArr6, fArr5);
        } else {
            SensorManager.getRotationMatrix(fArr6, null, this.f16782k, this.f16783l);
        }
        WindowManager windowManager = this.f16773a;
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i3 = 2;
            i10 = 129;
        } else if (rotation == 2) {
            i3 = 129;
            i10 = 130;
        } else if (rotation != 3) {
            i3 = 1;
            i10 = 2;
        } else {
            i10 = 1;
            i3 = 130;
        }
        Pair pair = TuplesKt.to(Integer.valueOf(i3), Integer.valueOf(i10));
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        float[] fArr7 = new float[9];
        SensorManager.remapCoordinateSystem(fArr6, intValue, intValue2, fArr7);
        float[] fArr8 = this.f16784m;
        SensorManager.getOrientation(fArr7, fArr8);
        double d8 = fArr8[1];
        if (d8 < -0.7853981633974483d) {
            int rotation2 = windowManager.getDefaultDisplay().getRotation();
            if (rotation2 == 1) {
                i12 = 3;
                i11 = 129;
            } else if (rotation2 == 2) {
                i11 = 131;
                i12 = 129;
            } else if (rotation2 != 3) {
                i11 = 3;
            } else {
                i11 = 1;
                i12 = 131;
            }
        } else if (d8 > 0.7853981633974483d) {
            int rotation3 = windowManager.getDefaultDisplay().getRotation();
            if (rotation3 == 1) {
                i12 = 131;
                i11 = 129;
            } else if (rotation3 == 2) {
                i11 = 3;
                i12 = 129;
            } else if (rotation3 != 3) {
                i11 = 131;
            } else {
                i11 = 1;
                i12 = 3;
            }
        } else if (Math.abs(fArr8[2]) > 1.5707963267948966d) {
            int rotation4 = windowManager.getDefaultDisplay().getRotation();
            if (rotation4 == 1) {
                i12 = 130;
                i11 = 129;
            } else if (rotation4 == 2) {
                i11 = 2;
                i12 = 129;
            } else if (rotation4 != 3) {
                i11 = 130;
            } else {
                i11 = 1;
                i12 = 2;
            }
        } else {
            i11 = intValue2;
            i12 = intValue;
        }
        Pair pair2 = TuplesKt.to(Integer.valueOf(i12), Integer.valueOf(i11));
        SensorManager.remapCoordinateSystem(fArr6, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), fArr7);
        SensorManager.getOrientation(fArr7, fArr8);
        float degrees = (float) Math.toDegrees(fArr8[0]);
        Iterator it = this.f16775c.iterator();
        while (it.hasNext()) {
            Oc.a.T(((C1241k) it.next()).f16765a, Double.valueOf(degrees));
        }
        this.j = elapsedRealtime + 500;
    }
}
