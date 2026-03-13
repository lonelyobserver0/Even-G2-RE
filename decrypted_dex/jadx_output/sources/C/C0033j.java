package C;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.stub.StubApp;

/* renamed from: C.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0033j extends C {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f843e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f844f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f845g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f846h;

    public static IconCompat e(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.c((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.d((Bitmap) parcelable);
        }
        return null;
    }

    @Override // C.C
    public final void b(E e10) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) e10.f786c).setBigContentTitle(this.f781b);
        IconCompat iconCompat = this.f843e;
        Context context = (Context) e10.f785b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0032i.a(bigContentTitle, iconCompat.h(context));
            } else {
                int i3 = iconCompat.f9662a;
                if (i3 == -1) {
                    i3 = ((Icon) iconCompat.f9663b).getType();
                }
                if (i3 == 1) {
                    IconCompat iconCompat2 = this.f843e;
                    int i10 = iconCompat2.f9662a;
                    if (i10 == -1) {
                        Object obj = iconCompat2.f9663b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i10 == 1) {
                        bitmap = (Bitmap) iconCompat2.f9663b;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException(StubApp.getString2(799) + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f9663b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f10 = min;
                        float f11 = 0.5f * f10;
                        float f12 = 0.9166667f * f11;
                        float f13 = 0.010416667f * f10;
                        paint.setColor(0);
                        paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f11, f11, f12, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f845g) {
            IconCompat iconCompat3 = this.f844f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                AbstractC0031h.a(bigContentTitle, iconCompat3.h(context));
            }
        }
        if (this.f783d) {
            bigContentTitle.setSummaryText(this.f782c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0032i.c(bigContentTitle, this.f846h);
            AbstractC0032i.b(bigContentTitle, null);
        }
    }

    @Override // C.C
    public final String c() {
        return StubApp.getString2(710);
    }

    @Override // C.C
    public final void d(Bundle bundle) {
        super.d(bundle);
        String string2 = StubApp.getString2(800);
        if (bundle.containsKey(string2)) {
            this.f844f = e(bundle.getParcelable(string2));
            this.f845g = true;
        }
        Parcelable parcelable = bundle.getParcelable(StubApp.getString2(714));
        this.f843e = parcelable != null ? e(parcelable) : e(bundle.getParcelable(StubApp.getString2(715)));
        this.f846h = bundle.getBoolean(StubApp.getString2(801));
    }
}
