package l4;

import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class T extends AbstractC1214u0 {

    /* renamed from: c, reason: collision with root package name */
    public char f16239c;

    /* renamed from: d, reason: collision with root package name */
    public long f16240d;

    /* renamed from: e, reason: collision with root package name */
    public String f16241e;

    /* renamed from: f, reason: collision with root package name */
    public final Ac.b f16242f;

    /* renamed from: g, reason: collision with root package name */
    public final Ac.b f16243g;

    /* renamed from: h, reason: collision with root package name */
    public final Ac.b f16244h;
    public final Ac.b j;

    /* renamed from: k, reason: collision with root package name */
    public final Ac.b f16245k;

    /* renamed from: l, reason: collision with root package name */
    public final Ac.b f16246l;

    /* renamed from: m, reason: collision with root package name */
    public final Ac.b f16247m;

    /* renamed from: n, reason: collision with root package name */
    public final Ac.b f16248n;

    /* renamed from: p, reason: collision with root package name */
    public final Ac.b f16249p;

    public T(C1200n0 c1200n0) {
        super(c1200n0);
        this.f16239c = (char) 0;
        this.f16240d = -1L;
        this.f16242f = new Ac.b(this, 6, false, false);
        this.f16243g = new Ac.b(this, 6, true, false);
        this.f16244h = new Ac.b(this, 6, false, true);
        this.j = new Ac.b(this, 5, false, false);
        this.f16245k = new Ac.b(this, 5, true, false);
        this.f16246l = new Ac.b(this, 5, false, true);
        this.f16247m = new Ac.b(this, 4, false, false);
        this.f16248n = new Ac.b(this, 3, false, false);
        this.f16249p = new Ac.b(this, 2, false, false);
    }

    public static S s(String str) {
        if (str == null) {
            return null;
        }
        return new S(str);
    }

    public static String v(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String w10 = w(obj, z2);
        String w11 = w(obj2, z2);
        String w12 = w(obj3, z2);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = StubApp.getString2(994);
        }
        boolean isEmpty = TextUtils.isEmpty(w10);
        String string2 = StubApp.getString2(81);
        if (!isEmpty) {
            sb2.append(str2);
            sb2.append(w10);
            str2 = string2;
        }
        if (TextUtils.isEmpty(w11)) {
            string2 = str2;
        } else {
            sb2.append(str2);
            sb2.append(w11);
        }
        if (!TextUtils.isEmpty(w12)) {
            sb2.append(string2);
            sb2.append(w12);
        }
        return sb2.toString();
    }

    public static String w(Object obj, boolean z2) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        boolean z10 = obj instanceof Long;
        String string2 = StubApp.getString2(999);
        if (z10) {
            if (!z2) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l9.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? string2 : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append(StubApp.getString2(10450));
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof S ? ((S) obj).f16233a : z2 ? string2 : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
        String canonicalName = C1200n0.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb3.append(StubApp.getString2(994));
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i3++;
        }
        return sb3.toString();
    }

    @Override // l4.AbstractC1214u0
    public final boolean l() {
        return false;
    }

    public final Ac.b o() {
        return this.f16242f;
    }

    public final Ac.b p() {
        return this.j;
    }

    public final Ac.b q() {
        return this.f16248n;
    }

    public final Ac.b r() {
        return this.f16249p;
    }

    public final void t(int i3, boolean z2, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && Log.isLoggable(u(), i3)) {
            Log.println(i3, u(), v(false, str, obj, obj2, obj3));
        }
        if (z10 || i3 < 5) {
            return;
        }
        S3.D.h(str);
        C1191k0 c1191k0 = ((C1200n0) this.f4728a).f16542g;
        if (c1191k0 == null) {
            Log.println(6, u(), StubApp.getString2(20149));
        } else {
            if (!c1191k0.f16634b) {
                Log.println(6, u(), StubApp.getString2(20150));
                return;
            }
            if (i3 >= 9) {
                i3 = 8;
            }
            c1191k0.t(new Q(this, i3, str, obj, obj2, obj3));
        }
    }

    public final String u() {
        String str;
        synchronized (this) {
            try {
                if (this.f16241e == null) {
                    ((C1200n0) ((C1200n0) this.f4728a).f16539d.f4728a).getClass();
                    this.f16241e = StubApp.getString2("11932");
                }
                S3.D.h(this.f16241e);
                str = this.f16241e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
