package f4;

import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f13784a;

    /* renamed from: b, reason: collision with root package name */
    public static final StringBuilder f13785b;

    static {
        Locale locale = Locale.ROOT;
        f13784a = new SimpleDateFormat(StubApp.getString2(17506), locale);
        new SimpleDateFormat(StubApp.getString2(17507), locale);
        f13785b = new StringBuilder(33);
    }

    public static void a(long j, StringBuilder sb2) {
        if (j == 0) {
            sb2.append(StubApp.getString2(17508));
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z2 = false;
        if (j < 0) {
            sb2.append(StubApp.getString2(999));
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = LongCompanionObject.MAX_VALUE;
                z2 = true;
            }
        }
        if (j >= 86400000) {
            sb2.append(j / 86400000);
            sb2.append(StubApp.getString2(1315));
            j %= 86400000;
        }
        if (true == z2) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb2.append(j / 3600000);
            sb2.append(StubApp.getString2(4933));
            j %= 3600000;
        }
        if (j >= 60000) {
            sb2.append(j / 60000);
            sb2.append(StubApp.getString2(2374));
            j %= 60000;
        }
        if (j >= 1000) {
            sb2.append(j / 1000);
            sb2.append(StubApp.getString2(1313));
            j %= 1000;
        }
        if (j > 0) {
            sb2.append(j);
            sb2.append(StubApp.getString2(6642));
        }
    }
}
