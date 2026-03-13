package com.mapbox.navigator;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0012J\b\u00101\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020.H\u0002J\u001a\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u00010\u00072\u0006\u00105\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\fH\u0016J\u0010\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0010\u0010<\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u001bH\u0016J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\u0010\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\u000bH\u0016J\u001f\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0002\u0010FR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010!\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/mapbox/navigator/IMUServiceImpl;", "Lcom/mapbox/navigator/IMUService;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accelerometerSensor", "Landroid/hardware/Sensor;", "kotlin.jvm.PlatformType", "altimeterCallbacks", "", "", "Lcom/mapbox/navigator/AltimeterUpdateCallback;", "compassCallbacks", "Lcom/mapbox/navigator/CompassUpdateCallback;", "getContext", "()Landroid/content/Context;", "geomagneticXyz", "", "gravity", "gravitySensor", "gyroscopeSensor", "handler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "imuCallbacks", "Lcom/mapbox/navigator/IMUUpdateCallback;", "lastTimestampNanoseconds", "", "lastTimestampNotifiedNanoseconds", "magneticDeclination", "Ljava/util/concurrent/atomic/AtomicInteger;", "magneticSensor", "nextCallbackId", "notifyCallbacksRunnable", "Ljava/lang/Runnable;", "orientations", "pressureSensor", "rotationMatrix", "rotationSensor", "rotations", "sensorManager", "Landroid/hardware/SensorManager;", "userAccelerationWithGravity", "handlePressure", "", "timestamp", "pressureValues", "makeNextCallbackId", "notifyCallbacks", "onAccuracyChanged", "sensor", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "registerAltimeterUpdateCallback", "callback", "registerCompassUpdateCallback", "registerIMUUpdateCallback", "start", "stop", "unregisterCallback", "id", "update", "coordinate", "Lcom/mapbox/geojson/Point;", "altitude", "", "(Lcom/mapbox/geojson/Point;Ljava/lang/Float;)V", "Companion", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class IMUServiceImpl implements IMUService, SensorEventListener {
    private static final long CALLBACK_UPDATE_DELAY_MILLIS = 10;
    private static final int SENSOR_DELAY_MICROS = 20000;
    private final Sensor accelerometerSensor;
    private final Map<Integer, AltimeterUpdateCallback> altimeterCallbacks;
    private final Map<Integer, CompassUpdateCallback> compassCallbacks;
    private final Context context;
    private final float[] geomagneticXyz;
    private final float[] gravity;
    private final Sensor gravitySensor;
    private final Sensor gyroscopeSensor;
    private Handler handler;
    private HandlerThread handlerThread;
    private final Map<Integer, IMUUpdateCallback> imuCallbacks;
    private long lastTimestampNanoseconds;
    private long lastTimestampNotifiedNanoseconds;
    private final AtomicInteger magneticDeclination;
    private final Sensor magneticSensor;
    private final AtomicInteger nextCallbackId;
    private final Runnable notifyCallbacksRunnable;
    private final float[] orientations;
    private final Sensor pressureSensor;
    private final float[] rotationMatrix;
    private final Sensor rotationSensor;
    private final float[] rotations;
    private final SensorManager sensorManager;
    private final float[] userAccelerationWithGravity;
    public static final String TAG = StubApp.getString2(15017);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/navigator/IMUServiceImpl$Companion;", "", "()V", "CALLBACK_UPDATE_DELAY_MILLIS", "", "SENSOR_DELAY_MICROS", "", "TAG", "", "createPlatformIMUService", "Lcom/mapbox/navigator/IMUService;", "dash-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final IMUService createPlatformIMUService() {
            return new IMUServiceImpl(MapboxNavigationNative.INSTANCE.getAppContext$dash_native_release());
        }

        private Companion() {
        }
    }

    public IMUServiceImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService(StubApp.getString2(9580));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.accelerometerSensor = sensorManager.getDefaultSensor(1);
        this.magneticSensor = sensorManager.getDefaultSensor(2);
        this.rotationSensor = sensorManager.getDefaultSensor(11);
        this.gyroscopeSensor = sensorManager.getDefaultSensor(4);
        this.gravitySensor = sensorManager.getDefaultSensor(9);
        this.pressureSensor = sensorManager.getDefaultSensor(6);
        float[] fArr = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr[i3] = -1.0f;
        }
        this.gravity = fArr;
        float[] fArr2 = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr2[i10] = -1.0f;
        }
        this.geomagneticXyz = fArr2;
        float[] fArr3 = new float[3];
        for (int i11 = 0; i11 < 3; i11++) {
            fArr3[i11] = -1.0f;
        }
        this.rotations = fArr3;
        float[] fArr4 = new float[3];
        for (int i12 = 0; i12 < 3; i12++) {
            fArr4[i12] = -1.0f;
        }
        this.orientations = fArr4;
        float[] fArr5 = new float[3];
        for (int i13 = 0; i13 < 3; i13++) {
            fArr5[i13] = -1.0f;
        }
        this.userAccelerationWithGravity = fArr5;
        float[] fArr6 = new float[9];
        for (int i14 = 0; i14 < 9; i14++) {
            fArr6[i14] = -1.0f;
        }
        this.rotationMatrix = fArr6;
        this.compassCallbacks = new LinkedHashMap();
        this.imuCallbacks = new LinkedHashMap();
        this.altimeterCallbacks = new LinkedHashMap();
        this.nextCallbackId = new AtomicInteger(0);
        this.magneticDeclination = new AtomicInteger(Float.floatToIntBits(0.0f));
        this.notifyCallbacksRunnable = new Runnable() { // from class: com.mapbox.navigator.a
            @Override // java.lang.Runnable
            public final void run() {
                IMUServiceImpl.notifyCallbacksRunnable$lambda$0(IMUServiceImpl.this);
            }
        };
    }

    @JvmStatic
    public static final IMUService createPlatformIMUService() {
        return INSTANCE.createPlatformIMUService();
    }

    private final int makeNextCallbackId() {
        return this.nextCallbackId.addAndGet(1);
    }

    private final void notifyCallbacks() {
        double normalizeAngle;
        double normalizeAngle2;
        Point3d point3d;
        Point3d point3d2;
        Point3d point3d3;
        Point3d point3d4;
        normalizeAngle = IMUServiceKt.normalizeAngle(Math.toDegrees(this.orientations[0]));
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        normalizeAngle2 = IMUServiceKt.normalizeAngle(Float.intBitsToFloat(this.magneticDeclination.get()) + normalizeAngle);
        float[] fArr = this.userAccelerationWithGravity;
        float f10 = fArr[0];
        float[] fArr2 = this.gravity;
        Point3d point3d5 = new Point3d((f10 - fArr2[0]) / 9.80665f, (fArr[1] - fArr2[1]) / 9.80665f, (fArr[2] - fArr2[2]) / 9.80665f);
        float[] fArr3 = this.orientations;
        AttitudeData attitudeData = new AttitudeData(fArr3[1], fArr3[0], fArr3[2]);
        point3d = IMUServiceKt.toPoint3d(this.rotations);
        point3d2 = IMUServiceKt.toPoint3d(this.gravity);
        point3d3 = IMUServiceKt.toPoint3d(this.geomagneticXyz);
        float f11 = (float) normalizeAngle;
        MotionData motionData = new MotionData(attitudeData, point3d, point3d2, point3d5, point3d3, f11, this.lastTimestampNanoseconds);
        Float valueOf = Float.valueOf((float) normalizeAngle2);
        Float valueOf2 = Float.valueOf(f11);
        point3d4 = IMUServiceKt.toPoint3d(this.geomagneticXyz);
        CompassData compassData = new CompassData(valueOf, valueOf2, null, point3d4, this.lastTimestampNanoseconds);
        synchronized (this) {
            try {
                if (this.lastTimestampNanoseconds > this.lastTimestampNotifiedNanoseconds) {
                    Iterator<Map.Entry<Integer, IMUUpdateCallback>> it = this.imuCallbacks.entrySet().iterator();
                    while (it.hasNext()) {
                        it.next().getValue().run(motionData);
                    }
                    Iterator<Map.Entry<Integer, CompassUpdateCallback>> it2 = this.compassCallbacks.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().run(compassData);
                    }
                    this.lastTimestampNotifiedNanoseconds = this.lastTimestampNanoseconds;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.notifyCallbacksRunnable, 10L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyCallbacksRunnable$lambda$0(IMUServiceImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyCallbacks();
    }

    private final void start() {
        if (this.handlerThread != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(15018));
        this.handlerThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.handlerThread;
        Intrinsics.checkNotNull(handlerThread2);
        Handler handler = new Handler(handlerThread2.getLooper());
        this.handler = handler;
        SensorManager sensorManager = this.sensorManager;
        Sensor sensor = this.accelerometerSensor;
        Intrinsics.checkNotNull(handler);
        sensorManager.registerListener(this, sensor, SENSOR_DELAY_MICROS, handler);
        SensorManager sensorManager2 = this.sensorManager;
        Sensor sensor2 = this.magneticSensor;
        Handler handler2 = this.handler;
        Intrinsics.checkNotNull(handler2);
        sensorManager2.registerListener(this, sensor2, SENSOR_DELAY_MICROS, handler2);
        SensorManager sensorManager3 = this.sensorManager;
        Sensor sensor3 = this.rotationSensor;
        Handler handler3 = this.handler;
        Intrinsics.checkNotNull(handler3);
        sensorManager3.registerListener(this, sensor3, SENSOR_DELAY_MICROS, handler3);
        SensorManager sensorManager4 = this.sensorManager;
        Sensor sensor4 = this.gravitySensor;
        Handler handler4 = this.handler;
        Intrinsics.checkNotNull(handler4);
        sensorManager4.registerListener(this, sensor4, SENSOR_DELAY_MICROS, handler4);
        SensorManager sensorManager5 = this.sensorManager;
        Sensor sensor5 = this.gyroscopeSensor;
        Handler handler5 = this.handler;
        Intrinsics.checkNotNull(handler5);
        sensorManager5.registerListener(this, sensor5, SENSOR_DELAY_MICROS, handler5);
        Sensor sensor6 = this.pressureSensor;
        if (sensor6 != null) {
            SensorManager sensorManager6 = this.sensorManager;
            Handler handler6 = this.handler;
            Intrinsics.checkNotNull(handler6);
            sensorManager6.registerListener(this, sensor6, SENSOR_DELAY_MICROS, handler6);
        } else {
            Log.i(StubApp.getString2(15017), StubApp.getString2(15019));
        }
        Handler handler7 = this.handler;
        if (handler7 != null) {
            handler7.postDelayed(this.notifyCallbacksRunnable, 10L);
        }
    }

    private final void stop() {
        this.sensorManager.unregisterListener(this);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handler = null;
        this.compassCallbacks.clear();
        this.imuCallbacks.clear();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handlerThread = null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final synchronized void handlePressure(long timestamp, float[] pressureValues) {
        Intrinsics.checkNotNullParameter(pressureValues, "pressureValues");
        AltimeterData altimeterData = new AltimeterData((float) (pressureValues[0] * 0.1d), timestamp);
        Iterator<Map.Entry<Integer, AltimeterUpdateCallback>> it = this.altimeterCallbacks.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().run(altimeterData);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.accuracy == 0) {
            return;
        }
        if (event.sensor.getType() == 6) {
            long j = event.timestamp;
            float[] fArr = event.values;
            Intrinsics.checkNotNullExpressionValue(fArr, "event.values");
            handlePressure(j, fArr);
            return;
        }
        synchronized (this) {
            try {
                this.lastTimestampNanoseconds = event.timestamp;
                int type = event.sensor.getType();
                if (type == 1) {
                    float[] fArr2 = this.userAccelerationWithGravity;
                    float[] fArr3 = event.values;
                    Intrinsics.checkNotNullExpressionValue(fArr3, "event.values");
                    IMUServiceKt.copyFrom$default(fArr2, fArr3, 0, 0, 0, 14, null);
                } else if (type == 2) {
                    float[] fArr4 = this.geomagneticXyz;
                    float[] fArr5 = event.values;
                    Intrinsics.checkNotNullExpressionValue(fArr5, "event.values");
                    IMUServiceKt.copyFrom$default(fArr4, fArr5, 0, 0, 0, 14, null);
                } else if (type == 4) {
                    float[] fArr6 = this.rotations;
                    float[] fArr7 = event.values;
                    Intrinsics.checkNotNullExpressionValue(fArr7, "event.values");
                    IMUServiceKt.copyFrom$default(fArr6, fArr7, 0, 0, 0, 14, null);
                } else if (type == 9) {
                    float[] fArr8 = this.gravity;
                    float[] fArr9 = event.values;
                    Intrinsics.checkNotNullExpressionValue(fArr9, "event.values");
                    IMUServiceKt.copyFrom$default(fArr8, fArr9, 0, 0, 0, 14, null);
                } else if (type != 11) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    SensorManager.getRotationMatrixFromVector(this.rotationMatrix, event.values);
                    SensorManager.getOrientation(this.rotationMatrix, this.orientations);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mapbox.navigator.IMUService
    public synchronized int registerAltimeterUpdateCallback(AltimeterUpdateCallback callback) {
        int makeNextCallbackId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        makeNextCallbackId = makeNextCallbackId();
        this.altimeterCallbacks.put(Integer.valueOf(makeNextCallbackId), callback);
        start();
        return makeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public synchronized int registerCompassUpdateCallback(CompassUpdateCallback callback) {
        int makeNextCallbackId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        makeNextCallbackId = makeNextCallbackId();
        this.compassCallbacks.put(Integer.valueOf(makeNextCallbackId), callback);
        start();
        return makeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public synchronized int registerIMUUpdateCallback(IMUUpdateCallback callback) {
        int makeNextCallbackId;
        Intrinsics.checkNotNullParameter(callback, "callback");
        makeNextCallbackId = makeNextCallbackId();
        this.imuCallbacks.put(Integer.valueOf(makeNextCallbackId), callback);
        start();
        return makeNextCallbackId;
    }

    @Override // com.mapbox.navigator.IMUService
    public synchronized void unregisterCallback(int id) {
        this.compassCallbacks.remove(Integer.valueOf(id));
        this.imuCallbacks.remove(Integer.valueOf(id));
        this.altimeterCallbacks.remove(Integer.valueOf(id));
        if (this.compassCallbacks.isEmpty() && this.imuCallbacks.isEmpty() && this.altimeterCallbacks.isEmpty()) {
            stop();
        }
    }

    @Override // com.mapbox.navigator.IMUService
    public void update(Point coordinate, Float altitude) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        this.magneticDeclination.set(Float.floatToIntBits(new GeomagneticField((float) coordinate.coordinates().get(1).doubleValue(), (float) coordinate.coordinates().get(0).doubleValue(), altitude != null ? altitude.floatValue() : 0.0f, System.currentTimeMillis()).getDeclination()));
    }
}
