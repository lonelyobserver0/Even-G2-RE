package R4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6176a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6177b;

    public synchronized boolean a() {
        if (this.f6177b) {
            return false;
        }
        this.f6177b = true;
        notifyAll();
        return true;
    }

    public String toString() {
        switch (this.f6176a) {
            case 4:
                return this.f6177b ? StubApp.getString2(5662) : StubApp.getString2(5663);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(boolean z2, int i3) {
        this.f6176a = i3;
        this.f6177b = z2;
    }

    public b() {
        this.f6176a = 4;
        this.f6177b = true;
    }
}
