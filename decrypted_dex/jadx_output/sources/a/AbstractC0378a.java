package a;

import F9.f;
import L7.j;
import N6.d;
import O8.g;
import R2.c;
import R3.C0241j;
import R3.l;
import S3.D;
import T3.b;
import T6.e;
import V8.q;
import Xa.h;
import Y.m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import com.even.navigate.service.NavigationForegroundService;
import com.google.gson.JsonPrimitive;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.Value;
import com.mapbox.common.TileStore;
import com.mapbox.common.location.Location;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.navigator.FixLocation;
import com.stub.StubApp;
import d.y;
import i2.u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m8.v;
import p0.AbstractC1482f;
import q1.C1505a;
import r0.InterfaceC1542c;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0378a {

    /* renamed from: a, reason: collision with root package name */
    public static Class f9229a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f9230b;

    public static void A(EditorInfo editorInfo, CharSequence charSequence, int i3, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(StubApp.getString2(8268), charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(StubApp.getString2(8269), i3);
        editorInfo.extras.putInt(StubApp.getString2(8270), i10);
    }

    public static void B(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + z(parcel, i3));
    }

    public static void C(Context context) {
        String string2 = StubApp.getString2(8271);
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            context.stopService(new Intent(context, (Class<?>) NavigationForegroundService.class));
            c.b(string2, StubApp.getString2("8272"));
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(8273), e10.getMessage(), string2);
            Log.e(string2, StubApp.getString2(8274), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(q1.d r12, q1.k r13, r0.InterfaceC1542c r14) {
        /*
            long r0 = r13.f19904a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r12.d(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r12.g()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r12.e(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L51
            int r2 = r12.g()
            if (r4 >= r2) goto L51
            java.util.List r7 = r12.f(r0)
            long r2 = r12.e(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L51
            long r8 = r13.f19904a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L51
            q1.a r6 = new q1.a
            long r10 = r2 - r8
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
            r2 = 1
            goto L52
        L51:
            r2 = r5
        L52:
            r3 = r4
        L53:
            int r6 = r12.g()
            if (r3 >= r6) goto L5f
            r(r12, r3, r14)
            int r3 = r3 + 1
            goto L53
        L5f:
            boolean r13 = r13.f19905b
            if (r13 == 0) goto L87
            if (r2 == 0) goto L67
            int r4 = r4 + (-1)
        L67:
            if (r5 >= r4) goto L6f
            r(r12, r5, r14)
            int r5 = r5 + 1
            goto L67
        L6f:
            if (r2 == 0) goto L87
            q1.a r6 = new q1.a
            java.util.List r7 = r12.f(r0)
            long r8 = r12.e(r4)
            long r12 = r12.e(r4)
            long r10 = r0 - r12
            r6.<init>(r7, r8, r10)
            r14.accept(r6)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0378a.D(q1.d, q1.k, r0.c):void");
    }

    public static final Location E(FixLocation fixLocation) {
        Intrinsics.checkNotNullParameter(fixLocation, "<this>");
        Location.Builder verticalAccuracy = new Location.Builder().latitude(fixLocation.getCoordinate().latitude()).longitude(fixLocation.getCoordinate().longitude()).source(fixLocation.getProvider()).timestamp(fixLocation.getTime().getTime()).monotonicTimestamp(Long.valueOf(fixLocation.getMonotonicTimestampNanoseconds())).speed(fixLocation.getSpeed() != null ? Double.valueOf(r1.floatValue()) : null).bearing(fixLocation.getBearing() != null ? Double.valueOf(r1.floatValue()) : null).altitude(fixLocation.getAltitude() != null ? Double.valueOf(r1.floatValue()) : null).horizontalAccuracy(fixLocation.getAccuracyHorizontal() != null ? Double.valueOf(r1.floatValue()) : null).bearingAccuracy(fixLocation.getBearingAccuracy() != null ? Double.valueOf(r1.floatValue()) : null).speedAccuracy(fixLocation.getSpeedAccuracy() != null ? Double.valueOf(r1.floatValue()) : null).verticalAccuracy(fixLocation.getVerticalAccuracy() != null ? Double.valueOf(r1.floatValue()) : null);
        HashMap hashMap = new HashMap(fixLocation.getExtras());
        hashMap.put(StubApp.getString2(6677), new Value(fixLocation.getIsMock()));
        Location build = verticalAccuracy.extra(Value.valueOf((HashMap<String, Value>) hashMap)).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n    .latitude(…(isMock) }))\n    .build()");
        return build;
    }

    public static final ArrayList F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(E((FixLocation) it.next()));
        }
        return arrayList;
    }

    public static int G(Parcel parcel) {
        int readInt = parcel.readInt();
        int z2 = z(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new b(StubApp.getString2(8277).concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i3 = z2 + dataPosition;
        if (i3 < dataPosition || i3 > parcel.dataSize()) {
            throw new b(h.o(StubApp.getString2(8275), dataPosition, i3, StubApp.getString2(8276)), parcel);
        }
        return i3;
    }

    public static Value H(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof Value) && !(value instanceof d)) {
            if (value instanceof V6.c) {
                V6.c cVar = (V6.c) value;
                cVar.getClass();
                HashMap hashMap = new HashMap();
                Value value2 = new Value(0L);
                String string2 = StubApp.getString2(8278);
                hashMap.put(string2, value2);
                Value value3 = new Value(0L);
                String string22 = StubApp.getString2(2091);
                hashMap.put(string22, value3);
                Long l9 = cVar.f7764b;
                if (l9 != null) {
                    hashMap.put(string2, new Value(l9.longValue()));
                }
                Long l10 = cVar.f7763a;
                if (l10 != null) {
                    hashMap.put(string22, new Value(l10.longValue()));
                }
                return new Value((HashMap<String, Value>) hashMap);
            }
            if (value instanceof S6.c) {
                return new Value(((S6.c) value).getValue());
            }
            if (value instanceof TileCacheBudget) {
                TileCacheBudget tileCacheBudget = (TileCacheBudget) value;
                Intrinsics.checkNotNullParameter(tileCacheBudget, "<this>");
                HashMap hashMap2 = new HashMap();
                TileCacheBudget.Type typeInfo = tileCacheBudget.getTypeInfo();
                int i3 = typeInfo == null ? -1 : e.f7221a[typeInfo.ordinal()];
                if (i3 == 1) {
                    hashMap2.put(StubApp.getString2(8281), new Value(tileCacheBudget.getTileCacheBudgetInMegabytes().getSize()));
                } else {
                    if (i3 != 2) {
                        throw new MapboxStyleException(StubApp.getString2(8280) + tileCacheBudget);
                    }
                    hashMap2.put(StubApp.getString2(8279), new Value(tileCacheBudget.getTileCacheBudgetInTiles().getSize()));
                }
                return new Value((HashMap<String, Value>) hashMap2);
            }
            if (value instanceof Integer) {
                return new Value(((Number) value).intValue());
            }
            if (value instanceof String) {
                return new Value((String) value);
            }
            if (value instanceof Boolean) {
                return new Value(((Boolean) value).booleanValue());
            }
            if (value instanceof Double) {
                Number number = (Number) value;
                double doubleValue = number.doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    throw new IllegalArgumentException(StubApp.getString2(8282));
                }
                return new Value(number.doubleValue());
            }
            if (value instanceof Float) {
                float floatValue = ((Number) value).floatValue();
                if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                    throw new IllegalArgumentException(StubApp.getString2(8283));
                }
                return new Value(r7.floatValue());
            }
            if (value instanceof Long) {
                return new Value(((Number) value).longValue());
            }
            int i10 = 0;
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                while (i10 < length) {
                    arrayList.add(H(Long.valueOf(iArr[i10])));
                    i10++;
                }
                return new Value((List<Value>) arrayList);
            }
            if (value instanceof boolean[]) {
                boolean[] zArr = (boolean[]) value;
                ArrayList arrayList2 = new ArrayList(zArr.length);
                int length2 = zArr.length;
                while (i10 < length2) {
                    arrayList2.add(H(Boolean.valueOf(zArr[i10])));
                    i10++;
                }
                return new Value((List<Value>) arrayList2);
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                ArrayList arrayList3 = new ArrayList(dArr.length);
                int length3 = dArr.length;
                while (i10 < length3) {
                    arrayList3.add(H(Double.valueOf(dArr[i10])));
                    i10++;
                }
                return new Value((List<Value>) arrayList3);
            }
            if (value instanceof float[]) {
                float[] fArr = (float[]) value;
                ArrayList arrayList4 = new ArrayList(fArr.length);
                int length4 = fArr.length;
                while (i10 < length4) {
                    arrayList4.add(H(Double.valueOf(fArr[i10])));
                    i10++;
                }
                return new Value((List<Value>) arrayList4);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                ArrayList arrayList5 = new ArrayList(jArr.length);
                int length5 = jArr.length;
                while (i10 < length5) {
                    arrayList5.add(H(Long.valueOf(jArr[i10])));
                    i10++;
                }
                return new Value((List<Value>) arrayList5);
            }
            if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                ArrayList arrayList6 = new ArrayList(objArr.length);
                int length6 = objArr.length;
                while (i10 < length6) {
                    Object obj = objArr[i10];
                    arrayList6.add(obj != null ? H(obj) : null);
                    i10++;
                }
                return new Value((List<Value>) arrayList6);
            }
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.f(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    arrayList7.add(next != null ? H(next) : null);
                }
                return new Value((List<Value>) arrayList7);
            }
            if (value instanceof HashMap) {
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = (HashMap) value;
                Set<String> keySet = hashMap4.keySet();
                Intrinsics.checkNotNullExpressionValue(keySet, "castedValue.keys");
                for (String key : keySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Object obj2 = hashMap4.get(key);
                    Intrinsics.checkNotNull(obj2);
                    hashMap3.put(key, H(obj2));
                }
                return new Value((HashMap<String, Value>) hashMap3);
            }
            if (!(value instanceof JsonPrimitive)) {
                throw new UnsupportedOperationException(StubApp.getString2(8285) + value.getClass().getSimpleName() + StubApp.getString2(8286));
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) value;
            if (jsonPrimitive.isBoolean()) {
                return new Value(jsonPrimitive.getAsBoolean());
            }
            if (jsonPrimitive.isNumber()) {
                return new Value(jsonPrimitive.getAsDouble());
            }
            if (jsonPrimitive.isString()) {
                return new Value(jsonPrimitive.getAsString());
            }
            throw new IllegalArgumentException(h.m(value, StubApp.getString2(8284)));
        }
        return (Value) value;
    }

    public static int I(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 != 3) {
            return i3 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static void J(Parcel parcel, int i3, int i10) {
        if (i3 == i10) {
            return;
        }
        throw new b(AbstractC1482f.k(AbstractC1482f.l(i10, StubApp.getString2(2509), i3, StubApp.getString2(8287), StubApp.getString2(8288)), Integer.toHexString(i3), StubApp.getString2(74)), parcel);
    }

    public static void K(Parcel parcel, int i3, int i10) {
        int z2 = z(parcel, i3);
        if (z2 == i10) {
            return;
        }
        throw new b(AbstractC1482f.k(AbstractC1482f.l(i10, StubApp.getString2(2509), z2, StubApp.getString2(8287), StubApp.getString2(8288)), Integer.toHexString(z2), StubApp.getString2(74)), parcel);
    }

    public static d a(int i3) {
        float[] fArr = {(i3 >> 16) & 255, (i3 >> 8) & 255, i3 & 255, ((i3 >> 24) & 255) / 255.0f};
        d[] expressions = {new d(fArr[0]), new d(fArr[1]), new d(fArr[2]), new d(fArr[3])};
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        N6.a aVar = new N6.a(StubApp.getString2(5289));
        for (int i10 = 0; i10 < 4; i10++) {
            aVar.a(expressions[i10]);
        }
        return aVar.b();
    }

    public static Bundle b(Parcel parcel, int i3) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + z2);
        return readBundle;
    }

    public static v c(q8.d directionsSession, y currentLegIndex) {
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(currentLegIndex, "currentLegIndex");
        return new v(directionsSession, currentLegIndex);
    }

    public static int[] d(Parcel parcel, int i3) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + z2);
        return createIntArray;
    }

    public static l e(Looper looper, Object obj, String str) {
        D.i(obj, StubApp.getString2(5644));
        D.i(looper, StubApp.getString2(5966));
        return new l(looper, obj, str);
    }

    public static l f(Object obj, String str, Executor executor) {
        D.i(obj, StubApp.getString2(5644));
        D.i(executor, StubApp.getString2(5645));
        return new l(obj, str, executor);
    }

    public static C0241j g(Object obj, String str) {
        D.i(obj, StubApp.getString2(5644));
        D.f(str, StubApp.getString2(8289));
        return new C0241j(obj, str);
    }

    public static Parcelable h(Parcel parcel, int i3, Parcelable.Creator creator) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + z2);
        return parcelable;
    }

    public static g i(q8.d directionsSession, q tripSession, I4.e routeOptionsProvider, j rerouteOptions, D9.h threadController, m evDynamicDataHolder) {
        Intrinsics.checkNotNullParameter(directionsSession, "directionsSession");
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(routeOptionsProvider, "routeOptionsProvider");
        Intrinsics.checkNotNullParameter(rerouteOptions, "rerouteOptions");
        Intrinsics.checkNotNullParameter(threadController, "threadController");
        Intrinsics.checkNotNullParameter(evDynamicDataHolder, "evDynamicDataHolder");
        return new g(directionsSession, tripSession, routeOptionsProvider, rerouteOptions, threadController, evDynamicDataHolder);
    }

    public static String j(Parcel parcel, int i3) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + z2);
        return readString;
    }

    public static void k(L7.l routingTilesOptions, TileStore tileStore) {
        Intrinsics.checkNotNullParameter(routingTilesOptions, "routingTilesOptions");
        Intrinsics.checkNotNullParameter(tileStore, "tileStore");
        String tilesBaseUri = routingTilesOptions.f4290a.toString();
        Intrinsics.checkNotNullExpressionValue(tilesBaseUri, "routingTilesOptions.tilesBaseUri.toString()");
        Intrinsics.checkNotNullParameter(tileStore, "tileStore");
        K8.b downloadedTilesetsFetcher = new K8.b();
        F5.c tilesetVersionsApi = new F5.c(11);
        Intrinsics.checkNotNullParameter(tilesBaseUri, "tilesBaseUri");
        Intrinsics.checkNotNullParameter("mapbox", StubApp.getString2(8290));
        Intrinsics.checkNotNullParameter("driving-traffic", StubApp.getString2(8291));
        Intrinsics.checkNotNullParameter(downloadedTilesetsFetcher, "downloadedTilesetsFetcher");
        Intrinsics.checkNotNullParameter(tilesetVersionsApi, "tilesetVersionsApi");
    }

    public static Object[] l(Parcel parcel, int i3, Parcelable.Creator creator) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + z2);
        return createTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i3, Parcelable.Creator creator) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + z2);
        return createTypedArrayList;
    }

    public static int n(String str, int i3, int i10, boolean z2) {
        while (i3 < i10) {
            int i11 = i3 + 1;
            char charAt = str.charAt(i3);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z2)) {
                return i3;
            }
            i3 = i11;
        }
        return i10;
    }

    public static void o(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new b(u.p(i3, StubApp.getString2(8292)), parcel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t6.C1737d p(io.flutter.plugin.common.MethodCall r33, android.content.Context r34) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0378a.p(io.flutter.plugin.common.MethodCall, android.content.Context):t6.d");
    }

    public static String q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException(StubApp.getString2(8309));
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i3 = 0; i3 < str.length(); i3++) {
            sb2.append(str.charAt(i3));
            if (str2.length() > i3) {
                sb2.append(str2.charAt(i3));
            }
        }
        return sb2.toString();
    }

    public static void r(q1.d dVar, int i3, InterfaceC1542c interfaceC1542c) {
        long e10 = dVar.e(i3);
        List f10 = dVar.f(e10);
        if (f10.isEmpty()) {
            return;
        }
        if (i3 == dVar.g() - 1) {
            throw new IllegalStateException();
        }
        long e11 = dVar.e(i3 + 1) - dVar.e(i3);
        if (e11 > 0) {
            interfaceC1542c.accept(new C1505a(f10, e10, e11));
        }
    }

    public static Expected s(String str, String str2) {
        Pair pair;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            pair = new Pair(StubApp.getString2(8310), str2);
        } else {
            if (str == null || StringsKt.isBlank(str)) {
                Expected createError = ExpectedFactory.createError(new Error(StubApp.getString2(8311)));
                Intrinsics.checkNotNullExpressionValue(createError, "createError(invalidInstructionsError())");
                return createError;
            }
            pair = new Pair(StubApp.getString2(613), str);
        }
        Expected createValue = ExpectedFactory.createValue(new f((String) pair.component1(), (String) pair.component2()));
        Intrinsics.checkNotNullExpressionValue(createValue, "createValue(TypeAndAnnou…ement(type, instruction))");
        return createValue;
    }

    public static long t(int i3, String str) {
        int n10 = n(str, 0, i3, false);
        Matcher matcher = wc.l.f22401m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (n10 < i3) {
            int n11 = n(str, n10 + 1, i3, true);
            matcher.region(n10, n11);
            String string2 = StubApp.getString2(8312);
            if (i11 == -1 && matcher.usePattern(wc.l.f22401m).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, string2);
                i11 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                i14 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                i15 = Integer.parseInt(group3);
            } else if (i12 == -1 && matcher.usePattern(wc.l.f22400l).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, string2);
                i12 = Integer.parseInt(group4);
            } else {
                if (i13 == -1) {
                    Pattern pattern = wc.l.f22399k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, string2);
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                        i13 = StringsKt.x(pattern2, lowerCase) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(wc.l.j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, string2);
                    i10 = Integer.parseInt(group6);
                }
            }
            n10 = n(str, n11 + 1, i3, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        String string22 = StubApp.getString2(353);
        if (i10 < 1601) {
            throw new IllegalArgumentException(string22);
        }
        if (i13 == -1) {
            throw new IllegalArgumentException(string22);
        }
        if (1 > i12 || i12 >= 32) {
            throw new IllegalArgumentException(string22);
        }
        if (i11 < 0 || i11 >= 24) {
            throw new IllegalArgumentException(string22);
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException(string22);
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException(string22);
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(xc.b.f23182d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i10);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, i12);
        gregorianCalendar.set(11, i11);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean u(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    public static boolean v(Parcel parcel, int i3) {
        K(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder w(Parcel parcel, int i3) {
        int z2 = z(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (z2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + z2);
        return readStrongBinder;
    }

    public static int x(Parcel parcel, int i3) {
        K(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long y(Parcel parcel, int i3) {
        K(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int z(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }
}
