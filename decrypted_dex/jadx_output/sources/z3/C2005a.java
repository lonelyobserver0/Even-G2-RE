package z3;

import a.AbstractC0378a;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import y3.C1970c;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2005a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f24030c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f24031d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2005a f24032e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2005a f24033f;

    /* renamed from: a, reason: collision with root package name */
    public final String f24034a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24035b;

    static {
        String q10 = AbstractC0378a.q(StubApp.getString2(24890), StubApp.getString2(24891));
        f24030c = q10;
        String q11 = AbstractC0378a.q(StubApp.getString2(24892), StubApp.getString2(24893));
        String q12 = AbstractC0378a.q(StubApp.getString2(24894), StubApp.getString2(24895));
        f24031d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C1970c(StubApp.getString2(636)), new C1970c(StubApp.getString2(2547)))));
        f24032e = new C2005a(q10, null);
        f24033f = new C2005a(q11, q12);
    }

    public C2005a(String str, String str2) {
        this.f24034a = str;
        this.f24035b = str2;
    }

    public static C2005a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(StubApp.getString2(640)));
        if (!str.startsWith(StubApp.getString2(638))) {
            throw new IllegalArgumentException(StubApp.getString2(24898));
        }
        String[] split = str.substring(2).split(Pattern.quote(StubApp.getString2(639)), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException(StubApp.getString2(24897));
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException(StubApp.getString2(24896));
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2005a(str2, str3);
    }
}
