package u1;

import android.graphics.PointF;
import com.stub.StubApp;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f21419a = Pattern.compile(StubApp.getString2(23548));

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f21420b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f21421c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f21422d;

    static {
        String string2 = StubApp.getString2(23549);
        int i3 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        f21420b = Pattern.compile(String.format(locale, StubApp.getString2(23550), string2));
        f21421c = Pattern.compile(String.format(locale, StubApp.getString2(23551), string2));
        f21422d = Pattern.compile(StubApp.getString2(23552));
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f21420b.matcher(str);
        Matcher matcher2 = f21421c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AbstractC1550k.o(StubApp.getString2(23554), StubApp.getString2(23553) + str + StubApp.getString2(620));
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
