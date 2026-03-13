package com.google.android.gms.internal.measurement;

import Z9.C0366a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Parcelable;
import android.os.UserManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.datastore.preferences.protobuf.C0407g;
import com.mapbox.api.directions.v5.models.MapboxShield;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.TileCacheBudgetInMegabytes;
import com.mapbox.maps.TileCacheBudgetInTiles;
import com.mapbox.navigator.NavigationStatus;
import com.mapbox.navigator.RoadName;
import com.mapbox.navigator.Shield;
import com.stub.StubApp;
import i.AbstractActivityC1027h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F1 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f11263a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f11264b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11265c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f11266d;

    public static final /* synthetic */ TileCacheBudget A(Value value) {
        Object first;
        Intrinsics.checkNotNullParameter(value, "<this>");
        Object contents = value.getContents();
        HashMap hashMap = contents instanceof HashMap ? (HashMap) contents : null;
        if (hashMap != null) {
            if (hashMap.size() != 1) {
                throw new MapboxStyleException(StubApp.getString2(11640) + value);
            }
            Set entrySet = hashMap.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "it.entries");
            first = CollectionsKt___CollectionsKt.first(entrySet);
            Intrinsics.checkNotNullExpressionValue(first, "it.entries.first()");
            Map.Entry entry = (Map.Entry) first;
            boolean areEqual = Intrinsics.areEqual(entry.getKey(), "tiles");
            String string2 = StubApp.getString2(8440);
            if (areEqual) {
                Object contents2 = ((Value) entry.getValue()).getContents();
                Intrinsics.checkNotNull(contents2, string2);
                return new TileCacheBudget(new TileCacheBudgetInTiles(((Long) contents2).longValue()));
            }
            if (Intrinsics.areEqual(entry.getKey(), "megabytes")) {
                Object contents3 = ((Value) entry.getValue()).getContents();
                Intrinsics.checkNotNull(contents3, string2);
                return new TileCacheBudget(new TileCacheBudgetInMegabytes(((Long) contents3).longValue()));
            }
        }
        throw new MapboxStyleException(StubApp.getString2(11641) + value + StubApp.getString2(11642));
    }

    public static void B(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        throw new NotImplementedError(null, 1, null);
    }

    public static final X2.k a(String str) {
        return new X2.k(StubApp.getString2(9425), E1.a.k(StubApp.getString2(11643), str, StubApp.getString2(11644)), "");
    }

    public static final List b(Throwable th) {
        if (th instanceof X2.k) {
            X2.k kVar = (X2.k) th;
            return CollectionsKt.listOf(kVar.f8294a, kVar.f8295b, kVar.f8296c);
        }
        return CollectionsKt.listOf((Object[]) new String[]{th.getClass().getSimpleName(), th.toString(), E1.a.m(StubApp.getString2(6769), th.getCause(), StubApp.getString2(604), Log.getStackTraceString(th))});
    }

    public static final void c(Style style, P6.c layer) {
        Intrinsics.checkNotNullParameter(style, "<this>");
        Intrinsics.checkNotNullParameter(layer, "layer");
        layer.d(style, null);
    }

    public static final void d(MapboxStyleManager style, P6.c layer, LayerPosition layerPosition) {
        Intrinsics.checkNotNullParameter(style, "<this>");
        Intrinsics.checkNotNullParameter(layer, "layer");
        layer.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        layer.f5550b = style;
        String str = (String) layer.c(style, layerPosition).getError();
        if (str != null) {
            throw new MapboxStyleException(StubApp.getString2(11645).concat(str));
        }
    }

    public static final void e(MapboxStyleManager mapboxStyleManager, U6.c source) {
        Intrinsics.checkNotNullParameter(mapboxStyleManager, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        source.b(mapboxStyleManager);
    }

    public static M7.a f(NavigationStatus navigationStatus) {
        Intrinsics.checkNotNullParameter(navigationStatus, "navigationStatus");
        List<RoadName> roads = navigationStatus.getRoads();
        Intrinsics.checkNotNullExpressionValue(roads, "navigationStatus.roads");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(roads));
        for (RoadName roadName : roads) {
            String text = roadName.getText();
            Shield shield = roadName.getShield();
            MapboxShield build = shield != null ? MapboxShield.builder().name(shield.getName()).baseUrl(shield.getBaseUrl()).textColor(shield.getTextColor()).displayRef(shield.getDisplayRef()).build() : null;
            String imageBaseUrl = roadName.getImageBaseUrl();
            String language = roadName.getLanguage();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            Intrinsics.checkNotNullExpressionValue(language, "language");
            arrayList.add(new M7.b(text, language, build, imageBaseUrl));
        }
        return new M7.a(arrayList);
    }

    public static IOException g(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
            return iOException;
        } catch (IOException e10) {
            Log.w(StubApp.getString2(948), StubApp.getString2(11646).concat(str), e10);
            return iOException == null ? e10 : iOException;
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void i(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static D1 j(int i3) {
        if (i3 != 0 && i3 == 1) {
            return new I4.d();
        }
        return new I4.i();
    }

    public static RandomAccessFile k(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, StubApp.getString2(1273));
        randomAccessFile.setLength(0L);
        return randomAccessFile;
    }

    public static final void m(P1.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List createListBuilder = CollectionsKt.createListBuilder();
        Cursor F3 = db2.F(StubApp.getString2(11647));
        while (F3.moveToNext()) {
            try {
                createListBuilder.add(F3.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(F3, null);
        for (String triggerName : CollectionsKt.build(createListBuilder)) {
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (StringsKt.O(triggerName, StubApp.getString2(11648))) {
                db2.k(StubApp.getString2(2921) + triggerName);
            }
        }
    }

    public static String n(C0407g c0407g) {
        StringBuilder sb2 = new StringBuilder(c0407g.size());
        for (int i3 = 0; i3 < c0407g.size(); i3++) {
            byte a3 = c0407g.a(i3);
            if (a3 == 34) {
                sb2.append(StubApp.getString2(11658));
            } else if (a3 == 39) {
                sb2.append(StubApp.getString2(11657));
            } else if (a3 != 92) {
                switch (a3) {
                    case 7:
                        sb2.append(StubApp.getString2(11655));
                        break;
                    case 8:
                        sb2.append(StubApp.getString2(11654));
                        break;
                    case 9:
                        sb2.append(StubApp.getString2(11653));
                        break;
                    case 10:
                        sb2.append(StubApp.getString2(11652));
                        break;
                    case 11:
                        sb2.append(StubApp.getString2(11651));
                        break;
                    case 12:
                        sb2.append(StubApp.getString2(11650));
                        break;
                    case 13:
                        sb2.append(StubApp.getString2(11649));
                        break;
                    default:
                        if (a3 < 32 || a3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a3 >>> 6) & 3) + 48));
                            sb2.append((char) (((a3 >>> 3) & 7) + 48));
                            sb2.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) a3);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append(StubApp.getString2(11656));
            }
        }
        return sb2.toString();
    }

    public static wc.y o(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        if (Intrinsics.areEqual(protocol, "http/1.0")) {
            return wc.y.f22485b;
        }
        if (Intrinsics.areEqual(protocol, "http/1.1")) {
            return wc.y.f22486c;
        }
        if (Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
            return wc.y.f22489f;
        }
        if (Intrinsics.areEqual(protocol, "h2")) {
            return wc.y.f22488e;
        }
        if (Intrinsics.areEqual(protocol, "spdy/3.1")) {
            return wc.y.f22487d;
        }
        if (Intrinsics.areEqual(protocol, "quic")) {
            return wc.y.f22490g;
        }
        throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", protocol));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final P6.c p(com.mapbox.maps.MapboxStyleManager r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.F1.p(com.mapbox.maps.MapboxStyleManager, java.lang.String):P6.c");
    }

    public static final T6.d q(MapboxStyleManager mapboxStyleManager, String sourceId) {
        Object obj;
        Intrinsics.checkNotNullParameter(mapboxStyleManager, "<this>");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        try {
            obj = a4.f.x(mapboxStyleManager.getStyleSourceProperty(sourceId, StubApp.getString2(660)));
        } catch (RuntimeException unused) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        String string2 = StubApp.getString2(11662);
        String string22 = StubApp.getString2(11663);
        switch (hashCode) {
            case -1602807287:
                if (str.equals(StubApp.getString2(6376))) {
                    U6.f fVar = new U6.f(sourceId, 0);
                    Intrinsics.checkNotNullParameter(fVar, string22);
                    U6.e eVar = new U6.e(sourceId, 1);
                    eVar.d().putAll(fVar.f7476a);
                    eVar.f().putAll(fVar.f7477b);
                    eVar.f7220d = mapboxStyleManager;
                    return eVar;
                }
                break;
            case -1408217266:
                if (str.equals(StubApp.getString2(6217))) {
                    CustomGeometrySourceOptions build = new CustomGeometrySourceOptions.Builder().build();
                    Intrinsics.checkNotNullExpressionValue(build, string2);
                    T6.a aVar = new T6.a(sourceId, build);
                    aVar.f7220d = mapboxStyleManager;
                    return aVar;
                }
                break;
            case -938121859:
                if (str.equals(StubApp.getString2(5279))) {
                    U6.f fVar2 = new U6.f(sourceId, 1);
                    Intrinsics.checkNotNullParameter(fVar2, string22);
                    U6.e eVar2 = new U6.e(sourceId, 3);
                    eVar2.d().putAll(fVar2.f7476a);
                    eVar2.f().putAll(fVar2.f7477b);
                    eVar2.f7220d = mapboxStyleManager;
                    return eVar2;
                }
                break;
            case -820387517:
                if (str.equals(StubApp.getString2(6374))) {
                    U6.d dVar = new U6.d(sourceId, 2);
                    Intrinsics.checkNotNullParameter(dVar, string22);
                    U6.e eVar3 = new U6.e(sourceId, 4);
                    eVar3.d().putAll(dVar.f7473a);
                    eVar3.f().putAll(dVar.f7474b);
                    eVar3.f7220d = mapboxStyleManager;
                    return eVar3;
                }
                break;
            case -302402727:
                if (str.equals(StubApp.getString2(6216))) {
                    CustomRasterSourceOptions build2 = new CustomRasterSourceOptions.Builder().build();
                    Intrinsics.checkNotNullExpressionValue(build2, string2);
                    T6.a aVar2 = new T6.a(sourceId, build2);
                    aVar2.f7220d = mapboxStyleManager;
                    return aVar2;
                }
                break;
            case -79074375:
                if (str.equals(StubApp.getString2(6371))) {
                    U6.c a3 = new U6.a(sourceId).a();
                    a3.f7220d = mapboxStyleManager;
                    return a3;
                }
                break;
            case 100313435:
                if (str.equals(StubApp.getString2(1483))) {
                    U6.d dVar2 = new U6.d(sourceId, 0);
                    Intrinsics.checkNotNullParameter(dVar2, string22);
                    U6.e eVar4 = new U6.e(sourceId, 0);
                    eVar4.d().putAll(dVar2.f7473a);
                    eVar4.f().putAll(dVar2.f7474b);
                    eVar4.f7220d = mapboxStyleManager;
                    return eVar4;
                }
                break;
            case 1272076220:
                if (str.equals(StubApp.getString2(6375))) {
                    U6.d dVar3 = new U6.d(sourceId, 1);
                    Intrinsics.checkNotNullParameter(dVar3, string22);
                    U6.e eVar5 = new U6.e(sourceId, 2);
                    eVar5.d().putAll(dVar3.f7473a);
                    eVar5.f().putAll(dVar3.f7474b);
                    eVar5.f7220d = mapboxStyleManager;
                    return eVar5;
                }
                break;
        }
        MapboxLogger.logE(StubApp.getString2(11665), StubApp.getString2(11664) + str + StubApp.getString2(11660));
        return null;
    }

    public static final Cursor u(J1.r db2, O1.e sqLiteQuery) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return db2.m(sqLiteQuery);
    }

    public static TypedValue v(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int w(Context context, int i3, String str) {
        TypedValue v2 = v(context, i3);
        if (v2 != null) {
            return v2.data;
        }
        throw new IllegalArgumentException(String.format(StubApp.getString2(11666), str, context.getResources().getResourceName(i3)));
    }

    public static void y(View view, I4.g gVar) {
        C4.a aVar = gVar.f3151a.f3136b;
        if (aVar == null || !aVar.f1116a) {
            return;
        }
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = N.I.f4732a;
            f10 += N.B.e((View) parent);
        }
        I4.f fVar = gVar.f3151a;
        if (fVar.f3145l != f10) {
            fVar.f3145l = f10;
            gVar.k();
        }
    }

    public static RectF z(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i3 = 1; i3 < fArr.length; i3 += 2) {
            float round = Math.round(fArr[i3 - 1] * 10.0f) / 10.0f;
            float round2 = Math.round(fArr[i3] * 10.0f) / 10.0f;
            float f10 = rectF.left;
            if (round < f10) {
                f10 = round;
            }
            rectF.left = f10;
            float f11 = rectF.top;
            if (round2 < f11) {
                f11 = round2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (round <= f12) {
                round = f12;
            }
            rectF.right = round;
            float f13 = rectF.bottom;
            if (round2 <= f13) {
                round2 = f13;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public abstract Intent l(AbstractActivityC1027h abstractActivityC1027h, Parcelable parcelable);

    public C0366a r(AbstractActivityC1027h context, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object s(String str, Qc.c cVar, Qc.g gVar, boolean z2);

    public abstract Object t(Intent intent, int i3);

    public void x(StringBuilder sb2, Object obj, Qc.g gVar) {
        sb2.append(obj.toString());
    }
}
