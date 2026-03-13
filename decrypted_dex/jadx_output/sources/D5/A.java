package D5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(String str, int i3) {
        super(str);
        this.f1338a = i3;
    }

    @Override // java.lang.Throwable
    public String toString() {
        switch (this.f1338a) {
            case 6:
                String message = getMessage();
                Intrinsics.checkNotNull(message);
                return message;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(String str, Throwable th) {
        super(str, th);
        this.f1338a = 1;
    }
}
