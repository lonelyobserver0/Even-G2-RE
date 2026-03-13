package xc;

import Bc.h;
import Dc.C0054c;
import Kc.C0101h;
import Kc.H;
import Kc.InterfaceC0103j;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.asn1.eac.CertificateBody;
import wc.C1881F;
import wc.s;
import wc.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23179a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f23180b = android.support.v4.media.session.b.u(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final h f23181c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f23182d;

    /* renamed from: e, reason: collision with root package name */
    public static final Regex f23183e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f23184f;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0136, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.b.<clinit>():void");
    }

    public static final boolean a(t tVar, t other) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(tVar.f22421d, other.f22421d) && tVar.f22422e == other.f22422e && Intrinsics.areEqual(tVar.f22418a, other.f22418a);
    }

    public static final int b(String name, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j < 0) {
            throw new IllegalStateException(Intrinsics.stringPlus(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException(StubApp.getString2(35609));
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(name, " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus(name, " too small.").toString());
    }

    public static final void c(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c10, int i3, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i3 < i10) {
            int i11 = i3 + 1;
            if (str.charAt(i3) == c10) {
                return i3;
            }
            i3 = i11;
        }
        return i10;
    }

    public static final int f(String str, int i3, int i10, String delimiters) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i3 < i10) {
            int i11 = i3 + 1;
            contains$default = StringsKt__StringsKt.contains$default(delimiters, str.charAt(i3), false, 2, (Object) null);
            if (contains$default) {
                return i3;
            }
            i3 = i11;
        }
        return i10;
    }

    public static /* synthetic */ int g(String str, char c10, int i3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = str.length();
        }
        return e(str, c10, i3, i10);
    }

    public static final boolean h(H h2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(h2, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return t(h2, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str = strArr[i3];
                i3++;
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(C1881F c1881f) {
        Intrinsics.checkNotNullParameter(c1881f, "<this>");
        String a3 = c1881f.f22330f.a(StubApp.getString2(2415));
        if (a3 == null) {
            return -1L;
        }
        Intrinsics.checkNotNullParameter(a3, "<this>");
        try {
            return Long.parseLong(a3);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            char charAt = str.charAt(i3);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, CertificateBody.profileType) >= 0) {
                return i3;
            }
            i3 = i10;
        }
        return -1;
    }

    public static final int n(int i3, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i3 < i10) {
            int i11 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3;
            }
            i3 = i11;
        }
        return i10;
    }

    public static final int o(int i3, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i10 - 1;
        if (i3 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char charAt = str.charAt(i11);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i3) {
                    break;
                }
                i11 = i12;
            }
        }
        return i3;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            String str = strArr[i3];
            i3++;
            int length2 = other.length;
            int i10 = 0;
            while (true) {
                if (i10 < length2) {
                    String str2 = other[i10];
                    i10++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException(StubApp.getString2(11601));
    }

    public static final boolean q(String name) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        Intrinsics.checkNotNullParameter(name, "name");
        equals = StringsKt__StringsJVMKt.equals(name, StubApp.getString2(2407), true);
        if (equals) {
            return true;
        }
        equals2 = StringsKt__StringsJVMKt.equals(name, StubApp.getString2(25033), true);
        if (equals2) {
            return true;
        }
        equals3 = StringsKt__StringsJVMKt.equals(name, StubApp.getString2(35610), true);
        if (equals3) {
            return true;
        }
        equals4 = StringsKt__StringsJVMKt.equals(name, StubApp.getString2(35611), true);
        return equals4;
    }

    public static final int r(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int s(InterfaceC0103j interfaceC0103j) {
        Intrinsics.checkNotNullParameter(interfaceC0103j, "<this>");
        return (interfaceC0103j.readByte() & UByte.MAX_VALUE) | ((interfaceC0103j.readByte() & UByte.MAX_VALUE) << 16) | ((interfaceC0103j.readByte() & UByte.MAX_VALUE) << 8);
    }

    public static final boolean t(H h2, int i3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(h2, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c10 = h2.b().e() ? h2.b().c() - nanoTime : Long.MAX_VALUE;
        h2.b().d(Math.min(c10, timeUnit.toNanos(i3)) + nanoTime);
        try {
            C0101h c0101h = new C0101h();
            while (h2.n(8192L, c0101h) != -1) {
                c0101h.skip(c0101h.f3819b);
            }
            if (c10 == LongCompanionObject.MAX_VALUE) {
                h2.b().a();
                return true;
            }
            h2.b().d(nanoTime + c10);
            return true;
        } catch (InterruptedIOException unused) {
            if (c10 == LongCompanionObject.MAX_VALUE) {
                h2.b().a();
                return false;
            }
            h2.b().d(nanoTime + c10);
            return false;
        } catch (Throwable th) {
            if (c10 == LongCompanionObject.MAX_VALUE) {
                h2.b().a();
            } else {
                h2.b().d(nanoTime + c10);
            }
            throw th;
        }
    }

    public static final s u(List list) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0054c c0054c = (C0054c) it.next();
            String name = c0054c.f1563a.s();
            String value = c0054c.f1564b.s();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            trim = StringsKt__StringsKt.trim((CharSequence) value);
            arrayList.add(trim.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new s((String[]) array);
        }
        throw new NullPointerException(StubApp.getString2(11601));
    }

    public static final String v(t tVar, boolean z2) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        contains$default = StringsKt__StringsKt.contains$default(tVar.f22421d, (CharSequence) StubApp.getString2(478), false, 2, (Object) null);
        String str = tVar.f22421d;
        if (contains$default) {
            str = Xa.h.n(StubApp.getString2(1557), ']', str);
        }
        int i3 = tVar.f22422e;
        if (!z2) {
            String scheme = tVar.f22418a;
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (i3 == (Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i3;
    }

    public static final List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i3, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i3;
            }
        }
        if (valueOf == null) {
            return i3;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return IntCompanionObject.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String y(int i3, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int n10 = n(i3, i10, str);
        String substring = str.substring(n10, o(n10, i10, str));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(IOException iOException, List suppressed) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(iOException, (Exception) it.next());
        }
    }
}
