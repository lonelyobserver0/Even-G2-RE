package l4;

import com.stub.StubApp;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: l4.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1206q extends AbstractC1214u0 {

    /* renamed from: c, reason: collision with root package name */
    public long f16585c;

    /* renamed from: d, reason: collision with root package name */
    public String f16586d;

    @Override // l4.AbstractC1214u0
    public final boolean l() {
        Calendar calendar = Calendar.getInstance();
        this.f16585c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f16586d = E1.a.n(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, StubApp.getString2(999), lowerCase2);
        return false;
    }

    public final long o() {
        m();
        return this.f16585c;
    }

    public final String p() {
        m();
        return this.f16586d;
    }
}
