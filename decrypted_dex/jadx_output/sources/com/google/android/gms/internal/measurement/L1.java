package com.google.android.gms.internal.measurement;

import Qb.C0203k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import b3.C0498N;
import com.mapbox.common.Cancelable;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.ResourceDescription;
import com.mapbox.common.ResourceLoadFlags;
import com.mapbox.common.ResourceLoadOptions;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.common.TileDataDomain;
import com.mapbox.common.TileStore;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.AlternativeRouteInfo;
import com.mapbox.navigator.RouteAlternative;
import com.mapbox.navigator.RouteIntersection;
import com.stub.StubApp;
import g.C0948c;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import wc.EnumC1883H;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class L1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile L4.f f11305a;

    /* renamed from: b, reason: collision with root package name */
    public static X2.n f11306b;

    /* renamed from: c, reason: collision with root package name */
    public static X2.v f11307c;

    public static String A(int i3) {
        if (i3 == 0) {
            return StubApp.getString2(5759);
        }
        if (i3 == 1) {
            return StubApp.getString2(11714);
        }
        if (i3 != 8) {
            if (i3 == 19) {
                return StubApp.getString2(11712);
            }
            if (i3 == 22) {
                return StubApp.getString2(11711);
            }
            if (i3 == 34) {
                return StubApp.getString2(3095);
            }
            if (i3 == 62) {
                return StubApp.getString2(11710);
            }
            if (i3 == 133) {
                return StubApp.getString2(3069);
            }
            if (i3 == 143) {
                return StubApp.getString2(11709);
            }
            if (i3 != 147) {
                return i3 != 256 ? i3 != 257 ? Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(11707) : StubApp.getString2(11708);
            }
        }
        return StubApp.getString2(11713);
    }

    public static String B(int i3) {
        int i10 = i3 & 3840;
        return i10 != 256 ? i10 != 512 ? i10 != 1024 ? i10 != 2048 ? Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : f5.u0.v(i3) : f5.u0.w(i3) : f5.u0.u(i3) : AbstractC0624h2.v(i3);
    }

    public static final List C(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(StubApp.getString2(290));
        int columnIndex2 = cursor.getColumnIndex(StubApp.getString2(2361));
        int columnIndex3 = cursor.getColumnIndex(StubApp.getString2(1518));
        int columnIndex4 = cursor.getColumnIndex(StubApp.getString2(8317));
        List createListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i3 = cursor.getInt(columnIndex);
            int i10 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new L1.d(string, i3, i10, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
    }

    public static final L1.e D(P1.c cVar, String str, boolean z2) {
        Cursor F3 = cVar.F(StubApp.getString2(11715) + str + StubApp.getString2(3344));
        try {
            int columnIndex = F3.getColumnIndex(StubApp.getString2("11716"));
            int columnIndex2 = F3.getColumnIndex(StubApp.getString2("11717"));
            int columnIndex3 = F3.getColumnIndex(StubApp.getString2("152"));
            int columnIndex4 = F3.getColumnIndex(StubApp.getString2("3005"));
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (F3.moveToNext()) {
                    if (F3.getInt(columnIndex2) >= 0) {
                        int i3 = F3.getInt(columnIndex);
                        String columnName = F3.getString(columnIndex3);
                        String string2 = F3.getInt(columnIndex4) > 0 ? "DESC" : StubApp.getString2("3337");
                        Integer valueOf = Integer.valueOf(i3);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i3), string2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List list = CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                L1.e eVar = new L1.e(str, z2, list, CollectionsKt.toList(values2));
                CloseableKt.closeFinally(F3, null);
                return eVar;
            }
            CloseableKt.closeFinally(F3, null);
            return null;
        } finally {
        }
    }

    public static final String E(String value) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i3 = 0; i3 < value.length(); i3++) {
            char charAt = value.charAt(i3);
            contains$default = StringsKt__StringsKt.contains$default(StubApp.getString2(11718), charAt, false, 2, (Object) null);
            if (contains$default) {
                sb2.append('\\');
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static void F() {
        String string2 = StubApp.getString2(7096);
        R2.c.b(string2, StubApp.getString2(11719));
        try {
            X2.v vVar = f11307c;
            if (vVar != null) {
                R2.c.b(string2, StubApp.getString2("11720"));
                vVar.e(new X2.q(1));
                return;
            }
            R2.c.f(string2, StubApp.getString2("11721"));
            X2.n nVar = f11306b;
            C0498N c0498n = nVar != null ? nVar.f8311d : null;
            if (c0498n == null) {
                R2.c.f(string2, StubApp.getString2("11723"));
            } else {
                c0498n.y();
                R2.c.b(string2, StubApp.getString2("11722"));
            }
        } catch (Exception e10) {
            E1.a.u(StubApp.getString2(11724), e10.getMessage(), string2);
        }
    }

    public static int G(int i3) {
        return (i3 >>> 1) ^ (-(i3 & 1));
    }

    public static long H(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static final String h(SessionSKUIdentifier sessionSKUIdentifier) {
        switch (n8.e.f17884a[sessionSKUIdentifier.ordinal()]) {
            case 1:
                return StubApp.getString2(11730);
            case 2:
                return StubApp.getString2(11729);
            case 3:
                return StubApp.getString2(11728);
            case 4:
                return StubApp.getString2(11727);
            case 5:
                return StubApp.getString2(11726);
            case 6:
                return StubApp.getString2(11725);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r10 = w(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        throw new java.lang.IllegalArgumentException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003e, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = j(r8, r9, r10)
            boolean r1 = j(r8, r9, r11)
            if (r1 != 0) goto L7a
            if (r0 != 0) goto Le
            goto L7a
        Le:
            r0 = 5912(0x1718, float:8.284E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L41
            if (r8 == r2) goto L3a
            if (r8 == r3) goto L33
            if (r8 != r1) goto L2d
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L79
            goto L47
        L2d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L33:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L79
            goto L47
        L3a:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L79
            goto L47
        L41:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L79
        L47:
            if (r8 == r4) goto L79
            if (r8 != r3) goto L4c
            goto L79
        L4c:
            int r10 = w(r8, r9, r10)
            if (r8 == r4) goto L6e
            if (r8 == r2) goto L69
            if (r8 == r3) goto L64
            if (r8 != r1) goto L5e
            int r8 = r11.bottom
            int r9 = r9.bottom
        L5c:
            int r8 = r8 - r9
            goto L73
        L5e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L64:
            int r8 = r11.right
            int r9 = r9.right
            goto L5c
        L69:
            int r8 = r9.top
            int r9 = r11.top
            goto L5c
        L6e:
            int r8 = r9.left
            int r9 = r11.left
            goto L5c
        L73:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L7a
        L79:
            return r5
        L7a:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L1.i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean j(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException(StubApp.getString2(5912));
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static Nc.a l(int i3, int i10, byte[] bArr) {
        return new Nc.a(ByteBuffer.wrap(bArr, i3, i10).slice());
    }

    public static EnumC1883H m(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals(StubApp.getString2(11733))) {
                            return EnumC1883H.f22342d;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals(StubApp.getString2(11732))) {
                            return EnumC1883H.f22341c;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals(StubApp.getString2(11731))) {
                            return EnumC1883H.f22340b;
                        }
                        break;
                }
            } else if (javaName.equals(StubApp.getString2(11734))) {
                return EnumC1883H.f22343e;
            }
        } else if (javaName.equals(StubApp.getString2(11735))) {
            return EnumC1883H.f22344f;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
    }

    public static ColorStateList n(Context context, a5.c cVar, int i3) {
        int resourceId;
        ColorStateList j;
        TypedArray typedArray = (TypedArray) cVar.f9283c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (j = D1.j(context, resourceId)) == null) ? cVar.p(i3) : j;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList j;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (j = D1.j(context, resourceId)) == null) ? typedArray.getColorStateList(i3) : j;
    }

    public static Drawable p(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable m4;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (m4 = D1.m(context, resourceId)) == null) ? typedArray.getDrawable(i3) : m4;
    }

    public static ResolveInfo q(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().resolveActivity(new Intent(StubApp.getString2(11736)), 1114112);
    }

    public static String r(g.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof g.d) {
            return StubApp.getString2(4497);
        }
        if (input instanceof g.e) {
            return StubApp.getString2(4496);
        }
        if (input instanceof C0948c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List s(String name, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list == CollectionsKt.emptyList() || (list instanceof T9.a)) {
            return list;
        }
        T9.a aVar = new T9.a(list);
        if (aVar.contains(null)) {
            throw new IllegalArgumentException(name.concat(StubApp.getString2(11737)).toString());
        }
        return aVar;
    }

    public static boolean t(int i3, Rect rect, Rect rect2) {
        if (i3 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i3 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i3 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException(StubApp.getString2(5912));
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean u(byte b2) {
        return b2 > -65;
    }

    public static final Object v(C9.b bVar, Q2.g request, E9.h hVar) {
        C0203k c0203k = new C0203k(1, IntrinsicsKt.intercepted(hVar));
        c0203k.s();
        C9.e onFinished = new C9.e(1, c0203k, ContinuationKt.class, StubApp.getString2(11739), StubApp.getString2(11738), 1, 0);
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        C9.c callback = new C9.c(onFinished);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TileStore tileStore = G7.a.f2450a.a();
        Intrinsics.checkNotNullParameter(tileStore, "tileStore");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        long incrementAndGet = bVar.f1149b.incrementAndGet();
        ConcurrentLinkedQueue concurrentLinkedQueue = bVar.f1151d;
        Q2.g gVar = new Q2.g(request, callback, concurrentLinkedQueue);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((C9.c) it.next()).getClass();
            Intrinsics.checkNotNullParameter(request, "request");
        }
        ConcurrentHashMap concurrentHashMap = bVar.f1150c;
        Long valueOf = Long.valueOf(incrementAndGet);
        ResourceDescription resourceDescription = new ResourceDescription(TileDataDomain.NAVIGATION, (String) request.f5711b);
        NetworkRestriction networkRestriction = NetworkRestriction.DISALLOW_ALL;
        NetworkRestriction networkRestriction2 = (NetworkRestriction) request.f5713d;
        boolean z2 = networkRestriction2 != networkRestriction;
        String h2 = Xa.h.h(incrementAndGet, StubApp.getString2(11740));
        Cancelable loadResource = tileStore.loadResource(resourceDescription, (!z2 || bVar.f1148a.isReachable()) ? new ResourceLoadOptions(h2, (ResourceLoadFlags) request.f5712c, networkRestriction2, null) : new ResourceLoadOptions(h2, ResourceLoadFlags.ACCEPT_EXPIRED, networkRestriction, null), gVar, new C9.a(bVar, incrementAndGet, gVar));
        Intrinsics.checkNotNullExpressionValue(loadResource, "tileStore.loadResource(\n…Adapter.run(it)\n        }");
        concurrentHashMap.put(valueOf, loadResource);
        c0203k.u(new C9.d(bVar, incrementAndGet, 0));
        Object r8 = c0203k.r();
        if (r8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(hVar);
        }
        return r8;
    }

    public static int w(int i3, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i3 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i3 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i3 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i3 != 130) {
                throw new IllegalArgumentException(StubApp.getString2(5912));
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static final P8.c x(RouteAlternative routeAlternative, com.mapbox.navigation.base.route.g navigationRoute) {
        Intrinsics.checkNotNullParameter(routeAlternative, "<this>");
        Intrinsics.checkNotNullParameter(navigationRoute, "navigationRoute");
        RouteIntersection alternativeRouteFork = routeAlternative.getAlternativeRouteFork();
        Intrinsics.checkNotNullExpressionValue(alternativeRouteFork, "alternativeRouteFork");
        Point location = alternativeRouteFork.getLocation();
        Intrinsics.checkNotNullExpressionValue(location, "location");
        P8.b bVar = new P8.b(location, alternativeRouteFork.getGeometryIndex(), alternativeRouteFork.getSegmentIndex(), alternativeRouteFork.getLegIndex());
        RouteIntersection mainRouteFork = routeAlternative.getMainRouteFork();
        Intrinsics.checkNotNullExpressionValue(mainRouteFork, "mainRouteFork");
        Point location2 = mainRouteFork.getLocation();
        Intrinsics.checkNotNullExpressionValue(location2, "location");
        P8.b bVar2 = new P8.b(location2, mainRouteFork.getGeometryIndex(), mainRouteFork.getSegmentIndex(), mainRouteFork.getLegIndex());
        AlternativeRouteInfo infoFromFork = routeAlternative.getInfoFromFork();
        Intrinsics.checkNotNullExpressionValue(infoFromFork, "infoFromFork");
        P8.a aVar = new P8.a(infoFromFork.getDistance(), infoFromFork.getDuration());
        AlternativeRouteInfo infoFromStart = routeAlternative.getInfoFromStart();
        Intrinsics.checkNotNullExpressionValue(infoFromStart, "infoFromStart");
        return new P8.c(navigationRoute, bVar, bVar2, aVar, new P8.a(infoFromStart.getDistance(), infoFromStart.getDuration()));
    }

    public static int y(int i3, Rect rect, Rect rect2) {
        if (i3 != 17) {
            if (i3 != 33) {
                if (i3 != 66) {
                    if (i3 != 130) {
                        throw new IllegalArgumentException(StubApp.getString2(5912));
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static String z(int i3) {
        if (i3 == 26) {
            return StubApp.getString2(11756);
        }
        if (i3 == 30) {
            return StubApp.getString2(11755);
        }
        if (i3 == 34) {
            return StubApp.getString2(3095);
        }
        if (i3 == 42) {
            return StubApp.getString2(11754);
        }
        if (i3 == 257) {
            return StubApp.getString2(3094);
        }
        if (i3 == 58) {
            return StubApp.getString2(3093);
        }
        if (i3 == 59) {
            return StubApp.getString2(3092);
        }
        switch (i3) {
            case 1:
                return StubApp.getString2(3091);
            case 2:
                return StubApp.getString2(3090);
            case 3:
                return StubApp.getString2(3089);
            case 4:
                return StubApp.getString2(3088);
            case 5:
                return StubApp.getString2(3087);
            case 6:
                return StubApp.getString2(3086);
            case 7:
                return StubApp.getString2(3085);
            case 8:
                return StubApp.getString2(3084);
            case 9:
                return StubApp.getString2(3083);
            case 10:
                return StubApp.getString2(3082);
            case 11:
                return StubApp.getString2(3081);
            case 12:
                return StubApp.getString2(3080);
            case 13:
                return StubApp.getString2(3079);
            case 14:
                return StubApp.getString2(3078);
            case 15:
                return StubApp.getString2(3077);
            case 16:
                return StubApp.getString2(3076);
            case 17:
                return StubApp.getString2(3075);
            default:
                switch (i3) {
                    case 128:
                        return StubApp.getString2(3074);
                    case 129:
                        return StubApp.getString2(3073);
                    case 130:
                        return StubApp.getString2(3072);
                    case 131:
                        return StubApp.getString2(3071);
                    case 132:
                        return StubApp.getString2(3070);
                    case 133:
                        return StubApp.getString2(3069);
                    case 134:
                        return StubApp.getString2(3068);
                    case 135:
                        return StubApp.getString2(3067);
                    case 136:
                        return StubApp.getString2(3066);
                    case 137:
                        return StubApp.getString2(3065);
                    case 138:
                        return StubApp.getString2(3064);
                    case 139:
                        return StubApp.getString2(3063);
                    case 140:
                        return StubApp.getString2(3062);
                    case 141:
                        return StubApp.getString2(3061);
                    case 142:
                        return StubApp.getString2(3060);
                    case 143:
                        return StubApp.getString2(3059);
                    default:
                        switch (i3) {
                            case 253:
                                return StubApp.getString2(3058);
                            case 254:
                                return StubApp.getString2(3057);
                            case 255:
                                return StubApp.getString2(3056);
                            default:
                                switch (i3) {
                                    case 4096:
                                        return StubApp.getString2(11753);
                                    case DfuBaseService.ERROR_FILE_NOT_FOUND /* 4097 */:
                                        return StubApp.getString2(11752);
                                    case DfuBaseService.ERROR_FILE_ERROR /* 4098 */:
                                        return StubApp.getString2(11751);
                                    case DfuBaseService.ERROR_FILE_INVALID /* 4099 */:
                                        return StubApp.getString2(11750);
                                    case DfuBaseService.ERROR_FILE_IO_EXCEPTION /* 4100 */:
                                        return StubApp.getString2(11749);
                                    case DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED /* 4101 */:
                                        return StubApp.getString2(11748);
                                    case DfuBaseService.ERROR_SERVICE_NOT_FOUND /* 4102 */:
                                        return StubApp.getString2(11747);
                                    default:
                                        String string2 = StubApp.getString2(11741);
                                        switch (i3) {
                                            case DfuBaseService.ERROR_INVALID_RESPONSE /* 4104 */:
                                                return StubApp.getString2(11746);
                                            case DfuBaseService.ERROR_FILE_TYPE_UNSUPPORTED /* 4105 */:
                                                return StubApp.getString2(11745);
                                            case DfuBaseService.ERROR_BLUETOOTH_DISABLED /* 4106 */:
                                                return StubApp.getString2(11744);
                                            case DfuBaseService.ERROR_INIT_PACKET_REQUIRED /* 4107 */:
                                            case DfuBaseService.ERROR_FILE_SIZE_INVALID /* 4108 */:
                                                return string2;
                                            case DfuBaseService.ERROR_CRC_ERROR /* 4109 */:
                                                return StubApp.getString2(11743);
                                            case DfuBaseService.ERROR_DEVICE_NOT_BONDED /* 4110 */:
                                                return StubApp.getString2(11742);
                                            default:
                                                return Xa.h.g(i3, StubApp.getString2(3049), StubApp.getString2(74));
                                        }
                                }
                        }
                }
        }
    }

    public abstract List k(String str, List list);
}
