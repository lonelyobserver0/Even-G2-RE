package jb;

import Ab.c;
import D5.C0051o;
import Ec.d;
import R4.h;
import Xa.A;
import a4.f;
import android.content.Context;
import android.util.Log;
import c5.n;
import c5.r;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import q4.k;
import q8.AbstractC1526a;

/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class RunnableC1100a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f15416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f15417c;

    public /* synthetic */ RunnableC1100a(Object obj, Map map, k kVar, int i3) {
        this.f15415a = i3;
        this.f15416b = map;
        this.f15417c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterError flutterError;
        switch (this.f15415a) {
            case 0:
                Map map = this.f15416b;
                k kVar = this.f15417c;
                try {
                    Object obj = map.get(StubApp.getString2("728"));
                    Objects.requireNonNull(obj);
                    final String str = (String) obj;
                    Object obj2 = map.get(StubApp.getString2("1061"));
                    Objects.requireNonNull(obj2);
                    final String str2 = (String) obj2;
                    final r rVar = Y4.b.a().f8743a;
                    final int i3 = 0;
                    rVar.f10939p.f13422a.a(new Runnable() { // from class: c5.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    String str3 = str;
                                    String str4 = str2;
                                    l lVar = rVar.f10932h;
                                    lVar.getClass();
                                    try {
                                        ((O0.l) lVar.f10896d.f14845d).j(str3, str4);
                                        return;
                                    } catch (IllegalArgumentException e10) {
                                        Context context = lVar.f10893a;
                                        if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                            throw e10;
                                        }
                                        Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
                                        return;
                                    }
                                default:
                                    rVar.f10932h.i(str, str2);
                                    return;
                            }
                        }
                    });
                    kVar.b(null);
                    break;
                } catch (Exception e10) {
                    kVar.a(e10);
                    return;
                }
            case 1:
                Map map2 = this.f15416b;
                k kVar2 = this.f15417c;
                try {
                    Object obj3 = map2.get(StubApp.getString2("1905"));
                    Objects.requireNonNull(obj3);
                    r rVar2 = Y4.b.a().f8743a;
                    rVar2.f10939p.f13422a.a(new n(rVar2, System.currentTimeMillis() - rVar2.f10928d, (String) obj3, 1));
                    kVar2.b(null);
                    break;
                } catch (Exception e11) {
                    kVar2.a(e11);
                    return;
                }
            case 2:
                Map map3 = this.f15416b;
                k kVar3 = this.f15417c;
                try {
                    Y4.b a3 = Y4.b.a();
                    Object obj4 = map3.get(StubApp.getString2("17678"));
                    Objects.requireNonNull(obj4);
                    final String str3 = (String) obj4;
                    String str4 = (String) map3.get(StubApp.getString2("532"));
                    Object obj5 = map3.get(StubApp.getString2("19074"));
                    Objects.requireNonNull(obj5);
                    String str5 = (String) obj5;
                    Object obj6 = map3.get(StubApp.getString2("9474"));
                    Objects.requireNonNull(obj6);
                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                    Object obj7 = map3.get(StubApp.getString2("13780"));
                    Objects.requireNonNull(obj7);
                    final String str6 = (String) obj7;
                    Object obj8 = map3.get(StubApp.getString2("19075"));
                    Objects.requireNonNull(obj8);
                    List<String> list = (List) obj8;
                    if (str6.length() > 0) {
                        final r rVar3 = Y4.b.a().f8743a;
                        final String string2 = StubApp.getString2("19076");
                        final int i10 = 1;
                        rVar3.f10939p.f13422a.a(new Runnable() { // from class: c5.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        String str32 = string2;
                                        String str42 = str6;
                                        l lVar = rVar3.f10932h;
                                        lVar.getClass();
                                        try {
                                            ((O0.l) lVar.f10896d.f14845d).j(str32, str42);
                                            return;
                                        } catch (IllegalArgumentException e102) {
                                            Context context = lVar.f10893a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e102;
                                            }
                                            Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
                                            return;
                                        }
                                    default:
                                        rVar3.f10932h.i(string2, str6);
                                        return;
                                }
                            }
                        });
                    }
                    int i11 = 0;
                    for (final String str7 : list) {
                        i11++;
                        Y4.b a9 = Y4.b.a();
                        final String str8 = StubApp.getString2("19077") + i11;
                        final r rVar4 = a9.f8743a;
                        final int i12 = 1;
                        rVar4.f10939p.f13422a.a(new Runnable() { // from class: c5.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        String str32 = str8;
                                        String str42 = str7;
                                        l lVar = rVar4.f10932h;
                                        lVar.getClass();
                                        try {
                                            ((O0.l) lVar.f10896d.f14845d).j(str32, str42);
                                            return;
                                        } catch (IllegalArgumentException e102) {
                                            Context context = lVar.f10893a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e102;
                                            }
                                            Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
                                            return;
                                        }
                                    default:
                                        rVar4.f10932h.i(str8, str7);
                                        return;
                                }
                            }
                        });
                    }
                    final r rVar5 = a3.f8743a;
                    if (str4 != null) {
                        final String string22 = StubApp.getString2("19078");
                        final String str9 = StubApp.getString2("19079") + str4;
                        final int i13 = 0;
                        rVar5.f10939p.f13422a.a(new Runnable() { // from class: c5.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        String str32 = string22;
                                        String str42 = str9;
                                        l lVar = rVar5.f10932h;
                                        lVar.getClass();
                                        try {
                                            ((O0.l) lVar.f10896d.f14845d).j(str32, str42);
                                            return;
                                        } catch (IllegalArgumentException e102) {
                                            Context context = lVar.f10893a;
                                            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                                throw e102;
                                            }
                                            Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
                                            return;
                                        }
                                    default:
                                        rVar5.f10932h.i(string22, str9);
                                        return;
                                }
                            }
                        });
                        flutterError = new FlutterError(str3 + StubApp.getString2("19080") + str4 + StubApp.getString2("1"));
                    } else {
                        flutterError = new FlutterError(str3);
                    }
                    final String string23 = StubApp.getString2("19081");
                    final int i14 = 0;
                    rVar5.f10939p.f13422a.a(new Runnable() { // from class: c5.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    String str32 = string23;
                                    String str42 = str3;
                                    l lVar = rVar5.f10932h;
                                    lVar.getClass();
                                    try {
                                        ((O0.l) lVar.f10896d.f14845d).j(str32, str42);
                                        return;
                                    } catch (IllegalArgumentException e102) {
                                        Context context = lVar.f10893a;
                                        if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                                            throw e102;
                                        }
                                        Log.e(StubApp.getString2(280), StubApp.getString2(9547), null);
                                        return;
                                    }
                                default:
                                    rVar5.f10932h.i(string23, str3);
                                    return;
                            }
                        }
                    });
                    ArrayList arrayList = new ArrayList();
                    Object obj9 = map3.get(StubApp.getString2("19082"));
                    Objects.requireNonNull(obj9);
                    Iterator it = ((List) obj9).iterator();
                    while (it.hasNext()) {
                        StackTraceElement b2 = b.b((Map) it.next());
                        if (b2 != null) {
                            arrayList.add(b2);
                        }
                    }
                    flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    if (!str5.isEmpty()) {
                        rVar5.f10939p.f13422a.a(new n(rVar5, System.currentTimeMillis() - rVar5.f10928d, str5, 1));
                    }
                    if (booleanValue) {
                        d.C(flutterError);
                    } else {
                        Map map4 = Collections.EMPTY_MAP;
                        rVar5.f10939p.f13422a.a(new c(rVar5, flutterError));
                    }
                    kVar3.b(null);
                    break;
                } catch (Exception e12) {
                    kVar3.a(e12);
                    return;
                }
            case 3:
                Map map5 = this.f15416b;
                k kVar4 = this.f15417c;
                try {
                    Object obj10 = map5.get(StubApp.getString2("4474"));
                    Objects.requireNonNull(obj10);
                    r rVar6 = Y4.b.a().f8743a;
                    rVar6.f10939p.f13422a.a(new Ab.b(28, rVar6, (String) obj10));
                    kVar4.b(null);
                    break;
                } catch (Exception e13) {
                    kVar4.a(e13);
                    return;
                }
            case 4:
                Map map6 = this.f15416b;
                k kVar5 = this.f15417c;
                try {
                    FirebaseMessaging c10 = FirebaseMessaging.c();
                    Object obj11 = map6.get(StubApp.getString2("1418"));
                    Objects.requireNonNull(obj11);
                    f.b(c10.f12065h.onSuccessTask(new C0051o((String) obj11, 1)));
                    kVar5.b(null);
                    break;
                } catch (Exception e14) {
                    kVar5.a(e14);
                    return;
                }
            case 5:
                Map map7 = this.f15416b;
                k kVar6 = this.f15417c;
                try {
                    FirebaseMessaging c11 = FirebaseMessaging.c();
                    Object obj12 = map7.get(StubApp.getString2("427"));
                    Objects.requireNonNull(obj12);
                    boolean booleanValue2 = ((Boolean) obj12).booleanValue();
                    c11.getClass();
                    h e15 = h.e();
                    e15.a();
                    e15.f6193a.getSharedPreferences(StubApp.getString2("1466"), 0).edit().putBoolean(StubApp.getString2("19073"), booleanValue2).apply();
                    d.E(c11.f12059b, c11.f12060c, c11.j());
                    kVar6.b(null);
                    break;
                } catch (Exception e16) {
                    kVar6.a(e16);
                    return;
                }
            case 6:
                Map map8 = this.f15416b;
                k kVar7 = this.f15417c;
                try {
                    FirebaseMessaging c12 = FirebaseMessaging.c();
                    Object obj13 = map8.get(StubApp.getString2("427"));
                    Objects.requireNonNull(obj13);
                    c12.i(((Boolean) obj13).booleanValue());
                    A a10 = new A();
                    a10.put(StubApp.getString2("19072"), Boolean.valueOf(c12.f12062e.b()));
                    kVar7.b(a10);
                    break;
                } catch (Exception e17) {
                    kVar7.a(e17);
                    return;
                }
            case 7:
                Map map9 = this.f15416b;
                k kVar8 = this.f15417c;
                try {
                    FirebaseMessaging c13 = FirebaseMessaging.c();
                    Object obj14 = map9.get(StubApp.getString2("1418"));
                    Objects.requireNonNull(obj14);
                    f.b(c13.f12065h.onSuccessTask(new C0051o((String) obj14, 0)));
                    kVar8.b(null);
                    break;
                } catch (Exception e18) {
                    kVar8.a(e18);
                    return;
                }
            default:
                Map map10 = this.f15416b;
                k kVar9 = this.f15417c;
                try {
                    FirebaseMessaging.c().h(AbstractC1526a.t(map10));
                    kVar9.b(null);
                    break;
                } catch (Exception e19) {
                    kVar9.a(e19);
                }
        }
    }

    public /* synthetic */ RunnableC1100a(Map map, k kVar, int i3) {
        this.f15415a = i3;
        this.f15416b = map;
        this.f15417c = kVar;
    }
}
