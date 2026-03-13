package android.support.v4.media.session;

import H5.A;
import Kc.C0100g;
import Kc.C0101h;
import Qb.C0203k;
import Qb.C0220t;
import Qb.L;
import R4.h;
import S3.D;
import Vb.u;
import Z8.e;
import ac.ExecutorC0400a;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.LruCache;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C0601d;
import com.google.android.gms.internal.measurement.C0606e;
import com.google.android.gms.internal.measurement.C0616g;
import com.google.android.gms.internal.measurement.C0636k;
import com.google.android.gms.internal.measurement.C0656o;
import com.google.android.gms.internal.measurement.C0666q;
import com.google.android.gms.internal.measurement.InterfaceC0651n;
import i8.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsKt;
import mb.m;
import q4.s;
import q8.AbstractC1526a;
import r0.AbstractC1560u;
import v.AbstractC1794g;
import v.C1790c;
import v.C1793f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {
    public static HashMap A(Location location) {
        boolean hasMslAltitude;
        double mslAltitudeMeters;
        boolean hasMslAltitudeAccuracy;
        float mslAltitudeAccuracyMeters;
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        hashMap.put("timestamp", Long.valueOf(location.getTime()));
        int i3 = Build.VERSION.SDK_INT;
        hashMap.put("is_mocked", Boolean.valueOf(i3 >= 31 ? location.isMock() : location.isFromMockProvider()));
        if (location.hasAltitude()) {
            hashMap.put("altitude", Double.valueOf(location.getAltitude()));
        }
        if (location.hasVerticalAccuracy()) {
            hashMap.put("altitude_accuracy", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            hashMap.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            hashMap.put("heading", Double.valueOf(location.getBearing()));
        }
        if (location.hasBearingAccuracy()) {
            hashMap.put("heading_accuracy", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            hashMap.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (location.hasSpeedAccuracy()) {
            hashMap.put("speed_accuracy", Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                hashMap.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                hashMap.put("gnss_satellite_count", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                hashMap.put("gnss_satellites_used_in_fix", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i3 >= 34) {
                hasMslAltitude = location.hasMslAltitude();
                if (hasMslAltitude) {
                    mslAltitudeMeters = location.getMslAltitudeMeters();
                    hashMap.put("altitude", Double.valueOf(mslAltitudeMeters));
                    hasMslAltitudeAccuracy = location.hasMslAltitudeAccuracy();
                    if (hasMslAltitudeAccuracy) {
                        mslAltitudeAccuracyMeters = location.getMslAltitudeAccuracyMeters();
                        hashMap.put("altitude_accuracy", Float.valueOf(mslAltitudeAccuracyMeters));
                    }
                }
            }
        }
        return hashMap;
    }

    public static long B(long j, long j3, long j10, int i3) {
        int i10 = AbstractC1560u.f20190a;
        return j + AbstractC1560u.R(j3 - j10, 1000000L, i3, RoundingMode.DOWN);
    }

    public static void C(C0100g cursor, byte[] key) {
        long j;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i3 = 0;
        do {
            byte[] bArr = cursor.f3815e;
            int i10 = cursor.f3816f;
            int i11 = cursor.f3817g;
            if (bArr != null) {
                while (i10 < i11) {
                    int i12 = i3 % length;
                    bArr[i10] = (byte) (bArr[i10] ^ key[i12]);
                    i10++;
                    i3 = i12 + 1;
                }
            }
            long j3 = cursor.f3814d;
            C0101h c0101h = cursor.f3811a;
            Intrinsics.checkNotNull(c0101h);
            if (j3 == c0101h.f3819b) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.f3814d;
        } while (cursor.d(j == -1 ? 0L : j + (cursor.f3817g - cursor.f3816f)) != -1);
    }

    public static Integer D(String str) {
        byte b2;
        Long valueOf;
        byte b10;
        str.getClass();
        if (!str.isEmpty()) {
            int i3 = str.charAt(0) == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i10 = i3 + 1;
                char charAt = str.charAt(i3);
                if (charAt < 128) {
                    b2 = P4.c.f5538a[charAt];
                } else {
                    byte[] bArr = P4.c.f5538a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = -b2;
                    long j3 = 10;
                    long j10 = Long.MIN_VALUE / j3;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                b10 = P4.c.f5538a[charAt2];
                            } else {
                                byte[] bArr2 = P4.c.f5538a;
                                b10 = -1;
                            }
                            if (b10 < 0 || b10 >= 10 || j < j10) {
                                break;
                            }
                            long j11 = j * j3;
                            int i12 = i3;
                            long j12 = b10;
                            if (j11 < j12 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j11 - j12;
                            i10 = i11;
                            i3 = i12;
                        } else if (i3 != 0) {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static Bundle E(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static ArrayList F(Exception exc) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(exc.toString());
        arrayList.add(exc.getClass().getSimpleName());
        arrayList.add("Cause: " + exc.getCause() + ", Stacktrace: " + Log.getStackTraceString(exc));
        return arrayList;
    }

    public static ArrayList G(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof m) {
            m mVar = (m) th;
            arrayList.add(mVar.f17333a);
            arrayList.add(mVar.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static InterfaceC0651n H(Object obj) {
        if (obj == null) {
            return InterfaceC0651n.f11620V;
        }
        if (obj instanceof String) {
            return new C0666q((String) obj);
        }
        if (obj instanceof Double) {
            return new C0616g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0616g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0616g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0606e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0601d c0601d = new C0601d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0601d.r(c0601d.p(), H(it.next()));
            }
            return c0601d;
        }
        C0636k c0636k = new C0636k();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC0651n H2 = H(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                c0636k.g((String) obj2, H2);
            }
        }
        return c0636k;
    }

    public static String I(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String n10 = E1.a.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(n10), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + n10.length() + 8 + 1);
                    sb3.append("<");
                    sb3.append(n10);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    sb2 = sb3.toString();
                }
            }
            objArr[i10] = sb2;
            i10++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i11, indexOf);
            sb4.append(objArr[i3]);
            i3++;
            i11 = indexOf + 2;
        }
        sb4.append((CharSequence) str, i11, str.length());
        if (i3 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i3]);
            for (int i12 = i3 + 1; i12 < objArr.length; i12++) {
                sb4.append(", ");
                sb4.append(objArr[i12]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static InterfaceC0651n J(A1 a1) {
        if (a1 == null) {
            return InterfaceC0651n.f11619U;
        }
        int x7 = a1.x() - 1;
        if (x7 == 1) {
            return a1.r() ? new C0666q(a1.s()) : InterfaceC0651n.f11626e0;
        }
        if (x7 == 2) {
            return a1.v() ? new C0616g(Double.valueOf(a1.w())) : new C0616g(null);
        }
        if (x7 == 3) {
            return a1.t() ? new C0606e(Boolean.valueOf(a1.u())) : new C0606e(null);
        }
        if (x7 != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List p8 = a1.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = p8.iterator();
        while (it.hasNext()) {
            arrayList.add(J((A1) it.next()));
        }
        return new C0656o(arrayList, a1.q());
    }

    public static List a(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new P4.b(0, iArr.length, iArr);
    }

    public static final Object b(s sVar, A a3) {
        if (!sVar.isComplete()) {
            C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(a3));
            c0203k.s();
            sVar.addOnCompleteListener(ExecutorC0400a.f9348a, new e(c0203k));
            Object r8 = c0203k.r();
            if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(a3);
            }
            return r8;
        }
        Exception exception = sVar.getException();
        if (exception != null) {
            throw exception;
        }
        if (!sVar.f20075d) {
            return sVar.getResult();
        }
        throw new CancellationException("Task " + sVar + " was cancelled normally.");
    }

    public static void f(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            char charAt = str.charAt(i3);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(xc.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str).toString());
            }
            i3 = i10;
        }
    }

    public static void g(String str, String str2) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(xc.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i3), str2), xc.b.q(str2) ? "" : Intrinsics.stringPlus(": ", str)).toString());
            }
            i3 = i10;
        }
    }

    public static int h(long j) {
        int i3 = (int) j;
        hc.b.g(j, "Out of range: %s", ((long) i3) == j);
        return i3;
    }

    public static final void i() {
        Intrinsics.checkNotNullParameter(d.f14937a, "<this>");
        LruCache lruCache = d.f14939c;
        synchronized (lruCache) {
            d.f14940d.clear();
            lruCache.evictAll();
            lruCache.resize(1);
            Unit unit = Unit.INSTANCE;
        }
        d.f14938b.evictAll();
    }

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean k(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean l9 = l(file, inputStream);
                j(inputStream);
                return l9;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean l(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static void m(String str) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (SecurityException unused) {
        }
    }

    public static T3.c n(byte[] bArr, Parcelable.Creator creator) {
        D.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T3.c cVar = (T3.c) creator.createFromParcel(obtain);
        obtain.recycle();
        return cVar;
    }

    public static float o(float f10, float f11, float f12) {
        float f13 = f10 / (f12 / 2.0f);
        float f14 = f11 / 2.0f;
        if (f13 < 1.0f) {
            return (f14 * f13 * f13 * f13) + 0.0f;
        }
        float f15 = f13 - 2.0f;
        return (((f15 * f15 * f15) + 2.0f) * f14) + 0.0f;
    }

    public static int p(byte[] bArr) {
        boolean z2 = bArr.length >= 4;
        int length = bArr.length;
        if (!z2) {
            throw new IllegalArgumentException(AbstractC1526a.C("array too small: %s < %s", Integer.valueOf(length), 4));
        }
        byte b2 = bArr[0];
        byte b10 = bArr[1];
        byte b11 = bArr[2];
        return (bArr[3] & UByte.MAX_VALUE) | (b2 << 24) | ((b10 & UByte.MAX_VALUE) << 16) | ((b11 & UByte.MAX_VALUE) << 8);
    }

    public static final h q() {
        Intrinsics.checkNotNullParameter(R4.c.f6178b, "<this>");
        h e10 = h.e();
        Intrinsics.checkNotNullExpressionValue(e10, "getInstance()");
        return e10;
    }

    public static File r(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int s(int[] iArr, int i3, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i3) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static MappedByteBuffer t(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static wc.s u(String... namesAndValues) {
        CharSequence trim;
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i3 = 0;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String str = strArr[i10];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            trim = StringsKt__StringsKt.trim((CharSequence) str);
            strArr[i10] = trim.toString();
            i10 = i11;
        }
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                int i12 = i3 + 2;
                String str2 = strArr[i3];
                String str3 = strArr[i3 + 1];
                f(str2);
                g(str3, str2);
                if (i3 == progressionLastElement) {
                    break;
                }
                i3 = i12;
            }
        }
        return new wc.s(strArr);
    }

    public static int x(long j) {
        if (j > 2147483647L) {
            return IntCompanionObject.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final Object y(u uVar, u uVar2, Function2 function2) {
        Object c0220t;
        Object M5;
        try {
            c0220t = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(uVar2, uVar);
        } catch (Throwable th) {
            c0220t = new C0220t(th, false);
        }
        if (c0220t != IntrinsicsKt.getCOROUTINE_SUSPENDED() && (M5 = uVar.M(c0220t)) != L.f5819e) {
            if (M5 instanceof C0220t) {
                throw ((C0220t) M5).f5894a;
            }
            return L.m(M5);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static int[] z(Collection collection) {
        if (collection instanceof P4.b) {
            P4.b bVar = (P4.b) collection;
            return Arrays.copyOfRange(bVar.f5535a, bVar.f5536b, bVar.f5537c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            Object obj = array[i3];
            obj.getClass();
            iArr[i3] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public abstract boolean c(AbstractC1794g abstractC1794g, C1790c c1790c, C1790c c1790c2);

    public abstract boolean d(AbstractC1794g abstractC1794g, Object obj, Object obj2);

    public abstract boolean e(AbstractC1794g abstractC1794g, C1793f c1793f, C1793f c1793f2);

    public abstract void v(C1793f c1793f, C1793f c1793f2);

    public abstract void w(C1793f c1793f, Thread thread);
}
