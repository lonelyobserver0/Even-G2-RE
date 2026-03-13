package F;

import K.j;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.stub.StubApp;
import java.io.IOException;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends a4.f {
    public static Font b0(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int d02 = d0(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int d03 = d0(fontStyle, font2.getStyle());
            if (d03 < d02) {
                font = font2;
                d02 = d03;
            }
        }
        return font;
    }

    public static FontFamily c0(j[] jVarArr, ContentResolver contentResolver) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        int length = jVarArr.length;
        FontFamily.Builder builder = null;
        while (i3 < length) {
            j jVar = jVarArr[i3];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(jVar.f3564a, StubApp.getString2("1269"), null);
            } catch (IOException e10) {
                Log.w("TypefaceCompatApi29Impl", StubApp.getString2(2001), e10);
            }
            if (openFileDescriptor == null) {
                i3 = openFileDescriptor == null ? i3 + 1 : 0;
            } else {
                try {
                    Font build = new Font.Builder(openFileDescriptor).setWeight(jVar.f3566c).setSlant(jVar.f3567d ? 1 : 0).setTtcIndex(jVar.f3565b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (Throwable th) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int d0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a4.f
    public final Typeface g(Context context, E.e eVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (E.f fVar : eVar.f1696a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f1702f).setWeight(fVar.f1698b).setSlant(fVar.f1699c ? 1 : 0).setTtcIndex(fVar.f1701e).setFontVariationSettings(fVar.f1700d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(b0(build2, i3).getStyle()).build();
        } catch (Exception e10) {
            Log.w(StubApp.getString2(2002), StubApp.getString2(2001), e10);
            return null;
        }
    }

    @Override // a4.f
    public final Typeface h(Context context, j[] jVarArr, int i3) {
        try {
            FontFamily c02 = c0(jVarArr, context.getContentResolver());
            if (c02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(c02).setStyle(b0(c02, i3).getStyle()).build();
        } catch (Exception e10) {
            Log.w(StubApp.getString2(2002), StubApp.getString2(2001), e10);
            return null;
        }
    }

    @Override // a4.f
    public final Typeface i(Context context, List list, int i3) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily c02 = c0((j[]) list.get(0), contentResolver);
            if (c02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(c02);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily c03 = c0((j[]) list.get(i10), contentResolver);
                if (c03 != null) {
                    customFallbackBuilder.addCustomFallback(c03);
                }
            }
            return customFallbackBuilder.setStyle(b0(c02, i3).getStyle()).build();
        } catch (Exception e10) {
            Log.w(StubApp.getString2(2002), StubApp.getString2(2001), e10);
            return null;
        }
    }

    @Override // a4.f
    public final Typeface j(Context context, Resources resources, int i3, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e10) {
            Log.w(StubApp.getString2(2002), StubApp.getString2(2001), e10);
            return null;
        }
    }

    @Override // a4.f
    public final j k(j[] jVarArr, int i3) {
        throw new RuntimeException(StubApp.getString2(2003));
    }
}
