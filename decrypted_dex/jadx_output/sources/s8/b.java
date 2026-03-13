package s8;

import com.stub.StubApp;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import y7.c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20817a = new Locale(StubApp.getString2(2887)).getLanguage();

    public static C1605a a(double d8, int i3, String str, c cVar, Locale locale) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMaximumFractionDigits(i3);
        String roundedValue = numberInstance.format(d8);
        Intrinsics.checkNotNullExpressionValue(roundedValue, "roundedValue");
        return new C1605a(d8, roundedValue, str, cVar);
    }

    public static C1605a b(double d8, int i3, String str, c cVar) {
        Number valueOf;
        int intValue;
        if (d8 < 0.0d) {
            intValue = 0;
        } else {
            if (i3 > 0) {
                int roundToInt = MathKt.roundToInt(d8);
                if (roundToInt >= i3) {
                    i3 *= roundToInt / i3;
                }
                valueOf = Integer.valueOf(i3);
            } else {
                valueOf = Double.valueOf(d8);
            }
            intValue = valueOf.intValue();
        }
        return new C1605a(intValue, String.valueOf(intValue), str, cVar);
    }
}
