package kotlin.io.path;

import java.nio.file.Path;
import kotlin.jvm.functions.Function3;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15599b;

    public /* synthetic */ a(boolean z2, int i3) {
        this.f15598a = i3;
        this.f15599b = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
        CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
        CopyActionContext copyActionContext = (CopyActionContext) obj;
        Path path = (Path) obj2;
        Path path2 = (Path) obj3;
        switch (this.f15598a) {
            case 0:
                copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(this.f15599b, copyActionContext, path, path2);
                return copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
            default:
                copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt = PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(this.f15599b, copyActionContext, path, path2);
                return copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
        }
    }
}
