package D5;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class s implements W4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4.q f1453b;

    public /* synthetic */ s(W4.q qVar, int i3) {
        this.f1452a = i3;
        this.f1453b = qVar;
    }

    @Override // W4.e
    public final Object h(W4.s sVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f1452a) {
            case 0:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.f1453b, sVar);
                return lambda$getComponents$0;
            default:
                return new u5.c((Context) sVar.get(Context.class), ((R4.h) sVar.get(R4.h.class)).g(), sVar.f(W4.q.a(u5.d.class)), sVar.c(F5.b.class), (Executor) sVar.e(this.f1453b));
        }
    }
}
