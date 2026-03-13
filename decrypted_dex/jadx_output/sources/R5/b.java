package R5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import n6.h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public h f6213a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f6214b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z2 = false;
        float f10 = sensorEvent.values[0];
        if (this.f6213a != null) {
            if (f10 <= 45.0f) {
                this.f6214b.post(new a(0, this, true));
            } else if (f10 >= 450.0f) {
                this.f6214b.post(new a(0, this, z2));
            }
        }
    }
}
