package r5;

import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p5.g;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1570c implements p5.f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f20344a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StubApp.getString2(22680), Locale.US);
        f20344a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(StubApp.getString2(8779)));
    }

    @Override // p5.InterfaceC1491a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).add(f20344a.format((Date) obj));
    }
}
