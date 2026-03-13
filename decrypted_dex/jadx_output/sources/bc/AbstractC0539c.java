package bc;

import B3.s;
import com.stub.StubApp;
import dc.AbstractC0826a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0539c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0538b f10752c;

    /* renamed from: a, reason: collision with root package name */
    public final C0541e f10753a;

    /* renamed from: b, reason: collision with root package name */
    public final s f10754b;

    static {
        EnumC0537a enumC0537a = EnumC0537a.f10749a;
        f10752c = new C0538b(new C0541e(false, false, true, StubApp.getString2(6147), StubApp.getString2(660), true, enumC0537a), AbstractC0826a.f13558a);
    }

    public AbstractC0539c(C0541e c0541e, s sVar) {
        this.f10753a = c0541e;
        this.f10754b = sVar;
        new ConcurrentHashMap(16);
    }
}
