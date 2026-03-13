package s2;

import android.content.Context;
import android.os.PowerManager;
import com.stub.StubApp;
import java.util.WeakHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20723a = i2.o.g(StubApp.getString2(23104));

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f20724b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(1358));
        String concat = StubApp.getString2(23105).concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = f20724b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
