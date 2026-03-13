package ib;

import R3.ComponentCallbacks2C0235d;
import c5.B;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class g implements BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1069c f14999b;

    public /* synthetic */ g(C1069c c1069c, int i3) {
        this.f14998a = i3;
        this.f14999b = c1069c;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f14998a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                final String str = (String) arrayList2.get(0);
                final Boolean bool = (Boolean) arrayList2.get(1);
                h hVar = new h(arrayList, reply);
                this.f14999b.getClass();
                final q4.k kVar = new q4.k();
                final int i3 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: ib.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        q4.k kVar2 = kVar;
                        Boolean bool2 = bool;
                        String str2 = str;
                        switch (i3) {
                            case 0:
                                HashMap hashMap = C1069c.f14975c;
                                try {
                                    R4.h f10 = R4.h.f(str2);
                                    boolean booleanValue = bool2.booleanValue();
                                    f10.a();
                                    if (f10.f6197e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z2 = ComponentCallbacks2C0235d.f6114e.f6115a.get();
                                        if (booleanValue && z2) {
                                            f10.l(true);
                                        } else if (!booleanValue && z2) {
                                            f10.l(false);
                                        }
                                    }
                                    kVar2.b(null);
                                    break;
                                } catch (Exception e10) {
                                    kVar2.a(e10);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = C1069c.f14975c;
                                try {
                                    R4.h.f(str2).m(bool2);
                                    kVar2.b(null);
                                    break;
                                } catch (Exception e11) {
                                    kVar2.a(e11);
                                }
                        }
                    }
                });
                kVar.f20051a.addOnCompleteListener(new B(hVar, 17));
                break;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                final String str2 = (String) arrayList4.get(0);
                final Boolean bool2 = (Boolean) arrayList4.get(1);
                i iVar = new i(arrayList3, reply);
                this.f14999b.getClass();
                final q4.k kVar2 = new q4.k();
                final int i10 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: ib.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        q4.k kVar22 = kVar2;
                        Boolean bool22 = bool2;
                        String str22 = str2;
                        switch (i10) {
                            case 0:
                                HashMap hashMap = C1069c.f14975c;
                                try {
                                    R4.h f10 = R4.h.f(str22);
                                    boolean booleanValue = bool22.booleanValue();
                                    f10.a();
                                    if (f10.f6197e.compareAndSet(!booleanValue, booleanValue)) {
                                        boolean z2 = ComponentCallbacks2C0235d.f6114e.f6115a.get();
                                        if (booleanValue && z2) {
                                            f10.l(true);
                                        } else if (!booleanValue && z2) {
                                            f10.l(false);
                                        }
                                    }
                                    kVar22.b(null);
                                    break;
                                } catch (Exception e10) {
                                    kVar22.a(e10);
                                    return;
                                }
                            default:
                                HashMap hashMap2 = C1069c.f14975c;
                                try {
                                    R4.h.f(str22).m(bool22);
                                    kVar22.b(null);
                                    break;
                                } catch (Exception e11) {
                                    kVar22.a(e11);
                                }
                        }
                    }
                });
                kVar2.f20051a.addOnCompleteListener(new B(iVar, 17));
                break;
            case 2:
                ArrayList arrayList5 = new ArrayList();
                String str3 = (String) ((ArrayList) obj).get(0);
                j jVar = new j(arrayList5, reply);
                this.f14999b.getClass();
                q4.k kVar3 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new com.even.translate.a(12, str3, kVar3));
                kVar3.f20051a.addOnCompleteListener(new B(jVar, 17));
                break;
            case 3:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = (ArrayList) obj;
                String str4 = (String) arrayList7.get(0);
                e eVar = (e) arrayList7.get(1);
                l lVar = new l(arrayList6, reply);
                C1069c c1069c = this.f14999b;
                c1069c.getClass();
                q4.k kVar4 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new G3.a(5, c1069c, eVar, str4, kVar4));
                kVar4.f20051a.addOnCompleteListener(new B(lVar, 18));
                break;
            case 4:
                m mVar = new m(new ArrayList(), reply);
                final C1069c c1069c2 = this.f14999b;
                c1069c2.getClass();
                final q4.k kVar5 = new q4.k();
                final int i11 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: ib.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i11) {
                            case 0:
                                q4.k kVar6 = kVar5;
                                HashMap hashMap = C1069c.f14975c;
                                C1069c c1069c3 = c1069c2;
                                c1069c3.getClass();
                                try {
                                    R4.j a3 = R4.j.a(c1069c3.f14976a);
                                    if (a3 == null) {
                                        kVar6.a(new Exception(StubApp.getString2("18611")));
                                    } else {
                                        kVar6.b(C1069c.c(a3));
                                    }
                                    return;
                                } catch (Exception e10) {
                                    kVar6.a(e10);
                                    return;
                                }
                            default:
                                C1069c c1069c4 = c1069c2;
                                q4.k kVar7 = kVar5;
                                HashMap hashMap2 = C1069c.f14975c;
                                c1069c4.getClass();
                                try {
                                    if (c1069c4.f14977b) {
                                        a4.f.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        c1069c4.f14977b = true;
                                    }
                                    synchronized (R4.h.f6191k) {
                                        arrayList8 = new ArrayList(R4.h.f6192l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        R4.h hVar2 = (R4.h) it.next();
                                        q4.k kVar8 = new q4.k();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(c1069c4, hVar2, kVar8, 12));
                                        arrayList9.add((f) a4.f.b(kVar8.f20051a));
                                    }
                                    kVar7.b(arrayList9);
                                    return;
                                } catch (Exception e11) {
                                    kVar7.a(e11);
                                    return;
                                }
                        }
                    }
                });
                kVar5.f20051a.addOnCompleteListener(new B(mVar, 18));
                break;
            default:
                n nVar = new n(new ArrayList(), reply);
                final C1069c c1069c3 = this.f14999b;
                c1069c3.getClass();
                final q4.k kVar6 = new q4.k();
                final int i12 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: ib.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i12) {
                            case 0:
                                q4.k kVar62 = kVar6;
                                HashMap hashMap = C1069c.f14975c;
                                C1069c c1069c32 = c1069c3;
                                c1069c32.getClass();
                                try {
                                    R4.j a3 = R4.j.a(c1069c32.f14976a);
                                    if (a3 == null) {
                                        kVar62.a(new Exception(StubApp.getString2("18611")));
                                    } else {
                                        kVar62.b(C1069c.c(a3));
                                    }
                                    return;
                                } catch (Exception e10) {
                                    kVar62.a(e10);
                                    return;
                                }
                            default:
                                C1069c c1069c4 = c1069c3;
                                q4.k kVar7 = kVar6;
                                HashMap hashMap2 = C1069c.f14975c;
                                c1069c4.getClass();
                                try {
                                    if (c1069c4.f14977b) {
                                        a4.f.b(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        c1069c4.f14977b = true;
                                    }
                                    synchronized (R4.h.f6191k) {
                                        arrayList8 = new ArrayList(R4.h.f6192l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        R4.h hVar2 = (R4.h) it.next();
                                        q4.k kVar8 = new q4.k();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.c(c1069c4, hVar2, kVar8, 12));
                                        arrayList9.add((f) a4.f.b(kVar8.f20051a));
                                    }
                                    kVar7.b(arrayList9);
                                    return;
                                } catch (Exception e11) {
                                    kVar7.a(e11);
                                    return;
                                }
                        }
                    }
                });
                kVar6.f20051a.addOnCompleteListener(new B(nVar, 18));
                break;
        }
    }
}
