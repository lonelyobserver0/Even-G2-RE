package i4;

import com.stub.StubApp;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f14811a;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f14812b;

    static {
        Locale locale = Locale.ROOT;
        f14811a = new DecimalFormat(StubApp.getString2(18520), DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(StubApp.getString2(18521), DecimalFormatSymbols.getInstance(locale));
        f14812b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
