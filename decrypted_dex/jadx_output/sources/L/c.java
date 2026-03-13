package L;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3872a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3874c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3875d;

    public c(PrecomputedText.Params params) {
        this.f3872a = params.getTextPaint();
        this.f3873b = params.getTextDirection();
        this.f3874c = params.getBreakStrategy();
        this.f3875d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3874c != cVar.f3874c || this.f3875d != cVar.f3875d) {
            return false;
        }
        TextPaint textPaint = this.f3872a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = cVar.f3872a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f3873b == cVar.f3873b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f3872a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f3873b, Integer.valueOf(this.f3874c), Integer.valueOf(this.f3875d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1352));
        StringBuilder sb3 = new StringBuilder(StubApp.getString2(3279));
        TextPaint textPaint = this.f3872a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(StubApp.getString2(3280) + textPaint.getTextScaleX());
        sb2.append(StubApp.getString2(3281) + textPaint.getTextSkewX());
        sb2.append(StubApp.getString2(3282) + textPaint.getLetterSpacing());
        sb2.append(StubApp.getString2(3283) + textPaint.isElegantTextHeight());
        sb2.append(StubApp.getString2(3284) + textPaint.getTextLocales());
        sb2.append(StubApp.getString2(3285) + textPaint.getTypeface());
        sb2.append(StubApp.getString2(3286) + textPaint.getFontVariationSettings());
        sb2.append(StubApp.getString2(3287) + this.f3873b);
        sb2.append(StubApp.getString2(3288) + this.f3874c);
        sb2.append(StubApp.getString2(3289) + this.f3875d);
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
