package T5;

import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    EF17(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF46(new int[]{1, 3}, StubApp.getString2(2882)),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(4, StubApp.getString2(6166)),
    /* JADX INFO: Fake field, exist only in values array */
    EF96(5, StubApp.getString2(6168)),
    /* JADX INFO: Fake field, exist only in values array */
    EF120(6, StubApp.getString2(6170)),
    /* JADX INFO: Fake field, exist only in values array */
    EF144(7, StubApp.getString2(6172)),
    /* JADX INFO: Fake field, exist only in values array */
    EF169(8, StubApp.getString2(6174)),
    /* JADX INFO: Fake field, exist only in values array */
    EF194(9, StubApp.getString2(6176)),
    /* JADX INFO: Fake field, exist only in values array */
    EF219(10, StubApp.getString2(6178)),
    /* JADX INFO: Fake field, exist only in values array */
    EF244(11, StubApp.getString2(6180)),
    /* JADX INFO: Fake field, exist only in values array */
    EF269(12, StubApp.getString2(6182)),
    /* JADX INFO: Fake field, exist only in values array */
    EF294(13, StubApp.getString2(6184)),
    /* JADX INFO: Fake field, exist only in values array */
    EF323(15, StubApp.getString2(6186)),
    /* JADX INFO: Fake field, exist only in values array */
    EF352(16, StubApp.getString2(6188)),
    /* JADX INFO: Fake field, exist only in values array */
    EF381(17, StubApp.getString2(6190)),
    /* JADX INFO: Fake field, exist only in values array */
    EF410(18, StubApp.getString2(6192)),
    /* JADX INFO: Fake field, exist only in values array */
    EF439(20, StubApp.getString2(6194)),
    /* JADX INFO: Fake field, exist only in values array */
    EF468(21, StubApp.getString2(6196)),
    /* JADX INFO: Fake field, exist only in values array */
    EF497(22, StubApp.getString2(6198)),
    /* JADX INFO: Fake field, exist only in values array */
    EF526(23, StubApp.getString2(6200)),
    /* JADX INFO: Fake field, exist only in values array */
    EF555(24, StubApp.getString2(6202)),
    /* JADX INFO: Fake field, exist only in values array */
    EF591(25, StubApp.getString2(2880), StubApp.getString2(6204)),
    /* JADX INFO: Fake field, exist only in values array */
    EF620(26, StubApp.getString2(640)),
    /* JADX INFO: Fake field, exist only in values array */
    EF655(new int[]{27, 170}, StubApp.getString2(2879)),
    /* JADX INFO: Fake field, exist only in values array */
    EF680(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF723(29, StubApp.getString2(6210), StubApp.getString2(6211), StubApp.getString2(6209)),
    /* JADX INFO: Fake field, exist only in values array */
    EF752(30, StubApp.getString2(6213));


    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f7190c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f7191d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7193a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f7194b;

    static {
        for (d dVar : values()) {
            if (Charset.isSupported(dVar.name())) {
                for (int i3 : dVar.f7193a) {
                    f7190c.put(Integer.valueOf(i3), dVar);
                }
                f7191d.put(dVar.name(), dVar);
                for (String str : dVar.f7194b) {
                    f7191d.put(str, dVar);
                }
            }
        }
    }

    d(int i3, String... strArr) {
        this.f7193a = new int[]{i3};
        this.f7194b = strArr;
    }

    public static d a(int i3) {
        if (i3 < 0 || i3 >= 900) {
            throw N5.e.a();
        }
        return (d) f7190c.get(Integer.valueOf(i3));
    }

    d(int[] iArr, String... strArr) {
        this.f7193a = iArr;
        this.f7194b = strArr;
    }
}
