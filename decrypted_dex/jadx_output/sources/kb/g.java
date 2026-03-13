package kb;

import C.AbstractC0025b;
import C.J;
import Xa.AbstractActivityC0364d;
import a0.C0379a;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.z;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jb.RunnableC1100a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import q4.s;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class g implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, InterfaceC0825b, eb.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15533a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f15534b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0364d f15535c;

    /* renamed from: d, reason: collision with root package name */
    public final z f15536d;

    /* renamed from: e, reason: collision with root package name */
    public f f15537e;

    /* renamed from: f, reason: collision with root package name */
    public final z f15538f;

    /* renamed from: g, reason: collision with root package name */
    public f f15539g;

    /* renamed from: h, reason: collision with root package name */
    public D5.z f15540h;
    public Map j;

    /* renamed from: k, reason: collision with root package name */
    public h f15541k;

    public g() {
        if (z.f9940l == null) {
            z.f9940l = new z();
        }
        this.f15536d = z.f9940l;
        if (z.f9941m == null) {
            z.f9941m = new z();
        }
        this.f15538f = z.f9941m;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final q4.j didReinitializeFirebaseCore() {
        q4.k kVar = new q4.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new hb.f(8, kVar));
        return kVar.f20051a;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final q4.j getPluginConstantsForFirebaseApp(R4.h hVar) {
        q4.k kVar = new q4.k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new ib.d(hVar, kVar, 1));
        return kVar.f20051a;
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        Ya.d dVar = (Ya.d) bVar;
        dVar.f8886e.add(this);
        dVar.b(this.f15541k);
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        this.f15535c = abstractActivityC0364d;
        if (abstractActivityC0364d.getIntent() == null || this.f15535c.getIntent().getExtras() == null || (this.f15535c.getIntent().getFlags() & PKIFailureInfo.badCertTemplate) == 1048576) {
            return;
        }
        onNewIntent(this.f15535c.getIntent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kb.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.A, kb.f] */
    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        Context context = c0824a.f13553a;
        Log.d(StubApp.getString2(18880), StubApp.getString2(18881));
        hc.b.f14499b = context;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        String string2 = StubApp.getString2(19173);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, string2);
        this.f15534b = methodChannel;
        methodChannel.setMethodCallHandler(this);
        h hVar = new h();
        hVar.f15543b = false;
        this.f15541k = hVar;
        final int i3 = 0;
        ?? r42 = new A(this) { // from class: kb.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f15532b;

            {
                this.f15532b = this;
            }

            @Override // androidx.lifecycle.A
            public final void c(Object obj) {
                switch (i3) {
                    case 0:
                        g gVar = this.f15532b;
                        gVar.getClass();
                        gVar.f15534b.invokeMethod(StubApp.getString2(19172), AbstractC1526a.H((D5.z) obj));
                        break;
                    default:
                        this.f15532b.f15534b.invokeMethod(StubApp.getString2(19171), (String) obj);
                        break;
                }
            }
        };
        this.f15537e = r42;
        final int i10 = 1;
        this.f15539g = new A(this) { // from class: kb.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f15532b;

            {
                this.f15532b = this;
            }

            @Override // androidx.lifecycle.A
            public final void c(Object obj) {
                switch (i10) {
                    case 0:
                        g gVar = this.f15532b;
                        gVar.getClass();
                        gVar.f15534b.invokeMethod(StubApp.getString2(19172), AbstractC1526a.H((D5.z) obj));
                        break;
                    default:
                        this.f15532b.f15534b.invokeMethod(StubApp.getString2(19171), (String) obj);
                        break;
                }
            }
        };
        this.f15536d.c(r42);
        this.f15538f.c(this.f15539g);
        FlutterFirebasePluginRegistry.registerPlugin(string2, this);
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        this.f15535c = null;
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f15535c = null;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f15538f.e(this.f15539g);
        this.f15536d.e(this.f15537e);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        s sVar;
        long intValue;
        long intValue2;
        final int i3 = 1;
        final int i10 = 2;
        final int i11 = 0;
        String str = methodCall.method;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals(StubApp.getString2(19184))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals(StubApp.getString2(19183))) {
                    c10 = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals(StubApp.getString2(19182))) {
                    c10 = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals(StubApp.getString2(19181))) {
                    c10 = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals(StubApp.getString2(19180))) {
                    c10 = 4;
                    break;
                }
                break;
            case 607887267:
                if (str.equals(StubApp.getString2(19179))) {
                    c10 = 5;
                    break;
                }
                break;
            case 928431066:
                if (str.equals(StubApp.getString2(19178))) {
                    c10 = 6;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals(StubApp.getString2(19177))) {
                    c10 = 7;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals(StubApp.getString2(19176))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1243856389:
                if (str.equals(StubApp.getString2(19175))) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1459336962:
                if (str.equals(StubApp.getString2(19174))) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                final q4.k kVar = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: kb.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f15527b;

                    {
                        this.f15527b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v14 */
                    /* JADX WARN: Type inference failed for: r1v15 */
                    /* JADX WARN: Type inference failed for: r1v16 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map;
                        switch (i11) {
                            case 0:
                                q4.k kVar2 = kVar;
                                g gVar = this.f15527b;
                                try {
                                    D5.z zVar = gVar.f15540h;
                                    if (zVar != null) {
                                        HashMap H2 = AbstractC1526a.H(zVar);
                                        Map map2 = gVar.j;
                                        if (map2 != null) {
                                            H2.put("notification", map2);
                                        }
                                        kVar2.b(H2);
                                        gVar.f15540h = null;
                                        gVar.j = null;
                                        break;
                                    } else {
                                        AbstractActivityC0364d abstractActivityC0364d = gVar.f15535c;
                                        if (abstractActivityC0364d == null) {
                                            kVar2.b(null);
                                            break;
                                        } else {
                                            Intent intent = abstractActivityC0364d.getIntent();
                                            if (intent != null && intent.getExtras() != null) {
                                                String string = intent.getExtras().getString(StubApp.getString2("1178"));
                                                if (string == null) {
                                                    string = intent.getExtras().getString(StubApp.getString2("1179"));
                                                }
                                                if (string != null) {
                                                    HashMap hashMap = gVar.f15533a;
                                                    if (hashMap.get(string) == null) {
                                                        D5.z zVar2 = (D5.z) FlutterFirebaseMessagingReceiver.f15086a.get(string);
                                                        if (zVar2 == null) {
                                                            HashMap j = C0379a.n().j(string);
                                                            if (j != null) {
                                                                zVar2 = AbstractC1526a.t(j);
                                                                if (j.get("notification") != null) {
                                                                    map = (Map) j.get("notification");
                                                                    C0379a.n().x(string);
                                                                }
                                                            }
                                                            map = null;
                                                            C0379a.n().x(string);
                                                        } else {
                                                            map = null;
                                                        }
                                                        if (zVar2 != null) {
                                                            hashMap.put(string, Boolean.TRUE);
                                                            HashMap H10 = AbstractC1526a.H(zVar2);
                                                            if (zVar2.g() == null && map != null) {
                                                                H10.put("notification", map);
                                                            }
                                                            kVar2.b(H10);
                                                            break;
                                                        } else {
                                                            kVar2.b(null);
                                                            break;
                                                        }
                                                    }
                                                }
                                                kVar2.b(null);
                                                break;
                                            }
                                            kVar2.b(null);
                                        }
                                    }
                                } catch (Exception e10) {
                                    kVar2.a(e10);
                                    return;
                                }
                                break;
                            case 1:
                                String string2 = StubApp.getString2(783);
                                q4.k kVar3 = kVar;
                                g gVar2 = this.f15527b;
                                HashMap hashMap2 = new HashMap();
                                try {
                                    if (hc.b.f14499b.checkSelfPermission(string2) == 0) {
                                        hashMap2.put(StubApp.getString2("19162"), 1);
                                        kVar3.b(hashMap2);
                                    } else {
                                        h hVar = gVar2.f15541k;
                                        AbstractActivityC0364d abstractActivityC0364d2 = gVar2.f15535c;
                                        e eVar = new e(hashMap2, kVar3);
                                        if (hVar.f15543b) {
                                            kVar3.a(new Exception(StubApp.getString2("19163")));
                                        } else if (abstractActivityC0364d2 == null) {
                                            kVar3.a(new Exception(StubApp.getString2("1794")));
                                        } else {
                                            hVar.f15542a = eVar;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(string2);
                                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                            if (!hVar.f15543b) {
                                                AbstractC0025b.d(abstractActivityC0364d2, strArr, 240);
                                                hVar.f15543b = true;
                                            }
                                        }
                                    }
                                    break;
                                } catch (Exception e11) {
                                    kVar3.a(e11);
                                    return;
                                }
                            default:
                                q4.k kVar4 = kVar;
                                g gVar3 = this.f15527b;
                                gVar3.getClass();
                                try {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(StubApp.getString2("19162"), Integer.valueOf((int) (Build.VERSION.SDK_INT >= 33 ? hc.b.f14499b.checkSelfPermission(StubApp.getString2("783")) == 0 ? 1 : 0 : new J(gVar3.f15535c).f810b.areNotificationsEnabled())));
                                    kVar4.b(hashMap3);
                                    break;
                                } catch (Exception e12) {
                                    kVar4.a(e12);
                                }
                        }
                    }
                });
                sVar = kVar.f20051a;
                break;
            case 1:
                Map map = (Map) methodCall.arguments();
                q4.k kVar2 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(this, map, kVar2, 6));
                sVar = kVar2.f20051a;
                break;
            case 2:
                q4.k kVar3 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new hb.f(10, kVar3));
                sVar = kVar3.f20051a;
                break;
            case 3:
                Map map2 = (Map) methodCall.arguments();
                q4.k kVar4 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map2, kVar4, 4));
                sVar = kVar4.f20051a;
                break;
            case 4:
                Map map3 = (Map) methodCall.arguments();
                q4.k kVar5 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map3, kVar5, 7));
                sVar = kVar5.f20051a;
                break;
            case 5:
                Map map4 = (Map) methodCall.arguments();
                q4.k kVar6 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map4, kVar6, 5));
                sVar = kVar6.f20051a;
                break;
            case 6:
                Map map5 = (Map) methodCall.arguments;
                Object obj = map5.get(StubApp.getString2(19185));
                Object obj2 = map5.get(StubApp.getString2(19157));
                if (obj instanceof Long) {
                    intValue = ((Long) obj).longValue();
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException(StubApp.getString2(19189));
                    }
                    intValue = ((Integer) obj).intValue();
                }
                if (obj2 instanceof Long) {
                    intValue2 = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException(StubApp.getString2(19188));
                    }
                    intValue2 = ((Integer) obj2).intValue();
                }
                AbstractActivityC0364d abstractActivityC0364d = this.f15535c;
                A0.c h2 = abstractActivityC0364d != null ? A0.c.h(abstractActivityC0364d.getIntent()) : null;
                List list = FlutterFirebaseMessagingBackgroundService.f15085h;
                Context context = hc.b.f14499b;
                String string2 = StubApp.getString2(18365);
                if (context == null) {
                    Log.e(StubApp.getString2(7449), StubApp.getString2(19186));
                } else {
                    context.getSharedPreferences(string2, 0).edit().putLong(StubApp.getString2(9834), intValue).apply();
                }
                hc.b.f14499b.getSharedPreferences(string2, 0).edit().putLong(StubApp.getString2(19156), intValue2).apply();
                if (FlutterFirebaseMessagingBackgroundService.j != null) {
                    Log.w(StubApp.getString2(18366), StubApp.getString2(19187));
                } else {
                    c cVar = new c();
                    FlutterFirebaseMessagingBackgroundService.j = cVar;
                    cVar.b(intValue, h2);
                }
                sVar = a4.f.m(null);
                break;
            case 7:
                Map map6 = (Map) methodCall.arguments();
                q4.k kVar7 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1100a(map6, kVar7, 8));
                sVar = kVar7.f20051a;
                break;
            case '\b':
                if (Build.VERSION.SDK_INT < 33) {
                    final q4.k kVar8 = new q4.k();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: kb.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f15527b;

                        {
                            this.f15527b = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
                        /* JADX WARN: Type inference failed for: r1v14 */
                        /* JADX WARN: Type inference failed for: r1v15 */
                        /* JADX WARN: Type inference failed for: r1v16 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map map7;
                            switch (i10) {
                                case 0:
                                    q4.k kVar22 = kVar8;
                                    g gVar = this.f15527b;
                                    try {
                                        D5.z zVar = gVar.f15540h;
                                        if (zVar != null) {
                                            HashMap H2 = AbstractC1526a.H(zVar);
                                            Map map22 = gVar.j;
                                            if (map22 != null) {
                                                H2.put("notification", map22);
                                            }
                                            kVar22.b(H2);
                                            gVar.f15540h = null;
                                            gVar.j = null;
                                            break;
                                        } else {
                                            AbstractActivityC0364d abstractActivityC0364d2 = gVar.f15535c;
                                            if (abstractActivityC0364d2 == null) {
                                                kVar22.b(null);
                                                break;
                                            } else {
                                                Intent intent = abstractActivityC0364d2.getIntent();
                                                if (intent != null && intent.getExtras() != null) {
                                                    String string = intent.getExtras().getString(StubApp.getString2("1178"));
                                                    if (string == null) {
                                                        string = intent.getExtras().getString(StubApp.getString2("1179"));
                                                    }
                                                    if (string != null) {
                                                        HashMap hashMap = gVar.f15533a;
                                                        if (hashMap.get(string) == null) {
                                                            D5.z zVar2 = (D5.z) FlutterFirebaseMessagingReceiver.f15086a.get(string);
                                                            if (zVar2 == null) {
                                                                HashMap j = C0379a.n().j(string);
                                                                if (j != null) {
                                                                    zVar2 = AbstractC1526a.t(j);
                                                                    if (j.get("notification") != null) {
                                                                        map7 = (Map) j.get("notification");
                                                                        C0379a.n().x(string);
                                                                    }
                                                                }
                                                                map7 = null;
                                                                C0379a.n().x(string);
                                                            } else {
                                                                map7 = null;
                                                            }
                                                            if (zVar2 != null) {
                                                                hashMap.put(string, Boolean.TRUE);
                                                                HashMap H10 = AbstractC1526a.H(zVar2);
                                                                if (zVar2.g() == null && map7 != null) {
                                                                    H10.put("notification", map7);
                                                                }
                                                                kVar22.b(H10);
                                                                break;
                                                            } else {
                                                                kVar22.b(null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    kVar22.b(null);
                                                    break;
                                                }
                                                kVar22.b(null);
                                            }
                                        }
                                    } catch (Exception e10) {
                                        kVar22.a(e10);
                                        return;
                                    }
                                    break;
                                case 1:
                                    String string22 = StubApp.getString2(783);
                                    q4.k kVar32 = kVar8;
                                    g gVar2 = this.f15527b;
                                    HashMap hashMap2 = new HashMap();
                                    try {
                                        if (hc.b.f14499b.checkSelfPermission(string22) == 0) {
                                            hashMap2.put(StubApp.getString2("19162"), 1);
                                            kVar32.b(hashMap2);
                                        } else {
                                            h hVar = gVar2.f15541k;
                                            AbstractActivityC0364d abstractActivityC0364d22 = gVar2.f15535c;
                                            e eVar = new e(hashMap2, kVar32);
                                            if (hVar.f15543b) {
                                                kVar32.a(new Exception(StubApp.getString2("19163")));
                                            } else if (abstractActivityC0364d22 == null) {
                                                kVar32.a(new Exception(StubApp.getString2("1794")));
                                            } else {
                                                hVar.f15542a = eVar;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(string22);
                                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                                if (!hVar.f15543b) {
                                                    AbstractC0025b.d(abstractActivityC0364d22, strArr, 240);
                                                    hVar.f15543b = true;
                                                }
                                            }
                                        }
                                        break;
                                    } catch (Exception e11) {
                                        kVar32.a(e11);
                                        return;
                                    }
                                default:
                                    q4.k kVar42 = kVar8;
                                    g gVar3 = this.f15527b;
                                    gVar3.getClass();
                                    try {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put(StubApp.getString2("19162"), Integer.valueOf((int) (Build.VERSION.SDK_INT >= 33 ? hc.b.f14499b.checkSelfPermission(StubApp.getString2("783")) == 0 ? 1 : 0 : new J(gVar3.f15535c).f810b.areNotificationsEnabled())));
                                        kVar42.b(hashMap3);
                                        break;
                                    } catch (Exception e12) {
                                        kVar42.a(e12);
                                    }
                            }
                        }
                    });
                    sVar = kVar8.f20051a;
                    break;
                } else {
                    final q4.k kVar9 = new q4.k();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: kb.d

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ g f15527b;

                        {
                            this.f15527b = this;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v10, types: [int] */
                        /* JADX WARN: Type inference failed for: r1v14 */
                        /* JADX WARN: Type inference failed for: r1v15 */
                        /* JADX WARN: Type inference failed for: r1v16 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map map7;
                            switch (i3) {
                                case 0:
                                    q4.k kVar22 = kVar9;
                                    g gVar = this.f15527b;
                                    try {
                                        D5.z zVar = gVar.f15540h;
                                        if (zVar != null) {
                                            HashMap H2 = AbstractC1526a.H(zVar);
                                            Map map22 = gVar.j;
                                            if (map22 != null) {
                                                H2.put("notification", map22);
                                            }
                                            kVar22.b(H2);
                                            gVar.f15540h = null;
                                            gVar.j = null;
                                            break;
                                        } else {
                                            AbstractActivityC0364d abstractActivityC0364d2 = gVar.f15535c;
                                            if (abstractActivityC0364d2 == null) {
                                                kVar22.b(null);
                                                break;
                                            } else {
                                                Intent intent = abstractActivityC0364d2.getIntent();
                                                if (intent != null && intent.getExtras() != null) {
                                                    String string = intent.getExtras().getString(StubApp.getString2("1178"));
                                                    if (string == null) {
                                                        string = intent.getExtras().getString(StubApp.getString2("1179"));
                                                    }
                                                    if (string != null) {
                                                        HashMap hashMap = gVar.f15533a;
                                                        if (hashMap.get(string) == null) {
                                                            D5.z zVar2 = (D5.z) FlutterFirebaseMessagingReceiver.f15086a.get(string);
                                                            if (zVar2 == null) {
                                                                HashMap j = C0379a.n().j(string);
                                                                if (j != null) {
                                                                    zVar2 = AbstractC1526a.t(j);
                                                                    if (j.get("notification") != null) {
                                                                        map7 = (Map) j.get("notification");
                                                                        C0379a.n().x(string);
                                                                    }
                                                                }
                                                                map7 = null;
                                                                C0379a.n().x(string);
                                                            } else {
                                                                map7 = null;
                                                            }
                                                            if (zVar2 != null) {
                                                                hashMap.put(string, Boolean.TRUE);
                                                                HashMap H10 = AbstractC1526a.H(zVar2);
                                                                if (zVar2.g() == null && map7 != null) {
                                                                    H10.put("notification", map7);
                                                                }
                                                                kVar22.b(H10);
                                                                break;
                                                            } else {
                                                                kVar22.b(null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    kVar22.b(null);
                                                    break;
                                                }
                                                kVar22.b(null);
                                            }
                                        }
                                    } catch (Exception e10) {
                                        kVar22.a(e10);
                                        return;
                                    }
                                    break;
                                case 1:
                                    String string22 = StubApp.getString2(783);
                                    q4.k kVar32 = kVar9;
                                    g gVar2 = this.f15527b;
                                    HashMap hashMap2 = new HashMap();
                                    try {
                                        if (hc.b.f14499b.checkSelfPermission(string22) == 0) {
                                            hashMap2.put(StubApp.getString2("19162"), 1);
                                            kVar32.b(hashMap2);
                                        } else {
                                            h hVar = gVar2.f15541k;
                                            AbstractActivityC0364d abstractActivityC0364d22 = gVar2.f15535c;
                                            e eVar = new e(hashMap2, kVar32);
                                            if (hVar.f15543b) {
                                                kVar32.a(new Exception(StubApp.getString2("19163")));
                                            } else if (abstractActivityC0364d22 == null) {
                                                kVar32.a(new Exception(StubApp.getString2("1794")));
                                            } else {
                                                hVar.f15542a = eVar;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(string22);
                                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                                if (!hVar.f15543b) {
                                                    AbstractC0025b.d(abstractActivityC0364d22, strArr, 240);
                                                    hVar.f15543b = true;
                                                }
                                            }
                                        }
                                        break;
                                    } catch (Exception e11) {
                                        kVar32.a(e11);
                                        return;
                                    }
                                default:
                                    q4.k kVar42 = kVar9;
                                    g gVar3 = this.f15527b;
                                    gVar3.getClass();
                                    try {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put(StubApp.getString2("19162"), Integer.valueOf((int) (Build.VERSION.SDK_INT >= 33 ? hc.b.f14499b.checkSelfPermission(StubApp.getString2("783")) == 0 ? 1 : 0 : new J(gVar3.f15535c).f810b.areNotificationsEnabled())));
                                        kVar42.b(hashMap3);
                                        break;
                                    } catch (Exception e12) {
                                        kVar42.a(e12);
                                    }
                            }
                        }
                    });
                    sVar = kVar9.f20051a;
                    break;
                }
            case '\t':
                final q4.k kVar10 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: kb.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f15527b;

                    {
                        this.f15527b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
                    /* JADX WARN: Type inference failed for: r1v14 */
                    /* JADX WARN: Type inference failed for: r1v15 */
                    /* JADX WARN: Type inference failed for: r1v16 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map7;
                        switch (i10) {
                            case 0:
                                q4.k kVar22 = kVar10;
                                g gVar = this.f15527b;
                                try {
                                    D5.z zVar = gVar.f15540h;
                                    if (zVar != null) {
                                        HashMap H2 = AbstractC1526a.H(zVar);
                                        Map map22 = gVar.j;
                                        if (map22 != null) {
                                            H2.put("notification", map22);
                                        }
                                        kVar22.b(H2);
                                        gVar.f15540h = null;
                                        gVar.j = null;
                                        break;
                                    } else {
                                        AbstractActivityC0364d abstractActivityC0364d2 = gVar.f15535c;
                                        if (abstractActivityC0364d2 == null) {
                                            kVar22.b(null);
                                            break;
                                        } else {
                                            Intent intent = abstractActivityC0364d2.getIntent();
                                            if (intent != null && intent.getExtras() != null) {
                                                String string = intent.getExtras().getString(StubApp.getString2("1178"));
                                                if (string == null) {
                                                    string = intent.getExtras().getString(StubApp.getString2("1179"));
                                                }
                                                if (string != null) {
                                                    HashMap hashMap = gVar.f15533a;
                                                    if (hashMap.get(string) == null) {
                                                        D5.z zVar2 = (D5.z) FlutterFirebaseMessagingReceiver.f15086a.get(string);
                                                        if (zVar2 == null) {
                                                            HashMap j = C0379a.n().j(string);
                                                            if (j != null) {
                                                                zVar2 = AbstractC1526a.t(j);
                                                                if (j.get("notification") != null) {
                                                                    map7 = (Map) j.get("notification");
                                                                    C0379a.n().x(string);
                                                                }
                                                            }
                                                            map7 = null;
                                                            C0379a.n().x(string);
                                                        } else {
                                                            map7 = null;
                                                        }
                                                        if (zVar2 != null) {
                                                            hashMap.put(string, Boolean.TRUE);
                                                            HashMap H10 = AbstractC1526a.H(zVar2);
                                                            if (zVar2.g() == null && map7 != null) {
                                                                H10.put("notification", map7);
                                                            }
                                                            kVar22.b(H10);
                                                            break;
                                                        } else {
                                                            kVar22.b(null);
                                                            break;
                                                        }
                                                    }
                                                }
                                                kVar22.b(null);
                                                break;
                                            }
                                            kVar22.b(null);
                                        }
                                    }
                                } catch (Exception e10) {
                                    kVar22.a(e10);
                                    return;
                                }
                                break;
                            case 1:
                                String string22 = StubApp.getString2(783);
                                q4.k kVar32 = kVar10;
                                g gVar2 = this.f15527b;
                                HashMap hashMap2 = new HashMap();
                                try {
                                    if (hc.b.f14499b.checkSelfPermission(string22) == 0) {
                                        hashMap2.put(StubApp.getString2("19162"), 1);
                                        kVar32.b(hashMap2);
                                    } else {
                                        h hVar = gVar2.f15541k;
                                        AbstractActivityC0364d abstractActivityC0364d22 = gVar2.f15535c;
                                        e eVar = new e(hashMap2, kVar32);
                                        if (hVar.f15543b) {
                                            kVar32.a(new Exception(StubApp.getString2("19163")));
                                        } else if (abstractActivityC0364d22 == null) {
                                            kVar32.a(new Exception(StubApp.getString2("1794")));
                                        } else {
                                            hVar.f15542a = eVar;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(string22);
                                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                            if (!hVar.f15543b) {
                                                AbstractC0025b.d(abstractActivityC0364d22, strArr, 240);
                                                hVar.f15543b = true;
                                            }
                                        }
                                    }
                                    break;
                                } catch (Exception e11) {
                                    kVar32.a(e11);
                                    return;
                                }
                            default:
                                q4.k kVar42 = kVar10;
                                g gVar3 = this.f15527b;
                                gVar3.getClass();
                                try {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put(StubApp.getString2("19162"), Integer.valueOf((int) (Build.VERSION.SDK_INT >= 33 ? hc.b.f14499b.checkSelfPermission(StubApp.getString2("783")) == 0 ? 1 : 0 : new J(gVar3.f15535c).f810b.areNotificationsEnabled())));
                                    kVar42.b(hashMap3);
                                    break;
                                } catch (Exception e12) {
                                    kVar42.a(e12);
                                }
                        }
                    }
                });
                sVar = kVar10.f20051a;
                break;
            case '\n':
                q4.k kVar11 = new q4.k();
                FlutterFirebasePlugin.cachedThreadPool.execute(new hb.f(this, kVar11, 9));
                sVar = kVar11.f20051a;
                break;
            default:
                result.notImplemented();
                return;
        }
        sVar.addOnCompleteListener(new e(this, result));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public final boolean onNewIntent(Intent intent) {
        Map map;
        HashMap j;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString(StubApp.getString2(1178));
        if (string == null) {
            string = intent.getExtras().getString(StubApp.getString2(1179));
        }
        if (string == null) {
            return false;
        }
        HashMap hashMap = FlutterFirebaseMessagingReceiver.f15086a;
        D5.z zVar = (D5.z) hashMap.get(string);
        String string2 = StubApp.getString2(490);
        Map map2 = null;
        if (zVar == null && (j = C0379a.n().j(string)) != null) {
            zVar = AbstractC1526a.t(j);
            Object obj = j.get(StubApp.getString2(1905));
            Objects.requireNonNull(obj);
            Map map3 = (Map) obj;
            if (map3.get(string2) != null) {
                map2 = (Map) map3.get(string2);
            }
        }
        if (zVar == null) {
            return false;
        }
        this.f15540h = zVar;
        this.j = map2;
        hashMap.remove(string);
        HashMap H2 = AbstractC1526a.H(zVar);
        if (zVar.g() == null && (map = this.j) != null) {
            H2.put(string2, map);
        }
        this.f15534b.invokeMethod(StubApp.getString2(19190), H2);
        this.f15535c.setIntent(intent);
        return true;
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        Ya.d dVar = (Ya.d) bVar;
        dVar.f8886e.add(this);
        this.f15535c = dVar.f8882a;
    }
}
