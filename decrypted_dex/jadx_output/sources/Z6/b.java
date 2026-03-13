package Z6;

import android.animation.Animator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8986a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animator.AnimatorListener f8987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f8988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Animator.AnimatorListener animatorListener) {
        super(0);
        this.f8988c = dVar;
        this.f8987b = animatorListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8986a) {
            case 0:
                d dVar = this.f8988c;
                Y6.f fVar = dVar.f8999g;
                Animator.AnimatorListener animatorListener = this.f8987b;
                if (fVar != null) {
                    super/*android.animation.Animator*/.addListener(animatorListener);
                }
                dVar.j.add(animatorListener);
                break;
            default:
                d dVar2 = this.f8988c;
                Y6.f fVar2 = dVar2.f8999g;
                Animator.AnimatorListener animatorListener2 = this.f8987b;
                if (!Intrinsics.areEqual(animatorListener2, fVar2)) {
                    super/*android.animation.Animator*/.removeListener(animatorListener2);
                }
                CopyOnWriteArraySet copyOnWriteArraySet = dVar2.j;
                if (copyOnWriteArraySet.contains(animatorListener2)) {
                    copyOnWriteArraySet.remove(animatorListener2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Animator.AnimatorListener animatorListener, d dVar) {
        super(0);
        this.f8987b = animatorListener;
        this.f8988c = dVar;
    }
}
