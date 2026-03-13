package wc;

import com.stub.StubApp;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class t {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f22418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22419b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22420c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22421d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22422e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f22423f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22424g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22425h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22426i;

    public t(String scheme, String username, String password, String host, int i3, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f22418a = scheme;
        this.f22419b = username;
        this.f22420c = password;
        this.f22421d = host;
        this.f22422e = i3;
        this.f22423f = arrayList;
        this.f22424g = str;
        this.f22425h = url;
        this.f22426i = Intrinsics.areEqual(scheme, "https");
    }

    public final String a() {
        int indexOf$default;
        int indexOf$default2;
        if (this.f22420c.length() == 0) {
            return "";
        }
        int length = this.f22418a.length() + 3;
        String str = this.f22425h;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', length, false, 4, (Object) null);
        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null);
        String substring = str.substring(indexOf$default + 1, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int indexOf$default;
        int length = this.f22418a.length() + 3;
        String str = this.f22425h;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        String substring = str.substring(indexOf$default, xc.b.f(str, indexOf$default, str.length(), StubApp.getString2(25018)));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int indexOf$default;
        int length = this.f22418a.length() + 3;
        String str = this.f22425h;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        int f10 = xc.b.f(str, indexOf$default, str.length(), StubApp.getString2(25018));
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < f10) {
            int i3 = indexOf$default + 1;
            int e10 = xc.b.e(str, '/', i3, f10);
            String substring = str.substring(i3, e10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = e10;
        }
        return arrayList;
    }

    public final String d() {
        int indexOf$default;
        if (this.f22423f == null) {
            return null;
        }
        String str = this.f22425h;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        int i3 = indexOf$default + 1;
        String substring = str.substring(i3, xc.b.e(str, '#', i3, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f22419b.length() == 0) {
            return "";
        }
        int length = this.f22418a.length() + 3;
        String string2 = StubApp.getString2(35574);
        String str = this.f22425h;
        String substring = str.substring(length, xc.b.f(str, length, str.length(), string2));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && Intrinsics.areEqual(((t) obj).f22425h, this.f22425h);
    }

    public final Ac.t f() {
        int indexOf$default;
        String substring;
        Ac.t tVar = new Ac.t();
        String scheme = this.f22418a;
        tVar.f392d = scheme;
        String e10 = e();
        Intrinsics.checkNotNullParameter(e10, "<set-?>");
        tVar.f393e = e10;
        String a3 = a();
        Intrinsics.checkNotNullParameter(a3, "<set-?>");
        tVar.f394f = a3;
        tVar.f395g = this.f22421d;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        int i3 = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        int i10 = this.f22422e;
        tVar.f390b = i10 != i3 ? i10 : -1;
        ArrayList arrayList = tVar.f391c;
        arrayList.clear();
        arrayList.addAll(c());
        tVar.c(d());
        if (this.f22424g == null) {
            substring = null;
        } else {
            String str = this.f22425h;
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '#', 0, false, 6, (Object) null);
            substring = str.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        }
        tVar.f397i = substring;
        return tVar;
    }

    public final String g() {
        Ac.t tVar;
        Intrinsics.checkNotNullParameter("/...", StubApp.getString2(22253));
        try {
            tVar = new Ac.t();
            tVar.e(this, "/...");
        } catch (IllegalArgumentException unused) {
            tVar = null;
        }
        Intrinsics.checkNotNull(tVar);
        tVar.getClass();
        Intrinsics.checkNotNullParameter("", StubApp.getString2(17899));
        String string2 = StubApp.getString2(25015);
        String b2 = m.b("", 0, 0, string2, 251);
        Intrinsics.checkNotNullParameter(b2, "<set-?>");
        tVar.f393e = b2;
        Intrinsics.checkNotNullParameter("", "password");
        String b10 = m.b("", 0, 0, string2, 251);
        Intrinsics.checkNotNullParameter(b10, "<set-?>");
        tVar.f394f = b10;
        return tVar.a().f22425h;
    }

    public final URI h() {
        Ac.t f10 = f();
        String str = (String) f10.f395g;
        f10.f395g = str == null ? null : new Regex(StubApp.getString2(35575)).replace(str, "");
        ArrayList arrayList = f10.f391c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, m.b((String) arrayList.get(i3), 0, 0, StubApp.getString2(11096), 227));
        }
        ArrayList arrayList2 = (ArrayList) f10.f396h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                int i11 = i10 + 1;
                String str2 = (String) arrayList2.get(i10);
                arrayList2.set(i10, str2 == null ? null : m.b(str2, 0, 0, StubApp.getString2(35576), 195));
                i10 = i11;
            }
        }
        String str3 = (String) f10.f397i;
        f10.f397i = str3 != null ? m.b(str3, 0, 0, StubApp.getString2(35577), 163) : null;
        String tVar = f10.toString();
        try {
            return new URI(tVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new Regex(StubApp.getString2("35578")).replace(tVar, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f22425h.hashCode();
    }

    public final String toString() {
        return this.f22425h;
    }
}
