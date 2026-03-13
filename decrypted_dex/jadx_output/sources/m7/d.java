package m7;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f17133a = i3;
        this.f17134b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17133a) {
            case 0:
                this.f17134b.start();
                break;
            case 1:
                this.f17134b.f17137b.start();
                break;
            default:
                e eVar = this.f17134b;
                if (eVar.isRunning()) {
                    eVar.cancel();
                }
                ValueAnimator valueAnimator = eVar.f17137b;
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
