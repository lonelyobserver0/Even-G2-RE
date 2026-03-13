package cb;

import R3.n;
import android.os.Looper;
import android.os.Parcel;
import c5.C;
import com.google.android.gms.internal.measurement.C0600c3;
import com.google.android.gms.internal.measurement.C0610e3;
import com.google.android.gms.internal.measurement.C0640k3;
import com.google.android.gms.internal.measurement.C3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.j4;
import com.stub.StubApp;
import f4.F;
import f4.g;
import f4.i;
import f4.p;
import fa.AbstractC0936b;
import i2.o;
import i4.InterfaceC1037a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import k5.C1106a;
import k5.C1107b;
import k5.InterfaceC1108c;
import l4.AbstractC1148D;
import l4.InterfaceC1217w;
import org.json.JSONObject;
import p0.AbstractC1482f;
import q4.InterfaceC1521b;
import q4.j;
import q4.k;
import w.AbstractC1856e;

/* renamed from: cb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0585c implements InterfaceC1037a, InterfaceC1521b, n, ga.b, InterfaceC1108c, InterfaceC1217w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11087a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11066b = new C0585c(3);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11067c = new C0585c(4);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11068d = new C0585c(9);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11069e = new C0585c(10);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11070f = new C0585c(11);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11071g = new C0585c(12);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11072h = new C0585c(13);
    public static final /* synthetic */ C0585c j = new C0585c(14);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11073k = new C0585c(15);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11074l = new C0585c(16);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11075m = new C0585c(17);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11076n = new C0585c(18);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11077p = new C0585c(19);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11078q = new C0585c(20);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11079r = new C0585c(21);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11080s = new C0585c(22);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11081t = new C0585c(23);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11082v = new C0585c(24);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11083w = new C0585c(25);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11084x = new C0585c(26);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11085y = new C0585c(27);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11086z = new C0585c(28);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C0585c f11065A = new C0585c(29);

    public /* synthetic */ C0585c(int i3) {
        this.f11087a = i3;
    }

    public static C1107b d(C c10) {
        return new C1107b(System.currentTimeMillis() + 3600000, new o(8), new C1106a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static String f(String str) {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith(StubApp.getString2(9649)) ? runtime.exec(StubApp.getString2(9650)) : runtime.exec(StubApp.getString2(9651))).getInputStream(), AbstractC0936b.f14188a));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();
        return readLine;
    }

    public static final boolean g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // l4.InterfaceC1217w
    public Object a() {
        switch (this.f11087a) {
            case 9:
                return new Boolean(((Boolean) C0640k3.f11602b.b()).booleanValue());
            case 10:
                return new Boolean(((Boolean) C3.f11241a.b()).booleanValue());
            case 11:
                List list = AbstractC1148D.f15973a;
                Boolean bool = (Boolean) j4.f11594a.b();
                bool.getClass();
                return bool;
            case 12:
                List list2 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11517e.b();
            case 13:
                List list3 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11536o0.b()).longValue());
            case 14:
                List list4 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11541r.b()).longValue());
            case 15:
                List list5 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11495M.b();
            case 16:
                List list6 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l9 = (Long) C0610e3.f11483A.b();
                l9.getClass();
                return l9;
            case 17:
                List list7 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l10 = (Long) C0610e3.f11494L.b();
                l10.getClass();
                return l10;
            case 18:
                List list8 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11497O.b()).longValue());
            case 19:
                List list9 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l11 = (Long) C0610e3.f11499Q.b();
                l11.getClass();
                return l11;
            case 20:
                List list10 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l12 = (Long) C0610e3.f11520f0.b();
                l12.getClass();
                return l12;
            case 21:
                List list11 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l13 = (Long) C0610e3.f11487E.b();
                l13.getClass();
                return l13;
            case 22:
                List list12 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l14 = (Long) C0610e3.f11554y.b();
                l14.getClass();
                return l14;
            case 23:
                List list13 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l15 = (Long) C0610e3.f11522g0.b();
                l15.getClass();
                return l15;
            case 24:
                List list14 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11544s0.b()).longValue());
            case 25:
                List list15 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11535o.b()).longValue());
            case 26:
                List list16 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l16 = (Long) C0610e3.f11490H.b();
                l16.getClass();
                return l16;
            case 27:
                List list17 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11521g.b();
            case 28:
                List list18 = AbstractC1148D.f15973a;
                M3.f11312b.get();
                return Integer.valueOf((int) ((Long) O3.f11329d.b()).longValue());
            default:
                List list19 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11547u.b()).longValue());
        }
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        F f10 = (F) ((p) obj).t();
        i iVar = new i((Boolean) null, (k) obj2);
        Parcel g10 = f10.g();
        int i3 = g.f13749a;
        g10.writeStrongBinder(iVar);
        f10.L(g10, 67);
    }

    @Override // ga.b
    public ArrayList b() {
        String str;
        String string2;
        ArrayList arrayList = new ArrayList();
        try {
            str = System.getProperty(StubApp.getString2("9652"));
        } catch (SecurityException unused) {
            str = null;
        }
        String property = System.getProperty(StubApp.getString2(9653));
        if (str == null) {
            try {
                str = f(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        String string22 = StubApp.getString2(9654);
        if (str == null || str.length() <= 2) {
            String string23 = property.endsWith(StubApp.getString2(9655)) ? StubApp.getString2(9656) : StubApp.getString2(9657);
            char c10 = 'C';
            while (true) {
                string2 = StubApp.getString2(478);
                if (c10 > 'E') {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c10);
                sb2.append(string2);
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(string23);
                sb2.append(str2);
                sb2.append(string22);
                File file = new File(sb2.toString());
                try {
                    if (file.exists() && file.canRead()) {
                        arrayList.add(file);
                        break;
                    }
                } catch (SecurityException unused3) {
                }
                c10 = (char) (c10 + 1);
            }
            for (char c11 = 'C'; c11 <= 'E'; c11 = (char) (c11 + 1)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(c11);
                sb3.append(string2);
                File file2 = new File(AbstractC1482f.k(sb3, File.separator, "PSFONTS"));
                try {
                    if (file2.exists() && file2.canRead()) {
                        arrayList.add(file2);
                    }
                } catch (SecurityException unused4) {
                }
            }
        } else {
            if (str.endsWith(StubApp.getString2(601))) {
                str = str.substring(0, str.length() - 1);
            }
            StringBuilder b2 = AbstractC1856e.b(str);
            String str3 = File.separator;
            File file3 = new File(AbstractC1482f.k(b2, str3, string22));
            if (file3.exists() && file3.canRead()) {
                arrayList.add(file3);
            }
            File file4 = new File(str.substring(0, 2) + str3 + "PSFONTS");
            if (file4.exists() && file4.canRead()) {
                arrayList.add(file4);
            }
        }
        try {
            String str4 = System.getenv(StubApp.getString2("9658"));
            if (str4 != null && !str4.isEmpty()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                String str5 = File.separator;
                sb4.append(str5);
                sb4.append(StubApp.getString2("9659"));
                sb4.append(str5);
                sb4.append(StubApp.getString2("9660"));
                sb4.append(str5);
                sb4.append(StubApp.getString2("9661"));
                File file5 = new File(sb4.toString());
                if (file5.exists() && file5.canRead()) {
                    arrayList.add(file5);
                }
            }
        } catch (SecurityException unused5) {
        }
        return arrayList;
    }

    @Override // k5.InterfaceC1108c
    public C1107b c(C c10, JSONObject jSONObject) {
        return d(c10);
    }

    @Override // q4.InterfaceC1521b
    public /* synthetic */ Object e(j jVar) {
        return null;
    }
}
