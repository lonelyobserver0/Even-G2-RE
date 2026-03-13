package V;

import Kc.t;
import com.stub.StubApp;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f7642e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final u5.d f7643f = new u5.d(21);

    /* renamed from: a, reason: collision with root package name */
    public final t f7644a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f7645b;

    /* renamed from: c, reason: collision with root package name */
    public final X.e f7646c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f7647d;

    public e(t fileSystem, X.e producePath) {
        X.f serializer = X.f.f8229a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        String string2 = StubApp.getString2(6462);
        c cVar = c.f7639a;
        Intrinsics.checkNotNullParameter(cVar, string2);
        Intrinsics.checkNotNullParameter(producePath, "producePath");
        this.f7644a = fileSystem;
        this.f7645b = cVar;
        this.f7646c = producePath;
        this.f7647d = LazyKt.lazy(new d(this, 0));
    }
}
