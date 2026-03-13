package gb;

import android.window.BackEvent;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: gb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0975d {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14327a;

    public C0975d(Za.d dVar) {
        C0974c c0974c = new C0974c();
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(17895), StandardMethodCodec.INSTANCE);
        this.f14327a = methodChannel;
        methodChannel.setMethodCallHandler(c0974c);
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put(StubApp.getString2(17896), (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put(StubApp.getString2(4838), Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put(StubApp.getString2(17897), Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
