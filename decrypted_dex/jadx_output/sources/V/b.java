package V;

import Kc.t;
import Kc.y;
import T.InterfaceC0285a;
import Z9.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class b implements InterfaceC0285a {

    /* renamed from: a, reason: collision with root package name */
    public final t f7636a;

    /* renamed from: b, reason: collision with root package name */
    public final y f7637b;

    /* renamed from: c, reason: collision with root package name */
    public final q f7638c;

    public b(t fileSystem, y path) {
        X.f serializer = X.f.f8229a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f7636a = fileSystem;
        this.f7637b = path;
        this.f7638c = new q(22);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:20|21)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:57|(6:61|62|64|65|(1:67)|54)(2:59|60))|(2:35|36)|30|(2:32|33)(1:34)))|80|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0034, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (r8 != 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ce, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d2, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d3, code lost:
    
        kotlin.ExceptionsKt.addSuppressed(r9, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[Catch: FileNotFoundException -> 0x0098, TryCatch #5 {FileNotFoundException -> 0x0098, blocks: (B:32:0x009e, B:34:0x00a2, B:47:0x0094, B:44:0x008f), top: B:43:0x008f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[Catch: FileNotFoundException -> 0x0098, TRY_LEAVE, TryCatch #5 {FileNotFoundException -> 0x0098, blocks: (B:32:0x009e, B:34:0x00a2, B:47:0x0094, B:44:0x008f), top: B:43:0x008f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r8v0, types: [V.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(V.b r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.b.a(V.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // T.InterfaceC0285a
    public final void close() {
        ((AtomicBoolean) this.f7638c.f9143b).set(true);
    }
}
