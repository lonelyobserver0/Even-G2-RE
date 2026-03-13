package Z8;

import Qb.C0203k;
import com.mapbox.navigator.UpdateLocationCallback;
import kotlin.Result;
import kotlin.ResultKt;
import q4.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements UpdateLocationCallback, q4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0203k f9048a;

    public /* synthetic */ e(C0203k c0203k) {
        this.f9048a = c0203k;
    }

    @Override // q4.d
    public void j(j jVar) {
        Exception exception = jVar.getException();
        C0203k c0203k = this.f9048a;
        if (exception != null) {
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(exception)));
        } else if (jVar.isCanceled()) {
            c0203k.n(null);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(jVar.getResult()));
        }
    }

    @Override // com.mapbox.navigator.UpdateLocationCallback
    public void run(boolean z2) {
        this.f9048a.resumeWith(Result.m40constructorimpl(Boolean.valueOf(z2)));
    }
}
