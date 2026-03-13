package C2;

import D5.C;
import D5.C0047k;
import L0.B;
import L0.G;
import S3.D;
import V8.t;
import Xa.AbstractActivityC0364d;
import a0.C0379a;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.SnapshotCompleteCallback;
import com.mapbox.maps.SnapshotOverlayCallback;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.Snapshotter;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import i5.C1059c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import q4.InterfaceC1521b;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e implements q4.e, q4.i, Expected.Transformer, J3.b, I3.f, InterfaceC1542c, SnapshotCompleteCallback, InterfaceC1521b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1061d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i3) {
        this.f1058a = i3;
        this.f1059b = obj;
        this.f1060c = obj2;
        this.f1061d = obj3;
    }

    @Override // q4.e
    public void C(Exception exc) {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        g gVar = (g) this.f1059b;
        gVar.getClass();
        boolean z2 = exc instanceof Q3.m;
        B2.a aVar = (B2.a) this.f1061d;
        if (!z2) {
            if (((Q3.e) exc).f5717a.f11170a == 8502) {
                gVar.h(gVar.f1070f);
                return;
            } else {
                aVar.b(3);
                return;
            }
        }
        AbstractActivityC0364d abstractActivityC0364d = (AbstractActivityC0364d) this.f1060c;
        if (abstractActivityC0364d == null) {
            aVar.b(3);
            return;
        }
        Status status = ((Q3.m) exc).f5717a;
        if (status.f11170a != 6) {
            aVar.b(3);
            return;
        }
        try {
            int i3 = gVar.f1069e;
            PendingIntent pendingIntent = status.f11172c;
            if (pendingIntent != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                    bundle = pendingIntentBackgroundActivityStartMode.toBundle();
                } else {
                    bundle = null;
                }
                Bundle bundle2 = bundle;
                D.h(pendingIntent);
                abstractActivityC0364d.startIntentSenderForResult(pendingIntent.getIntentSender(), i3, null, 0, 0, 0, bundle2);
            }
        } catch (IntentSender.SendIntentException unused) {
            aVar.b(3);
        }
    }

    @Override // r0.InterfaceC1542c
    public void accept(Object obj) {
        ((G) obj).o(((A0.f) this.f1059b).f32a, (B) this.f1060c, (I0.g) this.f1061d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[SYNTHETIC] */
    @Override // I3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.e.apply(java.lang.Object):java.lang.Object");
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        boolean isSuccessful = jVar.isSuccessful();
        q4.k kVar = (q4.k) this.f1059b;
        if (isSuccessful) {
            kVar.d(jVar.getResult());
        } else if (jVar.getException() != null) {
            kVar.c(jVar.getException());
        } else if (((AtomicBoolean) this.f1060c).getAndSet(true)) {
            ((q4.n) ((C0379a) this.f1061d).f9233b).f20062a.d(null);
        }
        return a4.f.m(null);
    }

    @Override // J3.b
    public Object f() {
        G3.b bVar = (G3.b) this.f1059b;
        I3.h hVar = (I3.h) bVar.f2386d;
        hVar.getClass();
        B3.j jVar = (B3.j) this.f1060c;
        B3.i iVar = (B3.i) this.f1061d;
        String concat = StubApp.getString2(1063).concat(StubApp.getString2(1037));
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, StubApp.getString2(1064) + jVar.f630c + StubApp.getString2(1065) + iVar.f619a + StubApp.getString2(1066) + jVar.f628a);
        }
        ((Long) hVar.e(new e(hVar, iVar, jVar, 4))).getClass();
        bVar.f2383a.a(jVar, 1, false);
        return null;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        switch (this.f1058a) {
            case 2:
                F7.h hVar = (F7.h) obj;
                ArrayList arrayList = hVar.f2306a;
                String p8 = Y3.a.p((RouterOrigin) this.f1059b);
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(1067));
                ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.mapbox.navigation.base.route.g) it.next()).f12506i);
                }
                sb2.append(arrayList2);
                D9.l.f(sb2.toString(), StubApp.getString2(1068));
                ((A0.c) ((C1059c) this.f1060c).f14844c).u(hVar.f2307b);
                ((Q2.g) this.f1061d).d(arrayList, p8);
                return Unit.INSTANCE;
            default:
                List value = (List) obj;
                com.mapbox.navigation.base.route.g primaryRoute = (com.mapbox.navigation.base.route.g) this.f1059b;
                Intrinsics.checkNotNullParameter(primaryRoute, "$primaryRoute");
                V8.q this$0 = (V8.q) this.f1060c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                List routes = (List) this.f1061d;
                Intrinsics.checkNotNullParameter(routes, "$routes");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(primaryRoute, "<this>");
                com.mapbox.navigation.base.route.g a3 = com.mapbox.navigation.base.route.g.a(primaryRoute, null, null, null, null, null, CertificateBody.profileType);
                this$0.f7876g = a3;
                ArrayList arrayList3 = a3.f12507k;
                if (!Intrinsics.areEqual(this$0.f7891w, arrayList3)) {
                    this$0.f7891w = arrayList3;
                }
                List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.drop(routes, 1));
                mutableList.add(0, a3);
                return new t(mutableList, value);
        }
    }

    @Override // q4.i
    public q4.j k(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1059b;
        String str = (String) this.f1060c;
        C c10 = (C) this.f1061d;
        String str2 = (String) obj;
        F5.c d8 = FirebaseMessaging.d(firebaseMessaging.f12059b);
        String e10 = firebaseMessaging.e();
        String a3 = firebaseMessaging.f12066i.a();
        synchronized (d8) {
            String a9 = C.a(System.currentTimeMillis(), str2, a3);
            if (a9 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) d8.f2238b).edit();
                edit.putString(F5.c.j(e10, str), a9);
                edit.commit();
            }
        }
        if (c10 == null || !str2.equals(c10.f1345a)) {
            R4.h hVar = firebaseMessaging.f12058a;
            hVar.a();
            if (StubApp.getString2(429).equals(hVar.f6194b)) {
                String string2 = StubApp.getString2(493);
                if (Log.isLoggable(string2, 3)) {
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(1069));
                    hVar.a();
                    sb2.append(hVar.f6194b);
                    Log.d(string2, sb2.toString());
                }
                Intent intent = new Intent(StubApp.getString2(1070));
                intent.putExtra(StubApp.getString2(1071), str2);
                new C0047k(firebaseMessaging.f12059b).b(intent);
            }
        }
        return a4.f.m(str2);
    }

    @Override // com.mapbox.maps.SnapshotCompleteCallback
    public void run(Expected expected) {
        Snapshotter.start$lambda$17((Snapshotter) this.f1059b, (SnapshotResultCallback) this.f1060c, (SnapshotOverlayCallback) this.f1061d, expected);
    }
}
