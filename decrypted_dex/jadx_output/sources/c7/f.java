package c7;

import D9.l;
import Qb.J;
import R3.n;
import Z9.q;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C0600c3;
import com.google.android.gms.internal.measurement.C0610e3;
import com.google.android.gms.internal.measurement.C0640k3;
import com.google.android.gms.internal.measurement.C0714z3;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.X3;
import com.google.android.gms.location.LocationAvailability;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Event;
import com.mapbox.common.EventPriority;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.common.ValueUtilsKt;
import com.stub.StubApp;
import e5.InterfaceC0845d;
import f4.F;
import f4.p;
import f4.r;
import i4.C1056t;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.AbstractC1148D;
import l4.InterfaceC1217w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements InterfaceC0845d, n, InterfaceC1217w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11034a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f f11013b = new f(3);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f f11014c = new f(4);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f f11015d = new f(5);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f f11016e = new f(9);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f f11017f = new f(10);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f f11018g = new f(11);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f f11019h = new f(12);
    public static final /* synthetic */ f j = new f(13);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f f11020k = new f(14);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ f f11021l = new f(15);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f f11022m = new f(16);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f f11023n = new f(17);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ f f11024p = new f(18);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ f f11025q = new f(19);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ f f11026r = new f(20);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f f11027s = new f(21);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ f f11028t = new f(22);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f f11029v = new f(23);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f f11030w = new f(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f f11031x = new f(25);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f f11032y = new f(26);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f f11033z = new f(27);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ f f11011A = new f(28);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ f f11012B = new f(29);

    public /* synthetic */ f(int i3) {
        this.f11034a = i3;
    }

    public static Object e(DataRef dataRef, String str, String str2, long j3, J7.g gVar) {
        l.f(StubApp.getString2(9620), StubApp.getString2(9621));
        return J.c(new com.mapbox.navigation.base.route.f(j3, dataRef, str, str2, null), gVar);
    }

    public static void f(String description) {
        q qVar;
        Pair pair;
        Intrinsics.checkNotNullParameter(description, "description");
        l.d(StubApp.getString2(9622) + description + ')', StubApp.getString2(9623));
        synchronized (F8.b.f2327a) {
            try {
                if (F8.b.f2328b == null) {
                    int ordinal = u8.k.f21475a.ordinal();
                    if (ordinal == 0) {
                        pair = TuplesKt.to(StubApp.getString2("2158"), StubApp.getString2("2159"));
                    } else {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = TuplesKt.to(StubApp.getString2("2156"), StubApp.getString2("2157"));
                    }
                    EventsServerOptions eventsServerOptions = new EventsServerOptions(new SdkInformation((String) pair.component1(), StubApp.getString2("2160"), (String) pair.component2()), null);
                    Intrinsics.checkNotNullParameter(eventsServerOptions, "eventsServerOptions");
                    EventsService orCreate = EventsService.getOrCreate(eventsServerOptions);
                    Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(eventsServerOptions)");
                    F8.b.f2328b = new q(orCreate);
                }
                qVar = F8.b.f2328b;
                if (qVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
                    qVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String string2 = StubApp.getString2(9624);
        F8.a event = new F8.a(description);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        if (!TelemetryUtils.getEventsCollectionState()) {
            if (l.a(l.g(), LoggingLevel.DEBUG)) {
                l.d(StubApp.getString2(9625), StubApp.getString2(2181));
                return;
            }
            return;
        }
        EventPriority eventPriority = EventPriority.IMMEDIATE;
        HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to(StubApp.getString2(660), ValueUtilsKt.toValue(string2)), TuplesKt.to(StubApp.getString2(1055), ValueUtilsKt.toValue(description)), TuplesKt.to(StubApp.getString2(2178), ValueUtilsKt.toValue(StubApp.getString2(9626))), TuplesKt.to(StubApp.getString2(9627), ValueUtilsKt.toValue(event.f2325a)));
        hashMapOf.putAll(F8.a.f2324c);
        Value valueOf = Value.valueOf((HashMap<String, Value>) hashMapOf);
        Intrinsics.checkNotNullExpressionValue(valueOf, "hashMapOf(\n            \"…e.valueOf(this)\n        }");
        ((EventsService) qVar.f9143b).sendEvent(new Event(eventPriority, valueOf, null), new F8.c(event, 0));
    }

    @Override // l4.InterfaceC1217w
    public Object a() {
        switch (this.f11034a) {
            case 9:
                return new Boolean(((Boolean) C0640k3.f11601a.b()).booleanValue());
            case 10:
                return new Boolean(((Boolean) C0714z3.f11773a.b()).booleanValue());
            case 11:
                List list = AbstractC1148D.f15973a;
                P3.f11347b.get();
                Boolean bool = (Boolean) R3.f11355c.b();
                bool.getClass();
                return bool;
            case 12:
                List list2 = AbstractC1148D.f15973a;
                Boolean bool2 = (Boolean) X3.f11413a.b();
                bool2.getClass();
                return bool2;
            case 13:
                List list3 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11530l0.b()).longValue());
            case 14:
                List list4 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11540q0.b()).longValue());
            case 15:
                List list5 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return (String) C0610e3.f11533n.b();
            case 16:
                List list6 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l9 = (Long) C0610e3.f11502T.b();
                l9.getClass();
                return l9;
            case 17:
                List list7 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l10 = (Long) C0610e3.f11492J.b();
                l10.getClass();
                return l10;
            case 18:
                List list8 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11498P.b()).longValue());
            case 19:
                List list9 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l11 = (Long) C0610e3.f11500R.b();
                l11.getClass();
                return l11;
            case 20:
                List list10 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l12 = (Long) C0610e3.f11519f.b();
                l12.getClass();
                return l12;
            case 21:
                List list11 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l13 = (Long) C0610e3.h0.b();
                l13.getClass();
                return l13;
            case 22:
                List list12 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l14 = (Long) C0610e3.f11555z.b();
                l14.getClass();
                return l14;
            case 23:
                List list13 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l15 = (Long) C0610e3.f11488F.b();
                l15.getClass();
                return l15;
            case 24:
                List list14 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l16 = (Long) C0610e3.f11546t0.b();
                l16.getClass();
                return l16;
            case 25:
                List list15 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l17 = (Long) C0610e3.f11531m.b();
                l17.getClass();
                return l17;
            case 26:
                List list16 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                Long l18 = (Long) C0610e3.f11489G.b();
                l18.getClass();
                return l18;
            case 27:
                List list17 = AbstractC1148D.f15973a;
                M3.f11312b.get();
                return (String) O3.f11331f.b();
            case 28:
                List list18 = AbstractC1148D.f15973a;
                M3.f11312b.get();
                Long l19 = (Long) O3.f11327b.b();
                l19.getClass();
                return l19;
            default:
                List list19 = AbstractC1148D.f15973a;
                C0600c3.f11467b.get();
                return Integer.valueOf((int) ((Long) C0610e3.f11543s.b()).longValue());
        }
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.d dVar = null;
        int i3 = 0;
        q4.k kVar = (q4.k) obj2;
        p pVar = (p) obj;
        switch (this.f11034a) {
            case 3:
                C1056t c1056t = new C1056t(false, null);
                com.google.android.gms.common.d[] k3 = pVar.k();
                if (k3 != null) {
                    while (true) {
                        if (i3 < k3.length) {
                            com.google.android.gms.common.d dVar2 = k3[i3];
                            if (StubApp.getString2(6601).equals(dVar2.f11182a)) {
                                dVar = dVar2;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (dVar != null && dVar.d() >= 1) {
                        F f10 = (F) pVar.t();
                        r rVar = new r(5, null, new f4.j(2, kVar), null, null);
                        Parcel g10 = f10.g();
                        f4.g.b(g10, c1056t);
                        f4.g.b(g10, rVar);
                        f10.L(g10, 91);
                        break;
                    }
                }
                F f11 = (F) pVar.t();
                String packageName = pVar.f6493c.getPackageName();
                Parcel g11 = f11.g();
                g11.writeString(packageName);
                Parcel K10 = f11.K(g11, 34);
                LocationAvailability locationAvailability = (LocationAvailability) f4.g.a(K10, LocationAvailability.CREATOR);
                K10.recycle();
                kVar.b(locationAvailability);
                break;
            default:
                com.google.android.gms.common.d[] k4 = pVar.k();
                if (k4 != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < k4.length) {
                            com.google.android.gms.common.d dVar3 = k4[i10];
                            if (StubApp.getString2(9430).equals(dVar3.f11182a)) {
                                dVar = dVar3;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (dVar != null && dVar.d() >= 1) {
                        F f12 = (F) pVar.t();
                        f4.l lVar = new f4.l(Boolean.TRUE, kVar);
                        Parcel g12 = f12.g();
                        int i11 = f4.g.f13749a;
                        g12.writeInt(0);
                        g12.writeStrongBinder(lVar);
                        f12.L(g12, 84);
                        break;
                    }
                }
                F f13 = (F) pVar.t();
                Parcel g13 = f13.g();
                int i12 = f4.g.f13749a;
                g13.writeInt(0);
                f13.L(g13, 12);
                kVar.b(Boolean.TRUE);
                break;
        }
    }

    @Override // e5.InterfaceC0845d
    public void b() {
    }

    @Override // e5.InterfaceC0845d
    public String c() {
        return null;
    }

    @Override // e5.InterfaceC0845d
    public void d(long j3, String str) {
    }
}
