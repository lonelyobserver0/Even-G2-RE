package ib;

import com.google.firebase.messaging.FirebaseMessaging;
import com.stub.StubApp;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4.h f14979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4.k f14980c;

    public /* synthetic */ d(R4.h hVar, q4.k kVar, int i3) {
        this.f14978a = i3;
        this.f14979b = hVar;
        this.f14980c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14978a) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(this.f14979b, this.f14980c);
                break;
            default:
                R4.h hVar = this.f14979b;
                q4.k kVar = this.f14980c;
                try {
                    HashMap hashMap = new HashMap();
                    hVar.a();
                    if (hVar.f6194b.equals(StubApp.getString2("429"))) {
                        hashMap.put(StubApp.getString2("18616"), Boolean.valueOf(FirebaseMessaging.c().f12062e.b()));
                    }
                    kVar.b(hashMap);
                    break;
                } catch (Exception e10) {
                    kVar.a(e10);
                }
        }
    }
}
