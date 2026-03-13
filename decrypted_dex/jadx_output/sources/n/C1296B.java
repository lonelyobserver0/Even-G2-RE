package n;

import a0.C0379a;
import a0.C0381c;
import a0.C0384f;
import a0.C0387i;
import a0.C0388j;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.stub.StubApp;
import h.AbstractC0997a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1296B implements InterfaceC1323Y {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f17360d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17361a;

    /* renamed from: b, reason: collision with root package name */
    public final View f17362b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17363c;

    public C1296B(AbsSeekBar absSeekBar) {
        this.f17361a = 0;
        this.f17362b = absSeekBar;
    }

    @Override // n.InterfaceC1323Y
    public void a(int i3) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i3);
    }

    @Override // n.InterfaceC1323Y
    public void b(int i3) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i3);
    }

    @Override // n.InterfaceC1323Y
    public void c(int i3, float f10) {
    }

    public KeyListener d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((V6.b) ((C0379a) this.f17363c).f9233b).getClass();
        if (keyListener instanceof C0384f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0384f(keyListener);
    }

    public void e(AttributeSet attributeSet, int i3) {
        switch (this.f17361a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f17362b;
                a5.c E10 = a5.c.E(absSeekBar.getContext(), attributeSet, f17360d, i3);
                Drawable s10 = E10.s(0);
                if (s10 != null) {
                    if (s10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) s10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable h2 = h(animationDrawable.getFrame(i10), true);
                            h2.setLevel(10000);
                            animationDrawable2.addFrame(h2, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        s10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(s10);
                }
                Drawable s11 = E10.s(1);
                if (s11 != null) {
                    absSeekBar.setProgressDrawable(h(s11, false));
                }
                E10.I();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f17362b).getContext().obtainStyledAttributes(attributeSet, AbstractC0997a.f14402i, i3, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    g(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0381c f(InputConnection inputConnection, EditorInfo editorInfo) {
        C0379a c0379a = (C0379a) this.f17363c;
        if (inputConnection == null) {
            c0379a.getClass();
            inputConnection = null;
        } else {
            V6.b bVar = (V6.b) c0379a.f9233b;
            bVar.getClass();
            if (!(inputConnection instanceof C0381c)) {
                inputConnection = new C0381c((EditText) bVar.f7761b, inputConnection, editorInfo);
            }
        }
        return (C0381c) inputConnection;
    }

    public void g(boolean z2) {
        C0388j c0388j = (C0388j) ((V6.b) ((C0379a) this.f17363c).f9233b).f7762c;
        if (c0388j.f9253c != z2) {
            if (c0388j.f9252b != null) {
                Y.h a3 = Y.h.a();
                C0387i c0387i = c0388j.f9252b;
                a3.getClass();
                M.d.e(c0387i, StubApp.getString2(7470));
                ReentrantReadWriteLock reentrantReadWriteLock = a3.f8659a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a3.f8660b.remove(c0387i);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0388j.f9253c = z2;
            if (z2) {
                C0388j.a(c0388j.f9251a, Y.h.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable h(Drawable drawable, boolean z2) {
        if (drawable instanceof G.b) {
            ((G.c) ((G.b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    int id = layerDrawable.getId(i3);
                    drawableArr[i3] = h(layerDrawable.getDrawable(i3), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f17363c) == null) {
                    this.f17363c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1296B(EditText editText) {
        this.f17361a = 1;
        this.f17362b = editText;
        this.f17363c = new C0379a(editText);
    }

    public C1296B(AppCompatTextView appCompatTextView) {
        this.f17361a = 2;
        this.f17363c = appCompatTextView;
        this.f17361a = 2;
        this.f17362b = appCompatTextView;
    }
}
