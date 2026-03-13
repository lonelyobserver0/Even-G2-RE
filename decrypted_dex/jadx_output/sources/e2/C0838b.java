package e2;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0838b extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((f) this.receiver).accept(p02);
        return Unit.INSTANCE;
    }
}
