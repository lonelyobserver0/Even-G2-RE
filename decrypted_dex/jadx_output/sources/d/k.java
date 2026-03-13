package d;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.O;
import i.AbstractActivityC1027h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC1027h abstractActivityC1027h, int i3) {
        super(0);
        this.f13073a = i3;
        this.f13074b = abstractActivityC1027h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13073a) {
            case 0:
                AbstractActivityC1027h abstractActivityC1027h = this.f13074b;
                return new O(abstractActivityC1027h.getApplication(), abstractActivityC1027h, abstractActivityC1027h.getIntent() != null ? abstractActivityC1027h.getIntent().getExtras() : null);
            case 1:
                this.f13074b.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                AbstractActivityC1027h abstractActivityC1027h2 = this.f13074b;
                return new s(abstractActivityC1027h2.f13081f, new k(abstractActivityC1027h2, 1));
            default:
                AbstractActivityC1027h abstractActivityC1027h3 = this.f13074b;
                z zVar = new z(new RunnableC0761c(abstractActivityC1027h3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC1027h3.f13076a.a(new g(zVar, abstractActivityC1027h3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new com.even.translate.a(8, abstractActivityC1027h3, zVar));
                    }
                }
                return zVar;
        }
    }
}
