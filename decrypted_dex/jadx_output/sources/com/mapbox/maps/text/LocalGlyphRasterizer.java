package com.mapbox.maps.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.Keep;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class LocalGlyphRasterizer {
    private final Canvas canvas;
    private final FontMetrics fontMetrics;
    private final GlyphMetrics glyphMetrics;
    private final Paint paint;
    private boolean useSystemFont;
    private final float sdfScale = 2.0f;
    private final int borderSize = Math.round(6.0f);
    private final Rect bounds = new Rect();

    /* renamed from: com.mapbox.maps.text.LocalGlyphRasterizer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @Keep
    public class FontMetrics {
        float ascender;
        float descender;
        int fontID;

        private FontMetrics() {
        }

        public /* synthetic */ FontMetrics(LocalGlyphRasterizer localGlyphRasterizer, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Keep
    public class GlyphMetrics {
        float advance;
        float ascender;
        float descender;
        Bitmap glyphBitmap;
        float height;
        float left;
        float top;
        float width;

        private GlyphMetrics() {
        }

        public /* synthetic */ GlyphMetrics(LocalGlyphRasterizer localGlyphRasterizer, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public LocalGlyphRasterizer() {
        AnonymousClass1 anonymousClass1 = null;
        this.glyphMetrics = new GlyphMetrics(this, anonymousClass1);
        this.fontMetrics = new FontMetrics(this, anonymousClass1);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        paint.setTextSize(48.0f);
        this.canvas = new Canvas();
        this.useSystemFont = false;
    }

    public FontMetrics getFontMetrics(String str, boolean z2) {
        if (this.useSystemFont) {
            this.paint.setTypeface(z2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            this.paint.setTypeface(Typeface.create(str, z2 ? 1 : 0));
        }
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        this.fontMetrics.ascender = Math.abs(fontMetrics.top) / 2.0f;
        this.fontMetrics.descender = Math.abs(fontMetrics.bottom) / 2.0f;
        this.fontMetrics.fontID = this.paint.getTypeface().hashCode();
        return this.fontMetrics;
    }

    public GlyphMetrics getGlyphMetrics(String str, boolean z2, char c10) {
        String valueOf = String.valueOf(c10);
        if (this.useSystemFont) {
            this.paint.setTypeface(z2 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        } else {
            this.paint.setTypeface(Typeface.create(str, z2 ? 1 : 0));
        }
        this.paint.getTextBounds(valueOf, 0, 1, this.bounds);
        GlyphMetrics glyphMetrics = this.glyphMetrics;
        Rect rect = this.bounds;
        glyphMetrics.left = rect.left / 2.0f;
        glyphMetrics.width = rect.width() / 2.0f;
        this.glyphMetrics.height = this.bounds.height() / 2.0f;
        this.glyphMetrics.top = Math.abs(this.bounds.top) / 2.0f;
        this.glyphMetrics.advance = this.paint.measureText(valueOf, 0, 1) / 2.0f;
        if (this.bounds.width() > 0 && this.bounds.height() > 0) {
            this.glyphMetrics.glyphBitmap = Bitmap.createBitmap((this.borderSize * 2) + this.bounds.width(), (this.borderSize * 2) + this.bounds.height(), Bitmap.Config.ARGB_8888);
            this.canvas.setBitmap(this.glyphMetrics.glyphBitmap);
            int i3 = this.borderSize;
            Rect rect2 = this.bounds;
            float f10 = i3 - rect2.left;
            float f11 = i3 - rect2.top;
            this.canvas.drawColor(-1);
            this.canvas.drawText(valueOf, f10, f11, this.paint);
        }
        return this.glyphMetrics;
    }

    public void useSystemFont() {
        this.useSystemFont = true;
    }
}
