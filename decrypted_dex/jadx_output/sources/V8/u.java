package V8;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(String str, int i3) {
        super(str);
        this.f7898a = i3;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f7898a) {
            case 1:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case 3:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(String str, Throwable th) {
        super(str, th);
        this.f7898a = 0;
    }
}
