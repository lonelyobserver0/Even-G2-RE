package H9;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2954a;

    static {
        HashMap hashMap = new HashMap();
        f2954a = hashMap;
        hashMap.put(StubApp.getString2(2701), Double.valueOf(3960.0d));
        hashMap.put(StubApp.getString2(2702), Double.valueOf(3441.145d));
        hashMap.put(StubApp.getString2(2703), Double.valueOf(57.2957795d));
        hashMap.put(StubApp.getString2(2704), Double.valueOf(1.0d));
        hashMap.put(StubApp.getString2(2705), Double.valueOf(2.509056E8d));
        hashMap.put(StubApp.getString2(2706), Double.valueOf(6969600.0d));
        Double valueOf = Double.valueOf(6373000.0d);
        hashMap.put(StubApp.getString2(2707), valueOf);
        Double valueOf2 = Double.valueOf(6.373E8d);
        hashMap.put(StubApp.getString2(2708), valueOf2);
        Double valueOf3 = Double.valueOf(6373.0d);
        hashMap.put(StubApp.getString2(2709), valueOf3);
        hashMap.put(StubApp.getString2(2710), Double.valueOf(2.090879265E7d));
        hashMap.put(StubApp.getString2(2711), valueOf2);
        hashMap.put(StubApp.getString2(2712), valueOf);
        hashMap.put(StubApp.getString2(2713), valueOf3);
    }

    public static double a(double d8) {
        return ((d8 % 360.0d) * 3.141592653589793d) / 180.0d;
    }
}
