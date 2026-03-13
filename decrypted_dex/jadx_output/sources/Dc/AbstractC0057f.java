package Dc;

import Kc.C0104k;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Dc.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0057f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0054c[] f1581a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f1582b;

    static {
        C0054c c0054c = new C0054c(C0054c.f1562i, "");
        C0104k c0104k = C0054c.f1559f;
        C0054c c0054c2 = new C0054c(c0104k, StubApp.getString2(595));
        C0054c c0054c3 = new C0054c(c0104k, StubApp.getString2(13314));
        C0104k c0104k2 = C0054c.f1560g;
        C0054c c0054c4 = new C0054c(c0104k2, StubApp.getString2(601));
        C0054c c0054c5 = new C0054c(c0104k2, StubApp.getString2(25110));
        C0104k c0104k3 = C0054c.f1561h;
        C0054c c0054c6 = new C0054c(c0104k3, StubApp.getString2(3589));
        C0054c c0054c7 = new C0054c(c0104k3, StubApp.getString2(3396));
        C0104k c0104k4 = C0054c.f1558e;
        C0054c[] c0054cArr = {c0054c, c0054c2, c0054c3, c0054c4, c0054c5, c0054c6, c0054c7, new C0054c(c0104k4, StubApp.getString2(7661)), new C0054c(c0104k4, StubApp.getString2(25111)), new C0054c(c0104k4, StubApp.getString2(25112)), new C0054c(c0104k4, StubApp.getString2(25113)), new C0054c(c0104k4, StubApp.getString2(9694)), new C0054c(c0104k4, StubApp.getString2(9696)), new C0054c(c0104k4, StubApp.getString2(9669)), new C0054c(StubApp.getString2(25114), ""), new C0054c(StubApp.getString2(25115), StubApp.getString2(25116)), new C0054c(StubApp.getString2(8449), ""), new C0054c(StubApp.getString2(25117), ""), new C0054c(StubApp.getString2(8452), ""), new C0054c(StubApp.getString2(25118), ""), new C0054c(StubApp.getString2(13288), ""), new C0054c(StubApp.getString2(25119), ""), new C0054c(StubApp.getString2(25120), ""), new C0054c(StubApp.getString2(13289), ""), new C0054c(StubApp.getString2(25121), ""), new C0054c(StubApp.getString2(13290), ""), new C0054c(StubApp.getString2(8451), ""), new C0054c(StubApp.getString2(13291), ""), new C0054c(StubApp.getString2(25122), ""), new C0054c(StubApp.getString2(25123), ""), new C0054c(StubApp.getString2(8450), ""), new C0054c(StubApp.getString2(25124), ""), new C0054c(StubApp.getString2(3713), ""), new C0054c(StubApp.getString2(13293), ""), new C0054c(StubApp.getString2(25125), ""), new C0054c(StubApp.getString2(25056), ""), new C0054c(StubApp.getString2(1518), ""), new C0054c(StubApp.getString2(5873), ""), new C0054c(StubApp.getString2(25126), ""), new C0054c(StubApp.getString2(25127), ""), new C0054c(StubApp.getString2(13294), ""), new C0054c(StubApp.getString2(25128), ""), new C0054c(StubApp.getString2(25129), ""), new C0054c(StubApp.getString2(13295), ""), new C0054c(StubApp.getString2(22253), ""), new C0054c(StubApp.getString2(662), ""), new C0054c(StubApp.getString2(25130), ""), new C0054c(StubApp.getString2(25131), ""), new C0054c(StubApp.getString2(25132), ""), new C0054c(StubApp.getString2(7704), ""), new C0054c(StubApp.getString2(25133), ""), new C0054c(StubApp.getString2(11304), ""), new C0054c(StubApp.getString2(13296), ""), new C0054c(StubApp.getString2(25134), ""), new C0054c(StubApp.getString2(25135), ""), new C0054c(StubApp.getString2(25136), ""), new C0054c(StubApp.getString2(25137), ""), new C0054c(StubApp.getString2(13297), ""), new C0054c(StubApp.getString2(25138), ""), new C0054c(StubApp.getString2(25139), ""), new C0054c(StubApp.getString2(25140), "")};
        f1581a = c0054cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i3 = 0;
        while (i3 < 61) {
            int i10 = i3 + 1;
            if (!linkedHashMap.containsKey(c0054cArr[i3].f1563a)) {
                linkedHashMap.put(c0054cArr[i3].f1563a, Integer.valueOf(i3));
            }
            i3 = i10;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        f1582b = unmodifiableMap;
    }

    public static void a(C0104k name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int e10 = name.e();
        int i3 = 0;
        while (i3 < e10) {
            int i10 = i3 + 1;
            byte j = name.j(i3);
            if (65 <= j && j <= 90) {
                throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", name.s()));
            }
            i3 = i10;
        }
    }
}
