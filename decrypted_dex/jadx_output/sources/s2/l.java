package s2;

import A3.s;
import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import j2.C1084b;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C1608a f20735a;

    /* renamed from: b, reason: collision with root package name */
    public final C1084b f20736b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20737c;

    static {
        i2.o.g(StubApp.getString2(23110));
    }

    public l(WorkDatabase workDatabase, C1084b c1084b, C1608a c1608a) {
        this.f20736b = c1084b;
        this.f20735a = c1608a;
        this.f20737c = workDatabase.u();
    }
}
