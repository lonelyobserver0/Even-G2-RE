package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: n.y, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1373y extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C1355p f17630a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc.i f17631b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1373y(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        P0.a(context);
        this.f17632c = false;
        O0.a(this, getContext());
        C1355p c1355p = new C1355p(this);
        this.f17630a = c1355p;
        c1355p.d(attributeSet, i3);
        Bc.i iVar = new Bc.i(this);
        this.f17631b = iVar;
        iVar.l(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            c1355p.a();
        }
        Bc.i iVar = this.f17631b;
        if (iVar != null) {
            iVar.f();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            return c1355p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            return c1355p.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        Q0 q02;
        Bc.i iVar = this.f17631b;
        if (iVar == null || (q02 = (Q0) iVar.f768d) == null) {
            return null;
        }
        return (ColorStateList) q02.f17459c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Q0 q02;
        Bc.i iVar = this.f17631b;
        if (iVar == null || (q02 = (Q0) iVar.f768d) == null) {
            return null;
        }
        return (PorterDuff.Mode) q02.f17460d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f17631b.f767c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            c1355p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            c1355p.f(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        Bc.i iVar = this.f17631b;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Bc.i iVar = this.f17631b;
        if (iVar != null && drawable != null && !this.f17632c) {
            iVar.f766b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (iVar != null) {
            iVar.f();
            if (this.f17632c) {
                return;
            }
            ImageView imageView = (ImageView) iVar.f767c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(iVar.f766b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f17632c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        Bc.i iVar = this.f17631b;
        ImageView imageView = (ImageView) iVar.f767c;
        if (i3 != 0) {
            Drawable m4 = D1.m(imageView.getContext(), i3);
            if (m4 != null) {
                AbstractC1346k0.a(m4);
            }
            imageView.setImageDrawable(m4);
        } else {
            imageView.setImageDrawable(null);
        }
        iVar.f();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        Bc.i iVar = this.f17631b;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            c1355p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1355p c1355p = this.f17630a;
        if (c1355p != null) {
            c1355p.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        Bc.i iVar = this.f17631b;
        if (iVar != null) {
            if (((Q0) iVar.f768d) == null) {
                iVar.f768d = new Q0();
            }
            Q0 q02 = (Q0) iVar.f768d;
            q02.f17459c = colorStateList;
            q02.f17458b = true;
            iVar.f();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        Bc.i iVar = this.f17631b;
        if (iVar != null) {
            if (((Q0) iVar.f768d) == null) {
                iVar.f768d = new Q0();
            }
            Q0 q02 = (Q0) iVar.f768d;
            q02.f17460d = mode;
            q02.f17457a = true;
            iVar.f();
        }
    }
}
