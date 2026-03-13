package Y;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import com.stub.StubApp;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f8702b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f8705e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f8701a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f8703c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f8704d = 1.0f;

    public v(u uVar) {
        M.d.e(uVar, StubApp.getString2(7493));
        this.f8702b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f8705e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f8705e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i11, f10 + this.f8703c, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        h.a().getClass();
        float f11 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        u uVar = this.f8702b;
        p2.h hVar = uVar.f8699b;
        Typeface typeface = (Typeface) hVar.f19674d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) hVar.f19672b, uVar.f8698a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f8701a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f8702b;
        this.f8704d = abs / (uVar.b().a(14) != 0 ? ((ByteBuffer) r8.f4812d).getShort(r1 + r8.f4809a) : (short) 0);
        Z.a b2 = uVar.b();
        int a3 = b2.a(14);
        if (a3 != 0) {
            ((ByteBuffer) b2.f4812d).getShort(a3 + b2.f4809a);
        }
        short s10 = (short) ((uVar.b().a(12) != 0 ? ((ByteBuffer) r5.f4812d).getShort(r7 + r5.f4809a) : (short) 0) * this.f8704d);
        this.f8703c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
