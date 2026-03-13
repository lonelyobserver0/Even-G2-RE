package q8;

import D5.y;
import D5.z;
import S9.n;
import S9.s;
import X2.x;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.Z;
import com.google.protobuf.AbstractC0733j;
import com.google.protobuf.C0738l0;
import com.google.protobuf.G;
import com.google.protobuf.P;
import com.google.protobuf.T;
import com.google.protobuf.u0;
import com.google.protobuf.x0;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.navigation.base.route.i;
import com.mapbox.navigation.base.route.m;
import com.mapbox.navigator.RouteInterface;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Lazy;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import o0.AbstractC1405B;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;
import t.C1690c;
import t.C1692e;
import t.C1697j;

/* renamed from: q8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1526a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f20083a;

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A(android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = Ec.d.z(r4)
            r1 = 1493(0x5d5, float:2.092E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L13
            goto L5f
        L13:
            r0 = 22235(0x56db, float:3.1158E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.content.Context r1 = r4.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r2 == 0) goto L45
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r1 == 0) goto L45
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r2 == 0) goto L45
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            if (r2 == 0) goto L45
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L45
            goto L46
        L45:
            r0 = 1
        L46:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L5b
            q4.k r1 = new q4.k
            r1.<init>()
            D5.w r2 = new D5.w
            r3 = 0
            r2.<init>(r4, r0, r1, r3)
            r2.run()
            goto L5f
        L5b:
            r4 = 0
            a4.f.m(r4)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.AbstractC1526a.A(android.content.Context):void");
    }

    public static boolean B(P7.b routeProgress, Long l9, boolean z2, boolean z10) {
        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
        if ((l9 != null && l9.longValue() > DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT) || z2) {
            return false;
        }
        float f10 = routeProgress.f5569h;
        if (Float.isNaN(f10) || Float.isInfinite(f10) || f10 < 0.0f) {
            return false;
        }
        return (routeProgress.f5565d == P7.c.f5581c || z10) ? f10 <= 100.0f : ((double) routeProgress.f5571k) >= 0.99d && f10 <= 100.0f;
    }

    public static String C(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i3 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = StubApp.getString2(1116);
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger(StubApp.getString2(22236)).log(Level.WARNING, StubApp.getString2(22237) + str2, (Throwable) e10);
                    StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(2041), str2, StubApp.getString2(22238));
                    l9.append(e10.getClass().getName());
                    l9.append(StubApp.getString2(3372));
                    sb2 = l9.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i3 < objArr.length && (indexOf = str.indexOf(StubApp.getString2(22239), i11)) != -1) {
            sb3.append((CharSequence) str, i11, indexOf);
            sb3.append(objArr[i3]);
            i11 = indexOf + 2;
            i3++;
        }
        sb3.append((CharSequence) str, i11, str.length());
        if (i3 < objArr.length) {
            sb3.append(StubApp.getString2(510));
            sb3.append(objArr[i3]);
            for (int i12 = i3 + 1; i12 < objArr.length; i12++) {
                sb3.append(StubApp.getString2(81));
                sb3.append(objArr[i12]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static int D(Object obj, u0 u0Var, byte[] bArr, int i3, int i10, int i11, D0.g gVar) {
        int H2 = ((C0738l0) u0Var).H(obj, bArr, i3, i10, i11, gVar);
        gVar.f1246c = obj;
        return H2;
    }

    public static int E(Object obj, u0 u0Var, byte[] bArr, int i3, int i10, D0.g gVar) {
        int i11 = i3 + 1;
        int i12 = bArr[i3];
        if (i12 < 0) {
            i11 = m(i12, bArr, i11, gVar);
            i12 = gVar.f1244a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw T.g();
        }
        int i14 = i13 + i12;
        u0Var.f(obj, bArr, i13, i14, gVar);
        gVar.f1246c = obj;
        return i14;
    }

    public static int F(int i3) {
        int i10 = i3 % PKIFailureInfo.notAuthorized;
        return i10 >= 0 ? i10 : i10 + PKIFailureInfo.notAuthorized;
    }

    public static Z.b G(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & UShort.MAX_VALUE;
        String string2 = StubApp.getString2(22240);
        if (i3 > 100) {
            throw new IOException(string2);
        }
        duplicate.position(duplicate.position() + 6);
        int i10 = 0;
        while (true) {
            if (i10 >= i3) {
                j = -1;
                break;
            }
            int i11 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & BodyPartID.bodyIdMax;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i11) {
                break;
            }
            i10++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & BodyPartID.bodyIdMax;
            for (int i12 = 0; i12 < j3; i12++) {
                int i13 = duplicate.getInt();
                long j10 = duplicate.getInt() & BodyPartID.bodyIdMax;
                duplicate.getInt();
                if (1164798569 == i13 || 1701669481 == i13) {
                    duplicate.position((int) (j10 + j));
                    Z.b bVar = new Z.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f4812d = duplicate;
                    bVar.f4809a = position;
                    int i14 = position - duplicate.getInt(position);
                    bVar.f4810b = i14;
                    bVar.f4811c = ((ByteBuffer) bVar.f4812d).getShort(i14);
                    return bVar;
                }
            }
        }
        throw new IOException(string2);
    }

    public static HashMap H(z zVar) {
        int parseInt;
        long parseLong;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Bundle bundle = zVar.f1486a;
        String string2 = StubApp.getString2(1520);
        if (bundle.getString(string2) != null) {
            hashMap.put(StubApp.getString2(1416), zVar.f1486a.getString(string2));
        }
        Bundle bundle2 = zVar.f1486a;
        String string22 = StubApp.getString2(1518);
        if (bundle2.getString(string22) != null) {
            hashMap.put(string22, zVar.f1486a.getString(string22));
        }
        Bundle bundle3 = zVar.f1486a;
        String string23 = StubApp.getString2(12574);
        if (bundle3.getString(string23) != null) {
            hashMap.put(StubApp.getString2(8317), zVar.f1486a.getString(string23));
        }
        if (zVar.f() != null) {
            hashMap.put(StubApp.getString2(1411), zVar.f());
        }
        Bundle bundle4 = zVar.f1486a;
        String string24 = StubApp.getString2(1519);
        if (bundle4.getString(string24) != null) {
            hashMap.put(StubApp.getString2(1413), zVar.f1486a.getString(string24));
        }
        if (!((C1697j) zVar.d()).isEmpty()) {
            for (Map.Entry entry : ((C1692e) zVar.d()).entrySet()) {
                hashMap2.put((String) entry.getKey(), entry.getValue());
            }
        }
        hashMap.put(StubApp.getString2(1485), hashMap2);
        Bundle bundle5 = zVar.f1486a;
        Object obj = bundle5.get(StubApp.getString2(22241));
        boolean z2 = obj instanceof Integer;
        String string25 = StubApp.getString2(493);
        if (z2) {
            parseInt = ((Integer) obj).intValue();
        } else {
            if (obj instanceof String) {
                try {
                    parseInt = Integer.parseInt((String) obj);
                } catch (NumberFormatException unused) {
                    Log.w(string25, StubApp.getString2(22242) + obj);
                }
            }
            parseInt = 0;
        }
        hashMap.put(StubApp.getString2(1417), Integer.valueOf(parseInt));
        Object obj2 = bundle5.get(StubApp.getString2(22243));
        if (obj2 instanceof Long) {
            parseLong = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused2) {
                    Log.w(string25, StubApp.getString2(22244) + obj2);
                }
            }
            parseLong = 0;
        }
        hashMap.put(StubApp.getString2(22245), Long.valueOf(parseLong));
        if (zVar.g() != null) {
            y g10 = zVar.g();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            String str = g10.f1469a;
            if (str != null) {
                hashMap3.put(StubApp.getString2(616), str);
            }
            String str2 = g10.f1470b;
            if (str2 != null) {
                hashMap3.put(StubApp.getString2(22246), str2);
            }
            String[] strArr = g10.f1471c;
            if (strArr != null) {
                hashMap3.put(StubApp.getString2(22247), Arrays.asList(strArr));
            }
            String str3 = g10.f1472d;
            if (str3 != null) {
                hashMap3.put(StubApp.getString2(9806), str3);
            }
            String str4 = g10.f1473e;
            if (str4 != null) {
                hashMap3.put(StubApp.getString2(22248), str4);
            }
            String[] strArr2 = g10.f1474f;
            if (strArr2 != null) {
                hashMap3.put(StubApp.getString2(22249), Arrays.asList(strArr2));
            }
            String str5 = g10.f1480m;
            if (str5 != null) {
                hashMap4.put(StubApp.getString2(9804), str5);
            }
            String str6 = g10.f1479l;
            if (str6 != null) {
                hashMap4.put(StubApp.getString2(22250), str6);
            }
            String str7 = g10.f1478k;
            if (str7 != null) {
                hashMap4.put(StubApp.getString2(160), str7);
            }
            String str8 = g10.f1475g;
            if (str8 != null) {
                hashMap4.put(StubApp.getString2(22251), str8);
            }
            String str9 = g10.f1476h;
            if ((str9 != null ? Uri.parse(str9) : null) != null) {
                hashMap4.put(StubApp.getString2(22252), (str9 != null ? Uri.parse(str9) : null).toString());
            }
            Uri uri = g10.f1481n;
            if (uri != null) {
                hashMap4.put(StubApp.getString2(22253), uri.toString());
            }
            Integer num = g10.f1485r;
            if (num != null) {
                hashMap4.put(StubApp.getString2(20291), num);
            }
            Integer num2 = g10.f1483p;
            if (num2 != null) {
                hashMap4.put(StubApp.getString2(1044), num2);
            }
            String str10 = g10.f1477i;
            if (str10 != null) {
                hashMap4.put(StubApp.getString2(5841), str10);
            }
            String str11 = g10.f1482o;
            if (str11 != null) {
                hashMap4.put(StubApp.getString2(9986), str11);
            }
            Integer num3 = g10.f1484q;
            if (num3 != null) {
                hashMap4.put(StubApp.getString2(1338), num3);
            }
            String str12 = g10.j;
            if (str12 != null) {
                hashMap4.put(StubApp.getString2(3514), str12);
            }
            hashMap3.put(StubApp.getString2(3400), hashMap4);
            hashMap.put(StubApp.getString2(490), hashMap3);
        }
        return hashMap;
    }

    public static w1.g I(w1.g gVar, String[] strArr, Map map) {
        int i3 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (w1.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                w1.g gVar2 = new w1.g();
                int length = strArr.length;
                while (i3 < length) {
                    gVar2.a((w1.g) map.get(strArr[i3]));
                    i3++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((w1.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i3 < length2) {
                    gVar.a((w1.g) map.get(strArr[i3]));
                    i3++;
                }
            }
        }
        return gVar;
    }

    public static void J(TextView textView, int i3) {
        M.d.d(i3);
        if (i3 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public static String K(String str) {
        return f20083a.getCacheDir() + StubApp.getString2(601) + str;
    }

    public static final com.mapbox.navigation.base.route.g L(RouteInterface routeInterface, long j, DirectionsResponse directionsResponse) {
        Intrinsics.checkNotNullParameter(routeInterface, "<this>");
        Intrinsics.checkNotNullParameter(directionsResponse, "directionsResponse");
        Lazy lazy = i.f12510a;
        Intrinsics.checkNotNullParameter(routeInterface, "<this>");
        Intrinsics.checkNotNullParameter(directionsResponse, "directionsResponse");
        List<DirectionsRoute> routes = directionsResponse.routes();
        Intrinsics.checkNotNullExpressionValue(routes, "directionsResponse.routes()");
        DirectionsRoute directionsRoute = (DirectionsRoute) CollectionsKt.getOrNull(routes, routeInterface.getRouteIndex());
        Integer L10 = directionsRoute != null ? Oc.a.L(directionsRoute) : null;
        RouteOptions fromUrl = RouteOptions.fromUrl(new URL(routeInterface.getRequestUri()));
        Intrinsics.checkNotNullExpressionValue(fromUrl, "fromUrl(URL(requestUri))");
        return new com.mapbox.navigation.base.route.g(i.a(directionsResponse, routeInterface.getRouteIndex(), fromUrl), Intrinsics.areEqual(fromUrl.waypointsPerRoute(), Boolean.TRUE) ? directionsResponse.routes().get(routeInterface.getRouteIndex()).waypoints() : directionsResponse.waypoints(), fromUrl, routeInterface, L10 != null ? Long.valueOf(L10.intValue() + j) : null);
    }

    public static final StylePropertyValue M(N6.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new StylePropertyValue(dVar, StylePropertyValueKind.EXPRESSION);
    }

    public static com.mapbox.navigation.base.route.g N(com.mapbox.navigation.base.route.g gVar, Function1 directionsRouteBlock, Function1 waypointsBlock, Long l9, a4.f fVar, m mVar, int i3) {
        if ((i3 & 4) != 0) {
            l9 = gVar.f12503f;
        }
        Long l10 = l9;
        if ((i3 & 8) != 0) {
            fVar = null;
            gVar.getClass();
        }
        a4.f fVar2 = fVar;
        if ((i3 & 16) != 0) {
            mVar = gVar.f12505h;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(directionsRouteBlock, "directionsRouteBlock");
        Intrinsics.checkNotNullParameter(waypointsBlock, "waypointsBlock");
        return com.mapbox.navigation.base.route.g.a(gVar, (DirectionsRoute) directionsRouteBlock.invoke(gVar.f12498a), (List) waypointsBlock.invoke(gVar.f12499b), fVar2, l10, mVar, 12);
    }

    public static final boolean O(String str, Function0 block) {
        String string2 = StubApp.getString2(22254);
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean booleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e(string2, str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e(string2, StubApp.getString2(22256).concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e(string2, StubApp.getString2(22255).concat(str));
            return false;
        }
    }

    public static final List a(List list, ArrayList arrayList) {
        if (list == null || arrayList == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list));
        int i3 = 0;
        for (Object obj : list) {
            int i10 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DirectionsWaypoint directionsWaypoint = (DirectionsWaypoint) obj;
            DirectionsWaypoint directionsWaypoint2 = (DirectionsWaypoint) CollectionsKt.getOrNull(arrayList, i3);
            if (directionsWaypoint2 != null) {
                directionsWaypoint = directionsWaypoint2;
            }
            arrayList2.add(directionsWaypoint);
            i3 = i10;
        }
        return arrayList2;
    }

    public static final void b(Style style, String str, double d8) {
        style.setStyleLayerProperty(str, StubApp.getString2(22257), new Value(d8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if ("driving-traffic".equals(com.stub.StubApp.getString2(5803)) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        r5.annotationsList(r0);
        r0 = java.lang.Boolean.FALSE;
        r5.continueStraight(r0);
        r5.enableRefresh(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if ("driving-traffic".equals(com.stub.StubApp.getString2(5804)) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.mapbox.api.directions.v5.models.RouteOptions.Builder r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 5556(0x15b4, float:7.786E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r1 = "driving-traffic"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 2029(0x7ed, float:2.843E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r2 = 2091(0x82b, float:2.93E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r3 = 2090(0x82a, float:2.929E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r2, r3}
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            int r2 = r1.hashCode()
            r3 = 13010(0x32d2, float:1.8231E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            switch(r2) {
                case -1040922121: goto L8b;
                case 1118815609: goto L72;
                case 1227428899: goto L64;
                case 1920367559: goto L3e;
                default: goto L3c;
            }
        L3c:
            goto Ld1
        L3e:
            r2 = 4429(0x114d, float:6.206E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld1
            java.lang.String[] r2 = new java.lang.String[]{r3}
            java.util.List r2 = kotlin.collections.CollectionsKt.mutableListOf(r2)
            r2.addAll(r0)
            r5.annotationsList(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.continueStraight(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.enableRefresh(r0)
            goto Lb5
        L64:
            r2 = 5803(0x16ab, float:8.132E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld1
            goto L7f
        L72:
            r2 = 5804(0x16ac, float:8.133E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Ld1
        L7f:
            r5.annotationsList(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.continueStraight(r0)
            r5.enableRefresh(r0)
            goto Lb5
        L8b:
            boolean r2 = r1.equals(r1)
            if (r2 == 0) goto Ld1
            r2 = 370(0x172, float:5.18E-43)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            r4 = 22258(0x56f2, float:3.119E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4}
            java.util.List r2 = kotlin.collections.CollectionsKt.mutableListOf(r2)
            r2.addAll(r0)
            r5.annotationsList(r2)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.continueStraight(r0)
            r5.enableRefresh(r0)
        Lb5:
            r5.profile(r1)
            r0 = 22259(0x56f3, float:3.1192E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r5.overview(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.steps(r0)
            r5.roundaboutExits(r0)
            r5.voiceInstructions(r0)
            r5.bannerInstructions(r0)
            return
        Ld1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r0 = 22260(0x56f4, float:3.1193E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r2 = 22261(0x56f5, float:3.1194E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r0 = E1.a.k(r0, r1, r2)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.AbstractC1526a.c(com.mapbox.api.directions.v5.models.RouteOptions$Builder):void");
    }

    public static final void d(RouteOptions.Builder builder, Context context) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        builder.language(Oc.a.t(context).getLanguage());
        builder.voiceUnits(Tc.d.l(Oc.a.t(context)).f23548a);
    }

    public static int e(int i3, int i10) {
        long j = i3 + i10;
        int i11 = (int) j;
        if (j == ((long) i11)) {
            return i11;
        }
        throw new ArithmeticException(AbstractC1482f.e(i3, StubApp.getString2(22262), i10, StubApp.getString2(81), StubApp.getString2(74)));
    }

    public static final void f(S9.i delegate, String typeUrl) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
        S9.d dVar = S9.d.f6614b;
        s sVar = s.f6665b;
        new n(delegate, delegate.f6641b, delegate.f6643d);
    }

    public static int g(byte[] bArr, int i3, D0.g gVar) {
        int n10 = n(bArr, i3, gVar);
        int i10 = gVar.f1244a;
        if (i10 < 0) {
            throw T.e();
        }
        if (i10 > bArr.length - n10) {
            throw T.g();
        }
        if (i10 == 0) {
            gVar.f1246c = AbstractC0733j.f12158b;
            return n10;
        }
        gVar.f1246c = AbstractC0733j.c(n10, i10, bArr);
        return n10 + i10;
    }

    public static int h(int i3, byte[] bArr) {
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static long i(int i3, byte[] bArr) {
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public static int j(u0 u0Var, byte[] bArr, int i3, int i10, int i11, D0.g gVar) {
        Object d8 = u0Var.d();
        int D6 = D(d8, u0Var, bArr, i3, i10, i11, gVar);
        u0Var.b(d8);
        gVar.f1246c = d8;
        return D6;
    }

    public static int k(u0 u0Var, int i3, byte[] bArr, int i10, int i11, P p8, D0.g gVar) {
        Object d8 = u0Var.d();
        u0 u0Var2 = u0Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        D0.g gVar2 = gVar;
        int E10 = E(d8, u0Var2, bArr2, i10, i12, gVar2);
        u0Var2.b(d8);
        gVar2.f1246c = d8;
        p8.add(d8);
        while (E10 < i12) {
            D0.g gVar3 = gVar2;
            int i13 = i12;
            int n10 = n(bArr2, E10, gVar3);
            if (i3 != gVar3.f1244a) {
                break;
            }
            byte[] bArr3 = bArr2;
            u0 u0Var3 = u0Var2;
            Object d10 = u0Var3.d();
            E10 = E(d10, u0Var3, bArr3, n10, i13, gVar3);
            u0Var2 = u0Var3;
            bArr2 = bArr3;
            i12 = i13;
            gVar2 = gVar3;
            u0Var2.b(d10);
            gVar2.f1246c = d10;
            p8.add(d10);
        }
        return E10;
    }

    public static int l(int i3, byte[] bArr, int i10, int i11, x0 x0Var, D0.g gVar) {
        if ((i3 >>> 3) == 0) {
            throw T.a();
        }
        int i12 = i3 & 7;
        if (i12 == 0) {
            int p8 = p(bArr, i10, gVar);
            x0Var.f(i3, Long.valueOf(gVar.f1245b));
            return p8;
        }
        if (i12 == 1) {
            x0Var.f(i3, Long.valueOf(i(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int n10 = n(bArr, i10, gVar);
            int i13 = gVar.f1244a;
            if (i13 < 0) {
                throw T.e();
            }
            if (i13 > bArr.length - n10) {
                throw T.g();
            }
            if (i13 == 0) {
                x0Var.f(i3, AbstractC0733j.f12158b);
            } else {
                x0Var.f(i3, AbstractC0733j.c(n10, i13, bArr));
            }
            return n10 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw T.a();
            }
            x0Var.f(i3, Integer.valueOf(h(i10, bArr)));
            return i10 + 4;
        }
        x0 x0Var2 = new x0();
        int i14 = (i3 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int n11 = n(bArr, i10, gVar);
            i15 = gVar.f1244a;
            if (i15 == i14) {
                i10 = n11;
                break;
            }
            i10 = l(i15, bArr, n11, i11, x0Var2, gVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw T.f();
        }
        x0Var.f(i3, x0Var2);
        return i10;
    }

    public static int m(int i3, byte[] bArr, int i10, D0.g gVar) {
        int i11 = i3 & CertificateBody.profileType;
        int i12 = i10 + 1;
        byte b2 = bArr[i10];
        if (b2 >= 0) {
            gVar.f1244a = i11 | (b2 << 7);
            return i12;
        }
        int i13 = i11 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            gVar.f1244a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & ByteCompanionObject.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            gVar.f1244a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & ByteCompanionObject.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            gVar.f1244a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                gVar.f1244a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int n(byte[] bArr, int i3, D0.g gVar) {
        int i10 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 < 0) {
            return m(b2, bArr, i10, gVar);
        }
        gVar.f1244a = b2;
        return i10;
    }

    public static int o(int i3, byte[] bArr, int i10, int i11, P p8, D0.g gVar) {
        G g10 = (G) p8;
        int n10 = n(bArr, i10, gVar);
        g10.b(gVar.f1244a);
        while (n10 < i11) {
            int n11 = n(bArr, n10, gVar);
            if (i3 != gVar.f1244a) {
                break;
            }
            n10 = n(bArr, n11, gVar);
            g10.b(gVar.f1244a);
        }
        return n10;
    }

    public static int p(byte[] bArr, int i3, D0.g gVar) {
        int i10 = i3 + 1;
        long j = bArr[i3];
        if (j >= 0) {
            gVar.f1245b = j;
            return i10;
        }
        int i11 = i3 + 2;
        byte b2 = bArr[i10];
        long j3 = (j & 127) | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i12 = 7;
        while (b2 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j3 |= (r10 & ByteCompanionObject.MAX_VALUE) << i12;
            b2 = bArr[i11];
            i11 = i13;
        }
        gVar.f1245b = j3;
        return i11;
    }

    public static boolean q(Method method, KClass clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Class clazz2 = JvmClassMappingKt.getJavaClass(clazz);
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        return method.getReturnType().equals(clazz2);
    }

    public static String r(P7.b routeProgress) {
        RouteLeg routeLeg;
        List<LegStep> steps;
        LegStep legStep;
        BannerText primary;
        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
        try {
            BannerInstructions bannerInstructions = routeProgress.f5563b;
            if (bannerInstructions != null && (primary = bannerInstructions.primary()) != null) {
                String text = primary.text();
                Intrinsics.checkNotNullExpressionValue(text, "text(...)");
                if (text != null && text.length() != 0) {
                    return text;
                }
            }
            LegStep legStep2 = routeProgress.f5566e.f5559g.f5588d;
            if (legStep2 != null) {
                StepManeuver maneuver = legStep2.maneuver();
                Intrinsics.checkNotNullExpressionValue(maneuver, "maneuver(...)");
                String instruction = maneuver.instruction();
                if (instruction != null && instruction.length() != 0) {
                    return instruction;
                }
            }
            List<RouteLeg> legs = routeProgress.f5562a.f12498a.legs();
            StepManeuver maneuver2 = (legs == null || (routeLeg = (RouteLeg) CollectionsKt.firstOrNull((List) legs)) == null || (steps = routeLeg.steps()) == null || (legStep = (LegStep) CollectionsKt.firstOrNull((List) steps)) == null) ? null : legStep.maneuver();
            if (maneuver2 != null) {
                return maneuver2.instruction();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static x s(P7.b routeProgress) {
        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
        BannerInstructions bannerInstructions = routeProgress.f5563b;
        BannerText primary = bannerInstructions != null ? bannerInstructions.primary() : null;
        if (primary != null) {
            return u(primary.type(), primary.modifier(), primary.degrees());
        }
        LegStep legStep = routeProgress.f5566e.f5559g.f5588d;
        StepManeuver maneuver = legStep != null ? legStep.maneuver() : null;
        if (maneuver != null) {
            return u(maneuver.type(), maneuver.modifier(), null);
        }
        return null;
    }

    public static z t(Map map) {
        Object obj = map.get(StubApp.getString2(1905));
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get(StubApp.getString2(8317));
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        Bundle bundle = new Bundle();
        C1692e c1692e = new C1692e(0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(StubApp.getString2(22263).concat(str));
        }
        bundle.putString(StubApp.getString2(12574), str);
        String str2 = (String) map2.get(StubApp.getString2(1416));
        String str3 = (String) map2.get(StubApp.getString2(1411));
        String str4 = (String) map2.get(StubApp.getString2(1413));
        Integer num = (Integer) map2.get(StubApp.getString2(1417));
        Map map3 = (Map) map2.get(StubApp.getString2(1485));
        if (str2 != null) {
            bundle.putString(StubApp.getString2(1520), str2);
        }
        if (str4 != null) {
            bundle.putString(StubApp.getString2(1519), str4);
        }
        if (str3 != null) {
            bundle.putString(StubApp.getString2(1178), str3);
        }
        if (num != null) {
            bundle.putString(StubApp.getString2(22241), String.valueOf(num.intValue()));
        }
        if (map3 != null) {
            c1692e.clear();
            c1692e.putAll(map3);
        }
        Bundle bundle2 = new Bundle();
        Iterator it = ((Z) c1692e.entrySet()).iterator();
        while (true) {
            C1690c c1690c = (C1690c) it;
            if (!c1690c.hasNext()) {
                bundle2.putAll(bundle);
                bundle.remove(StubApp.getString2(1518));
                return new z(bundle2);
            }
            c1690c.next();
            C1690c c1690c2 = c1690c;
            bundle2.putString((String) c1690c2.getKey(), (String) c1690c2.getValue());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0115, code lost:
    
        if (r0 != 0.0d) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0118, code lost:
    
        r0 = java.lang.Math.max(50.0d, java.lang.Math.min(310.0d, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x012e, code lost:
    
        if (r0 > 45.0d) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        return X2.x.f8355l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013a, code lost:
    
        if (r0 > 90.0d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013e, code lost:
    
        return X2.x.f8356m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0146, code lost:
    
        if (r0 > 135.0d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014a, code lost:
    
        return X2.x.f8357n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
    
        if (r0 > 180.0d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0151, code lost:
    
        return X2.x.f8358p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0159, code lost:
    
        if (r0 > 225.0d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015d, code lost:
    
        return X2.x.f8359q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0165, code lost:
    
        if (r0 > 270.0d) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0169, code lost:
    
        return X2.x.f8360r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        if (r0 > 315.0d) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0175, code lost:
    
        return X2.x.f8361s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0178, code lost:
    
        return X2.x.f8362t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        r0 = 180.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
    
        if (r7.equals(com.stub.StubApp.getString2(1548)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r7.equals(com.stub.StubApp.getString2(22264)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0109, code lost:
    
        if (r9 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e2, code lost:
    
        if (r7.equals(com.stub.StubApp.getString2(22267)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f1, code lost:
    
        if (r7.equals(com.stub.StubApp.getString2(22268)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:
    
        if (r7.equals(com.stub.StubApp.getString2(1550)) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x010b, code lost:
    
        r0 = r9.doubleValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X2.x u(java.lang.String r7, java.lang.String r8, java.lang.Double r9) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.AbstractC1526a.u(java.lang.String, java.lang.String, java.lang.Double):X2.x");
    }

    public static final List v(d dVar) {
        List emptyList;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List a3 = dVar.a();
        g gVar = dVar.f20092d;
        if (gVar == null || (emptyList = gVar.f20096b) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.f(emptyList));
        Iterator it = emptyList.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1528c) it.next()).f20087a);
        }
        return CollectionsKt___CollectionsKt.plus((Collection) a3, (Iterable) arrayList);
    }

    public static String w(String tableName, String triggerType) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(triggerType, "triggerType");
        return StubApp.getString2(22269) + tableName + '_' + triggerType + '`';
    }

    public static x x(P7.b routeProgress) {
        Intrinsics.checkNotNullParameter(routeProgress, "routeProgress");
        BannerInstructions bannerInstructions = routeProgress.f5563b;
        BannerText primary = bannerInstructions != null ? bannerInstructions.primary() : null;
        if (primary != null) {
            return u(primary.type(), primary.modifier(), primary.degrees());
        }
        return null;
    }

    public static int y(String str) {
        int i3;
        char c10;
        if (str == null) {
            return -1;
        }
        String m4 = AbstractC1405B.m(str);
        m4.getClass();
        switch (m4.hashCode()) {
            case -2123537834:
                i3 = 20;
                if (m4.equals(StubApp.getString2(938))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22281))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22280))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1662095187:
                i3 = 20;
                if (m4.equals(StubApp.getString2(19246))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                i3 = 20;
                if (m4.equals(StubApp.getString2(1625))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487656890:
                i3 = 20;
                if (m4.equals(StubApp.getString2(525))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1487464693:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22279))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1487464690:
                i3 = 20;
                if (m4.equals(StubApp.getString2(524))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                i3 = 20;
                if (m4.equals(StubApp.getString2(6953))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1487018032:
                i3 = 20;
                if (m4.equals(StubApp.getString2(523))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                i3 = 20;
                if (m4.equals(StubApp.getString2(3217))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1079884372:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22278))) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                i3 = 20;
                if (m4.equals(StubApp.getString2(519))) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -879272239:
                i3 = 20;
                if (m4.equals(StubApp.getString2(6954))) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -879258763:
                i3 = 20;
                if (m4.equals(StubApp.getString2(6955))) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22277))) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22276))) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22275))) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                i3 = 20;
                if (m4.equals(StubApp.getString2(1629))) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                i3 = 20;
                if (m4.equals(StubApp.getString2(3955))) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22274))) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                i3 = 20;
                if (m4.equals(StubApp.getString2(3216))) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22273))) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                i3 = 20;
                if (m4.equals(StubApp.getString2(21518))) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                i3 = 20;
                if (m4.equals(StubApp.getString2(880))) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                i3 = 20;
                if (m4.equals(StubApp.getString2(1624))) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                i3 = 20;
                if (m4.equals(StubApp.getString2(935))) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                i3 = 20;
                if (m4.equals(StubApp.getString2(1627))) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1504824762:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22272))) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                i3 = 20;
                if (m4.equals(StubApp.getString2(1623))) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22271))) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                i3 = 20;
                if (m4.equals(StubApp.getString2(22270))) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                i3 = 20;
                break;
        }
        switch (c10) {
        }
        return -1;
    }

    public static int z(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22282)) || lastPathSegment.endsWith(StubApp.getString2(22283))) {
            return 0;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22284))) {
            return 1;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22285)) || lastPathSegment.endsWith(StubApp.getString2(22286))) {
            return 2;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22287))) {
            return 3;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22288))) {
            return 4;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22289))) {
            return 5;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22290)) || lastPathSegment.endsWith(StubApp.getString2(22291)) || lastPathSegment.endsWith(StubApp.getString2(22292))) {
            return 15;
        }
        if (lastPathSegment.startsWith(StubApp.getString2(22293), lastPathSegment.length() - 4) || lastPathSegment.endsWith(StubApp.getString2(22294))) {
            return 6;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(1938))) {
            return 7;
        }
        String string2 = StubApp.getString2(21194);
        if (lastPathSegment.endsWith(string2)) {
            return 8;
        }
        if (lastPathSegment.startsWith(StubApp.getString2(22295), lastPathSegment.length() - 4) || lastPathSegment.startsWith(string2, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(StubApp.getString2(22296), lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(StubApp.getString2(22297), lastPathSegment.length() - 4) || lastPathSegment.endsWith(StubApp.getString2(22298))) {
            return 9;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22299)) || lastPathSegment.endsWith(StubApp.getString2(22300)) || lastPathSegment.endsWith(StubApp.getString2(22301)) || lastPathSegment.endsWith(StubApp.getString2(22302))) {
            return 10;
        }
        String string22 = StubApp.getString2(22303);
        if (lastPathSegment.endsWith(string22) || lastPathSegment.startsWith(string22, lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22304)) || lastPathSegment.endsWith(StubApp.getString2(22305))) {
            return 12;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22306)) || lastPathSegment.endsWith(StubApp.getString2(22307))) {
            return 13;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(6772)) || lastPathSegment.endsWith(StubApp.getString2(22308))) {
            return 14;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22309))) {
            return 16;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22310))) {
            return 17;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22311))) {
            return 18;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22312)) || lastPathSegment.endsWith(StubApp.getString2(22313))) {
            return 19;
        }
        if (lastPathSegment.endsWith(StubApp.getString2(22314)) || lastPathSegment.endsWith(StubApp.getString2(22315))) {
            return 20;
        }
        return lastPathSegment.endsWith(StubApp.getString2(22316)) ? 21 : -1;
    }
}
