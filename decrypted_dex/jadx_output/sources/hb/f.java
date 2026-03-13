package hb;

import R8.C0250h;
import Xa.A;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import c5.l;
import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.concurrent.Executors;
import q4.k;
import q4.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f14487b;

    public /* synthetic */ f(int i3, k kVar) {
        this.f14486a = i3;
        this.f14487b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar;
        s sVar2;
        switch (this.f14486a) {
            case 0:
                k kVar = this.f14487b;
                try {
                    kVar.b(new HashMap());
                    break;
                } catch (Exception e10) {
                    kVar.a(e10);
                    return;
                }
            case 1:
                k kVar2 = this.f14487b;
                try {
                    kVar2.b(null);
                    break;
                } catch (Exception e11) {
                    kVar2.a(e11);
                    return;
                }
            case 2:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f14487b);
                break;
            case 3:
                k kVar3 = this.f14487b;
                try {
                    kVar3.b(null);
                    break;
                } catch (Exception e12) {
                    kVar3.a(e12);
                    return;
                }
            case 4:
                k kVar4 = this.f14487b;
                try {
                    l lVar = Y4.b.a().f8743a.f10932h;
                    if (lVar.f10910s.compareAndSet(false, true)) {
                        sVar = lVar.f10907p.f20051a;
                    } else {
                        Log.w(StubApp.getString2("280"), StubApp.getString2("18327"), null);
                        sVar = a4.f.m(Boolean.FALSE);
                    }
                    Boolean bool = (Boolean) a4.f.b(sVar);
                    bool.booleanValue();
                    A a3 = new A();
                    a3.put(StubApp.getString2("18328"), bool);
                    kVar4.b(a3);
                    break;
                } catch (Exception e13) {
                    kVar4.a(e13);
                    return;
                }
            case 5:
                k kVar5 = this.f14487b;
                try {
                    l lVar2 = Y4.b.a().f8743a.f10932h;
                    lVar2.f10908q.d(Boolean.FALSE);
                    s sVar3 = lVar2.f10909r.f20051a;
                    kVar5.b(null);
                    break;
                } catch (Exception e14) {
                    kVar5.a(e14);
                    return;
                }
            case 6:
                k kVar6 = this.f14487b;
                try {
                    l lVar3 = Y4.b.a().f8743a.f10932h;
                    lVar3.f10908q.d(Boolean.TRUE);
                    s sVar4 = lVar3.f10909r.f20051a;
                    kVar6.b(null);
                    break;
                } catch (Exception e15) {
                    kVar6.a(e15);
                    return;
                }
            case 7:
                k kVar7 = this.f14487b;
                try {
                    boolean z2 = Y4.b.a().f8743a.f10931g;
                    A a9 = new A();
                    a9.put(StubApp.getString2("18326"), Boolean.valueOf(z2));
                    kVar7.b(a9);
                    break;
                } catch (Exception e16) {
                    kVar7.a(e16);
                    return;
                }
            case 8:
                this.f14487b.b(null);
                break;
            case 9:
                k kVar8 = this.f14487b;
                try {
                    final FirebaseMessaging c10 = FirebaseMessaging.c();
                    c10.getClass();
                    final k kVar9 = new k();
                    final int i3 = 0;
                    c10.f12063f.execute(new Runnable() { // from class: D5.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    q4.k kVar10 = kVar9;
                                    F5.c cVar = FirebaseMessaging.f12055l;
                                    try {
                                        kVar10.b(c10.a());
                                        return;
                                    } catch (Exception e17) {
                                        kVar10.a(e17);
                                        return;
                                    }
                                default:
                                    FirebaseMessaging firebaseMessaging = c10;
                                    q4.k kVar11 = kVar9;
                                    F5.c cVar2 = FirebaseMessaging.f12055l;
                                    try {
                                        C0250h c0250h = firebaseMessaging.f12060c;
                                        c0250h.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putString(StubApp.getString2("1378"), StubApp.getString2("878"));
                                        a4.f.b(c0250h.d(c0250h.k(u.b((R4.h) c0250h.f6296a), StubApp.getString2("602"), bundle)));
                                        F5.c d8 = FirebaseMessaging.d(firebaseMessaging.f12059b);
                                        String e18 = firebaseMessaging.e();
                                        String b2 = u.b(firebaseMessaging.f12058a);
                                        synchronized (d8) {
                                            String j = F5.c.j(e18, b2);
                                            SharedPreferences.Editor edit = ((SharedPreferences) d8.f2238b).edit();
                                            edit.remove(j);
                                            edit.commit();
                                        }
                                        kVar11.b(null);
                                        return;
                                    } catch (Exception e19) {
                                        kVar11.a(e19);
                                        return;
                                    }
                            }
                        }
                    });
                    String str = (String) a4.f.b(kVar9.f20051a);
                    A a10 = new A();
                    a10.put(StubApp.getString2("1071"), str);
                    kVar8.b(a10);
                    break;
                } catch (Exception e17) {
                    kVar8.a(e17);
                    return;
                }
            default:
                k kVar10 = this.f14487b;
                try {
                    final FirebaseMessaging c11 = FirebaseMessaging.c();
                    if (c11.f() == null) {
                        sVar2 = a4.f.m(null);
                    } else {
                        final k kVar11 = new k();
                        final int i10 = 1;
                        Executors.newSingleThreadExecutor(new X3.a(StubApp.getString2("12592"))).execute(new Runnable() { // from class: D5.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        q4.k kVar102 = kVar11;
                                        F5.c cVar = FirebaseMessaging.f12055l;
                                        try {
                                            kVar102.b(c11.a());
                                            return;
                                        } catch (Exception e172) {
                                            kVar102.a(e172);
                                            return;
                                        }
                                    default:
                                        FirebaseMessaging firebaseMessaging = c11;
                                        q4.k kVar112 = kVar11;
                                        F5.c cVar2 = FirebaseMessaging.f12055l;
                                        try {
                                            C0250h c0250h = firebaseMessaging.f12060c;
                                            c0250h.getClass();
                                            Bundle bundle = new Bundle();
                                            bundle.putString(StubApp.getString2("1378"), StubApp.getString2("878"));
                                            a4.f.b(c0250h.d(c0250h.k(u.b((R4.h) c0250h.f6296a), StubApp.getString2("602"), bundle)));
                                            F5.c d8 = FirebaseMessaging.d(firebaseMessaging.f12059b);
                                            String e18 = firebaseMessaging.e();
                                            String b2 = u.b(firebaseMessaging.f12058a);
                                            synchronized (d8) {
                                                String j = F5.c.j(e18, b2);
                                                SharedPreferences.Editor edit = ((SharedPreferences) d8.f2238b).edit();
                                                edit.remove(j);
                                                edit.commit();
                                            }
                                            kVar112.b(null);
                                            return;
                                        } catch (Exception e19) {
                                            kVar112.a(e19);
                                            return;
                                        }
                                }
                            }
                        });
                        sVar2 = kVar11.f20051a;
                    }
                    a4.f.b(sVar2);
                    kVar10.b(null);
                    break;
                } catch (Exception e18) {
                    kVar10.a(e18);
                }
        }
    }

    public /* synthetic */ f(Object obj, k kVar, int i3) {
        this.f14486a = i3;
        this.f14487b = kVar;
    }
}
