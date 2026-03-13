package hc;

import E9.k;
import Q.c;
import V9.d;
import Xa.h;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.Camera;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.widget.EdgeEffect;
import b0.AbstractC0482i;
import b0.C0475b;
import b0.C0476c;
import com.google.gson.JsonElement;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.stub.StubApp;
import ec.C0859b;
import i2.u;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import q8.AbstractC1526a;
import t6.C1737d;
import v6.InterfaceC1836b;
import w.AbstractC1856e;
import w6.e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static Context f14499b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14500a;

    public /* synthetic */ b(int i3) {
        this.f14500a = i3;
    }

    public static Set A() {
        try {
            Object invoke = Class.forName(StubApp.getString2("26016")).getMethod(StubApp.getString2("26017"), new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static long H(double d8) {
        h(StubApp.getString2(26018), O(d8));
        int exponent = Math.getExponent(d8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static Calendar I(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(StubApp.getString2(8779)));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static int K(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(h.g(i3, StubApp.getString2(5069), StubApp.getString2(26019)));
    }

    public static int L(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 4;
        }
        if (i3 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i3 != 5) {
            throw new IllegalArgumentException(h.g(i3, StubApp.getString2(5069), StubApp.getString2(26020)));
        }
        return 6;
    }

    public static int M(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(h.g(i3, StubApp.getString2(5069), StubApp.getString2(26021)));
    }

    public static int N(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 4;
        }
        if (i3 == 4) {
            return 5;
        }
        if (i3 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(h.g(i3, StubApp.getString2(5069), StubApp.getString2(26022)));
    }

    public static boolean O(double d8) {
        return Math.getExponent(d8) <= 1023;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.b.P(android.content.Intent):void");
    }

    public static void Q(String str, Bundle bundle) {
        String string2 = StubApp.getString2(493);
        try {
            R4.h.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString(StubApp.getString2(1185));
            if (string != null) {
                bundle2.putString(StubApp.getString2(19498), string);
            }
            String string3 = bundle.getString(StubApp.getString2(26027));
            if (string3 != null) {
                bundle2.putString(StubApp.getString2(19499), string3);
            }
            String string4 = bundle.getString(StubApp.getString2(26026));
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString(StubApp.getString2(744), string4);
            }
            String string5 = bundle.getString(StubApp.getString2(26034));
            if (!TextUtils.isEmpty(string5)) {
                bundle2.putString(StubApp.getString2(26035), string5);
            }
            String string6 = bundle.getString(StubApp.getString2(1518));
            if (string6 == null || !string6.startsWith(StubApp.getString2(1371))) {
                string6 = null;
            }
            if (string6 != null) {
                bundle2.putString(StubApp.getString2(19505), string6);
            }
            String string7 = bundle.getString(StubApp.getString2(26036));
            if (string7 != null) {
                try {
                    bundle2.putInt(StubApp.getString2("19500"), Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w(string2, StubApp.getString2(26037), e10);
                }
            }
            String string22 = StubApp.getString2(26038);
            String string8 = bundle.containsKey(string22) ? bundle.getString(string22) : null;
            if (string8 != null) {
                try {
                    bundle2.putInt(StubApp.getString2("19497"), Integer.parseInt(string8));
                } catch (NumberFormatException e11) {
                    Log.w(string2, StubApp.getString2(26039), e11);
                }
            }
            String string23 = s2.d.x(bundle) ? StubApp.getString2(3958) : StubApp.getString2(1485);
            if (StubApp.getString2(19407).equals(str) || StubApp.getString2(12593).equals(str)) {
                bundle2.putString(StubApp.getString2(19502), string23);
            }
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(26040) + str + StubApp.getString2(26041) + bundle2);
            }
            T4.a aVar = (T4.a) R4.h.e().c(T4.a.class);
            if (aVar != null) {
                ((T4.b) aVar).a(StubApp.getString2(1186), str, bundle2);
            } else {
                Log.w(string2, StubApp.getString2(26042));
            }
        } catch (IllegalStateException unused) {
            Log.e(string2, StubApp.getString2(26043));
        }
    }

    public static int R(int i3, int[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        int i10 = 0;
        int abs = Math.abs(values[0] - i3);
        int length = values.length;
        for (int i11 = 1; i11 < length; i11++) {
            int abs2 = Math.abs(values[i11] - i3);
            if (abs2 < abs) {
                i10 = i11;
                abs = abs2;
            }
        }
        if (i3 != values[i10]) {
            IntRange indices = ArraysKt.getIndices(values);
            ArrayList arrayList = new ArrayList(CollectionsKt.f(indices));
            Iterator<Integer> it = indices.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(values[((IntIterator) it).nextInt()]));
            }
            String str = StubApp.getString2(26044) + arrayList;
            String string2 = StubApp.getString2(2377);
            Log.d(string2, str);
            h.v(values[i10], StubApp.getString2(26045), string2);
        }
        return values[i10];
    }

    public static boolean S(char c10) {
        if (c10 == 160 || c10 == 5760) {
            return true;
        }
        return (8192 <= c10 && c10 <= 8203) || c10 == 8239 || c10 == 8287 || c10 == 12288;
    }

    public static float T(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f10, f11);
        }
        Q.b.a(edgeEffect, f10, f11);
        return f10;
    }

    public static void U(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null) {
            queryBroadcastReceivers = Collections.EMPTY_LIST;
        }
        if (queryBroadcastReceivers.size() == 0) {
            throw new C0859b(StubApp.getString2(26046) + intent.toString());
        }
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }

    public static boolean V(Intent intent) {
        Bundle extras;
        if (intent == null || StubApp.getString2(12583).equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return StubApp.getString2(878).equals(extras.getString(StubApp.getString2(1182)));
    }

    public static final int W(LegAnnotation legAnnotation) {
        if (legAnnotation == null) {
            throw new IllegalArgumentException(StubApp.getString2(26048));
        }
        for (List list : CollectionsKt.listOf((Object[]) new List[]{legAnnotation.duration(), legAnnotation.speed(), legAnnotation.distance(), legAnnotation.congestion(), legAnnotation.congestionNumeric(), legAnnotation.maxspeed(), legAnnotation.freeflowSpeed(), legAnnotation.currentSpeed(), legAnnotation.trafficTendency()})) {
            if (list != null) {
                return list.size();
            }
        }
        Map<String, JsonElement> unrecognizedJsonProperties = legAnnotation.getUnrecognizedJsonProperties();
        if (unrecognizedJsonProperties != null) {
            for (Map.Entry<String, JsonElement> entry : unrecognizedJsonProperties.entrySet()) {
                if (entry.getValue().isJsonArray()) {
                    return entry.getValue().getAsJsonArray().size();
                }
            }
        }
        throw new IllegalArgumentException(StubApp.getString2(26047));
    }

    public static int X(int i3) {
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            return 0;
        }
        int i10 = 1;
        if (c10 != 1) {
            i10 = 2;
            if (c10 != 2) {
                i10 = 3;
                if (c10 != 3) {
                    i10 = 4;
                    if (c10 != 4) {
                        if (c10 == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException(StubApp.getString2(5069) + u.D(i3) + StubApp.getString2(5068));
                    }
                }
            }
        }
        return i10;
    }

    public static String e(int i3, int i10, String str) {
        if (i3 < 0) {
            return AbstractC1526a.C(StubApp.getString2(8401), str, Integer.valueOf(i3));
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(u.p(i10, StubApp.getString2(8399)));
        }
        return AbstractC1526a.C(StubApp.getString2(8407), str, Integer.valueOf(i3), Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0043 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i2.d f(byte[] r7) {
        /*
            i2.d r0 = new i2.d
            r0.<init>()
            if (r7 != 0) goto L8
            goto L5f
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            i2.c r5 = new i2.c     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f14728a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.b.f(byte[]):i2.d");
    }

    public static void g(long j, String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(AbstractC1526a.C(str, Long.valueOf(j)));
        }
    }

    public static void h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(int i3, int i10) {
        String C10;
        if (i3 < 0 || i3 >= i10) {
            String string2 = StubApp.getString2(8110);
            if (i3 < 0) {
                C10 = AbstractC1526a.C(StubApp.getString2(8401), string2, Integer.valueOf(i3));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(u.p(i10, StubApp.getString2(8399)));
                }
                C10 = AbstractC1526a.C(StubApp.getString2(8400), string2, Integer.valueOf(i3), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(C10);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            throw new IndexOutOfBoundsException(e(i3, i10, StubApp.getString2(8110)));
        }
    }

    public static void l(int i3, int i10, int i11) {
        String e10;
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            if (i3 < 0 || i3 > i11) {
                e10 = e(i3, i11, StubApp.getString2(8406));
            } else if (i10 < 0 || i10 > i11) {
                e10 = e(i10, i11, StubApp.getString2(8405));
            } else {
                e10 = AbstractC1526a.C(StubApp.getString2(8404), Integer.valueOf(i10), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(e10);
        }
    }

    public static void n(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(FileDescriptor fileDescriptor) {
        try {
            AbstractC0482i.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e(StubApp.getString2(26049), StubApp.getString2(26050));
        }
    }

    public static void p(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] q(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static void r(C0475b c0475b, C0476c c0476c, int i3) {
        byte[] bArr = new byte[8192];
        while (i3 > 0) {
            int min = Math.min(i3, 8192);
            int read = c0475b.read(bArr, 0, min);
            if (read != min) {
                throw new IOException(StubApp.getString2(26051));
            }
            i3 -= read;
            c0476c.write(bArr, 0, read);
        }
    }

    public static void s(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String string2 = StubApp.getString2(26052);
        try {
            R4.h.e();
            R4.h e10 = R4.h.e();
            e10.a();
            String string22 = StubApp.getString2(1466);
            Context context = e10.f6193a;
            SharedPreferences sharedPreferences = context.getSharedPreferences(string22, 0);
            String string23 = StubApp.getString2(19073);
            if (sharedPreferences.contains(string23)) {
                return sharedPreferences.getBoolean(string23, false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(string2)) {
                    return applicationInfo.metaData.getBoolean(string2, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i(StubApp.getString2(493), StubApp.getString2(26053));
            return false;
        }
    }

    public static int v(int i3) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(StubApp.getString2(26054), StubApp.getString2(26055));
            return -1;
        }
        boolean z2 = i3 >= 0;
        if (!z2) {
            i3 = 0;
            while (i3 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i3, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i3++;
            }
        }
        return i3 < numberOfCameras ? i3 : z2 ? -1 : 0;
    }

    public static Calendar x(Calendar calendar) {
        Calendar I10 = I(calendar);
        Calendar I11 = I(null);
        I11.set(I10.get(1), I10.get(2), I10.get(5));
        return I11;
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public abstract MediaFormat B(C1737d c1737d);

    public abstract String C();

    public abstract String D();

    public boolean E() {
        return Boolean.TRUE.equals(u(StubApp.getString2(6411)));
    }

    public abstract d F();

    public abstract boolean G();

    public abstract boolean J();

    public boolean a(MediaCodecInfo.CodecCapabilities codecCapabilities, C1737d c1737d, MediaFormat mediaFormat) {
        if (codecCapabilities.isFormatSupported(mediaFormat)) {
            return true;
        }
        Range<Integer> bitrateRange = codecCapabilities.getAudioCapabilities().getBitrateRange();
        Intrinsics.checkNotNullExpressionValue(bitrateRange, "getBitrateRange(...)");
        int intValue = bitrateRange.getLower().intValue();
        int i3 = c1737d.f21188b;
        if (intValue > i3) {
            Integer lower = bitrateRange.getLower();
            Intrinsics.checkNotNullExpressionValue(lower, "getLower(...)");
            i3 = lower.intValue();
        } else if (bitrateRange.getUpper().intValue() < i3) {
            Integer upper = bitrateRange.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
            i3 = upper.intValue();
        }
        mediaFormat.setInteger(StubApp.getString2(24180), i3);
        if (codecCapabilities.getAudioCapabilities().getSupportedSampleRates() != null) {
            int[] supportedSampleRates = codecCapabilities.getAudioCapabilities().getSupportedSampleRates();
            Intrinsics.checkNotNullExpressionValue(supportedSampleRates, "getSupportedSampleRates(...)");
            c(mediaFormat, R(c1737d.f21189c, supportedSampleRates));
        }
        b(mediaFormat, R(c1737d.f21201p, new int[]{1, codecCapabilities.getAudioCapabilities().getMaxInputChannelCount()}));
        return codecCapabilities.isFormatSupported(mediaFormat);
    }

    public void b(MediaFormat format, int i3) {
        Intrinsics.checkNotNullParameter(format, "format");
        format.setInteger(StubApp.getString2(26056), i3);
    }

    public void c(MediaFormat format, int i3) {
        Intrinsics.checkNotNullParameter(format, "format");
        format.setInteger(StubApp.getString2(23466), i3);
    }

    @Override // V9.d
    public void d(Serializable serializable) {
        F().d(serializable);
    }

    @Override // V9.d
    public void m(String str, HashMap hashMap) {
        F().m(str, hashMap);
    }

    public String toString() {
        switch (this.f14500a) {
            case 8:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C());
                String string2 = StubApp.getString2(397);
                sb2.append(string2);
                sb2.append((String) u(StubApp.getString2(4779)));
                sb2.append(string2);
                sb2.append((List) u(StubApp.getString2(6400)));
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public abstract Object u(String str);

    public abstract InterfaceC1836b w(String str);

    public Pair z(C1737d config, k listener) {
        String str;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MediaFormat B7 = B(config);
        if (G()) {
            return new Pair(new e(config, this, B7, listener), B7);
        }
        Iterator it = ArrayIteratorKt.iterator(new MediaCodecList(0).getCodecInfos());
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (mediaCodecInfo.isEncoder()) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(D());
                    if (capabilitiesForType != null && a(capabilitiesForType, config, B7)) {
                        str = mediaCodecInfo.getName();
                        break;
                    }
                } catch (IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        String str2 = str;
        if (str2 != null) {
            return new Pair(new w6.d(config, this, B7, listener, str2), B7);
        }
        throw new Exception(StubApp.getString2(26057) + B7 + StubApp.getString2(26058));
    }
}
