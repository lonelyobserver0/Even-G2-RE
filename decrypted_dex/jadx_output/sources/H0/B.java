package H0;

import M4.Z;
import M4.n0;
import android.net.Uri;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2470a = Pattern.compile(StubApp.getString2(2334));

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2471b = Pattern.compile(StubApp.getString2(2335));

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2472c = Pattern.compile(StubApp.getString2(2336), 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f2473d = Pattern.compile(StubApp.getString2(2337));

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f2474e = Pattern.compile(StubApp.getString2(2338));

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f2475f = Pattern.compile(StubApp.getString2(2339));

    /* renamed from: g, reason: collision with root package name */
    public static final String f2476g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f2477h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals(StubApp.getString2(2351))) {
                    c10 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals(StubApp.getString2(2350))) {
                    c10 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals(StubApp.getString2(2349))) {
                    c10 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals(StubApp.getString2(2348))) {
                    c10 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals(StubApp.getString2(2347))) {
                    c10 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals(StubApp.getString2(2346))) {
                    c10 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals(StubApp.getString2(2345))) {
                    c10 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals(StubApp.getString2(2344))) {
                    c10 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals(StubApp.getString2(2343))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals(StubApp.getString2(2342))) {
                    c10 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals(StubApp.getString2(2341))) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals(StubApp.getString2(2340))) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static Z b(String str) {
        if (str == null) {
            M4.G g10 = M4.I.f4549b;
            return Z.f4578e;
        }
        M4.r.d(4, StubApp.getString2(2352));
        Object[] objArr = new Object[4];
        int i3 = AbstractC1560u.f20190a;
        int i10 = 0;
        for (String str2 : str.split(StubApp.getString2(2353), -1)) {
            int a3 = a(str2);
            if (a3 != 0) {
                Integer valueOf = Integer.valueOf(a3);
                int i11 = i10 + 1;
                int f10 = M4.C.f(objArr.length, i11);
                if (f10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f10);
                }
                objArr[i10] = valueOf;
                i10 = i11;
            }
        }
        return M4.I.j(i10, objArr);
    }

    public static Cc.a c(String str) {
        long parseInt;
        Matcher matcher = f2473d.matcher(str);
        if (!matcher.matches()) {
            throw C1406C.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e10) {
                throw C1406C.b(str, e10);
            }
        } else {
            parseInt = 60000;
        }
        return new Cc.a(group, parseInt, 1);
    }

    public static C2.a d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null) {
            return null;
        }
        String string2 = StubApp.getString2(478);
        if (!userInfo.contains(string2)) {
            return null;
        }
        int i3 = AbstractC1560u.f20190a;
        String[] split = userInfo.split(string2, 2);
        return new C2.a(split[0], split[1], false);
    }

    public static P3.m e(String str) {
        Matcher matcher = f2474e.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new P3.m(group, 2, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f2475f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new P3.m(group4, 1, "", "");
        }
        throw C1406C.b(StubApp.getString2(2354) + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        String string2 = StubApp.getString2(893);
        AbstractC1550k.c(encodedAuthority.contains(string2));
        int i3 = AbstractC1560u.f20190a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split(string2, -1)[1]).build();
    }

    public static Z g(C c10) {
        AbstractC1550k.c(c10.f2480c.b(StubApp.getString2(393)) != null);
        M4.F f10 = new M4.F(4);
        Object[] objArr = {h(c10.f2479b), c10.f2478a, StubApp.getString2(2355)};
        int i3 = AbstractC1560u.f20190a;
        f10.a(String.format(Locale.US, StubApp.getString2(2356), objArr));
        M4.J j = c10.f2480c.f2613a;
        n0 it = j.f4550d.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            M4.I d8 = j.d(str);
            for (int i10 = 0; i10 < d8.size(); i10++) {
                f10.a(String.format(Locale.US, StubApp.getString2(423), str, d8.get(i10)));
            }
        }
        f10.a("");
        f10.a(c10.f2481d);
        return f10.g();
    }

    public static String h(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(2341);
            case 2:
                return StubApp.getString2(2340);
            case 3:
                return StubApp.getString2(2349);
            case 4:
                return StubApp.getString2(2348);
            case 5:
                return StubApp.getString2(2343);
            case 6:
                return StubApp.getString2(2346);
            case 7:
                return StubApp.getString2(2347);
            case 8:
                return StubApp.getString2(2351);
            case 9:
                return StubApp.getString2(2345);
            case 10:
                return StubApp.getString2(2342);
            case 11:
                return StubApp.getString2(2344);
            case 12:
                return StubApp.getString2(2350);
            default:
                throw new IllegalStateException();
        }
    }
}
