package X;

import Kc.A;
import Kc.B;
import Kc.o;
import Kc.z;
import Qb.I;
import Qb.J;
import Qb.L;
import Qb.W;
import T.C0286b;
import T.C0289e;
import T.InterfaceC0287c;
import T.Q;
import androidx.datastore.preferences.protobuf.AbstractC0420u;
import androidx.datastore.preferences.protobuf.AbstractC0422w;
import androidx.datastore.preferences.protobuf.C0407g;
import androidx.datastore.preferences.protobuf.C0411k;
import androidx.datastore.preferences.protobuf.C0424y;
import androidx.datastore.preferences.protobuf.InterfaceC0421v;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8229a = new f();

    public static d a(U.a aVar, List migrations, I scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        V.e storage = new V.e(o.f3837a, new e(produceFile, 0));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC0287c interfaceC0287c = aVar;
        if (aVar == null) {
            interfaceC0287c = new u5.d(20);
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new d(new d(new Q(storage, CollectionsKt.listOf(new C0289e(migrations, null)), interfaceC0287c, scope)));
    }

    public static d b(U.a aVar, Function0 function0) {
        return a(aVar, CollectionsKt.emptyList(), J.a(W.f5839b.plus(L.b())), function0);
    }

    public b c(B b2) {
        byte[] bArr;
        Set set;
        D9.c input = new D9.c(b2);
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            W.e o5 = W.e.o(input);
            Intrinsics.checkNotNullExpressionValue(o5, "{\n                Prefer…From(input)\n            }");
            h[] pairs = new h[0];
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            b bVar = new b(false);
            h[] pairs2 = (h[]) Arrays.copyOf(pairs, 0);
            Intrinsics.checkNotNullParameter(pairs2, "pairs");
            bVar.b();
            if (pairs2.length > 0) {
                h hVar = pairs2[0];
                throw null;
            }
            Map m4 = o5.m();
            Intrinsics.checkNotNullExpressionValue(m4, "preferencesProto.preferencesMap");
            for (Map.Entry entry : m4.entrySet()) {
                String name = (String) entry.getKey();
                W.i value = (W.i) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int C10 = value.C();
                int i3 = C10 == 0 ? -1 : j.f8234a[AbstractC1856e.c(C10)];
                String string2 = StubApp.getString2(728);
                switch (i3) {
                    case -1:
                        throw new C0286b(StubApp.getString2(6951), 0);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar = new g(name);
                        Boolean valueOf = Boolean.valueOf(value.t());
                        Intrinsics.checkNotNullParameter(gVar, string2);
                        bVar.d(gVar, valueOf);
                        break;
                    case 2:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar2 = new g(name);
                        Float valueOf2 = Float.valueOf(value.x());
                        Intrinsics.checkNotNullParameter(gVar2, string2);
                        bVar.d(gVar2, valueOf2);
                        break;
                    case 3:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar3 = new g(name);
                        Double valueOf3 = Double.valueOf(value.w());
                        Intrinsics.checkNotNullParameter(gVar3, string2);
                        bVar.d(gVar3, valueOf3);
                        break;
                    case 4:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar4 = new g(name);
                        Integer valueOf4 = Integer.valueOf(value.y());
                        Intrinsics.checkNotNullParameter(gVar4, string2);
                        bVar.d(gVar4, valueOf4);
                        break;
                    case 5:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar5 = new g(name);
                        Long valueOf5 = Long.valueOf(value.z());
                        Intrinsics.checkNotNullParameter(gVar5, string2);
                        bVar.d(gVar5, valueOf5);
                        break;
                    case 6:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar6 = new g(name);
                        String A4 = value.A();
                        Intrinsics.checkNotNullExpressionValue(A4, "value.string");
                        Intrinsics.checkNotNullParameter(gVar6, string2);
                        bVar.d(gVar6, A4);
                        break;
                    case 7:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar7 = new g(name);
                        InterfaceC0421v n10 = value.B().n();
                        Intrinsics.checkNotNullExpressionValue(n10, "value.stringSet.stringsList");
                        set = CollectionsKt___CollectionsKt.toSet(n10);
                        Intrinsics.checkNotNullParameter(gVar7, string2);
                        bVar.d(gVar7, set);
                        break;
                    case 8:
                        Intrinsics.checkNotNullParameter(name, "name");
                        g gVar8 = new g(name);
                        C0407g u2 = value.u();
                        int size = u2.size();
                        if (size == 0) {
                            bArr = AbstractC0422w.f9853b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            u2.d(size, bArr2);
                            bArr = bArr2;
                        }
                        Intrinsics.checkNotNullExpressionValue(bArr, "value.bytes.toByteArray()");
                        Intrinsics.checkNotNullParameter(gVar8, string2);
                        bVar.d(gVar8, bArr);
                        break;
                    case 9:
                        throw new C0286b(StubApp.getString2(6950), 0);
                }
            }
            return new b(MapsKt.toMutableMap(bVar.a()), true);
        } catch (C0424y e10) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", StubApp.getString2(1905));
            throw new C0286b("Unable to parse preferences proto.", e10);
        }
    }

    public Unit d(Object obj, A a3) {
        AbstractC0420u a9;
        Map a10 = ((b) obj).a();
        W.c n10 = W.e.n();
        for (Map.Entry entry : a10.entrySet()) {
            g gVar = (g) entry.getKey();
            Object value = entry.getValue();
            String str = gVar.f8230a;
            if (value instanceof Boolean) {
                W.h D6 = W.i.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D6.c();
                W.i.q((W.i) D6.f9851b, booleanValue);
                a9 = D6.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                W.h D8 = W.i.D();
                float floatValue = ((Number) value).floatValue();
                D8.c();
                W.i.r((W.i) D8.f9851b, floatValue);
                a9 = D8.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                W.h D10 = W.i.D();
                double doubleValue = ((Number) value).doubleValue();
                D10.c();
                W.i.o((W.i) D10.f9851b, doubleValue);
                a9 = D10.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                W.h D11 = W.i.D();
                int intValue = ((Number) value).intValue();
                D11.c();
                W.i.s((W.i) D11.f9851b, intValue);
                a9 = D11.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                W.h D12 = W.i.D();
                long longValue = ((Number) value).longValue();
                D12.c();
                W.i.l((W.i) D12.f9851b, longValue);
                a9 = D12.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                W.h D13 = W.i.D();
                D13.c();
                W.i.m((W.i) D13.f9851b, (String) value);
                a9 = D13.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setString(value).build()");
            } else if (value instanceof Set) {
                W.h D14 = W.i.D();
                W.f o5 = W.g.o();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o5.c();
                W.g.l((W.g) o5.f9851b, (Set) value);
                D14.c();
                W.i.n((W.i) D14.f9851b, (W.g) o5.a());
                a9 = D14.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setStringSe…                ).build()");
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException(E1.a.h(value, StubApp.getString2(6952)));
                }
                W.h D15 = W.i.D();
                byte[] bArr = (byte[]) value;
                C0407g c0407g = C0407g.f9780c;
                C0407g c10 = C0407g.c(0, bArr.length, bArr);
                D15.c();
                W.i.p((W.i) D15.f9851b, c10);
                a9 = D15.a();
                Intrinsics.checkNotNullExpressionValue(a9, "newBuilder().setBytes(By….copyFrom(value)).build()");
            }
            n10.getClass();
            str.getClass();
            n10.c();
            W.e.l((W.e) n10.f9851b).put(str, (W.i) a9);
        }
        W.e eVar = (W.e) n10.a();
        z zVar = new z(a3);
        int a11 = eVar.a(null);
        Logger logger = C0411k.f9809g;
        if (a11 > 4096) {
            a11 = 4096;
        }
        C0411k c0411k = new C0411k(zVar, a11);
        eVar.b(c0411k);
        if (c0411k.f9814e > 0) {
            c0411k.T();
        }
        return Unit.INSTANCE;
    }
}
