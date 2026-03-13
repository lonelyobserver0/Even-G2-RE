package J;

import android.os.LocaleList;
import com.stub.StubApp;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f3255b = new e(new f(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final f f3256a;

    public e(f fVar) {
        this.f3256a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f3255b;
        }
        String[] split = str.split(StubApp.getString2(321), -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i3 = 0; i3 < length; i3++) {
            String str2 = split[i3];
            int i10 = d.f3254a;
            localeArr[i3] = Locale.forLanguageTag(str2);
        }
        return new e(new f(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3256a.equals(((e) obj).f3256a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3256a.f3257a.hashCode();
    }

    public final String toString() {
        return this.f3256a.f3257a.toString();
    }
}
