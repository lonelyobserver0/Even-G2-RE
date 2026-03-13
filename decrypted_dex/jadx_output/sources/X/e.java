package X;

import Kc.y;
import com.stub.StubApp;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lambda f8228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Function0 function0, int i3) {
        super(0);
        this.f8227a = i3;
        switch (i3) {
            case 1:
                this.f8228b = (Lambda) function0;
                super(0);
                break;
            default:
                this.f8228b = (Lambda) function0;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r02 = this.f8228b;
        switch (this.f8227a) {
            case 0:
                File file = (File) r02.invoke();
                if (Intrinsics.areEqual(FilesKt.getExtension(file), "preferences_pb")) {
                    String str = y.f3858b;
                    File absoluteFile = file.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return C2.i.w(absoluteFile);
                }
                throw new IllegalStateException((StubApp.getString2(6948) + file + StubApp.getString2(6949)).toString());
            default:
                try {
                    return (List) r02.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
        }
    }
}
