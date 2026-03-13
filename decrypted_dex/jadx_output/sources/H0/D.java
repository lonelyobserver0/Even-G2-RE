package H0;

import com.stub.StubApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C1406C;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    public static final D f2482c = new D(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f2483d = Pattern.compile(StubApp.getString2(2357));

    /* renamed from: a, reason: collision with root package name */
    public final long f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2485b;

    public D(long j, long j3) {
        this.f2484a = j;
        this.f2485b = j3;
    }

    public static D a(String str) {
        long parseFloat;
        Matcher matcher = f2483d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = B.f2470a;
        if (!matches) {
            throw C1406C.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw C1406C.b(str, null);
        }
        int i3 = AbstractC1560u.f20190a;
        long parseFloat2 = group.equals(StubApp.getString2(2358)) ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                if (parseFloat < parseFloat2) {
                    throw C1406C.b(str, null);
                }
            } catch (NumberFormatException e10) {
                throw C1406C.b(group2, e10);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new D(parseFloat2, parseFloat);
    }
}
