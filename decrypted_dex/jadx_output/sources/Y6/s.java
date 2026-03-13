package Y6;

import android.animation.AnimatorSet;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s implements Cancelable {

    /* renamed from: a, reason: collision with root package name */
    public final String f8824a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimatorSet f8825b;

    public s(String str, AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        this.f8824a = str;
        this.f8825b = animatorSet;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(this, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f8824a, sVar.f8824a) && Intrinsics.areEqual(this.f8825b, sVar.f8825b);
    }

    public final int hashCode() {
        String str = this.f8824a;
        return this.f8825b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return StubApp.getString2(7579) + this.f8824a + StubApp.getString2(7580) + this.f8825b + ')';
    }
}
