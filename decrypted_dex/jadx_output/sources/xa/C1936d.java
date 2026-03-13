package xa;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xa.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1936d {

    /* renamed from: d, reason: collision with root package name */
    public static final C1936d f23119d = a(4281, StubApp.getString2(24226));

    /* renamed from: e, reason: collision with root package name */
    public static final C1936d f23120e = a(201, StubApp.getString2(24227));

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23121a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23122b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f23123c = new ConcurrentHashMap();

    static {
        try {
            if (System.getProperty(StubApp.getString2("24228")) == null) {
            } else {
                throw new UnsupportedOperationException(StubApp.getString2("24229"));
            }
        } catch (SecurityException unused) {
        }
    }

    public C1936d(InputStream inputStream, int i3) {
        this.f23121a = new HashMap(i3);
        this.f23122b = new HashMap(i3);
        b(inputStream);
    }

    public static C1936d a(int i3, String str) {
        InputStream resourceAsStream;
        String string2 = StubApp.getString2(24230);
        String string22 = StubApp.getString2(601);
        String concat = StubApp.getString2(24231).concat(str);
        try {
            try {
                if (AbstractC0624h2.o()) {
                    resourceAsStream = AbstractC0624h2.k(concat);
                } else {
                    resourceAsStream = C1936d.class.getResourceAsStream(string22 + concat);
                }
                InputStream inputStream = resourceAsStream;
                if (inputStream != null) {
                    C1936d c1936d = new C1936d(inputStream, i3);
                    F1.h(inputStream);
                    return c1936d;
                }
                throw new IOException(string2 + concat + StubApp.getString2("23961"));
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            F1.h(null);
            throw th;
        }
    }

    public final void b(InputStream inputStream) {
        HashMap hashMap = this.f23122b;
        String string2 = StubApp.getString2(397);
        HashMap hashMap2 = this.f23121a;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StubApp.getString2(2882)));
        while (bufferedReader.ready()) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && !readLine.startsWith(StubApp.getString2("919"))) {
                    String[] split = readLine.split(StubApp.getString2("1262"));
                    if (split.length < 2) {
                        throw new IOException(StubApp.getString2("24233") + readLine);
                    }
                    String str = split[0];
                    String[] split2 = split[1].split(string2);
                    if (hashMap2.containsKey(str)) {
                        Log.w(StubApp.getString2("948"), StubApp.getString2("24232") + str + StubApp.getString2("438") + split[1] + string2 + ((String) hashMap2.get(str)));
                    }
                    int length = split2.length;
                    int[] iArr = new int[length];
                    int length2 = split2.length;
                    int i3 = 0;
                    int i10 = 0;
                    while (i3 < length2) {
                        iArr[i10] = Integer.parseInt(split2[i3], 16);
                        i3++;
                        i10++;
                    }
                    String str2 = new String(iArr, 0, length);
                    hashMap2.put(str, str2);
                    boolean z2 = C1942j.f23135d.f23118b.containsKey(str) || C1939g.f23129d.f23118b.containsKey(str) || C1937e.f23125d.f23118b.containsKey(str) || C1941i.f23133d.f23118b.containsKey(str) || C1943k.f23137d.f23118b.containsKey(str);
                    if (!hashMap.containsKey(str2) || z2) {
                        hashMap.put(str2, str);
                    }
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
        bufferedReader.close();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.f23121a.get(str);
        if (str2 != null) {
            return str2;
        }
        ConcurrentHashMap concurrentHashMap = this.f23123c;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 == null) {
            if (str.indexOf(46) > 0) {
                str3 = c(str.substring(0, str.indexOf(46)));
            } else {
                boolean startsWith = str.startsWith(StubApp.getString2(17157));
                String string2 = StubApp.getString2(24234);
                String string22 = StubApp.getString2(948);
                String string23 = StubApp.getString2(24235);
                if (startsWith && str.length() == 7) {
                    int length = str.length();
                    StringBuilder sb2 = new StringBuilder();
                    int i3 = 3;
                    while (true) {
                        int i10 = i3 + 4;
                        if (i10 > length) {
                            break;
                        }
                        try {
                            int parseInt = Integer.parseInt(str.substring(i3, i10), 16);
                            if (parseInt <= 55295 || parseInt >= 57344) {
                                sb2.append((char) parseInt);
                            } else {
                                Log.w(string22, string23 + str);
                            }
                            i3 = i10;
                        } catch (NumberFormatException unused) {
                            Log.w(string22, string2.concat(str));
                        }
                        Log.w(string22, string2.concat(str));
                    }
                    str3 = sb2.toString();
                } else if (str.startsWith(StubApp.getString2(2371)) && str.length() == 5) {
                    try {
                        int parseInt2 = Integer.parseInt(str.substring(1), 16);
                        if (parseInt2 <= 55295 || parseInt2 >= 57344) {
                            str3 = String.valueOf((char) parseInt2);
                        } else {
                            Log.w(string22, string23.concat(str));
                        }
                    } catch (NumberFormatException unused2) {
                        Log.w(string22, string2.concat(str));
                    }
                }
            }
            if (str3 != null) {
                concurrentHashMap.put(str, str3);
            }
        }
        return str3;
    }

    public C1936d(C1936d c1936d, InputStream inputStream) {
        this.f23121a = new HashMap(c1936d.f23121a);
        this.f23122b = new HashMap(c1936d.f23122b);
        b(inputStream);
    }
}
