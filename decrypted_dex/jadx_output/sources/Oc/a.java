package Oc;

import M4.e0;
import Q7.d;
import Qb.L;
import R7.e;
import Sb.l;
import Sb.m;
import Sb.o;
import Sb.w;
import Sb.x;
import V8.C0353e;
import Xa.h;
import Y9.b;
import Z1.i;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.KeyEvent;
import c5.B;
import com.google.gson.JsonElement;
import com.google.protobuf.T;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.route.g;
import com.mapbox.navigator.ElectronicHorizonEdge;
import com.mapbox.navigator.Gate;
import com.mapbox.navigator.GraphPosition;
import com.mapbox.navigator.Position;
import com.mapbox.navigator.RoadObjectType;
import com.stub.StubApp;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l.AbstractC1130a;
import oa.C1471d;
import oa.q;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1711k;
import ta.C1747g;
import tc.I;
import wa.n;
import z0.C1986b;
import z0.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f5374a;

    public static final e A(Position position) {
        Intrinsics.checkNotNullParameter(position, "<this>");
        GraphPosition position2 = position.getPosition();
        Intrinsics.checkNotNullExpressionValue(position2, "position");
        d dVar = new d(position2.getEdgeId(), position2.getPercentAlong());
        Point coordinate = position.getCoordinate();
        Intrinsics.checkNotNullExpressionValue(coordinate, "coordinate");
        return new e(dVar, coordinate);
    }

    public static final ArrayList B(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A((Position) it.next()));
        }
        return arrayList;
    }

    public static final int C(RoadObjectType roadObjectType) {
        Intrinsics.checkNotNullParameter(roadObjectType, "<this>");
        switch (Q7.e.f5758a[roadObjectType.ordinal()]) {
            case 1:
                return 6;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 0;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 5;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static i I(String str) {
        String group;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile(StubApp.getString2(25426)).matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        Intrinsics.checkNotNullExpressionValue(description, "description");
        return new i(parseInt, parseInt2, parseInt3, description);
    }

    public static String J(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 8 ? i3 != 19 ? i3 != 22 ? i3 != 34 ? i3 != 62 ? i3 != 133 ? i3 != 256 ? h.g(i3, StubApp.getString2(3049), StubApp.getString2(74)) : StubApp.getString2(25427) : StubApp.getString2(3069) : StubApp.getString2(11710) : StubApp.getString2(3095) : StubApp.getString2(11711) : StubApp.getString2(11712) : StubApp.getString2(11713) : StubApp.getString2(11714) : StubApp.getString2(5759);
    }

    public static final File K(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String fileName = name + StubApp.getString2(25428);
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new File(StubApp.getOrigApplicationContext(context.getApplicationContext()).getFilesDir(), E1.a.j(StubApp.getString2(25429), fileName));
    }

    public static final Integer L(DirectionsRoute directionsRoute) {
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(directionsRoute, "<this>");
        try {
            Map<String, JsonElement> unrecognizedJsonProperties = directionsRoute.getUnrecognizedJsonProperties();
            if (unrecognizedJsonProperties == null || (jsonElement = unrecognizedJsonProperties.get(StubApp.getString2("1915"))) == null) {
                return null;
            }
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final I S(Ab.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return I.f21271d;
        }
        if (ordinal == 1) {
            return I.f21272e;
        }
        if (ordinal == 2) {
            return I.f21273f;
        }
        if (ordinal == 3) {
            return I.f21274g;
        }
        if (ordinal == 4) {
            return I.f21275h;
        }
        if (ordinal == 5) {
            return I.j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void T(x xVar, Object obj) {
        Object j = xVar.j(obj);
        if (j instanceof l) {
            Object obj2 = ((m) L.k(new o(xVar, obj, null))).f6716a;
        } else {
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void a(byte b2, byte b10, byte b11, byte b12, char[] cArr, int i3) {
        if (!w(b10)) {
            if ((((b10 + 112) + (b2 << 28)) >> 30) == 0 && !w(b11) && !w(b12)) {
                int i10 = ((b2 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i3] = (char) ((i10 >>> 10) + 55232);
                cArr[i3 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw T.b();
    }

    public static void b(byte b2, byte b10, char[] cArr, int i3) {
        if (b2 < -62 || w(b10)) {
            throw T.b();
        }
        cArr[i3] = (char) (((b2 & 31) << 6) | (b10 & 63));
    }

    public static void c(byte b2, byte b10, byte b11, char[] cArr, int i3) {
        if (w(b10) || ((b2 == -32 && b10 < -96) || ((b2 == -19 && b10 >= -96) || w(b11)))) {
            throw T.b();
        }
        cArr[i3] = (char) (((b2 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    public static final boolean d(List routes1, List routes2) {
        Intrinsics.checkNotNullParameter(routes1, "routes1");
        Intrinsics.checkNotNullParameter(routes2, "routes2");
        if (routes1.size() != routes2.size()) {
            return false;
        }
        int size = routes1.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!x(((g) routes1.get(i3)).f12498a, ((g) routes2.get(i3)).f12498a)) {
                return false;
            }
        }
        return true;
    }

    public static C1711k e(z0.m mVar, String str, j jVar, int i3) {
        e0 e0Var = e0.f4606g;
        Map map = Collections.EMPTY_MAP;
        Uri u2 = AbstractC1550k.u(str, jVar.f23689c);
        String b2 = mVar.b();
        if (b2 == null) {
            b2 = AbstractC1550k.u(((C1986b) mVar.f23695b.get(0)).f23642a, jVar.f23689c).toString();
        }
        String str2 = b2;
        AbstractC1550k.i(u2, StubApp.getString2(505));
        return new C1711k(u2, 1, null, e0Var, jVar.f23687a, jVar.f23688b, str2, i3);
    }

    public static n f(b bVar) {
        boolean equals = bVar.f8849d.equals(StubApp.getString2(25430));
        n nVar = new n();
        String str = bVar.f8846a;
        oa.j a3 = str != null ? oa.j.a(str) : null;
        oa.j jVar = oa.j.f18593s1;
        C1471d c1471d = nVar.f22238a;
        c1471d.V(jVar, a3);
        String str2 = bVar.f8847b;
        c1471d.V(oa.j.f18570n1, str2 != null ? new q(str2) : null);
        if (nVar.f22240c == -1) {
            nVar.f22240c = c1471d.N(oa.j.f18548h1, null, 0);
        }
        int i3 = nVar.f22240c;
        int i10 = !equals ? i3 | 32 : i3 & (-33);
        oa.j jVar2 = oa.j.f18548h1;
        c1471d.U(jVar2, i10);
        nVar.f22240c = i10;
        if (i10 == -1) {
            nVar.f22240c = c1471d.N(jVar2, null, 0);
        }
        int i11 = nVar.f22240c;
        int i12 = equals ? i11 | 4 : i11 & (-5);
        c1471d.U(jVar2, i12);
        nVar.f22240c = i12;
        c1471d.V(oa.j.f18560l1, new C1747g(bVar.f8848c).f21255a);
        c1471d.T(oa.j.f18462J1, bVar.f8855k);
        c1471d.T(oa.j.f18568n, bVar.f8853h);
        c1471d.T(oa.j.f18461J0, bVar.f8854i);
        float f10 = bVar.f8851f;
        c1471d.T(oa.j.f18456I, f10);
        nVar.f22239b = f10;
        c1471d.T(oa.j.f18469K3, bVar.f8852g);
        c1471d.T(oa.j.f18607w, bVar.a());
        String str3 = bVar.f8850e;
        c1471d.V(oa.j.f18512X, str3 != null ? new q(str3) : null);
        c1471d.T(oa.j.j3, 0.0f);
        return nVar;
    }

    public static ArrayList g(float[] colorArray) {
        Intrinsics.checkNotNullParameter(colorArray, "colorArray");
        return CollectionsKt.arrayListOf(new Value(StubApp.getString2(5289)), new Value(colorArray[0]), new Value(colorArray[1]), new Value(colorArray[2]), new Value(colorArray[3]));
    }

    public static final void h(w wVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException(StubApp.getString2(25431));
            cancellationException.initCause(th);
        }
        wVar.d(cancellationException);
    }

    public static Object i(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static float[] l(int i3) {
        return new float[]{(i3 >> 16) & 255, (i3 >> 8) & 255, i3 & 255, ((i3 >> 24) & 255) / 255.0f};
    }

    public static int m(int i3, int i10) {
        int i11 = i3 - i10;
        if (i11 > i10) {
            i11 = i10;
            i10 = i11;
        }
        int i12 = 1;
        int i13 = 1;
        while (i3 > i10) {
            i12 *= i3;
            if (i13 <= i11) {
                i12 /= i13;
                i13++;
            }
            i3--;
        }
        while (i13 <= i11) {
            i12 /= i13;
            i13++;
        }
        return i12;
    }

    public static C1711k p(int i3) {
        int i10 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        return new C1711k(Uri.parse(StubApp.getString2(25432) + i3), 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static int q(int[] iArr, int i3, boolean z2) {
        boolean z10;
        int[] iArr2 = iArr;
        int i10 = 0;
        for (int i11 : iArr2) {
            i10 += i11;
        }
        int length = iArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = length - 1;
            if (i12 >= i15) {
                return i13;
            }
            int i16 = 1 << i12;
            i14 |= i16;
            int i17 = 1;
            while (i17 < iArr2[i12]) {
                int i18 = i10 - i17;
                int i19 = length - i12;
                int i20 = i19 - 2;
                int m4 = m(i18 - 1, i20);
                if (z2 && i14 == 0) {
                    int i21 = i19 - 1;
                    if (i18 - i21 >= i21) {
                        m4 -= m(i18 - i19, i20);
                    }
                }
                boolean z11 = true;
                if (i19 - 1 > 1) {
                    int i22 = i18 - i20;
                    int i23 = 0;
                    while (i22 > i3) {
                        i23 += m((i18 - i22) - 1, i19 - 3);
                        i22--;
                        z11 = z11;
                    }
                    z10 = z11;
                    m4 -= (i15 - i12) * i23;
                } else {
                    z10 = true;
                    if (i18 > i3) {
                        m4--;
                    }
                }
                i13 += m4;
                i17++;
                i14 &= ~i16;
                iArr2 = iArr;
            }
            i10 -= i17;
            i12++;
            iArr2 = iArr;
        }
    }

    public static final Bundle r(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException(E1.a.k(StubApp.getString2(25433), key, StubApp.getString2(25434)));
    }

    public static final Locale t(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "this.resources.configuration.locales");
        Locale locale = (locales.isEmpty() || locales.get(0) == null) ? Locale.getDefault() : locales.get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "{\n        val locales = …Default()\n        }\n    }");
        return locale;
    }

    public static boolean w(byte b2) {
        return b2 > -65;
    }

    public static final boolean x(DirectionsRoute directionsRoute, DirectionsRoute directionsRoute2) {
        Intrinsics.checkNotNullParameter(directionsRoute, "<this>");
        if (directionsRoute == directionsRoute2) {
            return true;
        }
        if (directionsRoute2 == null) {
            return false;
        }
        String geometry = directionsRoute.geometry();
        String geometry2 = directionsRoute2.geometry();
        if (geometry != null && geometry2 != null) {
            return Intrinsics.areEqual(geometry, geometry2);
        }
        List<RouteLeg> legs = directionsRoute.legs();
        String joinToString$default = legs != null ? CollectionsKt___CollectionsKt.joinToString$default(legs, null, null, null, 0, null, J7.j.f3435c, 31, null) : null;
        List<RouteLeg> legs2 = directionsRoute2.legs();
        String joinToString$default2 = legs2 != null ? CollectionsKt___CollectionsKt.joinToString$default(legs2, null, null, null, 0, null, J7.j.f3435c, 31, null) : null;
        if (joinToString$default == null || joinToString$default2 == null) {
            return false;
        }
        return Intrinsics.areEqual(joinToString$default, joinToString$default2);
    }

    public static final Q7.b y(ElectronicHorizonEdge electronicHorizonEdge) {
        ArrayList arrayList = new ArrayList();
        Q7.b bVar = new Q7.b(electronicHorizonEdge.getId(), electronicHorizonEdge.getLevel(), electronicHorizonEdge.getProbability(), electronicHorizonEdge.getIsOnRoute(), arrayList);
        List<ElectronicHorizonEdge> out = electronicHorizonEdge.getOut();
        Intrinsics.checkNotNullExpressionValue(out, "out");
        for (ElectronicHorizonEdge it : out) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(y(it));
        }
        return bVar;
    }

    public static final List z(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Gate gate = (Gate) it.next();
            int id = gate.getId();
            Position position = gate.getPosition();
            Intrinsics.checkNotNullExpressionValue(position, "position");
            arrayList.add(new V7.b(id, A(position), gate.getProbability(), gate.getDistance()));
        }
        return CollectionsKt.toList(arrayList);
    }

    public abstract void D();

    public void E() {
    }

    public abstract boolean F(int i3, KeyEvent keyEvent);

    public boolean G(KeyEvent keyEvent) {
        return false;
    }

    public boolean H() {
        return false;
    }

    public abstract void M(B b2);

    public abstract void N(boolean z2);

    public abstract void O();

    public abstract void P(boolean z2);

    public abstract void Q(CharSequence charSequence);

    public AbstractC1130a R(Y.m mVar) {
        return null;
    }

    public abstract boolean U(C0353e c0353e);

    public boolean j() {
        return false;
    }

    public abstract boolean k();

    public abstract void n(boolean z2);

    public abstract int o();

    public abstract Context s();

    public abstract void u();

    public boolean v() {
        return false;
    }
}
