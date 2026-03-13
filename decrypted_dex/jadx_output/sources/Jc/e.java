package Jc;

import Ac.j;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3483e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, f fVar) {
        super(str, true);
        this.f3484f = fVar;
    }

    @Override // zc.a
    public final long a() {
        switch (this.f3483e) {
            case 0:
                f fVar = this.f3484f;
                try {
                    if (fVar.h()) {
                    }
                } catch (IOException e10) {
                    fVar.c(e10, null);
                    break;
                }
                break;
            default:
                j jVar = this.f3484f.f3492g;
                Intrinsics.checkNotNull(jVar);
                jVar.d();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f this$0) {
        super(Intrinsics.stringPlus(this$0.f3496l, " writer"), true);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f3484f = this$0;
    }
}
