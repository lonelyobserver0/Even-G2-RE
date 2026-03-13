package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import android.widget.TextView;
import com.mapbox.navigator.ElectronicHorizon;
import com.mapbox.navigator.ElectronicHorizonEdge;
import com.mapbox.navigator.ElectronicHorizonPosition;
import com.mapbox.navigator.ElectronicHorizonResultType;
import com.mapbox.navigator.Gate;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.LineDistanceInfo;
import com.mapbox.navigator.PolygonDistanceInfo;
import com.mapbox.navigator.RoadObjectDistance;
import com.mapbox.navigator.RoadObjectDistanceInfo;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.SubGraphDistanceInfo;
import com.stub.StubApp;
import i5.C1059c;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlin.time.DurationKt;
import kotlin.time.InstantKt;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;
import q8.C1527b;
import q8.C1528c;
import r0.AbstractC1550k;
import v0.C1830z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class D1 {

    /* renamed from: a, reason: collision with root package name */
    public static C1059c f11246a;

    public static int A(byte[] bArr, int i3, Y1 y12) {
        int v2 = v(bArr, i3, y12);
        int i10 = y12.f11417a;
        if (i10 < 0) {
            throw new C0683t2(StubApp.getString2(11585));
        }
        if (i10 == 0) {
            y12.f11419c = "";
            return v2;
        }
        int i11 = W2.f11401a;
        int length = bArr.length;
        if ((((length - v2) - i10) | v2 | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format(StubApp.getString2(11584), Integer.valueOf(length), Integer.valueOf(v2), Integer.valueOf(i10)));
        }
        int i12 = v2 + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (v2 < i12) {
            byte b2 = bArr[v2];
            if (b2 < 0) {
                break;
            }
            v2++;
            cArr[i13] = (char) b2;
            i13++;
        }
        while (v2 < i12) {
            int i14 = v2 + 1;
            byte b10 = bArr[v2];
            if (b10 >= 0) {
                cArr[i13] = (char) b10;
                i13++;
                v2 = i14;
                while (v2 < i12) {
                    byte b11 = bArr[v2];
                    if (b11 >= 0) {
                        v2++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else {
                String string2 = StubApp.getString2(11583);
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i14 >= i12 - 2) {
                            throw new C0683t2(string2);
                        }
                        byte b12 = bArr[i14];
                        int i15 = v2 + 3;
                        byte b13 = bArr[v2 + 2];
                        v2 += 4;
                        byte b14 = bArr[i15];
                        if (!f5.u0.C(b12)) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && !f5.u0.C(b13) && !f5.u0.C(b14)) {
                                int i16 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                cArr[i13] = (char) ((i16 >>> 10) + 55232);
                                cArr[i13 + 1] = (char) ((i16 & 1023) + 56320);
                                i13 += 2;
                            }
                        }
                        throw new C0683t2(string2);
                    }
                    if (i14 >= i12 - 1) {
                        throw new C0683t2(string2);
                    }
                    int i17 = i13 + 1;
                    int i18 = v2 + 2;
                    byte b15 = bArr[i14];
                    v2 += 3;
                    byte b16 = bArr[i18];
                    if (!f5.u0.C(b15)) {
                        if (b10 == -32) {
                            if (b15 >= -96) {
                                b10 = -32;
                            }
                        }
                        if (b10 == -19) {
                            if (b15 < -96) {
                                b10 = -19;
                            }
                        }
                        if (!f5.u0.C(b16)) {
                            cArr[i13] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                            i13 = i17;
                        }
                    }
                    throw new C0683t2(string2);
                }
                if (i14 >= i12) {
                    throw new C0683t2(string2);
                }
                int i19 = i13 + 1;
                v2 += 2;
                byte b17 = bArr[i14];
                if (b10 < -62 || f5.u0.C(b17)) {
                    throw new C0683t2(string2);
                }
                cArr[i13] = (char) ((b17 & 63) | ((b10 & 31) << 6));
                i13 = i19;
            }
        }
        y12.f11419c = new String(cArr, 0, i13);
        return i12;
    }

    public static int B(byte[] bArr, int i3, Y1 y12) {
        int v2 = v(bArr, i3, y12);
        int i10 = y12.f11417a;
        if (i10 < 0) {
            throw new C0683t2(StubApp.getString2(11585));
        }
        if (i10 > bArr.length - v2) {
            throw new C0683t2(StubApp.getString2(11586));
        }
        if (i10 == 0) {
            y12.f11419c = C0594b2.f11453c;
            return v2;
        }
        y12.f11419c = C0594b2.d(v2, i10, bArr);
        return v2 + i10;
    }

    public static int C(Object obj, L2 l22, byte[] bArr, int i3, int i10, Y1 y12) {
        int i11 = i3 + 1;
        int i12 = bArr[i3];
        if (i12 < 0) {
            i11 = w(i12, bArr, i11, y12);
            i12 = y12.f11417a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new C0683t2(StubApp.getString2(11586));
        }
        int i14 = y12.f11420d + 1;
        y12.f11420d = i14;
        if (i14 >= 100) {
            throw new C0683t2(StubApp.getString2(447));
        }
        int i15 = i13 + i12;
        l22.h(obj, bArr, i13, i15, y12);
        y12.f11420d--;
        y12.f11419c = obj;
        return i15;
    }

    public static int D(Object obj, L2 l22, byte[] bArr, int i3, int i10, int i11, Y1 y12) {
        E2 e22 = (E2) l22;
        int i12 = y12.f11420d + 1;
        y12.f11420d = i12;
        if (i12 >= 100) {
            throw new C0683t2(StubApp.getString2(447));
        }
        int t3 = e22.t(obj, bArr, i3, i10, i11, y12);
        y12.f11420d--;
        y12.f11419c = obj;
        return t3;
    }

    public static int E(int i3, byte[] bArr, int i10, int i11, InterfaceC0669q2 interfaceC0669q2, Y1 y12) {
        C0644l2 c0644l2 = (C0644l2) interfaceC0669q2;
        int v2 = v(bArr, i10, y12);
        c0644l2.d(y12.f11417a);
        while (v2 < i11) {
            int v8 = v(bArr, v2, y12);
            if (i3 != y12.f11417a) {
                break;
            }
            v2 = v(bArr, v8, y12);
            c0644l2.d(y12.f11417a);
        }
        return v2;
    }

    public static int F(byte[] bArr, int i3, InterfaceC0669q2 interfaceC0669q2, Y1 y12) {
        C0644l2 c0644l2 = (C0644l2) interfaceC0669q2;
        int v2 = v(bArr, i3, y12);
        int i10 = y12.f11417a + v2;
        while (v2 < i10) {
            v2 = v(bArr, v2, y12);
            c0644l2.d(y12.f11417a);
        }
        if (v2 == i10) {
            return v2;
        }
        throw new C0683t2(StubApp.getString2(11586));
    }

    public static int G(L2 l22, int i3, byte[] bArr, int i10, int i11, InterfaceC0669q2 interfaceC0669q2, Y1 y12) {
        AbstractC0639k2 a3 = l22.a();
        L2 l23 = l22;
        byte[] bArr2 = bArr;
        int i12 = i11;
        Y1 y13 = y12;
        int C10 = C(a3, l23, bArr2, i10, i12, y13);
        l23.f(a3);
        y13.f11419c = a3;
        interfaceC0669q2.add(a3);
        while (C10 < i12) {
            Y1 y14 = y13;
            int i13 = i12;
            int v2 = v(bArr2, C10, y14);
            if (i3 != y14.f11417a) {
                break;
            }
            byte[] bArr3 = bArr2;
            L2 l24 = l23;
            AbstractC0639k2 a9 = l24.a();
            C10 = C(a9, l24, bArr3, v2, i13, y14);
            l23 = l24;
            bArr2 = bArr3;
            i12 = i13;
            y13 = y14;
            l23.f(a9);
            y13.f11419c = a9;
            interfaceC0669q2.add(a9);
        }
        return C10;
    }

    public static int H(int i3, byte[] bArr, int i10, int i11, P2 p22, Y1 y12) {
        int i12 = i3 >>> 3;
        String string2 = StubApp.getString2(11587);
        if (i12 == 0) {
            throw new C0683t2(string2);
        }
        int i13 = i3 & 7;
        if (i13 == 0) {
            int x7 = x(bArr, i10, y12);
            p22.d(i3, Long.valueOf(y12.f11418b));
            return x7;
        }
        if (i13 == 1) {
            p22.d(i3, Long.valueOf(z(i10, bArr)));
            return i10 + 8;
        }
        if (i13 == 2) {
            int v2 = v(bArr, i10, y12);
            int i14 = y12.f11417a;
            if (i14 < 0) {
                throw new C0683t2(StubApp.getString2(11585));
            }
            if (i14 > bArr.length - v2) {
                throw new C0683t2(StubApp.getString2(11586));
            }
            if (i14 == 0) {
                p22.d(i3, C0594b2.f11453c);
            } else {
                p22.d(i3, C0594b2.d(v2, i14, bArr));
            }
            return v2 + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C0683t2(string2);
            }
            p22.d(i3, Integer.valueOf(y(i10, bArr)));
            return i10 + 4;
        }
        int i15 = (i3 & (-8)) | 4;
        P2 a3 = P2.a();
        int i16 = y12.f11420d + 1;
        y12.f11420d = i16;
        if (i16 >= 100) {
            throw new C0683t2(StubApp.getString2(447));
        }
        int i17 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int v8 = v(bArr, i10, y12);
            int i18 = y12.f11417a;
            if (i18 == i15) {
                i17 = i18;
                i10 = v8;
                break;
            }
            i10 = H(i18, bArr, v8, i11, a3, y12);
            i17 = i18;
        }
        y12.f11420d--;
        if (i10 > i11 || i17 != i15) {
            throw new C0683t2(StubApp.getString2(445));
        }
        p22.d(i3, a3);
        return i10;
    }

    public static int I(int i3, byte[] bArr, int i10, int i11, Y1 y12) {
        int i12 = i3 >>> 3;
        String string2 = StubApp.getString2(11587);
        if (i12 == 0) {
            throw new C0683t2(string2);
        }
        int i13 = i3 & 7;
        if (i13 == 0) {
            return x(bArr, i10, y12);
        }
        if (i13 == 1) {
            return i10 + 8;
        }
        if (i13 == 2) {
            return v(bArr, i10, y12) + y12.f11417a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i10 + 4;
            }
            throw new C0683t2(string2);
        }
        int i14 = (i3 & (-8)) | 4;
        int i15 = 0;
        while (i10 < i11) {
            i10 = v(bArr, i10, y12);
            i15 = y12.f11417a;
            if (i15 == i14) {
                break;
            }
            i10 = I(i15, bArr, i10, i11, y12);
        }
        if (i10 > i11 || i15 != i14) {
            throw new C0683t2(StubApp.getString2(445));
        }
        return i10;
    }

    public static final void a(zc.a aVar, zc.b bVar, String str) {
        Logger logger = zc.c.f24148i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f24142b);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(StubApp.getString2(11588), Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(StubApp.getString2(994));
        sb2.append(aVar.f24137a);
        logger.fine(sb2.toString());
    }

    public static Q7.f b(ElectronicHorizonPosition position) {
        String string2;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(position, "<this>");
        GraphPosition position2 = position.position();
        Intrinsics.checkNotNullExpressionValue(position2, "position()");
        Q7.d dVar = new Q7.d(position2.getEdgeId(), position2.getPercentAlong());
        ElectronicHorizon tree = position.tree();
        Intrinsics.checkNotNullExpressionValue(tree, "tree()");
        ElectronicHorizonEdge start = tree.getStart();
        Intrinsics.checkNotNullExpressionValue(start, "this.start");
        Q7.a aVar = new Q7.a(Oc.a.y(start));
        ElectronicHorizonResultType type = position.type();
        Intrinsics.checkNotNullExpressionValue(type, "type()");
        int i3 = Q7.e.f5762e[type.ordinal()];
        if (i3 == 1) {
            string2 = StubApp.getString2(11589);
        } else if (i3 == 2) {
            string2 = StubApp.getString2(2909);
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = StubApp.getString2(10294);
        }
        return new Q7.f(dVar, aVar, string2);
    }

    public static V7.f c(RoadObjectDistance distance) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(distance, "<this>");
        RoadObjectDistanceInfo distanceInfo = distance.getDistanceInfo();
        Intrinsics.checkNotNullExpressionValue(distanceInfo, "distanceInfo");
        String roadObjectId = distance.getRoadObjectId();
        Intrinsics.checkNotNullExpressionValue(roadObjectId, "roadObjectId");
        RoadObjectType type = distance.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        int C10 = Oc.a.C(type);
        Intrinsics.checkNotNullParameter(distanceInfo, "<this>");
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        if (distanceInfo.isGantryDistanceInfo()) {
            return new V7.a(roadObjectId, C10, distanceInfo.getGantryDistanceInfo().getDistance());
        }
        if (distanceInfo.isLineDistanceInfo()) {
            LineDistanceInfo lineDistanceInfo = distanceInfo.getLineDistanceInfo();
            return new V7.c(roadObjectId, C10, lineDistanceInfo.getDistanceToEntry(), lineDistanceInfo.getDistanceToExit(), lineDistanceInfo.getDistanceToEnd(), lineDistanceInfo.getEntryFromStart(), lineDistanceInfo.getLength());
        }
        if (distanceInfo.isPointDistanceInfo()) {
            return new V7.d(roadObjectId, C10, distanceInfo.getPointDistanceInfo().getDistance());
        }
        boolean isPolygonDistanceInfo = distanceInfo.isPolygonDistanceInfo();
        String string2 = StubApp.getString2(11590);
        String string22 = StubApp.getString2(11591);
        if (isPolygonDistanceInfo) {
            PolygonDistanceInfo polygonDistanceInfo = distanceInfo.getPolygonDistanceInfo();
            List<Gate> entrances = polygonDistanceInfo.getEntrances();
            Intrinsics.checkNotNullExpressionValue(entrances, string22);
            List z2 = Oc.a.z(entrances);
            List<Gate> exits = polygonDistanceInfo.getExits();
            Intrinsics.checkNotNullExpressionValue(exits, string2);
            return new V7.e(roadObjectId, C10, z2, Oc.a.z(exits), polygonDistanceInfo.getInside());
        }
        if (!distanceInfo.isSubGraphDistanceInfo()) {
            throw new IllegalArgumentException(StubApp.getString2(11592));
        }
        SubGraphDistanceInfo subGraphDistanceInfo = distanceInfo.getSubGraphDistanceInfo();
        List<Gate> entrances2 = subGraphDistanceInfo.getEntrances();
        Intrinsics.checkNotNullExpressionValue(entrances2, string22);
        List z10 = Oc.a.z(entrances2);
        List<Gate> exits2 = subGraphDistanceInfo.getExits();
        Intrinsics.checkNotNullExpressionValue(exits2, string2);
        return new V7.g(roadObjectId, C10, z10, Oc.a.z(exits2), subGraphDistanceInfo.getInside());
    }

    public static C1527b d(List inputRoutes, V8.t processedRoutes, m8.G setRoutesInfo) {
        Intrinsics.checkNotNullParameter(inputRoutes, "inputRoutes");
        Intrinsics.checkNotNullParameter(processedRoutes, "processedRoutes");
        Intrinsics.checkNotNullParameter(setRoutesInfo, "setRoutesInfo");
        List drop = CollectionsKt.drop(inputRoutes, 1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : drop) {
            com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) obj;
            List list = processedRoutes.f7897b;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((RouteAlternative) it.next()).getRoute().getRouteId(), gVar.f12506i)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        List plus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt.listOfNotNull(CollectionsKt.firstOrNull(processedRoutes.f7896a)), (Iterable) list2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(list3));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C1528c((com.mapbox.navigation.base.route.g) it2.next(), StubApp.getString2(11593)));
        }
        return new C1527b(plus, arrayList3, setRoutesInfo);
    }

    public static void e(String str, String str2, Object obj) {
        String concat = StubApp.getString2(1063).concat(str);
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, String.format(str2, obj));
        }
    }

    public static void f(String str, String str2, Exception exc) {
        String concat = StubApp.getString2(1063).concat(str);
        if (Log.isLoggable(concat, 6)) {
            Log.e(concat, str2, exc);
        }
    }

    public static InvocationHandler g() {
        return (InvocationHandler) Class.forName(StubApp.getString2(11594), false, WebView.getWebViewClassLoader()).getDeclaredMethod(StubApp.getString2(11595), new Class[0]).invoke(null, new Object[0]);
    }

    public static final String h(long j) {
        String q10;
        String string2 = StubApp.getString2(11596);
        if (j <= -999500000) {
            q10 = Xa.h.q(new StringBuilder(), (j - 500000000) / InstantKt.NANOS_PER_SECOND, string2);
        } else {
            String string22 = StubApp.getString2(559);
            if (j <= -999500) {
                q10 = Xa.h.q(new StringBuilder(), (j - 500000) / DurationKt.NANOS_IN_MILLIS, string22);
            } else {
                String string23 = StubApp.getString2(11597);
                q10 = j <= 0 ? Xa.h.q(new StringBuilder(), (j - 500) / 1000, string23) : j < 999500 ? Xa.h.q(new StringBuilder(), (j + 500) / 1000, string23) : j < 999500000 ? Xa.h.q(new StringBuilder(), (j + 500000) / DurationKt.NANOS_IN_MILLIS, string22) : Xa.h.q(new StringBuilder(), (j + 500000000) / InstantKt.NANOS_PER_SECOND, string2);
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(StubApp.getString2(11598), Arrays.copyOf(new Object[]{q10}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    public static wc.v i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = wc.v.f22427c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(Xa.h.n(StubApp.getString2(11602), Typography.quote, str).toString());
        }
        String group = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(group.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = wc.v.f22428d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(11599));
                String substring = str.substring(end);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                sb2.append(StubApp.getString2(11600));
                throw new IllegalArgumentException(Xa.h.s(sb2, str, Typography.quote).toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else {
                    String string2 = StubApp.getString2(620);
                    if (StringsKt.O(group4, string2) && StringsKt.u(group4, string2) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new wc.v(str, (String[]) array);
        }
        throw new NullPointerException(StubApp.getString2(11601));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f1710c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList j(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            E.i r1 = new E.i
            r1.<init>(r0, r8)
            java.lang.Object r2 = E.l.f1718c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = E.l.f1717b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            E.h r5 = (E.h) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f1709b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f1710c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lc2
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f1710c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f1708a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = E.l.f1716a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L91
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = E.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L91
        L7f:
            r2 = move-exception
            r3 = 1575(0x627, float:2.207E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r5 = 11603(0x2d53, float:1.6259E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.util.Log.w(r3, r5, r2)
        L91:
            if (r4 == 0) goto Lbd
            java.lang.Object r2 = E.l.f1718c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = E.l.f1717b     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> La9
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> La9
            if (r3 != 0) goto Lab
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> La9
            r3.<init>()     // Catch: java.lang.Throwable -> La9
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> La9
            goto Lab
        La9:
            r8 = move-exception
            goto Lbb
        Lab:
            E.h r0 = new E.h     // Catch: java.lang.Throwable -> La9
            android.content.res.Resources r1 = r1.f1711a     // Catch: java.lang.Throwable -> La9
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> La9
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> La9
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
            goto Lc1
        Lbb:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La9
            throw r8
        Lbd:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lc1:
            return r4
        Lc2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D1.j(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final int k(String name, Cursor c10) {
        String string2;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex(StubApp.getString2(4957) + name + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            string2 = ArraysKt___ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e10) {
            Log.d(StubApp.getString2(11604), StubApp.getString2(11605), e10);
            string2 = StubApp.getString2(351);
        }
        throw new IllegalArgumentException(AbstractC1482f.i(StubApp.getString2(11606), name, StubApp.getString2(11607), string2));
    }

    public static Drawable m(Context context, int i3) {
        return n.J0.b().c(context, i3);
    }

    public static int n() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    public static int o(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static void p(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void q(Ya.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod(StubApp.getString2("11608"), Ya.c.class).invoke(null, cVar);
        } catch (Exception e10) {
            String str = StubApp.getString2(11609) + cVar + StubApp.getString2(11610);
            String string2 = StubApp.getString2(11611);
            Log.e(string2, str);
            Log.e(string2, StubApp.getString2(11612), e10);
        }
    }

    public static w0.j r(Context context, C1830z c1830z, boolean z2, String str) {
        PlaybackSession createPlaybackSession;
        w0.h hVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager b2 = w0.f.b(context.getSystemService(StubApp.getString2(11613)));
        if (b2 == null) {
            hVar = null;
        } else {
            createPlaybackSession = b2.createPlaybackSession();
            hVar = new w0.h(context, createPlaybackSession);
        }
        if (hVar == null) {
            AbstractC1550k.w(StubApp.getString2(11614), StubApp.getString2(11615));
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new w0.j(logSessionId, str);
        }
        if (z2) {
            c1830z.getClass();
            w0.c cVar = c1830z.f21857t;
            cVar.getClass();
            cVar.f21994f.a(hVar);
        }
        sessionId = hVar.f22017c.getSessionId();
        return new w0.j(sessionId, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T5.b s(T5.b r17, int r18, int r19, T5.f r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D1.s(T5.b, int, int, T5.f):T5.b");
    }

    public static R8.m t(com.mapbox.navigation.base.route.g route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(route.j, "CUSTOM_EXTERNAL")) {
            return new R8.k(StubApp.getString2(11616));
        }
        Intrinsics.checkNotNullParameter(route, "<this>");
        if (!Intrinsics.areEqual(route.f12500c.enableRefresh(), Boolean.TRUE)) {
            return new R8.k(StubApp.getString2(11617));
        }
        if (route.f12498a.requestUuid() == null || !(!StringsKt.isBlank(r0))) {
            return new R8.k(StubApp.getString2(11620));
        }
        return Intrinsics.areEqual(route.f12504g, StubApp.getString2(11618)) ? new R8.k(StubApp.getString2(11619)) : R8.l.f6306a;
    }

    public static int v(byte[] bArr, int i3, Y1 y12) {
        int i10 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 < 0) {
            return w(b2, bArr, i10, y12);
        }
        y12.f11417a = b2;
        return i10;
    }

    public static int w(int i3, byte[] bArr, int i10, Y1 y12) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i3 & CertificateBody.profileType;
        if (b2 >= 0) {
            y12.f11417a = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & ByteCompanionObject.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            y12.f11417a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & ByteCompanionObject.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            y12.f11417a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & ByteCompanionObject.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            y12.f11417a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                y12.f11417a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int x(byte[] bArr, int i3, Y1 y12) {
        long j = bArr[i3];
        int i10 = i3 + 1;
        if (j >= 0) {
            y12.f11418b = j;
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
        y12.f11418b = j3;
        return i11;
    }

    public static int y(int i3, byte[] bArr) {
        int i10 = bArr[i3] & UByte.MAX_VALUE;
        int i11 = bArr[i3 + 1] & UByte.MAX_VALUE;
        int i12 = bArr[i3 + 2] & UByte.MAX_VALUE;
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long z(int i3, byte[] bArr) {
        return (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48) | ((bArr[i3 + 7] & 255) << 56);
    }

    public abstract void l(I4.s sVar, float f10, float f11);

    public abstract void u(int i3, int i10, byte[] bArr);
}
