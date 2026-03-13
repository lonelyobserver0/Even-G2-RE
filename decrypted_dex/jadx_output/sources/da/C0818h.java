package da;

import com.stub.StubApp;
import java.util.Arrays;

/* renamed from: da.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0818h extends J1.s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13506c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0818h(int i3) {
        super(2);
        this.f13506c = i3;
    }

    @Override // J1.s
    public final int j(int i3) {
        switch (this.f13506c) {
            case 0:
                return Arrays.binarySearch((int[]) this.f13507d, i3);
            default:
                for (R0.d dVar : (R0.d[]) this.f13507d) {
                    int i10 = dVar.f5935b;
                    if (i10 <= i3 && i3 <= dVar.f5936c) {
                        return (dVar.f5937d + i3) - i10;
                    }
                }
                return -1;
        }
    }

    @Override // J1.s
    public final String toString() {
        switch (this.f13506c) {
            case 0:
                return String.format(StubApp.getString2(17210), Integer.valueOf(this.f3376b), Arrays.toString((int[]) this.f13507d));
            default:
                return String.format(StubApp.getString2(17209), Integer.valueOf(this.f3376b));
        }
    }
}
