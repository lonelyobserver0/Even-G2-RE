package d5;

import com.stub.StubApp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0803c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0803c f13417b = new C0803c(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0803c f13418c = new C0803c(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0803c f13419d = new C0803c(0, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0803c(int i3, int i10) {
        super(i3);
        this.f13420a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13420a) {
            case 0:
                return StubApp.getString2(16819) + Thread.currentThread().getName() + '.';
            case 1:
                return StubApp.getString2(16818) + Thread.currentThread().getName() + '.';
            default:
                return StubApp.getString2(16817) + Thread.currentThread().getName() + '.';
        }
    }
}
