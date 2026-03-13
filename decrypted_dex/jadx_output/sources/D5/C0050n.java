package D5;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: D5.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0050n implements q4.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f1440b;

    public /* synthetic */ C0050n(FirebaseMessaging firebaseMessaging, int i3) {
        this.f1439a = i3;
        this.f1440b = firebaseMessaging;
    }

    @Override // q4.f
    public final void i(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f1440b;
        switch (this.f1439a) {
            case 0:
                I i3 = (I) obj;
                if (firebaseMessaging.f12062e.b()) {
                    i3.f();
                    break;
                }
                break;
            default:
                P3.a aVar = (P3.a) obj;
                F5.c cVar = FirebaseMessaging.f12055l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    hc.b.P(aVar.f5488a);
                    firebaseMessaging.g();
                    break;
                }
                break;
        }
    }
}
