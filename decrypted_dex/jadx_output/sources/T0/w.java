package T0;

import com.stub.StubApp;
import h1.C1002e;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C1404A;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7059c = Pattern.compile(StubApp.getString2(6121));

    /* renamed from: a, reason: collision with root package name */
    public int f7060a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f7061b = -1;

    public final boolean a(String str) {
        Matcher matcher = f7059c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i3 = AbstractC1560u.f20190a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f7060a = parseInt;
            this.f7061b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(C1404A c1404a) {
        int i3 = 0;
        while (true) {
            o0.z[] zVarArr = c1404a.f18017a;
            if (i3 >= zVarArr.length) {
                return;
            }
            o0.z zVar = zVarArr[i3];
            boolean z2 = zVar instanceof C1002e;
            String string2 = StubApp.getString2(6122);
            if (z2) {
                C1002e c1002e = (C1002e) zVar;
                if (string2.equals(c1002e.f14436c) && a(c1002e.f14437d)) {
                    return;
                }
            } else if (zVar instanceof h1.k) {
                h1.k kVar = (h1.k) zVar;
                if (StubApp.getString2(6123).equals(kVar.f14449b) && string2.equals(kVar.f14450c) && a(kVar.f14451d)) {
                    return;
                }
            } else {
                continue;
            }
            i3++;
        }
    }
}
