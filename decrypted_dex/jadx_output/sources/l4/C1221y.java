package l4;

import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.android.gms.internal.measurement.C0595b3;
import com.google.android.gms.internal.measurement.C0600c3;
import com.google.android.gms.internal.measurement.C0610e3;
import com.google.android.gms.internal.measurement.C0684t3;
import com.google.android.gms.internal.measurement.C0699w3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.p4;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import l5.InterfaceC1225a;
import o0.C1438m;

/* renamed from: l4.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1221y implements InterfaceC1217w, InterfaceC1225a, q1.j, Z9.m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16666b = new C1221y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16667c = new C1221y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16668d = new C1221y(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16669e = new C1221y(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16670f = new C1221y(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16671g = new C1221y(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16672h = new C1221y(6);
    public static final /* synthetic */ C1221y j = new C1221y(7);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16673k = new C1221y(8);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16674l = new C1221y(9);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16675m = new C1221y(10);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16676n = new C1221y(11);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16677p = new C1221y(12);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16678q = new C1221y(13);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16679r = new C1221y(14);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16680s = new C1221y(15);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16681t = new C1221y(16);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C1221y f16682v = new C1221y(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16683a;

    public /* synthetic */ C1221y(int i3) {
        this.f16683a = i3;
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static V6.b g(Context context, String[] strArr, String str, a5.c cVar) {
        String[] m4 = m(context);
        int length = m4.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = m4[i3];
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i10 = i11;
                }
            }
            if (zipFile != null) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i12 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder(StubApp.getString2(8500));
                            char c10 = File.separatorChar;
                            sb2.append(c10);
                            sb2.append(str3);
                            sb2.append(c10);
                            sb2.append(str);
                            String sb3 = sb2.toString();
                            cVar.getClass();
                            a5.c.B(StubApp.getString2(20918), sb3, str2);
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry != null) {
                                V6.b bVar = new V6.b(27, false);
                                bVar.f7761b = zipFile;
                                bVar.f7762c = entry;
                                return bVar;
                            }
                        }
                        i12 = i13;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    public static String h(AbstractActivityC0364d abstractActivityC0364d, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals(StubApp.getString2("1248")) ? MimeTypeMap.getSingleton().getExtensionFromMimeType(abstractActivityC0364d.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return StubApp.getString2(1) + l(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r14.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[Catch: all -> 0x0093, TryCatch #2 {all -> 0x0093, blocks: (B:5:0x0017, B:54:0x005d, B:11:0x0073, B:13:0x0079, B:16:0x0096, B:17:0x00b9, B:26:0x00e5, B:40:0x00f7, B:39:0x00f4, B:42:0x009d, B:45:0x00af, B:46:0x00ab, B:9:0x006f, B:65:0x006c, B:64:0x0069, B:48:0x0047, B:50:0x004d, B:53:0x0055, B:34:0x00ee, B:59:0x0063, B:20:0x00d1, B:21:0x00d3, B:23:0x00da, B:25:0x00de), top: B:4:0x0017, inners: #0, #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[Catch: all -> 0x00ec, LOOP:0: B:21:0x00d3->B:23:0x00da, LOOP_END, TryCatch #5 {all -> 0x00ec, blocks: (B:20:0x00d1, B:21:0x00d3, B:23:0x00da, B:25:0x00de), top: B:19:0x00d1, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(Xa.AbstractActivityC0364d r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1221y.i(Xa.d, android.net.Uri):java.lang.String");
    }

    public static String[] j(Context context, String str) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(8500));
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append(StubApp.getString2(20922));
        sb2.append(c10);
        sb2.append(StubApp.getString2(20923));
        sb2.append(c10);
        sb2.append(str);
        Pattern compile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static File k(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException(StubApp.getString2(20924) + file.getCanonicalPath() + StubApp.getString2(20925) + str2 + StubApp.getString2(1));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String string2 = StubApp.getString2(15721);
        String string22 = StubApp.getString2(601);
        String[] strArr = {string2, string22};
        String str2 = str.split(string22)[r4.length - 1];
        for (int i3 = 0; i3 < 2; i3++) {
            str2 = str2.replace(strArr[i3], StubApp.getString2(4956));
        }
        return str2;
    }

    public static String[] m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // l4.InterfaceC1217w
    public Object a() {
        switch (this.f16683a) {
            case 0:
                List list = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11539q.b()).longValue());
            case 1:
                List list2 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l9 = (Long) C0610e3.f11518e0.b();
                l9.getClass();
                return l9;
            case 2:
                List list3 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11537p.b()).longValue());
            case 3:
                List list4 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11510a0.b();
            case 4:
                List list5 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11552w0.b();
            case 5:
                List list6 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11542r0.b()).longValue());
            case 6:
                List list7 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11506X.b()).longValue());
            case 7:
                List list8 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Boolean bool = (Boolean) C0610e3.f11513c.b();
                bool.getClass();
                return bool;
            case 8:
                List list9 = AbstractC1148D.f15973a;
                Boolean bool2 = (Boolean) C0699w3.f11764b.b();
                bool2.getClass();
                return bool2;
            case 9:
                List list10 = AbstractC1148D.f15973a;
                Boolean bool3 = (Boolean) C0699w3.f11765c.b();
                bool3.getClass();
                return bool3;
            case 10:
                List list11 = AbstractC1148D.f15973a;
                Boolean bool4 = (Boolean) p4.f11646a.b();
                bool4.getClass();
                return bool4;
            case 11:
                List list12 = AbstractC1148D.f15973a;
                Boolean bool5 = (Boolean) C0684t3.f11663b.b();
                bool5.getClass();
                return bool5;
            case 12:
                List list13 = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool6 = (Boolean) R3.f11358f.b();
                bool6.getClass();
                return bool6;
            case 13:
                List list14 = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool7 = (Boolean) R3.f11360h.b();
                bool7.getClass();
                return bool7;
            case 14:
                List list15 = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool8 = (Boolean) R3.f11357e.b();
                bool8.getClass();
                return bool8;
            case 15:
                List list16 = AbstractC1148D.f15973a;
                Boolean bool9 = (Boolean) C0595b3.f11456a.b();
                bool9.getClass();
                return bool9;
            case 16:
                List list17 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11534n0.b()).longValue());
            default:
                return new Boolean(((Boolean) I3.f11290a.b()).booleanValue());
        }
    }

    @Override // q1.j
    public int b(C1438m c1438m) {
        return 1;
    }

    @Override // q1.j
    public boolean c(C1438m c1438m) {
        return false;
    }

    @Override // l5.InterfaceC1225a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        int i3;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i11 - intValue;
                if (i11 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i11 + i14])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i10 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i10++;
                    }
                    i3 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i3 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i10 = 1;
            i3 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return i12 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // q1.j
    public q1.l e(C1438m c1438m) {
        throw new IllegalStateException(StubApp.getString2(20926));
    }

    public C1221y() {
        this.f16683a = 20;
        M4.G g10 = M4.I.f4549b;
        M4.Z z2 = M4.Z.f4578e;
    }
}
