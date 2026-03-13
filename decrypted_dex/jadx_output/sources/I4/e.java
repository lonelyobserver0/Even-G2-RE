package I4;

import E0.x;
import H0.InterfaceC0061d;
import H0.InterfaceC0062e;
import H0.J;
import N.InterfaceC0171q;
import R8.C0250h;
import T0.B;
import T0.H;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.mapbox.api.directions.v5.models.Bearing;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.maps.CustomLayerHost;
import com.mapbox.maps.CustomLayerRenderParameters;
import com.stub.StubApp;
import i0.InterfaceC1029b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;
import o0.C1406C;
import t0.C1709i;
import t0.C1718r;
import t0.C1721u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class e implements D3.b, C1.a, E0.l, E6.b, InterfaceC0061d, K3.a, M0.m, InterfaceC0171q, CustomLayerHost, T0.q, a4.b, a4.c, InterfaceC1029b {

    /* renamed from: b, reason: collision with root package name */
    public static e f3132b;

    /* renamed from: c, reason: collision with root package name */
    public static e f3133c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3134a;

    public /* synthetic */ e(int i3) {
        this.f3134a = i3;
    }

    public static ArrayList A(int i3, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.TRUE);
        if (list == null || list.isEmpty()) {
            CollectionsKt.addAll(arrayList, new Boolean[i3]);
            return arrayList;
        }
        arrayList.addAll(CollectionsKt.takeLast(list, i3));
        return arrayList;
    }

    public static final ArrayList m(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "this.resources.configuration.locales");
        IntRange until = RangesKt.until(0, locales.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.f(until));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(locales.get(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Locale) it2.next()).toLanguageTag());
        }
        return arrayList2;
    }

    public static Y8.d n(Context context, Z8.f navigator) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(handler, "handler");
        return new Y8.d(context, navigator, handler);
    }

    public static MediaCodec o(C0250h c0250h) {
        E0.p pVar = (E0.p) c0250h.f6296a;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1656));
        String str = pVar.f1777a;
        sb2.append(str);
        Trace.beginSection(sb2.toString());
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static final Expected p(String str) {
        Expected createError = ExpectedFactory.createError(str);
        Intrinsics.checkNotNullExpressionValue(createError, "createError(message)");
        return createError;
    }

    public static String r(AbstractActivityC0364d abstractActivityC0364d, Uri uri, String str, String[] strArr) {
        Throwable th;
        String string2 = StubApp.getString2(2567);
        Cursor cursor = null;
        try {
            Cursor query = abstractActivityC0364d.getContentResolver().query(uri, new String[]{string2}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow(string2));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static A1.g s(P0.i iVar, x xVar) {
        IOException iOException = (IOException) xVar.f1862b;
        if (!(iOException instanceof C1721u)) {
            return null;
        }
        int i3 = ((C1721u) iOException).f21114d;
        if (i3 != 403 && i3 != 404 && i3 != 410 && i3 != 416 && i3 != 500 && i3 != 503) {
            return null;
        }
        if (iVar.a(1)) {
            return new A1.g(1, 300000L);
        }
        if (iVar.a(2)) {
            return new A1.g(2, 60000L);
        }
        return null;
    }

    public static long u(x xVar) {
        Throwable th = (IOException) xVar.f1862b;
        if ((th instanceof C1406C) || (th instanceof FileNotFoundException) || (th instanceof C1718r) || (th instanceof P0.n)) {
            return -9223372036854775807L;
        }
        int i3 = C1709i.f21069b;
        while (th != null) {
            if ((th instanceof C1709i) && ((C1709i) th).f21070a == 2008) {
                return -9223372036854775807L;
            }
            th = th.getCause();
        }
        return Math.min((xVar.f1861a - 1) * 1000, 5000);
    }

    public static ArrayList v(int i3, int i10, Double d8, List list) {
        int lastIndex;
        Bearing bearing;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d8 != null ? Bearing.builder().angle(d8.doubleValue()).degrees((list == null || (bearing = (Bearing) CollectionsKt.getOrNull(list, 0)) == null) ? 90.0d : bearing.degrees()).build() : null);
        if (list != null && i10 <= (lastIndex = CollectionsKt.getLastIndex(list))) {
            while (true) {
                arrayList.add(list.get(i10));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        while (arrayList.size() < i3 + 1) {
            arrayList.add(null);
        }
        return arrayList;
    }

    public static Map x(Map map, int i3, String str) {
        List split$default;
        String joinToString$default;
        if (Intrinsics.areEqual(str, "MAP_MATCHING_API")) {
            return MapsKt.emptyMap();
        }
        String str2 = null;
        if (map == null) {
            return null;
        }
        Map mutableMap = MapsKt.toMutableMap(map);
        JsonElement jsonElement = (JsonElement) map.get(StubApp.getString2(2862));
        if (jsonElement != null) {
            try {
                str2 = jsonElement.getAsString();
            } catch (Throwable unused) {
            }
        }
        if (Intrinsics.areEqual(str2, "electric")) {
            for (String str3 : CollectionsKt.listOf((Object[]) new String[]{StubApp.getString2(2864), StubApp.getString2(2865), StubApp.getString2(2863)})) {
                if (map.containsKey(str3)) {
                    Object obj = map.get(str3);
                    Intrinsics.checkNotNull(obj);
                    String oldValue = ((JsonElement) obj).getAsString();
                    Intrinsics.checkNotNullExpressionValue(oldValue, "oldValue");
                    String string2 = StubApp.getString2(1262);
                    split$default = StringsKt__StringsKt.split$default(oldValue, new String[]{string2}, false, 0, 6, (Object) null);
                    StringBuilder sb2 = new StringBuilder(string2);
                    joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.drop(split$default, i3), StubApp.getString2(1262), null, null, 0, null, null, 62, null);
                    sb2.append(joinToString$default);
                    mutableMap.put(str3, new JsonPrimitive(sb2.toString()));
                }
            }
        }
        return mutableMap;
    }

    public static List y(int i3, String str, List list) {
        if (list == null || list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (Intrinsics.areEqual(str, "MAP_MATCHING_API")) {
            return CollectionsKt.listOf((Object[]) new Integer[]{0, 1});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = (((Number) it.next()).intValue() - i3) + 1;
            if (intValue > 0) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        return arrayList;
    }

    public static ArrayList z(int i3, List list, List list2) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        if (list2 == null || list2.isEmpty()) {
            list2 = CollectionsKt.toList(CollectionsKt.getIndices(list));
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        if (list2 != null) {
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((Number) obj).intValue() < i3) {
                    i10 = i11;
                }
                i11 = i12;
            }
        }
        arrayList.add(null);
        arrayList.addAll(list.subList(i10 + 1, list.size()));
        return arrayList;
    }

    @Override // T0.q
    public void D(B b2) {
        throw new UnsupportedOperationException();
    }

    @Override // N.InterfaceC0171q
    public void a(int i3, int i10, int i11, boolean z2) {
    }

    @Override // M0.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // a4.b
    public int c(Context context, String str, boolean z2) {
        return a4.d.d(context, str, z2);
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void contextLost() {
    }

    @Override // a4.c
    public R0.d d(Context context, String str, a4.b bVar) {
        R0.d dVar = new R0.d();
        dVar.f5935b = bVar.j(context, str);
        int i3 = 1;
        int c10 = bVar.c(context, str, true);
        dVar.f5936c = c10;
        int i10 = dVar.f5935b;
        if (i10 == 0) {
            i10 = 0;
            if (c10 == 0) {
                i3 = 0;
                dVar.f5937d = i3;
                return dVar;
            }
        }
        if (i10 >= c10) {
            i3 = -1;
        }
        dVar.f5937d = i3;
        return dVar;
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void deinitialize() {
    }

    @Override // H0.InterfaceC0061d
    public InterfaceC0062e e(int i3) {
        J j = new J();
        J j3 = new J();
        try {
            j.f2519a.n(Oc.a.p(0));
            int f10 = j.f();
            boolean z2 = f10 % 2 == 0;
            j3.f2519a.n(Oc.a.p(z2 ? f10 + 1 : f10 - 1));
            if (z2) {
                j.f2520b = j3;
                return j;
            }
            j3.f2520b = j;
            return j3;
        } catch (IOException e10) {
            W.a.a(j);
            W.a.a(j3);
            throw e10;
        }
    }

    @Override // K3.a
    public long f() {
        return System.currentTimeMillis();
    }

    @Override // M0.m
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // Pb.a
    public Object get() {
        return new B3.q(Executors.newSingleThreadExecutor(), 0);
    }

    @Override // C1.a
    public CharSequence h(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f9986a.getString(2131755216);
        }
        return null;
    }

    @Override // E6.b
    public Object i(String str) {
        switch (this.f3134a) {
            case 5:
                return Integer.valueOf(str);
            default:
                return str.equals(StubApp.getString2(2866)) ? Double.valueOf(Double.POSITIVE_INFINITY) : Double.valueOf(str);
        }
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void initialize() {
    }

    @Override // a4.b
    public int j(Context context, String str) {
        return a4.d.a(context, str);
    }

    @Override // N.InterfaceC0171q
    public void k(int i3, int i10, int i11, int i12) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // E0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E0.m l(R8.C0250h r6) {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = o(r6)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            java.lang.String r1 = "1588"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            java.lang.Object r1 = r6.f6299d     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            if (r1 != 0) goto L29
            java.lang.Object r2 = r6.f6296a     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            E0.p r2 = (E0.p) r2     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            boolean r2 = r2.f1784h     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            if (r2 == 0) goto L29
            int r2 = r0.AbstractC1560u.f20190a     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            r3 = 35
            if (r2 < r3) goto L29
            r2 = 8
            goto L2a
        L25:
            r6 = move-exception
            goto L51
        L27:
            r6 = move-exception
            goto L51
        L29:
            r2 = 0
        L2a:
            java.lang.Object r3 = r6.f6297b     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            java.lang.Object r4 = r6.f6300e     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            java.lang.String r1 = "1589"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            r0.start()     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            l4.E0 r1 = new l4.E0     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            java.lang.Object r6 = r6.f6301f     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            Q2.g r6 = (Q2.g) r6     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L25 java.io.IOException -> L27
            return r1
        L51:
            if (r0 == 0) goto L56
            r0.release()
        L56:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.e.l(R8.h):E0.m");
    }

    @Override // M0.m
    public boolean next() {
        return false;
    }

    @Override // T0.q
    public void q() {
        throw new UnsupportedOperationException();
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void render(CustomLayerRenderParameters parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    public int t(int i3) {
        return i3 == 7 ? 6 : 3;
    }

    @Override // T0.q
    public H w(int i3, int i10) {
        throw new UnsupportedOperationException();
    }
}
